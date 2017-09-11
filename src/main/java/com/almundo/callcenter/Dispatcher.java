package com.almundo.callcenter;

import java.util.*;
import java.util.concurrent.*;

/**
 * Created by Gisela Lopez Giles on 9/8/17.
 */
public class Dispatcher {

    private PriorityBlockingQueue<Employee> employeers;
    private Map<Integer, Employee> employeersOnCall;
    private Queue<Call> onHoldCalls;

    public Dispatcher() {
        employeers = new PriorityBlockingQueue<>();
        employeersOnCall = new ConcurrentHashMap<>();
        onHoldCalls = new ConcurrentLinkedQueue<>();
    }


    public void start() {
        Runnable runnable = () -> {
            while (!onHoldCalls.isEmpty()) {
                System.out.println("Cola OnHold no esta vacia");
                Call call = onHoldCalls.poll();
                try {
                    dispatchCall(call);
                } catch (Exception e) {
                    onHoldCalls.offer(call);
                }
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }

    private void makeEmployeeAvailable(Employee employee) {
        System.out.println("Corrio en " + employee.getId());
        employeersOnCall.remove(employee.getId());
        addAvailableEmployee(employee);
    }

    private void dispatchCall(Call call) {
        try {
            Employee employee = employeers.take();
            System.out.println("Toma la llamada el " + employee.getRole() + " :" + employee.getId());
            employeersOnCall.put(employee.getId(), employee);
            Runnable callback = () -> makeEmployeeAvailable(employee);
            employee.answerCall(call, callback);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void receiveCall(Call call) {
        onHoldCalls.add(call);
    }

    public void addAvailableEmployee(Employee employee) {
        employeers.add(employee);
    }

    public int verifyEmployeesOnCall(){
        return employeersOnCall.size();
    }
}

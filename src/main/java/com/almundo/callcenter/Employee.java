package com.almundo.callcenter;

/**
 * Created by Gisela Lopez Giles on 9/8/17.
 */
public class Employee implements Comparable<Employee>{

    private int id;
    private Role role;

    public Employee(int id, Role role) {
        this.id = id;
        this.role = role;
    }

    @Override
    public int compareTo(Employee employee) {
        return role.compareTo(employee.getRole());
    }

    public void answerCall(Call call, Runnable callback){
        call.executeAtEnd(callback);
        Thread thread = new Thread(call);
        thread.start();
    }


    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

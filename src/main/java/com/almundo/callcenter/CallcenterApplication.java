package com.almundo.callcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CallcenterApplication {
		//implements CommandLineRunner  {

	public static void main(String[] args) {
		SpringApplication.run(CallcenterApplication.class, args);
	}

	/*
	@Override
	public void run(String... arg0) throws Exception {
		Dispatcher dispatcher = new Dispatcher();
		Employee employee1 = new Employee(1, Role.SUPERVISOR);
		Employee employee2 = new Employee(2,Role.DIRECTOR);
		Employee employee3 = new Employee(3,Role.OPERATOR);
		Employee employee4 = new Employee(4, Role.SUPERVISOR);
		Employee employee5 = new Employee(5,Role.OPERATOR);
		Employee employee6 = new Employee(6,Role.OPERATOR);
		Employee employee7 = new Employee(7,Role.OPERATOR);
		Employee employee8 = new Employee(8,Role.OPERATOR);
		Employee employee9 = new Employee(9,Role.OPERATOR);
		Employee employee10 = new Employee(10,Role.OPERATOR);
		dispatcher.addAvailableEmployee(employee1);
		dispatcher.addAvailableEmployee(employee2);
		dispatcher.addAvailableEmployee(employee3);
		dispatcher.addAvailableEmployee(employee4);
		dispatcher.addAvailableEmployee(employee5);
		dispatcher.addAvailableEmployee(employee6);
		dispatcher.addAvailableEmployee(employee7);
		dispatcher.addAvailableEmployee(employee8);
		dispatcher.addAvailableEmployee(employee9);
		dispatcher.addAvailableEmployee(employee10);
		Call call1 = new Call();
		Call call2 = new Call();
		Call call3 = new Call();
		Call call4 = new Call();
		Call call5 = new Call();
		Call call6 = new Call();
		Call call7 = new Call();
		Call call8 = new Call();
		Call call9 = new Call();
		Call call10 = new Call();
		Call call11 = new Call();
		dispatcher.receiveCall(call1);
		dispatcher.receiveCall(call2);
		dispatcher.receiveCall(call3);
		dispatcher.receiveCall(call4);
		dispatcher.receiveCall(call5);
		dispatcher.receiveCall(call6);
		dispatcher.receiveCall(call7);
		dispatcher.receiveCall(call8);
		dispatcher.receiveCall(call9);
		dispatcher.receiveCall(call10);
		dispatcher.receiveCall(call11);
		dispatcher.start();
	}*/
}

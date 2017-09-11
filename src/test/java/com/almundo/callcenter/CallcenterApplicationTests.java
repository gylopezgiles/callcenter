package com.almundo.callcenter;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CallcenterApplicationTests {

	private Dispatcher dispatcher;

	@Before
	public void setUp() throws Exception {
		dispatcher = new Dispatcher();
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
	}

	@Test
	public void contextLoads() {

	}


	@Test
	public void assignCallToAnEmployee(){
		Call call = new Call();
		dispatcher.receiveCall(call);
		dispatcher.start();
		Assert.assertTrue(dispatcher.verifyEmployeesOnCall() == 1);
	}

}

package com.howtodoinjava.demo;

import com.howtodoinjava.demo.service.EmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

//@RunWith(SpringRunner.class)
@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class SpringBootDemoApplicationTests {
	@Autowired
	private EmployeeService employeeService;
	@Test
	public void contextLoads() {
	}


	@Test
	public void whenUserIdIsProvided_thenRetrievedNameIsCorrect() {
		Mockito.when(employeeService.getEmployeeName()).thenReturn("Mock Product Name");

	}

}

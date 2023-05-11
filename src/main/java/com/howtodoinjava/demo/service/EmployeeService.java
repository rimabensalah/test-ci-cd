package com.howtodoinjava.demo.service;

import com.howtodoinjava.demo.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    public List<Employee> getEmployees()
    {
        List<Employee> employeesList = new ArrayList<Employee>();
        employeesList.add(new Employee(1,"lokesh","gupta","howtodoinjava@gmail.com"));
        employeesList.add(new Employee(2,"ryma","bensalah","rymabensalah@gmail.com"));
        return employeesList;
    }
}

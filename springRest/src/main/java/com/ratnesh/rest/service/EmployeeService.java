package com.ratnesh.rest.service;

import com.ratnesh.rest.db.MyDatabase;
import com.ratnesh.rest.model.Employee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by ratnesh on 2/7/17.
 */
@Component
public class EmployeeService {
    private static Map<Long, Employee> employees = MyDatabase.getEmployee();
    public EmployeeService() {
        employees.put(1L, new Employee(1L, "Ratnesh", "Varma"));
        employees.put(2L,  new Employee(2L, "Jai", "Singh"));
    }

    public List<Employee> getAllEmployee() {
        return  new ArrayList<Employee>(employees.values());
    }
    public Employee getEmployee(long empId) {
        return employees.get(empId);
    }
    public Employee addEmployee(Employee employee){
        employee.setEmpId(employees.size()+1);
        System.out.println("Name: "+ employee.getFirstName());
        employees.put(employee.getEmpId(),employee);
        return employee;
    }
    public Employee updateEmployee(Employee employee){
        employees.put(employee.getEmpId(),employee);
        return employee;
    }
    public Employee removeEmployee(long empId){
        return employees.remove(empId);

    }


}

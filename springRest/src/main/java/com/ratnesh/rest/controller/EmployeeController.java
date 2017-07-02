package com.ratnesh.rest.controller;

import com.ratnesh.rest.model.Employee;
import com.ratnesh.rest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by ratnesh on 2/7/17.
 */
@RestController
@RequestMapping(value="/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @RequestMapping( method = RequestMethod.GET ,produces = {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployee();
    }

    @RequestMapping(value="/{empId}", method = RequestMethod.GET ,produces = {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
    public Employee getEmployee( @PathVariable("empId") long empId){
               return employeeService.getEmployee(empId);
    }

    @RequestMapping(
            method = RequestMethod.POST,
            consumes = {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE}
    )
    public Employee createEmployee(@RequestBody Employee employee){

        return employeeService.addEmployee(employee);
    }

    @RequestMapping( value = "/{empId}",
            method = RequestMethod.PUT,
            consumes = {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE}
    )
    public Employee editEmployee(@RequestBody Employee employee){

        return employeeService.updateEmployee(employee);
    }

    @RequestMapping( value = "/{empId}",
            method = RequestMethod.DELETE,
            consumes = {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE}
    )
    public Employee deleteEmployee(@PathVariable("empId") long empId){

        return employeeService.removeEmployee(empId);
    }
}

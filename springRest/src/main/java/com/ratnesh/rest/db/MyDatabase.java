package com.ratnesh.rest.db;

import com.ratnesh.rest.model.Employee;
import com.sun.javafx.collections.MappingChange;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ratnesh on 2/7/17.
 */
public class MyDatabase {
    private static Map<Long, Employee> employees = new HashMap();
    public  static Map<Long, Employee> getEmployee(){
        return employees;
    }

}

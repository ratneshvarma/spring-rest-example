package com.ratnesh.rest.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Created by ratnesh on 2/7/17.
 */

@JsonPropertyOrder({"empId","lastName","firstName"})
public class Employee {

    private long empId;
    @JsonProperty("first_name")
    private String firstName;
    private String lastName;
    public Employee(){}
    public Employee(long empId, String firstName, String lastName){
        this.empId=empId;
        this.firstName=firstName;
        this.lastName=lastName;

    }
    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


}

/**
 * EmployeePayrollDTO.java
 */

package com.bridgelabz.employeepayrollapp.EmployeePayrollApp.dto;

import lombok.Data;

@Data
public class EmployeePayrollDTO {
    public String name;
    public long salary;

    public EmployeePayrollDTO(String name, long salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "name="+name+":salary="+salary;
    }
}
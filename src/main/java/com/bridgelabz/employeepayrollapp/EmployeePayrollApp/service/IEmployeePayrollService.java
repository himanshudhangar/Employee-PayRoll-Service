package com.bridgelabz.employeepayrollapp.EmployeePayrollApp.service;

import com.bridgelabz.employeepayrollapp.EmployeePayrollApp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.EmployeePayrollApp.model.EmployeePayrollData;

import java.util.List;

public interface IEmployeePayrollService
{
    List<EmployeePayrollData> getEmployeePayrollData();

    EmployeePayrollData getEmployeePayrollDataById(int empId);

    EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO);

    EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollDTO employeePayrollDTO);

    void deleteEmployeePayrollData(int empId);
}
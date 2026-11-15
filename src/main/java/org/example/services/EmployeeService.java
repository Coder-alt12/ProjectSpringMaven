package org.example.services;

import org.example.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    List<EmployeeDto> listAll();
    EmployeeDto addEmployee(EmployeeDto employeeDto);
}

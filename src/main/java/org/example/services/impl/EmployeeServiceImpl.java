package org.example.services.impl;

import org.example.converter.EmployeeConverter;
import org.example.dto.EmployeeDto;
import org.example.entity.EmployeeEntity;
import org.example.repository.EmployeeRepository;
import org.example.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {


    private final EmployeeRepository employeeRepository;
    private final EmployeeConverter employeeConverter;
    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository, EmployeeConverter employeeConverter) {
        this.employeeRepository = employeeRepository;
        this.employeeConverter = employeeConverter;
    }

    @Override
    public List<EmployeeDto> listAll() {

        List<EmployeeDto> returnValue = new ArrayList<>();
        List<EmployeeEntity> allEmployees = employeeRepository.findAll();
        for (int i = 0; i < allEmployees.size();i++){
            EmployeeEntity employeeEntity = allEmployees.get(i);
            EmployeeDto employeeDto = employeeConverter.entityToDto(employeeEntity);
            returnValue.add(employeeDto);
        }
        return returnValue;
    }

    @Override
    public EmployeeDto addEmployee(EmployeeDto employeeDto) {
        EmployeeEntity employeeEntity = employeeConverter.dtoToEntity(employeeDto);
        EmployeeEntity savedEmployee = employeeRepository.save(employeeEntity);

        return employeeConverter.entityToDto(savedEmployee);
    }
}

package org.example.converter;

import org.example.dto.EmployeeDto;
import org.example.entity.EmployeeEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeConverter {

    private  ModelMapper modelMapper;

    @Autowired

    private void initiate(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public EmployeeDto entityToDto(EmployeeEntity employeeEntity){
        EmployeeDto returnValue = new EmployeeDto();

        returnValue.setId(employeeEntity.getId());
        returnValue.setFirstName(employeeEntity.getFirstName());
        returnValue.setLastName(employeeEntity.getLastName());
        returnValue.setLocation(employeeEntity.getLocation());
        returnValue.setPosition(employeeEntity.getPosition());
        returnValue.setSalary(employeeEntity.getSalary());

        return returnValue;

    }
    public EmployeeEntity dtoToEntity(EmployeeDto employeeDto){

        return modelMapper.map(employeeDto,EmployeeEntity.class);

    }
}

package org.example.controlers;

import org.example.dto.EmployeeDto;
import org.example.exeptions.DataNotValidatedExeption;
import org.example.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/employees")
public class EmployeeControler {
    private final EmployeeService employeeService;

    @Autowired
    public EmployeeControler(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping
    public ResponseEntity<List<EmployeeDto>> getAllEmployees(){
        List<EmployeeDto> employees = employeeService.listAll();
        return new ResponseEntity<>(employees, HttpStatus.OK);

    }
    @PostMapping
    public ResponseEntity<String>saveEmployee(@RequestBody @Validated EmployeeDto employeeDto, Errors errors){
        if (errors.hasErrors()){
            throw new DataNotValidatedExeption("Employee has not been validated");
        }
        EmployeeDto savedEmployee = employeeService.addEmployee(employeeDto);

        return new ResponseEntity<>("Employee with ID "+ savedEmployee.getId() + "has been added!",HttpStatus.CREATED);
    }

}

package org.example.dto;



import jakarta.validation.constraints.*;

import java.io.Serializable;

public class EmployeeDto implements Serializable {

    private Integer id;
    @NotEmpty
    @Size(max = 20)
    private String firstName;
    @NotEmpty
    @Size(max = 20)
    private String lastName;
    @NotEmpty
    @Size(max = 20)
    private String position;
    @NotNull
    @DecimalMax(value = "4000000")
    @DecimalMin(value = "10000")
    private Double salary;
    @NotEmpty
    @Size(max = 20)
    private String location;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

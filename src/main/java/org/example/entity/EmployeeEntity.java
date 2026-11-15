package org.example.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="employees")
public class EmployeeEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "first_name",nullable = false,length = 20)
    private String firstName;
    @Column(name = "last_name",nullable = false,length = 20)
    private String lastName;
    @Column(nullable = false,length = 20)
    private String position;
    @Column(nullable = false)
    private Double salary;
    @Column(nullable = false,length = 20)
    private String location;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    //geters
    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPosition() {
        return position;
    }

    public Double getSalary() {
        return salary;
    }

    public String getLocation() {
        return location;
    }
}

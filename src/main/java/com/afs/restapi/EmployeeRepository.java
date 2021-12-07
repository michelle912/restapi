package com.afs.restapi;

import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepository {

    private List<Employee> employeeList;

    public EmployeeRepository() {
        employeeList = new ArrayList<>();
        employeeList.add(new Employee(1,"Tom", 21, "Female", 1000));

    }

    public List<Employee> findAll() {
        return employeeList;
    }

}

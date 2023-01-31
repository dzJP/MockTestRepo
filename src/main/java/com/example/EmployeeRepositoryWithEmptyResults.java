package com.example;

import java.util.List;

public class EmployeeRepositoryDumyWithEmptyResults implements EmployeeRepository {

    @Override
    public List<Employee> findAll() {
        return List.of();
    }

    @Override
    public Employee save(Employee e) {
        return e;
    }
}

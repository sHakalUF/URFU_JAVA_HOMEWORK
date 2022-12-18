package com.example.hw8.dao;

import com.example.hw8.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAll();

    public void save(Employee employee);

    public Employee getEmployee(int id);

    public void delete(int id);
}

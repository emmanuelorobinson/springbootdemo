package dev.emmanuelrobinson.cruddemo.service;

import dev.emmanuelrobinson.cruddemo.entity.Employee;

import java.util.List;

public interface IEmployeeService {

    List<Employee> findAll();
    Employee findById(int id);
    Employee save(Employee employee);
    void deleteById(int id);
}

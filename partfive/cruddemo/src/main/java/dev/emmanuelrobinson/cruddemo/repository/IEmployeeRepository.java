package dev.emmanuelrobinson.cruddemo.repository;

import dev.emmanuelrobinson.cruddemo.entity.Employee;

import java.util.List;

public interface IEmployeeRepository {

    List<Employee> findAll();
    Employee findById(int id);
    Employee save(Employee employee);
    void deleteById(int id);
}

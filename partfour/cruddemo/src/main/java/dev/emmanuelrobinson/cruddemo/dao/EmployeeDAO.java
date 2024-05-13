package dev.emmanuelrobinson.cruddemo.dao;

import dev.emmanuelrobinson.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
}

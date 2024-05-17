package dev.emmanuelrobinson.cruddemo.service;

import dev.emmanuelrobinson.cruddemo.entity.Employee;
import dev.emmanuelrobinson.cruddemo.repository.EmployeeRepository;
import dev.emmanuelrobinson.cruddemo.repository.IEmployeeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService{

    IEmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(IEmployeeRepository employeeDAO) {
        employeeRepository = employeeDAO;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(int id) {
        return employeeRepository.findById(id);
    }

    @Transactional
    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Transactional
    @Override
    public void deleteById(int id) {
        employeeRepository.deleteById(id);
    }


}

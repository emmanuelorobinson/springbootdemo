package dev.emmanuelrobinson.cruddemo.service;

import dev.emmanuelrobinson.cruddemo.entity.Employee;
import dev.emmanuelrobinson.cruddemo.repository.EmployeeRepository;
import dev.emmanuelrobinson.cruddemo.repository.IEmployeeRepository;
import dev.emmanuelrobinson.cruddemo.repository.JPAEmployeeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements IEmployeeService{

//    IEmployeeRepository employeeRepository;

    private JPAEmployeeRepository employeeRepository;


//    @Autowired
//    public EmployeeService(IEmployeeRepository employeeDAO) {
//        employeeRepository = employeeDAO;
//    }

    @Autowired
    public EmployeeService(JPAEmployeeRepository theEmployeeRepository) {
        employeeRepository = theEmployeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(int id) {
        Optional<Employee> result = employeeRepository.findById(id);

        Employee theEmployee = null;
        if (result.isPresent()) {
            theEmployee = result.get();
        }
        else {
            throw new RuntimeException("Did not find employee id - " + id);
        }


        return theEmployee;
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

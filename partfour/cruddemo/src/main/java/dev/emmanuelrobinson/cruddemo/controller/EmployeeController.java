package dev.emmanuelrobinson.cruddemo.controller;

import dev.emmanuelrobinson.cruddemo.repository.IEmployeeRepository;
import dev.emmanuelrobinson.cruddemo.entity.Employee;
import dev.emmanuelrobinson.cruddemo.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

//    @Autowired
    private IEmployeeService employeeService;

    @Autowired
    public EmployeeController(IEmployeeService emService) {
        employeeService = emService;
    }

    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }

}

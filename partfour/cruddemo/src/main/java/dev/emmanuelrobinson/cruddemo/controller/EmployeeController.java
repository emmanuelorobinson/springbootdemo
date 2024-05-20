package dev.emmanuelrobinson.cruddemo.controller;

import dev.emmanuelrobinson.cruddemo.repository.IEmployeeRepository;
import dev.emmanuelrobinson.cruddemo.entity.Employee;
import dev.emmanuelrobinson.cruddemo.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/employees/{employeeId}")
    public Employee getEmployee(@PathVariable int employeeId) {
        Employee employee = employeeService.findById(employeeId);

        if (employee == null) {
            throw new RuntimeException("Employee id not found");
        }

        return employee;
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee) {

        employee.setId(0);

        Employee dbEmployee = employeeService.save(employee);

        return dbEmployee;
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee) {

        Employee dbEmployee = employeeService.save(employee);

        return dbEmployee;
    }

    @DeleteMapping("/employees/{employeeId}")
    public String deleteEmployee(@PathVariable int employeeId) {

        Employee employee = employeeService.findById(employeeId);

        if (employee == null) {
            throw new RuntimeException("Employee id not found - " + employeeId);
        }

        employeeService.deleteById(employeeId);

        return "Deleted employee id - " + employeeId;
    }

}

package dev.emmanuelrobinson.cruddemo.repository;

import dev.emmanuelrobinson.cruddemo.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeRepository implements IEmployeeRepository {

    private EntityManager entityManager;

    @Autowired
    public EmployeeRepository(EntityManager em) {
        entityManager = em;
    }


    @Override
    public List<Employee> findAll() {
        TypedQuery<Employee> tq = entityManager.createQuery("from Employee", Employee.class);

        List<Employee> employees = tq.getResultList();

        return employees;

    }

    @Override
    public Employee findById(int id) {
        Employee employee = entityManager.find(Employee.class, id);

        return employee;
    }

    @Override
    public Employee save(Employee employee) {
        Employee dbEmployee = entityManager.merge(employee);

        return dbEmployee;
    }

    @Override
    public void deleteById(int id) {
        Employee employee = entityManager.find(Employee.class, id);

        entityManager.remove(employee);
    }
}

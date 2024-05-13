package dev.emmanuelrobinson.cruddemo.dao;

import dev.emmanuelrobinson.cruddemo.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO{

    private EntityManager entityManager;

    @Autowired
    public  EmployeeDAOJpaImpl(EntityManager em) {
        entityManager = em;
    }


    @Override
    public List<Employee> findAll() {
        TypedQuery<Employee> tq = entityManager.createQuery("from Employee", Employee.class);

        List<Employee> employees = tq.getResultList();

        return employees;

    }
}

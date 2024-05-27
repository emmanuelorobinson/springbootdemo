package dev.emmanuelrobinson.cruddemo.repository;

import dev.emmanuelrobinson.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JPAEmployeeRepository extends JpaRepository<Employee, Integer> {
}

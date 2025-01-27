package dev.emmanuelrobinson.hibernatejpacrud.dao;

import dev.emmanuelrobinson.hibernatejpacrud.entity.Student;

import java.util.List;

public interface StudentDAO {

    void save(Student student);
    void update(Student student);
    void delete(Integer id);
    int deleteAll();
    Student findById(Integer id);
    List<Student> findAll();
    List<Student> findByLastName(String lastName);
}

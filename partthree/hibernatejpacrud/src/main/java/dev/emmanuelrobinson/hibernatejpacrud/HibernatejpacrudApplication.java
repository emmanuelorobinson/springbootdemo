package dev.emmanuelrobinson.hibernatejpacrud;

import dev.emmanuelrobinson.hibernatejpacrud.entity.Student;
import dev.emmanuelrobinson.hibernatejpacrud.dao.StudentDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class HibernatejpacrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernatejpacrudApplication.class, args);
	}


	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
//			createStudent(studentDAO);
//			readStudent(studentDAO);
//			queryAllStudents(studentDAO);
//			queryByLastName(studentDAO, "John");
//			updateStudent(studentDAO);
//			deleteStudent(studentDAO);
			deleteAllStudents(studentDAO);
		};


	}

	private void queryByLastName(StudentDAO studentDAO, String lastName) {
		List<Student> students = studentDAO.findByLastName(lastName);

		for (Student student : students) {
			System.out.println(student);
		}
	}

	private void queryAllStudents(StudentDAO studentDAO) {
		List<Student> students = studentDAO.findAll();

		for (Student student : students) {
			System.out.println(student);
		}
	}

	private void readStudent(StudentDAO studentDAO) {

		Student tempStudent = new Student("Rein", "Matbeck", "rein@example.com");
		studentDAO.save(tempStudent);
		System.out.println("Student saved. Generated ID: " + tempStudent.getId());

		System.out.println("Reading student with ID: " + tempStudent.getId());
		Student student = studentDAO.findById(tempStudent.getId());

		System.out.println("Student: " + student);
	}


	private void createStudent(StudentDAO studentDAO) {
		Student student = new Student("Rein", "Matbeck", "rein@example.com");

		studentDAO.save(student);

		System.out.println("Student saved successfully");
		System.out.println("Student ID: " + student.getId());

	}

	private void updateStudent(StudentDAO studentDAO) {
		int studentId = 1;
		System.out.println("Getting student with id: " + studentId);

		Student myStudent = studentDAO.findById(studentId);

		System.out.println("Updating student...");

		myStudent.setLastName("Marq");
		studentDAO.update(myStudent);

		System.out.println("Updated student: " + myStudent);
	}

	private void deleteStudent(StudentDAO studentDAO) {
		int studentId = 6;
		System.out.println("Deleting student id: " + studentId);

		studentDAO.delete(studentId);
	}

	private void deleteAllStudents(StudentDAO studentDAO) {
		System.out.println("Deleting all students");
		int numRowsDeleted = studentDAO.deleteAll();
		System.out.println("Deleted row count: " + numRowsDeleted);
	}
}

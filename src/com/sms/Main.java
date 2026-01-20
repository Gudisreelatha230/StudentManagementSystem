package com.sms;

import java.util.List;
import com.sms.dao.StudentDAO;
import com.sms.model.Student;

public class Main {
    public static void main(String[] args) {

        StudentDAO studentDAO = new StudentDAO();

        studentDAO.addStudent(new Student(1, "Ravi", 21));
        studentDAO.addStudent(new Student(2, "Sita", 22));

        List<Student> students = studentDAO.getAllStudents();

        for (Student s : students) {
            System.out.println(
                "ID: " + s.getId() +
                ", Name: " + s.getName() +
                ", Age: " + s.getAge()
            );
        }
    }
}
package com.sms.dao;

import java.util.ArrayList;
import java.util.List;
import com.sms.model.Student;

public class StudentDAO {

    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully");
    }

    public List<Student> getAllStudents() {
        return students;
    }
}
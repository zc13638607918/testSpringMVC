package com.zc.service;

import com.zc.pojo.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    int addStudent(Student student);
    int delStudent(Student student);
    int updStudent(Student student);
    Student selStudentByID(int id);
    List<Student> selAllStudent();

}

package com.zc.service.impl;

import com.zc.mapper.StudentMapper;
import com.zc.pojo.Student;
import com.zc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName StudentServiceImpl
 * @Description TODO
 * @Author 周超
 * @Date 2020/3/27 11:43
 * @Version 1.0
 **/
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public int addStudent(Student student) {
        return studentMapper.insertOne(student);
    }

    @Override
    public int delStudent(Student student) {
        return 0;
    }

    @Override
    public int updStudent(Student student) {
        return 0;
    }

    @Override
    public Student selStudentByID(int id) {
        return studentMapper.selByID(id);
    }

    @Override
    public List<Student> selAllStudent() {
        return null;
    }
}

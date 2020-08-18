package com.my.recall.service.impl;

import com.my.recall.dao.StudentMapper;
import com.my.recall.model.Student;
import com.my.recall.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> getStudentList() {
        return studentMapper.queryStudent();
    }
}

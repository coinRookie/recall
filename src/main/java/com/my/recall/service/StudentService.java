package com.my.recall.service;

import com.my.recall.dao.StudentMapper;
import com.my.recall.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

public interface StudentService {

    List<Student> getStudentList();


}

package com.my.recall.dao;

import com.my.recall.model.Student;
import com.my.recall.utils.MyMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Repository
public interface StudentMapper extends MyMapper<Student> {

    /**
     * 查询所有学生
     */
    List<Student> queryStudent();
}
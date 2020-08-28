package com.my.recall;

import com.my.recall.model.Student;
import com.my.recall.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {RecallApplication.class})
public class StudentTest {
    @Autowired
    private StudentService studentService;

    @Test
    public void query() {
        List<Student> studentList = studentService.getStudentList();
        for (Student student : studentList) {
            System.out.println(student);
        }


    }

    @Test
    public void query2() {
        System.out.println("holle");
    }
}

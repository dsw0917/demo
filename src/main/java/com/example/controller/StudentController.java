package com.example.controller;

import com.example.entity.Student;
import com.example.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ellen
 * @version 1.0
 * @date 2018/10/25
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    IStudentService studentService;

    /**
     * 添加学生
     * @param studentName
     * @param classId
     * @return
     */
    @RequestMapping("/add")
    public Student add(String studentName, Integer classId){
        Student student = new Student();
        student.setStudentName(studentName);
        student.setClassId(classId);

        studentService.insert(student);

        return student;
    }

}

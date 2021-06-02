package com.example.StudentData.StudentData.Controller;

import com.example.StudentData.StudentData.Model.Student;
import com.example.StudentData.StudentData.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/all")
    public List<Student> fetchAllinfo(){
        return studentService.fetchInfo();}

}

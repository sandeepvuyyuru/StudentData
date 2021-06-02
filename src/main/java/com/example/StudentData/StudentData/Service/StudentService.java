package com.example.StudentData.StudentData.Service;

import com.example.StudentData.StudentData.Model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

      public List<Student> fetchInfo() {
          List<Student> sl = new ArrayList<>();
          sl.add(new Student(1, "Amar", "abc", "A"));
          sl.add(new Student(2, "Akbar", "pqr", "B"));
          sl.add(new Student(3, "Anthony", "xyz", "C"));
          return sl;

      }

}
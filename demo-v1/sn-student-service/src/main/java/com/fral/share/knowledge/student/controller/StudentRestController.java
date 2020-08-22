package com.fral.share.knowledge.student.controller;

import java.util.List;

import com.fral.share.knowledge.student.domain.Student;
import com.fral.share.knowledge.student.service.StudentService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/students")
@RestController
public class StudentRestController {
    
    private final StudentService studentService;

    public StudentRestController(StudentService studentService) {
        this.studentService = studentService;
    }


    @GetMapping
    public ResponseEntity<List<Student>> getAll() {
        List<Student> studentsResult = studentService.getAllStudents();
        return ResponseEntity.ok(studentsResult);
    }
}
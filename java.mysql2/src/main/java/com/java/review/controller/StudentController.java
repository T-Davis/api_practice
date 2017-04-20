package com.java.review.controller;

import com.java.review.entity.Student;
import com.java.review.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by tdavis on 4/19/17.
 */

@Controller
@RequestMapping(path="/student")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping(path="/all")
    public @ResponseBody
    Iterable<Student> getAllStudent() {
        return studentRepository.findAll();
    }
}
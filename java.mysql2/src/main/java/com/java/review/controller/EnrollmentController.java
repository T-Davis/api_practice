package com.java.review.controller;

import com.java.review.entity.Enrollment;
import com.java.review.repository.EnrollmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by tdavis on 4/19/17.
 */

@Controller
@RequestMapping(path="/enrollment")
public class EnrollmentController {

    @Autowired
    private EnrollmentRepository enrollmentRepository;

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Enrollment> getAllEnrollment() {
        return enrollmentRepository.findAll();
    }
}
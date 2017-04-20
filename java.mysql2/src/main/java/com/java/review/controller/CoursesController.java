package com.java.review.controller;

import com.java.review.entity.Courses;
import com.java.review.repository.CoursesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by tdavis on 4/19/17.
 */

@Controller
@RequestMapping(path="/courses")
public class CoursesController {

	@Autowired
	private CoursesRepository coursesRepository;

	@GetMapping(path="/all")
	public @ResponseBody Iterable<Courses> getAllCourses() {
		return coursesRepository.findAll();
	}
}

package com.java.review.repository;

import com.java.review.entity.Student;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by tdavis on 4/19/17.
 */

public interface StudentRepository extends CrudRepository<Student, Long> {

}

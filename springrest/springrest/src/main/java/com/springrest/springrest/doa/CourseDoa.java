package com.springrest.springrest.doa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springrest.entities.Course;

public interface CourseDoa extends JpaRepository<Course, Long>{

}

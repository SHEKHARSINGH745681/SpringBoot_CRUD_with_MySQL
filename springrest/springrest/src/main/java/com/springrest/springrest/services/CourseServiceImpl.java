package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.doa.CourseDoa;
import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseDoa courseDoa;
	// List<Course> list;

	public CourseServiceImpl() {

//		list = new ArrayList<>();
//		list.add(new Course(1, "java", "core java"));
//		list.add(new Course(2, "python", "AI-ML"));
//		list.add(new Course(3, "C++", "DSA"));

	}

	@Override
	public Course getCourse(Long courseId) {
	//	Course c = null;
//		for (Course course : list) {
//			if (course.getId() == courseId) {
//				c = course;
//				break;
//			}
//		}
		return courseDoa.getOne(courseId);
	}

	@Override
	public Course addCourse(Course course) {
		// list.add(course);
		courseDoa.save(course);
		return course;

	}

	@Override
	public Course updateCourse(Course course) {
//		 list.forEach(e -> {
//			if (e.getId() == course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//		});
		courseDoa.save(course);
		return course;
	}

	@Override
	public void deleteCourse(long parseLong) {
		// list = this.list.stream().filter(e -> e.getId() !=
		// parseLong).collect(Collectors.toList());
		Course entity=courseDoa.getOne(parseLong);
		courseDoa.delete(entity);
	}

	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return courseDoa.findAll();
	}

}

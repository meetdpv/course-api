package io.javabrains.springbootstarter.course;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	public CourseRepository courseRepository;
	
	public List<Course> getAllCourses(String topicId)
	{
		List<Course> courses = new ArrayList<>();
		courseRepository.findByTopicId(topicId).forEach(courses :: add);
		return courses;
	}
	
	public Course getCourse(String id)
	{
		Optional<Course> course = courseRepository.findById(id);
		return course.get();
	}
	
	public void addCourse(Course course)
	{
		courseRepository.save(course);
	}

	public void updateCourse(String id, Course course) {
		courseRepository.save(course);
	}

	public void deleteCourse(String id) {
		courseRepository.deleteById(id);
		
	}

}

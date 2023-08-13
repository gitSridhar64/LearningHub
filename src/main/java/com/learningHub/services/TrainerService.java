package com.learningHub.services;



import java.util.List;

import org.springframework.stereotype.Service;

import com.learningHub.entity.Course;
import com.learningHub.entity.Lesson;

@Service
public interface TrainerService {
	public String addCourse(Course c);
	public String addLesson(Lesson l);
	public Course getCourse(int courseId);
	public List<Course> showCourses();
	

}

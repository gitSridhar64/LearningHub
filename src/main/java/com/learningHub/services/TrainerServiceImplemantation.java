package com.learningHub.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learningHub.Repository.LessonRepository;
import com.learningHub.Repository.CourseRepository;
import com.learningHub.entity.Course;
import com.learningHub.entity.Lesson;

@Service
public class TrainerServiceImplemantation implements TrainerService{
	@Autowired
	CourseRepository courseRepo;
	
	@Autowired
	LessonRepository lRepo;
	@Override
	public String addCourse(Course c)
	{
		courseRepo.save(c);
		return "added";
	}
	@Override
	public String addLesson(Lesson l)
	{
		lRepo.save(l);
		return "added lesson";
	}
	@Override
	public Course getCourse(int courseId)
	{
		return courseRepo.findById(courseId).get() ;
	}
	@Override
	public List<Course> showCourses() {
		// TODO Auto-generated method stub
		return courseRepo.findAll();
	}
	
}

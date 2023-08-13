package com.learningHub.services;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learningHub.Repository.LessonRepository;
import com.learningHub.Repository.MyCourseRepository;
import com.learningHub.entity.Lesson;
import com.learningHub.entity.MyCourses;

@Service
public class StudentServiceImplementation implements StudentService{

	@Autowired
	LessonRepository lRepo;
	
	@Autowired
	MyCourseRepository mcRepo;
	
	@Override
	public Lesson getLesson(int lessonId) {
		// TODO Auto-generated method stub
		return lRepo.findById(lessonId).get();
	}

	@Override
	public String addMyCourse(MyCourses mycourse) {
		mcRepo.save(mycourse);
		return "added mycourse";
	}

	@Override
	public List<MyCourses> getMyCourses(String email) {
		// TODO Auto-generated method stub
		return mcRepo.getByEmail(email);
	}

}

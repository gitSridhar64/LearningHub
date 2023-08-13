package com.learningHub.services;



import java.util.List;

import com.learningHub.entity.Lesson;
import com.learningHub.entity.MyCourses;


public interface StudentService {
	public Lesson getLesson(int lessonId);
	public String addMyCourse(MyCourses mycourse);
	public List<MyCourses> getMyCourses(String email);


}

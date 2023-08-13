package com.learningHub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.learningHub.entity.Comment;
import com.learningHub.entity.Lesson;
import com.learningHub.entity.MyCourses;
import com.learningHub.services.CommentService;
import com.learningHub.services.StudentService;

@Controller
public class StudentController {
	@Autowired
	StudentService studServices;
	
	@Autowired
	CommentService cService;
	
	@PostMapping("/searchLesson")
	public String myLesson(@RequestParam ("lessonId") int lessonId, Model model, Model model1) 
	{   
		Lesson ls= studServices.getLesson(lessonId);
		model.addAttribute("Lesson1",ls);
		List<Comment> com= cService.commentList();
		model1.addAttribute("allcomments", com);
		return "myLesson";
	}
	@PostMapping("/addMyCourse")
	public String addMyCourse(@RequestParam ("email") String email,
			@RequestParam ("courseId") int courseId,
			@RequestParam ("courseName") String courseName,
			@RequestParam ("coursePrice") int coursePrice) 
	{
		MyCourses mycourse=new MyCourses();
		mycourse.setCourseId(courseId);
		mycourse.setCourseName(courseName);
		mycourse.setCoursePrice(coursePrice);
		mycourse.setEmail(email);
		studServices.addMyCourse(mycourse);
		return "redirect:/addCourse1";
	}
	@PostMapping("/getMyCourseDetails")
	public String getMyCourseDetails(@RequestParam ("email") String email, Model model)
	{
		List<MyCourses> mycourse=studServices.getMyCourses(email);
		model.addAttribute("coursedata", mycourse);
		return "myCourses";
	}
}

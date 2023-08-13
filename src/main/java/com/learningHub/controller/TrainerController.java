package com.learningHub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.learningHub.entity.Course;
import com.learningHub.entity.Lesson;
import com.learningHub.services.TrainerService;

@Controller
public class TrainerController {
	
	@Autowired
	TrainerService tService;
	
	@PostMapping("/addCourse")
	public String addCourse(@RequestParam("courseId") int courseId,
			@RequestParam("courseName") String courseName,
			@RequestParam("coursePrice") int coursePrice)
	{
		Course c=new Course();
		c.setCourseId(courseId);
		c.setCourseName(courseName);
		c.setCoursePrice(coursePrice);
		tService.addCourse(c);
		return "trainerHome";
	}
	@PostMapping("/addLesson")
	public String addLesson(@RequestParam("courseId") int courseId,
			@RequestParam("lessonId") int lessonId,
			@RequestParam("lessonName") String lessonName,
			@RequestParam("lessonTopics") String lessonTopics,
			@RequestParam("videoLink") String videoLink)
	{
		Course course1=tService.getCourse(courseId);
		Lesson lesson=new Lesson(lessonId,lessonName,lessonTopics,videoLink,course1);
		course1.getLessons().add(lesson);
		tService.addLesson(lesson);
		return "trainerHome";
	}
	@GetMapping("/showCourse")
	public String showCourse(Model model)
	{
		List<Course> clist=tService.showCourses();
		model.addAttribute("CourseList", clist);
		return "getCourses";
	}
	@GetMapping("/buyCourses")
	public String buyCourses(Model model)
	{
		List<Course> clist=tService.showCourses();
		model.addAttribute("CourseList", clist);
		return "buyCourse";
	}
	@GetMapping("/addCourse1")
	public String addCourse1(Model model)
	{
		List<Course> clist=tService.showCourses();
		model.addAttribute("CourseList", clist);
		return "purchase";
	}

}

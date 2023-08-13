package com.learningHub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavController {
	
	@GetMapping("/register")
	public String register()
	{
		return "register";
		
	}
		@GetMapping("/login")
	public String login()
	{
		return "login";
		
	}
		@GetMapping("/learninghub")
	public String home()
	{
		return "home";
		
	}
	@GetMapping("/createCourse")
	public String createCourse()
	{
			return "createCourse";
			
	}
	@GetMapping("/addLesson")
	public String addLesson()
	{
			return "addLesson";
	}
	@GetMapping("/studentHome")
	public String studentHome()
	{
			return "studentHome";
	}
	@GetMapping("/trainerHome")
	public String trainerHome()
	{
			return "trainerHome";
	}
	@GetMapping("/getCourses")
	public String getCourses()
	{
			return "getCourses";
	}
	@GetMapping("/myCourses")
	public String myCourses()
	{
			return "myCourses";
	}
	@GetMapping("/buyCourse")
	public String buyCourse()
	{
			return "buyCourse";
	}
	@GetMapping("/showLesson")
	public String showLesson()
	{
			return "showLesson";
	}
	@GetMapping("/payment")
	public String payment()
	{
			return "payment";
	}
	@GetMapping("/myLesson")
	public String myLesson()
	{
			return "myLesson";
	}
	@GetMapping("/aboutus")
	public String aboutus()
	{
			return "aboutus";
	}
	@GetMapping("/index")
	public String index()
	{
			return "index";
	}
	@GetMapping("/purchase")
	public String purchase()
	{
			return "purchase";
	}
	
	
	
	////////////////////
	@GetMapping("/TaskStudent")
	public String TaskStudent()
	{
		return "TaskStudent";
		
	}
	@GetMapping("/TaskAddTeacher")
	public String TaskAddTeacher()
	{
		return "TaskAddTeacher";
		
	}
	@GetMapping("/AddTaskStudent")
	public String AddTaskStudent()
	{
		return "AddTaskStudent";
		
	}
}




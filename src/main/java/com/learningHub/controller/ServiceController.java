package com.learningHub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.learningHub.entity.Comment;
import com.learningHub.entity.Users;
import com.learningHub.services.CommentService;
import com.learningHub.services.UserService;

@Controller
public class ServiceController {
	
	@Autowired
	UserService uService;
	
	@Autowired
	CommentService cService;
	
	@PostMapping("/addUser")
	public String addUser(@RequestParam("firstname")String firstname,
			@RequestParam("lastname")String lastname,
			@RequestParam("inputEmail3")String email,
			@RequestParam("inputPassword3")String password,
			@RequestParam("role")String role,
			@RequestParam("mobile")String mobile)
	{
		boolean existEmail=uService.checkEmail(email);
		if(existEmail==false) 
		{
		Users user=new Users();
		user.setFirstname(firstname);
		user.setLastname(lastname);
		user.setEmail(email);
		user.setPassword(password);
		user.setRole(role);
		user.setMobile(mobile);
		uService.addUser(user);
		System.out.println("SUCESSFUL");
		return "redirect:/login";
		}
		else
		{
			System.out.println("NOT REGISTERED");
			return "redirect:/register";
		}
		
	}
	@PostMapping("/login")
	public String userLogin(@RequestParam("inputEmail") String email,
			@RequestParam("inputPassword") String password)
	{
		boolean existEmail=uService.checkEmail(email);
		if(existEmail==true) 
		{
			boolean val=uService.validate(email, password);
			System.out.println(val);
			if(val==true)
			{
				if(uService.getUserRole(email).equals("Trainer")) {
				
				return "trainerHome";
				}
				else
				{
					return "studentHome";
				}
		}
		else
		{
			System.out.println("register first");
			return "register";
		}
		
	}
		return "login failed";
	}
	@PostMapping("/addComment")
	public String addComment(@RequestParam("comment") String comment, Model model)
	{
		
		Comment c=new Comment();
		c.setComment(comment);
		cService.addComment(c);
		List<Comment> com= cService.commentList();
		model.addAttribute("allcomments", com);
		return "myLesson";
	}
	
	
	
}

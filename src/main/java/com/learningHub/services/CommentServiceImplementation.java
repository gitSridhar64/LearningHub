package com.learningHub.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learningHub.Repository.CommentRepository;
import com.learningHub.entity.Comment;

@Service
public class CommentServiceImplementation implements CommentService{

	@Autowired
	CommentRepository comRepo;
	
	@Override
	public List<Comment> commentList() {
		
		// TODO Auto-generated method stub
		return comRepo.findAll(); 
	}

	@Override
	public String addComment(Comment comment) {
		comRepo.save(comment);
		// TODO Auto-generated method stub
		return "comment Added";
	}

}
package com.learningHub.services;

import java.util.List;

import com.learningHub.entity.Comment;

public interface CommentService {
	List<Comment> commentList();
	String addComment(Comment comment);

}

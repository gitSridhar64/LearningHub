package com.learningHub.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learningHub.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment, Integer>{

}

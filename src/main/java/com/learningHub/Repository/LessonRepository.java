package com.learningHub.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learningHub.entity.Lesson;

public interface LessonRepository extends JpaRepository<Lesson, Integer>{

}

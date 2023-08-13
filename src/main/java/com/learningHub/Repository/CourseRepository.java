package com.learningHub.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learningHub.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Integer>{
}

package com.learningHub.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learningHub.entity.MyCourses;

public interface MyCourseRepository extends JpaRepository<MyCourses,Integer>{
		public List<MyCourses> getByEmail(String email);
}

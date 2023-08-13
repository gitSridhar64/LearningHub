package com.learningHub.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class MyCourses {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int myCourseId;
	int courseId;
	String email;
	String courseName;
	int coursePrice;
	public MyCourses() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MyCourses(int myCourseId, int courseId, String email, String courseName, int coursePrice) {
		super();
		this.myCourseId = myCourseId;
		this.courseId = courseId;
		this.email = email;
		this.courseName = courseName;
		this.coursePrice = coursePrice;
	}
	public int getMyCourseId() {
		return myCourseId;
	}
	public void setMyCourseId(int myCourseId) {
		this.myCourseId = myCourseId;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getCoursePrice() {
		return coursePrice;
	}
	public void setCoursePrice(int coursePrice) {
		this.coursePrice = coursePrice;
	}
	@Override
	public String toString() {
		return "MyCourses [myCourseId=" + myCourseId + ", CourseId=" + courseId + ", email=" + email + ", courseName="
				+ courseName + ", coursePrice=" + coursePrice + "]";
	}
	
}

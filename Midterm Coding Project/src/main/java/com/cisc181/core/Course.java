package com.cisc181.core;

import java.util.*;

public class Course {
	
	private UUID courseID;
	private String courseName;
	private int gradePoints;
	
	public Course(UUID courseID, String courseName, int gradePoints) {
		super();
		this.courseID = courseID;
		this.courseName = courseName;
		this.gradePoints = gradePoints;
	}
	
	public UUID getCourseID() {
		return courseID;
	}

	public void setCourseID(UUID courseID) {
		this.courseID = courseID;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getGradePoints() {
		return gradePoints;
	}

	public void setGradePoints(int gradePoints) {
		this.gradePoints = gradePoints;
	}

}

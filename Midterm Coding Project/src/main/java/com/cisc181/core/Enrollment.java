package com.cisc181.core;
import java.util.*;

public class Enrollment {

	private UUID sectionID;
	private UUID studentID;
	private UUID enrollmentID;
	private double grade;
	
	private void Enrollment() {	
	}
	public Enrollment(UUID sectionID, UUID studentID) {
		this.enrollmentID = UUID.randomUUID();
		this.sectionID = sectionID;
		this.studentID = studentID;
	}
	public UUID getSectionID() {
		return sectionID;
	}
	public void setSectionID(UUID sectionID) {
		this.sectionID = sectionID;
	}
	public UUID getStudentID() {
		return studentID;
	}
	public void setStudentID(UUID studentID) {
		this.studentID = studentID;
	}
	public UUID getEnrollmentID() {
		return enrollmentID;
	}
	public void setEnrollmentID(UUID enrollmentID) {
		this.enrollmentID = enrollmentID;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	
}

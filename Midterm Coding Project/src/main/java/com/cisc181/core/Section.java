package com.cisc181.core;
import java.util.*;

public class Section {
	
	private UUID courseID;
	private UUID semesterID;
	private UUID sectionID;
	private int roomID;
	
	public Section(UUID courseID, UUID semesterID, UUID sectionID, int roomID) {
		super();
		this.courseID = courseID;
		this.semesterID = semesterID;
		this.sectionID = sectionID;
		this.roomID = roomID;
	}
	public UUID getCourseID() {
		return courseID;
	}
	public void setCourseID(UUID courseID) {
		this.courseID = courseID;
	}	
	public UUID getSemesterID() {
		return semesterID;
	}
	public void setSemesterID(UUID semesterID) {
		this.semesterID = semesterID;
	}
	public UUID getSectionID() {
		return sectionID;
	}
	public void setSectionID(UUID sectionID) {
		this.sectionID = sectionID;
	}
	public int getRoomID() {
		return roomID;
	}
	public void setRoomID(int roomID) {
		this.roomID = roomID;
	}
	public void add(Enrollment enrollment) {
		// TODO Auto-generated method stub
	}
	public Enrollment get(int k) {
		// TODO Auto-generated method stub
		return null;
	}
}

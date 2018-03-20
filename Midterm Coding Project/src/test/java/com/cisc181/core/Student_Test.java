package com.cisc181.core;

import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;
import com.cisc181.eNums.eMajor;



public class Student_Test {
	
	static ArrayList<Student> students = new ArrayList<Student>();
	static ArrayList<Course> courses = new ArrayList<Course>();
	static ArrayList<Semester> semesters = new ArrayList<Semester>();
	static ArrayList<Section> sections = new ArrayList<Section>();
	private static ArrayList<Enrollment> enrollment= new ArrayList<Enrollment>();
	
	public static Date newDate(int yr, int mon, int day) {
		Calendar cal2 = Calendar.getInstance();
		cal2.set(yr, mon, day);
		return cal2.getTime();
	}
	
	@BeforeClass
	
	public static void setup() {
		//three courses added to course arraylist
		Course nurs = new Course(UUID.randomUUID(), "Nursing101", 100, eMajor.NURSING);
		Course  bus = new Course(UUID.randomUUID(), "Intro to Business", 100, eMajor.BUSINESS);
		Course chem = new Course(UUID.randomUUID(), "Chemistry101", 100, eMajor.CHEM);
		courses.add(nurs);
		courses.add(bus);
		courses.add(chem);
		//three Course records added to semester arraylist
		Semester fall2017 = new Semester(UUID.randomUUID(), newDate(2017, 8, 31), newDate(2017, 12, 11));
		Semester spring2018 = new Semester(UUID.randomUUID(), newDate(2018, 2, 5), newDate(2018, 5, 24));
		semesters.add(fall2017);
		semesters.add(spring2018);
		//two Sections for each Course and semester added to section arraylist
		Section fallNurs = new Section(nurs.getCourseID(), fall2017.getSemesterID(), UUID.randomUUID(), 123);
		Section springNurs = new Section(nurs.getCourseID(), spring2018.getSemesterID(), UUID.randomUUID(), 202);
		Section fallBus = new Section(bus.getCourseID(), fall2017.getSemesterID(), UUID.randomUUID(), 234);
		Section springBus = new Section(bus.getCourseID(), spring2018.getSemesterID(), UUID.randomUUID(), 115);
		Section fallChem = new Section(chem.getCourseID(), fall2017.getSemesterID(), UUID.randomUUID(), 808);
		Section springChem = new Section(chem.getCourseID(), spring2018.getSemesterID(), UUID.randomUUID(), 101);
		sections.add(fallNurs);
		sections.add(springNurs);
		sections.add(fallBus);
		sections.add(springBus);
		sections.add(fallChem);
		sections.add(springChem);
		// 10 students added to student arraylist
		Student student1 = new Student("Molly", "Lee", "Donald", newDate(1998, 1, 2), eMajor.NURSING, "110 Calvin Road",
				"(508)-655-4444", "modo@udel.edu", UUID.randomUUID());

		Student student2 = new Student("Thalia", "Janice", "Cobb", newDate(1995, 2, 3), eMajor.NURSING,
				"1200 Wall Street", "(508)-202-1034", "TJC@udel.edu", UUID.randomUUID());

		Student student3 = new Student("Angela", "Sage", "Walter", newDate(1994, 3, 4), eMajor.NURSING,
				"983 Red Road", "(508)-657-7889", "Sagey@udel.edu", UUID.randomUUID());

		Student student4 = new Student("Eddie", "Taylor", "Randolph", newDate(1996, 4, 5), eMajor.NURSING, "159 Bretton Hill Street",
				"(508)-808-8008", "eddieR@udel.edu", UUID.randomUUID());

		Student student5 = new Student("Tray", "Timothy", "Tibetts", newDate(1996, 5, 6), eMajor.BUSINESS, 
				"7 Taper Road", "(508)-108-8924", "ttt@udel.edu", UUID.randomUUID());

		Student student6 = new Student("Joanna", "Tammy", "Shaffe", newDate(1997, 6, 7), eMajor.BUSINESS,
				"54 Kite Circle", "(508)-662-4914", "joannas@udel.edu", UUID.randomUUID());

		Student student7 = new Student("Callum", "Henry", "Heaslewood", newDate(1999, 7, 8), eMajor.CHEM, "8 Free Road",
				"(584)-117-0982", "callumhh@udel.edu", UUID.randomUUID());

		Student student8 = new Student("Marcus", "Ralf", "Cruz", newDate(1995, 8, 9), eMajor.CHEM, "78 A Street",
				"(508)-112-1110", "marcrc@udel.edu", UUID.randomUUID());

		Student student9 = new Student("Tim", "Tom", "Taylor", newDate(1996, 9, 10), eMajor.PHYSICS,
				"44 Hot Road", "(508)-376-9111", "TimTaylore@udel.edu", UUID.randomUUID());

		Student student10 = new Student("Stacy", "Ruby", "Beiber", newDate(1997, 10, 11), eMajor.PHYSICS, "70 New Drive",
				"(508)-666-7722", "Rubyred@udel.edu", UUID.randomUUID());
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);
		students.add(student6);
		students.add(student7);
		students.add(student8);
		students.add(student9);
		students.add(student10);
		//possible grades in each course
		ArrayList<Integer> grades1 = new ArrayList<Integer>(Arrays.asList(100, 94, 88, 88, 79, 78, 78, 70, 65, 62));
		ArrayList<Integer> grades2 = new ArrayList<Integer>(Arrays.asList(99, 93, 88, 87, 83, 83, 79, 78, 70, 58));
		ArrayList<Integer> grades3 = new ArrayList<Integer>(Arrays.asList(100, 92, 87, 87, 87, 85, 82, 77, 70, 60));
		//assigns students grades
		for (int k = 0; k < students.size(); k++) {

			fallNurs.add(new Enrollment(sections.get(0).getSectionID(), students.get(k).getStudentID()));
			fallNurs.get(k).setGrade(grades1.get(k));

			springNurs.add(new Enrollment(sections.get(1).getSectionID(), students.get(k).getStudentID()));
			springNurs.get(k).setGrade(grades2.get(k));

			fallBus.add(new Enrollment(sections.get(2).getSectionID(), students.get(k).getStudentID()));
			fallBus.get(k).setGrade(grades3.get(k));

			springBus.add(new Enrollment(sections.get(3).getSectionID(), students.get(k).getStudentID()));
			springBus.get(k).setGrade(grades1.get(k));

			fallChem.add(new Enrollment(sections.get(4).getSectionID(), students.get(k).getStudentID()));
			fallChem.get(k).setGrade(grades2.get(k));

			springChem.add(new Enrollment(sections.get(5).getSectionID(), students.get(k).getStudentID()));
			springChem.get(k).setGrade(grades3.get(k));
		}
	}
		public static double AvgCourseGrade(ArrayList<Enrollment> courses) {

			double average = 0;
			double courseAverage = 0;

			for (int y = 0; y < students.size(); y++) { 
				average += courses.get(y).getGrade();
				courseAverage = (average / students.size());
			}
			return courseAverage;
	}
		public double getGPA(UUID id) {
			
			double GPA = 0.00;
			
			for (Enrollment enrollment : enrollment) {
				
				if (enrollment.getStudentID() == id) {
					
					if (enrollment.getGrade() >= 93) {
						GPA = 4.00;
					} else if (enrollment.getGrade() >= 90 && enrollment.getGrade() < 93) {
						GPA = 3.7;
					} else if (enrollment.getGrade() >= 87 && enrollment.getGrade() < 90) {
						GPA = 3.3;
					} else if (enrollment.getGrade() >= 83 && enrollment.getGrade() < 87) {
						GPA = 3.0;
					} else if (enrollment.getGrade() >= 80 && enrollment.getGrade() < 83) {
						GPA = 2.7;
					} else if (enrollment.getGrade() >= 77 && enrollment.getGrade() < 80) {
						GPA = 2.3;
					} else if (enrollment.getGrade() >= 73 && enrollment.getGrade() < 77) {
						GPA = 2.0;
					} else if (enrollment.getGrade() >= 70 && enrollment.getGrade() < 73) {
						GPA = 1.7;
					} else if (enrollment.getGrade() >= 67 && enrollment.getGrade() < 70) {
						GPA = 1.5;
					} else if (enrollment.getGrade() >= 63 && enrollment.getGrade() < 67) {
						GPA = 1.3;
					} else if (enrollment.getGrade() >= 60 && enrollment.getGrade() < 63) {
						GPA = 1.0;
					} else if (enrollment.getGrade() < 60) {
						GPA = 0.0;
					}
				}
			}

			return GPA;
		}

	@Test
	public void testGPA() {
		
		assertEquals(getGPA(enrollment.get(0).getStudentID()), 4.0, 0.1);
	}
}
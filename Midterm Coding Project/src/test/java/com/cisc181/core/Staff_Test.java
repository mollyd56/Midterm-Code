package com.cisc181.core;

import static org.junit.Assert.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Calendar;
import org.junit.BeforeClass;
import org.junit.Test;
import com.cisc181.eNums.eTitle;

public class Staff_Test {
	
	static ArrayList<Staff> staff = new ArrayList<Staff>();

	public static Date newDate(int yr, int mon, int day) {
		Calendar cal = Calendar.getInstance();
		cal.set(yr, mon, day);
		return cal.getTime();
	}

	@BeforeClass
	public static void setup() {
		
		staff.add(new Staff("Molly", "Luisa", "Doyle", newDate(1997, 8, 27), "Deerfield Road", "(123)-456-7890",
				"mollyd56@udel.edu", "TH 10:00-12:00am", 1, 100000, newDate(2000, 2, 4), eTitle.MS));

		staff.add(new Staff("Mary", "Lou", "Who", newDate(2012, 12, 24), "Main Street", "(508)-596-8457",
				"grinch@udel.edu", "W 11:00-12:00am", 1, 52000, newDate(2018, 3, 19), eTitle.MS));

		staff.add(new Staff("Emily", "May", "Driver", newDate(1969, 5, 17), "North Chapel Street", "(508)-302-4612",
				"beepbeep@udel.edu", "MW 1:00-2:30pm", 2, 60000, newDate(1990, 7, 5), eTitle.MRS));

		staff.add(new Staff("Gabby", "Kathleen", "Shanahan", newDate(1958, 1, 30), "East Delaware Avenue", "(345)-997-6756",
				"sadgab@udel.edu", "F 4:00-5:00pm", 4, 80000, newDate(1975, 4, 2), eTitle.MRS));

		staff.add(new Staff("Peter", "James", "Athy", newDate(1998, 4, 13), "Washington Street", "(898)-223-6786",
				"pete@udel.edu", "M 8:15-10:15am", 3, 45000, newDate(2005, 5, 18), eTitle.MR));
	}
	//exception for invalid DOB
	@Test(expected = PersonException.class)
	public void testingDOBException() throws PersonException {
		new Staff("Bob", "Tan", "Man", newDate(1890, 3, 29), "Cavalier Road", "(508)-222-4654",
				"bobby@udel.edu", "TH 12:00-1:15pm", 4, 49300, newDate(2000, 4, 19), eTitle.MR);
	}
	//exception for invalid phone number
	@Test(expected = PersonException.class)
	public void testingPhoneException() throws PersonException {
		new Staff("Bob", "Tan", "Man", newDate(1945, 3, 29), "Cavalier Road", "508-222-4654",
				"bobby@udel.edu", "TH 12:00-1:15pm", 4, 49300, newDate(2000, 4, 19), eTitle.MR);
	}
	
	@Test
	public void testingSalaryException() throws PersonException {
		double sum = 0;
		for (Staff avgStaff : staff) {
			sum += avgStaff.getSalary();
			}
		double average = sum / staff.size();
		assertEquals(67400, average, .01);
	}	

}

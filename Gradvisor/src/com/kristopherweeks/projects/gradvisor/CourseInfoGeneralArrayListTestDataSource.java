package com.kristopherweeks.projects.gradvisor;

import java.util.ArrayList;
import java.util.Iterator;

public class CourseInfoGeneralArrayListTestDataSource implements CourseInfoGeneralDataSource {


	private ArrayList<CourseInfoGeneral> courses = new ArrayList<CourseInfoGeneral>();
	private Iterator<CourseInfoGeneral> iterator;

	public CourseInfoGeneralArrayListTestDataSource() {
		super();
		initializeCourseArrayList();
	}

	private void initializeCourseArrayList() {
			
		
		
			//Testing for Credits, GPA, and enrollment status	
		
		courses.add(new CourseInfoGeneral(
				"Learning Java", "Dr. Kevin Trainor", 
				"Spring", 2016,	"LIS", 452, "1A", "University of Illinois", "Online", "100% Online", 
				false, null, true, 1, true, 2, false, null, false, null, false, null, false, null, false, null, false, 
				null, false, null, false, null, false, null, false, null, false, null, false, null, false, null, false, null, false, null,
				false, null,  false, null, false, null, false, 
				//Enrollment Status
				false, false, true, 
				//Credits and GPA
				4.0, 4.0, null,
				//remaining items
				"05/05/2016", "08/21/2016", 3, 3, 3, "Jana Diesner", "", "Programming Skills", "Logic,"));
		courses.add(new CourseInfoGeneral(
				"Learning Java", "Dr. Kevin Trainor", 
				"Spring", 2016,	"LIS", 452, "1A", "University of Illinois", "Online", "100% Online", 
				false, null, true, 1, true, 2, false, null, false, null, false, null, false, null, false, null, false, 
				null, false, null, false, null, false, null, false, null, false, null, false, null, false, null, false, null, false, null,
				false, null,  false, null, false, null, false, 
				//Enrollment Status
				false, true, false, 
				//Credits and GPA
				3.0, 3.0, null,
				//remaining items
				"05/05/2016", "08/21/2016", 3, 3, 3, "Jana Diesner", "", "Programming Skills", "Logic,"));
		courses.add(new CourseInfoGeneral(
				"Learning Java", "Dr. Kevin Trainor", 
				"Spring", 2016,	"LIS", 452, "1A", "University of Illinois", "Online", "100% Online", 
				false, null, true, 1, true, 2, false, null, false, null, false, null, false, null, false, null, false, 
				null, false, null, false, null, false, null, false, null, false, null, false, null, false, null, false, null, false, null,
				false, null,  false, null, false, null, false, 
				//Enrollment Status
				false, true, false, 
				//Credits and GPA
				1.0, 1.0, null,
				//remaining items
				"05/05/2016", "08/21/2016", 3, 3, 3, "Jana Diesner", "", "Programming Skills", "Logic,"));
		courses.add(new CourseInfoGeneral(
				"Learning Java", "Dr. Kevin Trainor", 
				"Spring", 2016,	"LIS", 452, "1A", "University of Illinois", "Online", "100% Online", 
				false, null, true, 1, true, 2, false, null, false, null, false, null, false, null, false, null, false, 
				null, false, null, false, null, false, null, false, null, false, null, false, null, false, null, false, null, false, null,
				false, null,  false, null, false, null, false, 
				//Enrollment Status
				true, false, false, 
				//Credits and GPA
				4.0, 4.0, 4.0,
				//remaining items
				"05/05/2016", "08/21/2016", 3, 3, 3, "Jana Diesner", "", "Programming Skills", "Logic,"));
		courses.add(new CourseInfoGeneral(
				"Learning Java", "Dr. Kevin Trainor", 
				"Spring", 2016,	"LIS", 452, "1A", "University of Illinois", "Online", "100% Online", 
				false, null, true, 1, true, 2, false, null, false, null, false, null, false, null, false, null, false, 
				null, false, null, false, null, false, null, false, null, false, null, false, null, false, null, false, null, false, null,
				false, null,  false, null, false, null, false, 
				//Enrollment Status
				true, false, false, 
				//Credits and GPA
				4.0, 2.0, 2.0,
				//remaining items
				"05/05/2016", "08/21/2016", 3, 3, 3, "Jana Diesner", "", "Programming Skills", "Logic,"));
		

		
		iterator = courses.iterator();
		
		
	}

	public CourseInfoGeneral getNextCourseInfoGeneral() {
		CourseInfoGeneral answer;
		
		if (iterator.hasNext()) {
			answer = iterator.next();
		} else {
			answer = null;
		}	
		
		return answer;
	}

	
	

}
	


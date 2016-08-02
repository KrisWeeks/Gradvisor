package com.kristopherweeks.projects.gradvisor;

import java.util.ArrayList;
import java.util.Iterator;

public class CourseInfoGeneralArrayListTestDataSource implements CourseInfoGeneralDataSource {


	private ArrayList<CourseInfoGeneral> courses = new ArrayList<CourseInfoGeneral>();
	private Iterator<CourseInfoGeneral> iterator;

	public CourseInfoGeneralArrayListTestDataSource() {
		super();
		initializeVehicleArrayList();
	}

	private void initializeVehicleArrayList() {
	
				
		courses.add(new CourseInfoGeneral("Learning Java", "Kevin Trainor", "Summer", 2016, "LIS", 452, "1",
				"University of Illinois", "Online", "100% Online", false, "", false, "", false, "", false, "", false,
				"", false, true, false, false, 4.0, 4.0, 4.0, "5/1/2016", "8/2/2016", 3, 3, 3, "Jana Diesner", "",
				"Java programming", "Logical Thinking"));
		courses.add(new CourseInfoGeneral("Learning Java", "Kevin Trainor", "Summer", 2016, "LIS", 452, "1",
				"University of Illinois", "Online", "100% Online", false, "", false, "", false, "", false, "", false,
				"", false, true, false, false, 3.0, 3.0, 3.0, "5/1/2016", "8/2/2016", 4, 4, 4, "Jana Diesner", "",
				"Java programming", "Logical Thinking"));
		courses.add(new CourseInfoGeneral("Learning Java", "Kevin Trainor", "Summer", 2016, "LIS", 452, "1",
				"University of Illinois", "Online", "100% Online", false, "", false, "", false, "", false, "", false,
				"", true, false, false, true , 1.0, 4.0, null, "5/1/2016", "8/2/2016", 6, 6, 6, "Jana Diesner", "",
				"Java programming", "Logical Thinking"));
		courses.add(new CourseInfoGeneral("Learning Java", "Kevin Trainor", "Summer", 2016, "LIS", 452, "1",
				"University of Illinois", "Online", "100% Online", false, "", false, "", false, "", false, "", false,
				"", false, true, false, false, 4.0, 4.0, 4.0, "5/1/2016", "8/2/2016", 6, 6, 6, "Jana Diesner", "",
				"Java programming", "Logical Thinking"));
		courses.add(new CourseInfoGeneral("Learning Java", "Kevin Trainor", "Summer", 2016, "LIS", 452, "1",
				"University of Illinois", "Online", "100% Online", false, "", false, "", false, "", false, "", false,
				"", false, false, true, false, 3.5, 3.5, null, "5/1/2016", "8/2/2016", 6, 6, 6, "Jana Diesner", "",
				"Java programming", "Logical Thinking"));
		

		
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
	


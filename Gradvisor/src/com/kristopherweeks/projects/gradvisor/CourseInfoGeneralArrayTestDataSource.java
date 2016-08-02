package com.kristopherweeks.projects.gradvisor;

public class CourseInfoGeneralArrayTestDataSource implements CourseInfoGeneralDataSource {

	public static final int Number_Of_Courses = 5;

	private CourseInfoGeneral[] courses = new CourseInfoGeneral[Number_Of_Courses];
	private int nextAvailableIndex = 0;
	private boolean isExhausted = false;

	public CourseInfoGeneralArrayTestDataSource() {
		super();
		initializeCourseArray();
	}

	private void initializeCourseArray() {

		

		
		// Testing Credits and GPA calculations

		courses[0] = new CourseInfoGeneral("Learning Java", "Kevin Trainor", "Summer", 2016, "LIS", 452, "1",
				"University of Illinois", "Online", "100% Online", false, "", false, "", false, "", false, "", false,
				"", false, true, false, false, 4.0, 4.0, 4.0, "5/1/2016", "8/2/2016", 3, 3, 3, "Jana Diesner", "",
				"Java programming", "Logical Thinking");
		courses[1] = new CourseInfoGeneral("Learning Java", "Kevin Trainor", "Summer", 2016, "LIS", 452, "1",
				"University of Illinois", "Online", "100% Online", false, "", false, "", false, "", false, "", false,
				"", false, true, false, false, 3.0, 3.0, 3.0, "5/1/2016", "8/2/2016", 4, 4, 4, "Jana Diesner", "",
				"Java programming", "Logical Thinking");
		courses[2] = new CourseInfoGeneral("Learning Java", "Kevin Trainor", "Summer", 2016, "LIS", 452, "1",
				"University of Illinois", "Online", "100% Online", false, "", false, "", false, "", false, "", false,
				"", true, false, false, true , 1.0, 4.0, null, "5/1/2016", "8/2/2016", 6, 6, 6, "Jana Diesner", "",
				"Java programming", "Logical Thinking");
		courses[3] = new CourseInfoGeneral("Learning Java", "Kevin Trainor", "Summer", 2016, "LIS", 452, "1",
				"University of Illinois", "Online", "100% Online", false, "", false, "", false, "", false, "", false,
				"", false, true, false, false, 4.0, 4.0, 4.0, "5/1/2016", "8/2/2016", 6, 6, 6, "Jana Diesner", "",
				"Java programming", "Logical Thinking");
		courses[4] = new CourseInfoGeneral("Learning Java", "Kevin Trainor", "Summer", 2016, "LIS", 452, "1",
				"University of Illinois", "Online", "100% Online", false, "", false, "", false, "", false, "", false,
				"", false, false, true, false, 3.5, 3.5, null, "5/1/2016", "8/2/2016", 6, 6, 6, "Jana Diesner", "",
				"Java programming", "Logical Thinking");
	}

	public CourseInfoGeneral getNextCourseInfoGeneral() {
		CourseInfoGeneral answer;
		if (isExhausted) {
			answer = null;
		} else {
			answer = courses[nextAvailableIndex];
			if (nextAvailableIndex == (Number_Of_Courses - 1)) {
				isExhausted = true;
			} else {
				nextAvailableIndex++;
			}
		}
		return answer;

	}

}

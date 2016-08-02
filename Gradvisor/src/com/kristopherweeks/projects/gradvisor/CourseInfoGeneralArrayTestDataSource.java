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

		

		
		// Testing credits, GPA, and enrollment status
			courses[0] = new CourseInfoGeneral("Learning Java", "Dr. Kevin Trainor", "Spring", 2016, "LIS", 452, "1A", "University of Illinois", "Online", "100% Online", 
						false, null, true, 1, true, 2, false, null, false, null, false, null, false, null, false, null, false, 
						null, false, null, false, null, false, null, false, null, false, null, false, null, false, null, false, null, false, null,
						false, null,  false, null, false, null, false, 
						//Enrollment Status
						false, false, true, 
						//Credits and GPA
						4.0, 4.0, null,
						//remaining items
						"05/05/2016", "08/21/2016", 3, 3, 3, "Jana Diesner", "", "Programming Skills", "Logic,");
			courses[1] = new CourseInfoGeneral("Learning Java", "Dr. Kevin Trainor", "Spring", 2016, "LIS", 452, "1A", "University of Illinois", "Online", "100% Online", 
						false, null, true, 1, true, 2, false, null, false, null, false, null, false, null, false, null, false, 
						null, false, null, false, null, false, null, false, null, false, null, false, null, false, null, false, null, false, null,
						false, null,  false, null, false, null, false, 
						//Enrollment Status
						false, true, false, 
						//Credits and GPA
						3.0, 3.0, null,
						//remaining items
						"05/05/2016", "08/21/2016", 3, 3, 3, "Jana Diesner", "", "Programming Skills", "Logic,");
			courses[2] = new CourseInfoGeneral("Learning Java", "Dr. Kevin Trainor", 
						"Spring", 2016,	"LIS", 452, "1A", "University of Illinois", "Online", "100% Online", 
						false, null, true, 1, true, 2, false, null, false, null, false, null, false, null, false, null, false, 
						null, false, null, false, null, false, null, false, null, false, null, false, null, false, null, false, null, false, null,
						false, null,  false, null, false, null, false, 
						//Enrollment Status
						false, true, false, 
						//Credits and GPA
						1.0, 1.0, null,
						//remaining items
						"05/05/2016", "08/21/2016", 3, 3, 3, "Jana Diesner", "", "Programming Skills", "Logic,");
			courses[3] = new CourseInfoGeneral("Learning Java", "Dr. Kevin Trainor", 
						"Spring", 2016,	"LIS", 452, "1A", "University of Illinois", "Online", "100% Online", 
						false, null, true, 1, true, 2, false, null, false, null, false, null, false, null, false, null, false, 
						null, false, null, false, null, false, null, false, null, false, null, false, null, false, null, false, null, false, null,
						false, null,  false, null, false, null, false, 
						//Enrollment Status
						true, false, false, 
						//Credits and GPA
						4.0, 4.0, 4.0,
						//remaining items
						"05/05/2016", "08/21/2016", 3, 3, 3, "Jana Diesner", "", "Programming Skills", "Logic,");
			courses[4] = new CourseInfoGeneral(	"Learning Java", "Dr. Kevin Trainor", 
						"Spring", 2016,	"LIS", 452, "1A", "University of Illinois", "Online", "100% Online", 
						false, null, true, 1, true, 2, false, null, false, null, false, null, false, null, false, null, false, 
						null, false, null, false, null, false, null, false, null, false, null, false, null, false, null, false, null, false, null,
						false, null,  false, null, false, null, false, 
						//Enrollment Status
						true, false, false, 
						//Credits and GPA
						4.0, 2.0, 2.0,
						//remaining items
						"05/05/2016", "08/21/2016", 3, 3, 3, "Jana Diesner", "", "Programming Skills", "Logic,");
				
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

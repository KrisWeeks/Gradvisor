package com.kristopherweeks.projects.gradvisor;

import static org.junit.Assert.*;

import org.junit.Test;

public class CourseInfoGeneralTest {

	@Test
	public void testNoArgumentConstructor() {
		CourseInfoGeneral course1 = new CourseInfoGeneral();
		assertNotNull(course1);
	}

	@Test
	public void testFullyOverloadedConstructor() {
		String expectedTitle = "Learning Java";
		String expectedInstructor = "The Honorable Dr. Kevin Trainor";
		String expectedSemester = "Summer";
		int expectedYear = 2016;
		String expectedDepartmentCode = "LIS";
		int expectedCourseNumber = 452;
		String expectedSectionNumber = "1";
		String expectedInstitution = "University of Illinois";
		String expectedLocation = "Online";
		String expectedOnline = "Completely Online";
		boolean expectedGeneralRequirement = false;
		String expectedGeneralCategory = "No Category";
		boolean expectedFirstMajorRequirement = false;
		String expectedFirstMajorCategory = "No Category";
		boolean expectedSecondMajorRequirement = false;
		String expectedSecondMajorCategory = "No Category";
		boolean expectedFirstMinorRequirement = false;
		String expectedFirstMinorCategory = "No Category";
		boolean expectedSecondMinorRequirement = false;
		String expectedSecondMinorCategory = "No Category";
		boolean expectedFreeElective = true;
		boolean expectedCompleted = false;
		boolean expectedConsideringEnrollment = false;
		boolean expectedCurrentEnrollment = false;
		double expectedCredits = 4.0;
		double expectedGpaDesired = 4.0;
		double expectedGpaEarned = 4.0;
		String expectedCourseStartDate = "05/21/2016";
		String expectedCourseEndDate = "08/02/2016";
		int expectedCoursePredictedDifficulty = 3;
		int expectedCoursePredictedWorkload = 3;
		int expectedPredictedEnjoyability = 3;
		String expectedRecommendedByWho = "Jana Diesner";
		String expectedNotRecommendedByWho = "Nobody";
		String expectedProfessionalSkills = "Java Programming";
		String expectedAcademicSkills = "Data Analysis";
		CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, expectedSemester,
				expectedYear, expectedDepartmentCode, expectedCourseNumber, expectedSectionNumber, expectedInstitution,
				expectedLocation, expectedOnline, expectedGeneralRequirement, expectedGeneralCategory,
				expectedFirstMajorRequirement, expectedFirstMajorCategory, expectedSecondMajorRequirement,
				expectedSecondMajorCategory, expectedFirstMinorRequirement, expectedFirstMinorCategory,
				expectedSecondMinorRequirement, expectedSecondMinorCategory, expectedFreeElective, expectedCompleted,
				expectedConsideringEnrollment, expectedCurrentEnrollment, expectedCredits, expectedGpaDesired, expectedGpaEarned,
				expectedCourseStartDate, expectedCourseEndDate, expectedCoursePredictedDifficulty,
				expectedCoursePredictedWorkload, expectedPredictedEnjoyability, expectedRecommendedByWho,
				expectedNotRecommendedByWho, expectedProfessionalSkills, expectedAcademicSkills);

		assertNotNull(course1);
		assertEquals(expectedTitle, course1.getTitle());
		assertEquals(expectedInstructor, course1.getInstructor());
		assertEquals(expectedSemester, course1.getSemester());
		assertEquals(expectedYear, course1.getYear());
		assertEquals(expectedDepartmentCode, course1.getDepartmentCode());
		assertEquals(expectedCourseNumber, course1.getCourseNumber());
		assertEquals(expectedSectionNumber, course1.getSectionNumber());
		assertEquals(expectedInstitution, course1.getInstitution());
		assertEquals(expectedLocation, course1.getLocation());
		assertEquals(expectedOnline, course1.getOnline());
		assertEquals(expectedGeneralRequirement, course1.isGeneralRequirement());
		assertEquals(expectedGeneralCategory, course1.getGeneralCategory());
		assertEquals(expectedFirstMajorRequirement, course1.isFirstMajorRequirement());
		assertEquals(expectedFirstMajorCategory, course1.getFirstMajorCategory());
		assertEquals(expectedSecondMajorRequirement, course1.isSecondMajorRequirement());
		assertEquals(expectedSecondMajorCategory, course1.getSecondMajorCategory());
		assertEquals(expectedFirstMinorRequirement, course1.isFirstMinorRequirement());
		assertEquals(expectedFirstMinorCategory, course1.getFirstMinorCategory());
		assertEquals(expectedSecondMinorRequirement, course1.isSecondMinorRequirement());
		assertEquals(expectedSecondMinorCategory, course1.getSecondMajorCategory());
		assertEquals(expectedFreeElective, course1.isFreeElective());
		assertEquals(expectedCompleted, course1.isCompleted());
		assertEquals(expectedConsideringEnrollment, course1.isConsideringEnrollment());
		assertEquals(expectedCurrentEnrollment, course1.isCurrentEnrollment());
		assertEquals(expectedCredits, course1.getCredits(), 0.01);
		assertEquals(expectedGpaDesired, course1.getGpaDesired(), 0.000001);
		assertEquals(expectedGpaEarned, course1.getGpaEarned(), 0.000001);
		assertEquals(expectedCourseStartDate, course1.getCourseStartDate());
		assertEquals(expectedCourseEndDate, course1.getCourseEndDate());
		assertEquals(expectedCoursePredictedDifficulty, course1.getCoursePredictedDifficulty());
		assertEquals(expectedCoursePredictedWorkload, course1.getCoursePredictedDifficulty());
		assertEquals(expectedPredictedEnjoyability, course1.getPredictedEnjoyability());
		assertEquals(expectedRecommendedByWho, course1.getRecommendedByWho());
		assertEquals(expectedNotRecommendedByWho, course1.getNotRecommendedByWho());
		assertEquals(expectedProfessionalSkills, course1.getProfessionalSkills());
		assertEquals(expectedAcademicSkills, course1.getAcademicSkills());
	}

	@Test
	public void testToString() {
		String expectedTitle = "Learning Java";
		String expectedInstructor = "The Honorable Dr. Kevin Trainor";
		String expectedSemester = "Summer";
		int expectedYear = 2016;
		String expectedDepartmentCode = "LIS";
		int expectedCourseNumber = 452;
		String expectedSectionNumber = "1";
		String expectedInstitution = "University of Illinois";
		String expectedLocation = "Online";
		String expectedOnline = "Completely Online";
		boolean expectedGeneralRequirement = false;
		String expectedGeneralCategory = "No Category";
		boolean expectedFirstMajorRequirement = false;
		String expectedFirstMajorCategory = "No Category";
		boolean expectedSecondMajorRequirement = false;
		String expectedSecondMajorCategory = "No Category";
		boolean expectedFirstMinorRequirement = false;
		String expectedFirstMinorCategory = "No Category";
		boolean expectedSecondMinorRequirement = false;
		String expectedSecondMinorCategory = "No Category";
		boolean expectedFreeElective = true;
		boolean expectedCompleted = false;
		boolean expectedConsideringEnrollment = false;
		boolean expectedCurrentEnrollment = true;
		double expectedCredits = 4.0;
		double expectedGpaDesired = 4.0;
		double expectedGpaEarned = 4.0;
		String expectedCourseStartDate = "05/21/2016";
		String expectedCourseEndDate = "08/02/2016";
		int expectedCoursePredictedDifficulty = 3;
		int expectedCoursePredictedWorkload = 3;
		int expectedPredictedEnjoyability = 3;
		String expectedRecommendedByWho = "Jana Diesner";
		String expectedNotRecommendedByWho = "Nobody";
		String expectedProfessionalSkills = "Java Programming";
		String expectedAcademicSkills = "Data Analysis";
		CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, expectedSemester,
				expectedYear, expectedDepartmentCode, expectedCourseNumber, expectedSectionNumber, expectedInstitution,
				expectedLocation, expectedOnline, expectedGeneralRequirement, expectedGeneralCategory,
				expectedFirstMajorRequirement, expectedFirstMajorCategory, expectedSecondMajorRequirement,
				expectedSecondMajorCategory, expectedFirstMinorRequirement, expectedFirstMinorCategory,
				expectedSecondMinorRequirement, expectedSecondMinorCategory, expectedFreeElective, expectedCompleted,
				expectedConsideringEnrollment, expectedCurrentEnrollment, expectedCredits, expectedGpaDesired, expectedGpaEarned,
				expectedCourseStartDate, expectedCourseEndDate, expectedCoursePredictedDifficulty,
				expectedCoursePredictedWorkload, expectedPredictedEnjoyability, expectedRecommendedByWho,
				expectedNotRecommendedByWho, expectedProfessionalSkills, expectedAcademicSkills);

		String expected = "CourseInfoGeneral [title=Learning Java, instructor=The Honorable Dr. Kevin Trainor, semester=Summer, year=2016, departmentCode=LIS, courseNumber=452, sectionNumber=1, institution=University of Illinois, location=Online, online=Completely Online, generalRequirement=false, generalCategory=No Category, firstMajorRequirement=false, firstMajorCategory=No Category, secondMajorRequirement=false, secondMajorCategory=No Category, firstMinorRequirement=false, firstMinorCategory=No Category, secondMinorRequirement=false, secondMinorCategory=No Category, freeElective=true, completed=false, consideringEnrollment=false, currentEnrollment=true, credits=4.0, gpaDesired=4.0, gpaEarned=4.0, courseStartDate=05/21/2016, courseEndDate=08/02/2016, coursePredictedDifficulty=3, coursePredictedWorkload=3, predictedEnjoyability=3, recommendedByWho=Jana Diesner, notRecommendedByWho=Nobody, professionalSkills=Java Programming, academicSkills=Data Analysis]";
		String actual = course1.toString();
		assertEquals(expected, actual);
	}

	@Test
	public void testEqualsAllFieldsEqual() {
		String expectedTitle = "Learning Java";
		String expectedInstructor = "The Honorable Dr. Kevin Trainor";
		String expectedSemester = "Summer";
		int expectedYear = 2016;
		String expectedDepartmentCode = "LIS";
		int expectedCourseNumber = 452;
		String expectedSectionNumber = "1";
		String expectedInstitution = "University of Illinois";
		String expectedLocation = "Online";
		String expectedOnline = "Completely Online";
		boolean expectedGeneralRequirement = false;
		String expectedGeneralCategory = "No Category";
		boolean expectedFirstMajorRequirement = false;
		String expectedFirstMajorCategory = "No Category";
		boolean expectedSecondMajorRequirement = false;
		String expectedSecondMajorCategory = "No Category";
		boolean expectedFirstMinorRequirement = false;
		String expectedFirstMinorCategory = "No Category";
		boolean expectedSecondMinorRequirement = false;
		String expectedSecondMinorCategory = "No Category";
		boolean expectedFreeElective = true;
		boolean expectedCompleted = false;
		boolean expectedConsideringEnrollment = false;
		boolean expectedCurrentEnrollment = false;
		double expectedCredits = 4.0;
		double expectedGpaDesired = 4.0;
		double expectedGpaEarned = 4.0;
		String expectedCourseStartDate = "05/21/2016";
		String expectedCourseEndDate = "08/02/2016";
		int expectedCoursePredictedDifficulty = 3;
		int expectedCoursePredictedWorkload = 3;
		int expectedPredictedEnjoyability = 3;
		String expectedRecommendedByWho = "Jana Diesner";
		String expectedNotRecommendedByWho = "Nobody";
		String expectedProfessionalSkills = "Java Programming";
		String expectedAcademicSkills = "Data Analysis";
		CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, expectedSemester,
				expectedYear, expectedDepartmentCode, expectedCourseNumber, expectedSectionNumber, expectedInstitution,
				expectedLocation, expectedOnline, expectedGeneralRequirement, expectedGeneralCategory,
				expectedFirstMajorRequirement, expectedFirstMajorCategory, expectedSecondMajorRequirement,
				expectedSecondMajorCategory, expectedFirstMinorRequirement, expectedFirstMinorCategory,
				expectedSecondMinorRequirement, expectedSecondMinorCategory, expectedFreeElective, expectedCompleted,
				expectedConsideringEnrollment, expectedCurrentEnrollment, expectedCredits, expectedGpaDesired, expectedGpaEarned,
				expectedCourseStartDate, expectedCourseEndDate, expectedCoursePredictedDifficulty,
				expectedCoursePredictedWorkload, expectedPredictedEnjoyability, expectedRecommendedByWho,
				expectedNotRecommendedByWho, expectedProfessionalSkills, expectedAcademicSkills);
		CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, expectedSemester,
				expectedYear, expectedDepartmentCode, expectedCourseNumber, expectedSectionNumber, expectedInstitution,
				expectedLocation, expectedOnline, expectedGeneralRequirement, expectedGeneralCategory,
				expectedFirstMajorRequirement, expectedFirstMajorCategory, expectedSecondMajorRequirement,
				expectedSecondMajorCategory, expectedFirstMinorRequirement, expectedFirstMinorCategory,
				expectedSecondMinorRequirement, expectedSecondMinorCategory, expectedFreeElective, expectedCompleted,
				expectedConsideringEnrollment, expectedCurrentEnrollment, expectedCredits, expectedGpaDesired, expectedGpaEarned,
				expectedCourseStartDate, expectedCourseEndDate, expectedCoursePredictedDifficulty,
				expectedCoursePredictedWorkload, expectedPredictedEnjoyability, expectedRecommendedByWho,
				expectedNotRecommendedByWho, expectedProfessionalSkills, expectedAcademicSkills);
		assertTrue(course1.equals(course2));
		assertFalse(course1 == course2);

	}

	@Test
	public void testEqualsAllFieldsEqualExceptTitle() {
		String expectedTitle = "Learning Java";
		String expectedInstructor = "The Honorable Dr. Kevin Trainor";
		String expectedSemester = "Summer";
		int expectedYear = 2016;
		String expectedDepartmentCode = "LIS";
		int expectedCourseNumber = 452;
		String expectedSectionNumber = "1";
		String expectedInstitution = "University of Illinois";
		String expectedLocation = "Online";
		String expectedOnline = "Completely Online";
		boolean expectedGeneralRequirement = false;
		String expectedGeneralCategory = "No Category";
		boolean expectedFirstMajorRequirement = false;
		String expectedFirstMajorCategory = "No Category";
		boolean expectedSecondMajorRequirement = false;
		String expectedSecondMajorCategory = "No Category";
		boolean expectedFirstMinorRequirement = false;
		String expectedFirstMinorCategory = "No Category";
		boolean expectedSecondMinorRequirement = false;
		String expectedSecondMinorCategory = "No Category";
		boolean expectedFreeElective = true;
		boolean expectedCompleted = false;
		boolean expectedConsideringEnrollment = false;
		boolean expectedCurrentEnrollment = false;
		double expectedCredits = 4.0;
		double expectedGpaDesired = 4.0;
		double expectedGpaEarned = 4.0;
		String expectedCourseStartDate = "05/21/2016";
		String expectedCourseEndDate = "08/02/2016";
		int expectedCoursePredictedDifficulty = 3;
		int expectedCoursePredictedWorkload = 3;
		int expectedPredictedEnjoyability = 3;
		String expectedRecommendedByWho = "Jana Diesner";
		String expectedNotRecommendedByWho = "Nobody";
		String expectedProfessionalSkills = "Java Programming";
		String expectedAcademicSkills = "Data Analysis";
		CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, expectedSemester,
				expectedYear, expectedDepartmentCode, expectedCourseNumber, expectedSectionNumber, expectedInstitution,
				expectedLocation, expectedOnline, expectedGeneralRequirement, expectedGeneralCategory,
				expectedFirstMajorRequirement, expectedFirstMajorCategory, expectedSecondMajorRequirement,
				expectedSecondMajorCategory, expectedFirstMinorRequirement, expectedFirstMinorCategory,
				expectedSecondMinorRequirement, expectedSecondMinorCategory, expectedFreeElective, expectedCompleted,
				expectedConsideringEnrollment, expectedCurrentEnrollment, expectedCredits, expectedGpaDesired, expectedGpaEarned,
				expectedCourseStartDate, expectedCourseEndDate, expectedCoursePredictedDifficulty,
				expectedCoursePredictedWorkload, expectedPredictedEnjoyability, expectedRecommendedByWho,
				expectedNotRecommendedByWho, expectedProfessionalSkills, expectedAcademicSkills);
		CourseInfoGeneral course2 = new CourseInfoGeneral("Learing Python", expectedInstructor, expectedSemester,
				expectedYear, expectedDepartmentCode, expectedCourseNumber, expectedSectionNumber, expectedInstitution,
				expectedLocation, expectedOnline, expectedGeneralRequirement, expectedGeneralCategory,
				expectedFirstMajorRequirement, expectedFirstMajorCategory, expectedSecondMajorRequirement,
				expectedSecondMajorCategory, expectedFirstMinorRequirement, expectedFirstMinorCategory,
				expectedSecondMinorRequirement, expectedSecondMinorCategory, expectedFreeElective, expectedCompleted,
				expectedConsideringEnrollment, expectedCurrentEnrollment, expectedCredits, expectedGpaDesired, expectedGpaEarned,
				expectedCourseStartDate, expectedCourseEndDate, expectedCoursePredictedDifficulty,
				expectedCoursePredictedWorkload, expectedPredictedEnjoyability, expectedRecommendedByWho,
				expectedNotRecommendedByWho, expectedProfessionalSkills, expectedAcademicSkills);
		assertFalse(course1.equals(course2));
		assertFalse(course1 == course2);

	}

	@Test
	public void testEqualsAllFieldsEqualExceptInstructor() {
		String expectedTitle = "Learning Java";
		String expectedInstructor = "The Honorable Dr. Kevin Trainor";
		String expectedSemester = "Summer";
		int expectedYear = 2016;
		String expectedDepartmentCode = "LIS";
		int expectedCourseNumber = 452;
		String expectedSectionNumber = "1";
		String expectedInstitution = "University of Illinois";
		String expectedLocation = "Online";
		String expectedOnline = "Completely Online";
		boolean expectedGeneralRequirement = false;
		String expectedGeneralCategory = "No Category";
		boolean expectedFirstMajorRequirement = false;
		String expectedFirstMajorCategory = "No Category";
		boolean expectedSecondMajorRequirement = false;
		String expectedSecondMajorCategory = "No Category";
		boolean expectedFirstMinorRequirement = false;
		String expectedFirstMinorCategory = "No Category";
		boolean expectedSecondMinorRequirement = false;
		String expectedSecondMinorCategory = "No Category";
		boolean expectedFreeElective = true;
		boolean expectedCompleted = false;
		boolean expectedConsideringEnrollment = false;
		boolean expectedCurrentEnrollment = false;
		double expectedCredits = 4.0;
		double expectedGpaDesired = 4.0;
		double expectedGpaEarned = 4.0;
		String expectedCourseStartDate = "05/21/2016";
		String expectedCourseEndDate = "08/02/2016";
		int expectedCoursePredictedDifficulty = 3;
		int expectedCoursePredictedWorkload = 3;
		int expectedPredictedEnjoyability = 3;
		String expectedRecommendedByWho = "Jana Diesner";
		String expectedNotRecommendedByWho = "Nobody";
		String expectedProfessionalSkills = "Java Programming";
		String expectedAcademicSkills = "Data Analysis";
		CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, expectedSemester,
				expectedYear, expectedDepartmentCode, expectedCourseNumber, expectedSectionNumber, expectedInstitution,
				expectedLocation, expectedOnline, expectedGeneralRequirement, expectedGeneralCategory,
				expectedFirstMajorRequirement, expectedFirstMajorCategory, expectedSecondMajorRequirement,
				expectedSecondMajorCategory, expectedFirstMinorRequirement, expectedFirstMinorCategory,
				expectedSecondMinorRequirement, expectedSecondMinorCategory, expectedFreeElective, expectedCompleted,
				expectedConsideringEnrollment, expectedCurrentEnrollment, expectedCredits, expectedGpaDesired, expectedGpaEarned,
				expectedCourseStartDate, expectedCourseEndDate, expectedCoursePredictedDifficulty,
				expectedCoursePredictedWorkload, expectedPredictedEnjoyability, expectedRecommendedByWho,
				expectedNotRecommendedByWho, expectedProfessionalSkills, expectedAcademicSkills);
		CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, "Dr. Strangelove", expectedSemester,
				expectedYear, expectedDepartmentCode, expectedCourseNumber, expectedSectionNumber, expectedInstitution,
				expectedLocation, expectedOnline, expectedGeneralRequirement, expectedGeneralCategory,
				expectedFirstMajorRequirement, expectedFirstMajorCategory, expectedSecondMajorRequirement,
				expectedSecondMajorCategory, expectedFirstMinorRequirement, expectedFirstMinorCategory,
				expectedSecondMinorRequirement, expectedSecondMinorCategory, expectedFreeElective, expectedCompleted,
				expectedConsideringEnrollment, expectedCurrentEnrollment, expectedCredits, expectedGpaDesired, expectedGpaEarned,
				expectedCourseStartDate, expectedCourseEndDate, expectedCoursePredictedDifficulty,
				expectedCoursePredictedWorkload, expectedPredictedEnjoyability, expectedRecommendedByWho,
				expectedNotRecommendedByWho, expectedProfessionalSkills, expectedAcademicSkills);
		assertFalse(course1.equals(course2));
		assertFalse(course1 == course2);

	}

	@Test
	public void testEqualsAllFieldsEqualExceptSemester() {
		String expectedTitle = "Learning Java";
		String expectedInstructor = "The Honorable Dr. Kevin Trainor";
		String expectedSemester = "Summer";
		int expectedYear = 2016;
		String expectedDepartmentCode = "LIS";
		int expectedCourseNumber = 452;
		String expectedSectionNumber = "1";
		String expectedInstitution = "University of Illinois";
		String expectedLocation = "Online";
		String expectedOnline = "Completely Online";
		boolean expectedGeneralRequirement = false;
		String expectedGeneralCategory = "No Category";
		boolean expectedFirstMajorRequirement = false;
		String expectedFirstMajorCategory = "No Category";
		boolean expectedSecondMajorRequirement = false;
		String expectedSecondMajorCategory = "No Category";
		boolean expectedFirstMinorRequirement = false;
		String expectedFirstMinorCategory = "No Category";
		boolean expectedSecondMinorRequirement = false;
		String expectedSecondMinorCategory = "No Category";
		boolean expectedFreeElective = true;
		boolean expectedCompleted = false;
		boolean expectedConsideringEnrollment = false;
		boolean expectedCurrentEnrollment = false;
		double expectedCredits = 4.0;
		double expectedGpaDesired = 4.0;
		double expectedGpaEarned = 4.0;
		String expectedCourseStartDate = "05/21/2016";
		String expectedCourseEndDate = "08/02/2016";
		int expectedCoursePredictedDifficulty = 3;
		int expectedCoursePredictedWorkload = 3;
		int expectedPredictedEnjoyability = 3;
		String expectedRecommendedByWho = "Jana Diesner";
		String expectedNotRecommendedByWho = "Nobody";
		String expectedProfessionalSkills = "Java Programming";
		String expectedAcademicSkills = "Data Analysis";
		CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, expectedSemester,
				expectedYear, expectedDepartmentCode, expectedCourseNumber, expectedSectionNumber, expectedInstitution,
				expectedLocation, expectedOnline, expectedGeneralRequirement, expectedGeneralCategory,
				expectedFirstMajorRequirement, expectedFirstMajorCategory, expectedSecondMajorRequirement,
				expectedSecondMajorCategory, expectedFirstMinorRequirement, expectedFirstMinorCategory,
				expectedSecondMinorRequirement, expectedSecondMinorCategory, expectedFreeElective, expectedCompleted,
				expectedConsideringEnrollment, expectedCurrentEnrollment, expectedCredits, expectedGpaDesired, expectedGpaEarned,
				expectedCourseStartDate, expectedCourseEndDate, expectedCoursePredictedDifficulty,
				expectedCoursePredictedWorkload, expectedPredictedEnjoyability, expectedRecommendedByWho,
				expectedNotRecommendedByWho, expectedProfessionalSkills, expectedAcademicSkills);
		CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, "Fall", expectedYear,
				expectedDepartmentCode, expectedCourseNumber, expectedSectionNumber, expectedInstitution,
				expectedLocation, expectedOnline, expectedGeneralRequirement, expectedGeneralCategory,
				expectedFirstMajorRequirement, expectedFirstMajorCategory, expectedSecondMajorRequirement,
				expectedSecondMajorCategory, expectedFirstMinorRequirement, expectedFirstMinorCategory,
				expectedSecondMinorRequirement, expectedSecondMinorCategory, expectedFreeElective, expectedCompleted,
				expectedConsideringEnrollment, expectedCurrentEnrollment, expectedCredits, expectedGpaDesired, expectedGpaEarned,
				expectedCourseStartDate, expectedCourseEndDate, expectedCoursePredictedDifficulty,
				expectedCoursePredictedWorkload, expectedPredictedEnjoyability, expectedRecommendedByWho,
				expectedNotRecommendedByWho, expectedProfessionalSkills, expectedAcademicSkills);
		assertFalse(course1.equals(course2));
		assertFalse(course1 == course2);

	}

	@Test
	public void testEqualsAllFieldsEqualExceptYear() {
		String expectedTitle = "Learning Java";
		String expectedInstructor = "The Honorable Dr. Kevin Trainor";
		String expectedSemester = "Summer";
		int expectedYear = 2016;
		String expectedDepartmentCode = "LIS";
		int expectedCourseNumber = 452;
		String expectedSectionNumber = "1";
		String expectedInstitution = "University of Illinois";
		String expectedLocation = "Online";
		String expectedOnline = "Completely Online";
		boolean expectedGeneralRequirement = false;
		String expectedGeneralCategory = "No Category";
		boolean expectedFirstMajorRequirement = false;
		String expectedFirstMajorCategory = "No Category";
		boolean expectedSecondMajorRequirement = false;
		String expectedSecondMajorCategory = "No Category";
		boolean expectedFirstMinorRequirement = false;
		String expectedFirstMinorCategory = "No Category";
		boolean expectedSecondMinorRequirement = false;
		String expectedSecondMinorCategory = "No Category";
		boolean expectedFreeElective = true;
		boolean expectedCompleted = false;
		boolean expectedConsideringEnrollment = false;
		boolean expectedCurrentEnrollment = false;
		double expectedCredits = 4.0;
		double expectedGpaDesired = 4.0;
		double expectedGpaEarned = 4.0;
		String expectedCourseStartDate = "05/21/2016";
		String expectedCourseEndDate = "08/02/2016";
		int expectedCoursePredictedDifficulty = 3;
		int expectedCoursePredictedWorkload = 3;
		int expectedPredictedEnjoyability = 3;
		String expectedRecommendedByWho = "Jana Diesner";
		String expectedNotRecommendedByWho = "Nobody";
		String expectedProfessionalSkills = "Java Programming";
		String expectedAcademicSkills = "Data Analysis";
		CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, expectedSemester,
				expectedYear, expectedDepartmentCode, expectedCourseNumber, expectedSectionNumber, expectedInstitution,
				expectedLocation, expectedOnline, expectedGeneralRequirement, expectedGeneralCategory,
				expectedFirstMajorRequirement, expectedFirstMajorCategory, expectedSecondMajorRequirement,
				expectedSecondMajorCategory, expectedFirstMinorRequirement, expectedFirstMinorCategory,
				expectedSecondMinorRequirement, expectedSecondMinorCategory, expectedFreeElective, expectedCompleted,
				expectedConsideringEnrollment, expectedCurrentEnrollment, expectedCredits, expectedGpaDesired, expectedGpaEarned,
				expectedCourseStartDate, expectedCourseEndDate, expectedCoursePredictedDifficulty,
				expectedCoursePredictedWorkload, expectedPredictedEnjoyability, expectedRecommendedByWho,
				expectedNotRecommendedByWho, expectedProfessionalSkills, expectedAcademicSkills);
		CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, expectedSemester, 1999,
				expectedDepartmentCode, expectedCourseNumber, expectedSectionNumber, expectedInstitution,
				expectedLocation, expectedOnline, expectedGeneralRequirement, expectedGeneralCategory,
				expectedFirstMajorRequirement, expectedFirstMajorCategory, expectedSecondMajorRequirement,
				expectedSecondMajorCategory, expectedFirstMinorRequirement, expectedFirstMinorCategory,
				expectedSecondMinorRequirement, expectedSecondMinorCategory, expectedFreeElective, expectedCompleted,
				expectedConsideringEnrollment, expectedCurrentEnrollment, expectedCredits, expectedGpaDesired, expectedGpaEarned,
				expectedCourseStartDate, expectedCourseEndDate, expectedCoursePredictedDifficulty,
				expectedCoursePredictedWorkload, expectedPredictedEnjoyability, expectedRecommendedByWho,
				expectedNotRecommendedByWho, expectedProfessionalSkills, expectedAcademicSkills);
		assertFalse(course1.equals(course2));
		assertFalse(course1 == course2);

	}

	@Test
	public void testEqualsAllFieldsEqualExceptDepartmentCode() {
		String expectedTitle = "Learning Java";
		String expectedInstructor = "The Honorable Dr. Kevin Trainor";
		String expectedSemester = "Summer";
		int expectedYear = 2016;
		String expectedDepartmentCode = "LIS";
		int expectedCourseNumber = 452;
		String expectedSectionNumber = "1";
		String expectedInstitution = "University of Illinois";
		String expectedLocation = "Online";
		String expectedOnline = "Completely Online";
		boolean expectedGeneralRequirement = false;
		String expectedGeneralCategory = "No Category";
		boolean expectedFirstMajorRequirement = false;
		String expectedFirstMajorCategory = "No Category";
		boolean expectedSecondMajorRequirement = false;
		String expectedSecondMajorCategory = "No Category";
		boolean expectedFirstMinorRequirement = false;
		String expectedFirstMinorCategory = "No Category";
		boolean expectedSecondMinorRequirement = false;
		String expectedSecondMinorCategory = "No Category";
		boolean expectedFreeElective = true;
		boolean expectedCompleted = false;
		boolean expectedConsideringEnrollment = false;
		boolean expectedCurrentEnrollment = false;
		double expectedCredits = 4.0;
		double expectedGpaDesired = 4.0;
		double expectedGpaEarned = 4.0;
		String expectedCourseStartDate = "05/21/2016";
		String expectedCourseEndDate = "08/02/2016";
		int expectedCoursePredictedDifficulty = 3;
		int expectedCoursePredictedWorkload = 3;
		int expectedPredictedEnjoyability = 3;
		String expectedRecommendedByWho = "Jana Diesner";
		String expectedNotRecommendedByWho = "Nobody";
		String expectedProfessionalSkills = "Java Programming";
		String expectedAcademicSkills = "Data Analysis";
		CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, expectedSemester,
				expectedYear, expectedDepartmentCode, expectedCourseNumber, expectedSectionNumber, expectedInstitution,
				expectedLocation, expectedOnline, expectedGeneralRequirement, expectedGeneralCategory,
				expectedFirstMajorRequirement, expectedFirstMajorCategory, expectedSecondMajorRequirement,
				expectedSecondMajorCategory, expectedFirstMinorRequirement, expectedFirstMinorCategory,
				expectedSecondMinorRequirement, expectedSecondMinorCategory, expectedFreeElective, expectedCompleted,
				expectedConsideringEnrollment, expectedCurrentEnrollment, expectedCredits, expectedGpaDesired, expectedGpaEarned,
				expectedCourseStartDate, expectedCourseEndDate, expectedCoursePredictedDifficulty,
				expectedCoursePredictedWorkload, expectedPredictedEnjoyability, expectedRecommendedByWho,
				expectedNotRecommendedByWho, expectedProfessionalSkills, expectedAcademicSkills);
		CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, expectedSemester,
				expectedYear, "GIS", expectedCourseNumber, expectedSectionNumber, expectedInstitution, expectedLocation,
				expectedOnline, expectedGeneralRequirement, expectedGeneralCategory, expectedFirstMajorRequirement,
				expectedFirstMajorCategory, expectedSecondMajorRequirement, expectedSecondMajorCategory,
				expectedFirstMinorRequirement, expectedFirstMinorCategory, expectedSecondMinorRequirement,
				expectedSecondMinorCategory, expectedFreeElective, expectedCompleted, expectedConsideringEnrollment,
				expectedCurrentEnrollment, expectedCredits, expectedGpaDesired, expectedGpaEarned, expectedCourseStartDate, expectedCourseEndDate,
				expectedCoursePredictedDifficulty, expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
				expectedRecommendedByWho, expectedNotRecommendedByWho, expectedProfessionalSkills,
				expectedAcademicSkills);
		assertFalse(course1.equals(course2));
		assertFalse(course1 == course2);

	}

	@Test
	public void testEqualsAllFieldsEqualExceptCourseNumber() {
		String expectedTitle = "Learning Java";
		String expectedInstructor = "The Honorable Dr. Kevin Trainor";
		String expectedSemester = "Summer";
		int expectedYear = 2016;
		String expectedDepartmentCode = "LIS";
		int expectedCourseNumber = 452;
		String expectedSectionNumber = "1";
		String expectedInstitution = "University of Illinois";
		String expectedLocation = "Online";
		String expectedOnline = "Completely Online";
		boolean expectedGeneralRequirement = false;
		String expectedGeneralCategory = "No Category";
		boolean expectedFirstMajorRequirement = false;
		String expectedFirstMajorCategory = "No Category";
		boolean expectedSecondMajorRequirement = false;
		String expectedSecondMajorCategory = "No Category";
		boolean expectedFirstMinorRequirement = false;
		String expectedFirstMinorCategory = "No Category";
		boolean expectedSecondMinorRequirement = false;
		String expectedSecondMinorCategory = "No Category";
		boolean expectedFreeElective = true;
		boolean expectedCompleted = false;
		boolean expectedConsideringEnrollment = false;
		boolean expectedCurrentEnrollment = false;
		double expectedCredits = 4.0;
		double expectedGpaDesired = 4.0;
		double expectedGpaEarned = 4.0;
		String expectedCourseStartDate = "05/21/2016";
		String expectedCourseEndDate = "08/02/2016";
		int expectedCoursePredictedDifficulty = 3;
		int expectedCoursePredictedWorkload = 3;
		int expectedPredictedEnjoyability = 3;
		String expectedRecommendedByWho = "Jana Diesner";
		String expectedNotRecommendedByWho = "Nobody";
		String expectedProfessionalSkills = "Java Programming";
		String expectedAcademicSkills = "Data Analysis";
		CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, expectedSemester,
				expectedYear, expectedDepartmentCode, expectedCourseNumber, expectedSectionNumber, expectedInstitution,
				expectedLocation, expectedOnline, expectedGeneralRequirement, expectedGeneralCategory,
				expectedFirstMajorRequirement, expectedFirstMajorCategory, expectedSecondMajorRequirement,
				expectedSecondMajorCategory, expectedFirstMinorRequirement, expectedFirstMinorCategory,
				expectedSecondMinorRequirement, expectedSecondMinorCategory, expectedFreeElective, expectedCompleted,
				expectedConsideringEnrollment, expectedCurrentEnrollment, expectedCredits, expectedGpaDesired, expectedGpaEarned,
				expectedCourseStartDate, expectedCourseEndDate, expectedCoursePredictedDifficulty,
				expectedCoursePredictedWorkload, expectedPredictedEnjoyability, expectedRecommendedByWho,
				expectedNotRecommendedByWho, expectedProfessionalSkills, expectedAcademicSkills);
		CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, expectedSemester,
				expectedYear, expectedDepartmentCode, 1234, expectedSectionNumber, expectedInstitution,
				expectedLocation, expectedOnline, expectedGeneralRequirement, expectedGeneralCategory,
				expectedFirstMajorRequirement, expectedFirstMajorCategory, expectedSecondMajorRequirement,
				expectedSecondMajorCategory, expectedFirstMinorRequirement, expectedFirstMinorCategory,
				expectedSecondMinorRequirement, expectedSecondMinorCategory, expectedFreeElective, expectedCompleted,
				expectedConsideringEnrollment, expectedCurrentEnrollment, expectedCredits, expectedGpaDesired, expectedGpaEarned,
				expectedCourseStartDate, expectedCourseEndDate, expectedCoursePredictedDifficulty,
				expectedCoursePredictedWorkload, expectedPredictedEnjoyability, expectedRecommendedByWho,
				expectedNotRecommendedByWho, expectedProfessionalSkills, expectedAcademicSkills);
		assertFalse(course1.equals(course2));
		assertFalse(course1 == course2);

	}

	@Test
	public void testEqualsAllFieldsEqualExceptSectionNumber() {
		String expectedTitle = "Learning Java";
		String expectedInstructor = "The Honorable Dr. Kevin Trainor";
		String expectedSemester = "Summer";
		int expectedYear = 2016;
		String expectedDepartmentCode = "LIS";
		int expectedCourseNumber = 452;
		String expectedSectionNumber = "1";
		String expectedInstitution = "University of Illinois";
		String expectedLocation = "Online";
		String expectedOnline = "Completely Online";
		boolean expectedGeneralRequirement = false;
		String expectedGeneralCategory = "No Category";
		boolean expectedFirstMajorRequirement = false;
		String expectedFirstMajorCategory = "No Category";
		boolean expectedSecondMajorRequirement = false;
		String expectedSecondMajorCategory = "No Category";
		boolean expectedFirstMinorRequirement = false;
		String expectedFirstMinorCategory = "No Category";
		boolean expectedSecondMinorRequirement = false;
		String expectedSecondMinorCategory = "No Category";
		boolean expectedFreeElective = true;
		boolean expectedCompleted = false;
		boolean expectedConsideringEnrollment = false;
		boolean expectedCurrentEnrollment = false;
		double expectedCredits = 4.0;
		double expectedGpaDesired = 4.0;
		double expectedGpaEarned = 4.0;
		String expectedCourseStartDate = "05/21/2016";
		String expectedCourseEndDate = "08/02/2016";
		int expectedCoursePredictedDifficulty = 3;
		int expectedCoursePredictedWorkload = 3;
		int expectedPredictedEnjoyability = 3;
		String expectedRecommendedByWho = "Jana Diesner";
		String expectedNotRecommendedByWho = "Nobody";
		String expectedProfessionalSkills = "Java Programming";
		String expectedAcademicSkills = "Data Analysis";
		CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, expectedSemester,
				expectedYear, expectedDepartmentCode, expectedCourseNumber, expectedSectionNumber, expectedInstitution,
				expectedLocation, expectedOnline, expectedGeneralRequirement, expectedGeneralCategory,
				expectedFirstMajorRequirement, expectedFirstMajorCategory, expectedSecondMajorRequirement,
				expectedSecondMajorCategory, expectedFirstMinorRequirement, expectedFirstMinorCategory,
				expectedSecondMinorRequirement, expectedSecondMinorCategory, expectedFreeElective, expectedCompleted,
				expectedConsideringEnrollment, expectedCurrentEnrollment, expectedCredits, expectedGpaDesired, expectedGpaEarned,
				expectedCourseStartDate, expectedCourseEndDate, expectedCoursePredictedDifficulty,
				expectedCoursePredictedWorkload, expectedPredictedEnjoyability, expectedRecommendedByWho,
				expectedNotRecommendedByWho, expectedProfessionalSkills, expectedAcademicSkills);
		CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, expectedSemester,
				expectedYear, expectedDepartmentCode, expectedCourseNumber, "G1", expectedInstitution, expectedLocation,
				expectedOnline, expectedGeneralRequirement, expectedGeneralCategory, expectedFirstMajorRequirement,
				expectedFirstMajorCategory, expectedSecondMajorRequirement, expectedSecondMajorCategory,
				expectedFirstMinorRequirement, expectedFirstMinorCategory, expectedSecondMinorRequirement,
				expectedSecondMinorCategory, expectedFreeElective, expectedCompleted, expectedConsideringEnrollment,
				expectedCurrentEnrollment, expectedCredits, expectedGpaDesired, expectedGpaEarned, expectedCourseStartDate, expectedCourseEndDate,
				expectedCoursePredictedDifficulty, expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
				expectedRecommendedByWho, expectedNotRecommendedByWho, expectedProfessionalSkills,
				expectedAcademicSkills);
		assertFalse(course1.equals(course2));
		assertFalse(course1 == course2);
	}

	@Test
	public void testEqualsAllFieldsEqualExceptInstitution() {
		String expectedTitle = "Learning Java";
		String expectedInstructor = "The Honorable Dr. Kevin Trainor";
		String expectedSemester = "Summer";
		int expectedYear = 2016;
		String expectedDepartmentCode = "LIS";
		int expectedCourseNumber = 452;
		String expectedSectionNumber = "1";
		String expectedInstitution = "University of Illinois";
		String expectedLocation = "Online";
		String expectedOnline = "Completely Online";
		boolean expectedGeneralRequirement = false;
		String expectedGeneralCategory = "No Category";
		boolean expectedFirstMajorRequirement = false;
		String expectedFirstMajorCategory = "No Category";
		boolean expectedSecondMajorRequirement = false;
		String expectedSecondMajorCategory = "No Category";
		boolean expectedFirstMinorRequirement = false;
		String expectedFirstMinorCategory = "No Category";
		boolean expectedSecondMinorRequirement = false;
		String expectedSecondMinorCategory = "No Category";
		boolean expectedFreeElective = true;
		boolean expectedCompleted = false;
		boolean expectedConsideringEnrollment = false;
		boolean expectedCurrentEnrollment = false;
		double expectedCredits = 4.0;
		double expectedGpaDesired = 4.0;
		double expectedGpaEarned = 4.0;
		String expectedCourseStartDate = "05/21/2016";
		String expectedCourseEndDate = "08/02/2016";
		int expectedCoursePredictedDifficulty = 3;
		int expectedCoursePredictedWorkload = 3;
		int expectedPredictedEnjoyability = 3;
		String expectedRecommendedByWho = "Jana Diesner";
		String expectedNotRecommendedByWho = "Nobody";
		String expectedProfessionalSkills = "Java Programming";
		String expectedAcademicSkills = "Data Analysis";
		CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, expectedSemester,
				expectedYear, expectedDepartmentCode, expectedCourseNumber, expectedSectionNumber, expectedInstitution,
				expectedLocation, expectedOnline, expectedGeneralRequirement, expectedGeneralCategory,
				expectedFirstMajorRequirement, expectedFirstMajorCategory, expectedSecondMajorRequirement,
				expectedSecondMajorCategory, expectedFirstMinorRequirement, expectedFirstMinorCategory,
				expectedSecondMinorRequirement, expectedSecondMinorCategory, expectedFreeElective, expectedCompleted,
				expectedConsideringEnrollment, expectedCurrentEnrollment, expectedCredits, expectedGpaDesired, expectedGpaEarned,
				expectedCourseStartDate, expectedCourseEndDate, expectedCoursePredictedDifficulty,
				expectedCoursePredictedWorkload, expectedPredictedEnjoyability, expectedRecommendedByWho,
				expectedNotRecommendedByWho, expectedProfessionalSkills, expectedAcademicSkills);
		CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, expectedSemester,
				expectedYear, expectedDepartmentCode, expectedCourseNumber, expectedSectionNumber, "Northwestern",
				expectedLocation, expectedOnline, expectedGeneralRequirement, expectedGeneralCategory,
				expectedFirstMajorRequirement, expectedFirstMajorCategory, expectedSecondMajorRequirement,
				expectedSecondMajorCategory, expectedFirstMinorRequirement, expectedFirstMinorCategory,
				expectedSecondMinorRequirement, expectedSecondMinorCategory, expectedFreeElective, expectedCompleted,
				expectedConsideringEnrollment, expectedCurrentEnrollment, expectedCredits, expectedGpaDesired, expectedGpaEarned,
				expectedCourseStartDate, expectedCourseEndDate, expectedCoursePredictedDifficulty,
				expectedCoursePredictedWorkload, expectedPredictedEnjoyability, expectedRecommendedByWho,
				expectedNotRecommendedByWho, expectedProfessionalSkills, expectedAcademicSkills);
		assertFalse(course1.equals(course2));
		assertFalse(course1 == course2);

	}

	@Test
	public void testEqualsAllFieldsEqualExceptLocation() {
		String expectedTitle = "Learning Java";
		String expectedInstructor = "The Honorable Dr. Kevin Trainor";
		String expectedSemester = "Summer";
		int expectedYear = 2016;
		String expectedDepartmentCode = "LIS";
		int expectedCourseNumber = 452;
		String expectedSectionNumber = "1";
		String expectedInstitution = "University of Illinois";
		String expectedLocation = "Online";
		String expectedOnline = "Completely Online";
		boolean expectedGeneralRequirement = false;
		String expectedGeneralCategory = "No Category";
		boolean expectedFirstMajorRequirement = false;
		String expectedFirstMajorCategory = "No Category";
		boolean expectedSecondMajorRequirement = false;
		String expectedSecondMajorCategory = "No Category";
		boolean expectedFirstMinorRequirement = false;
		String expectedFirstMinorCategory = "No Category";
		boolean expectedSecondMinorRequirement = false;
		String expectedSecondMinorCategory = "No Category";
		boolean expectedFreeElective = true;
		boolean expectedCompleted = false;
		boolean expectedConsideringEnrollment = false;
		boolean expectedCurrentEnrollment = false;
		double expectedCredits = 4.0;
		double expectedGpaDesired = 4.0;
		double expectedGpaEarned = 4.0;
		String expectedCourseStartDate = "05/21/2016";
		String expectedCourseEndDate = "08/02/2016";
		int expectedCoursePredictedDifficulty = 3;
		int expectedCoursePredictedWorkload = 3;
		int expectedPredictedEnjoyability = 3;
		String expectedRecommendedByWho = "Jana Diesner";
		String expectedNotRecommendedByWho = "Nobody";
		String expectedProfessionalSkills = "Java Programming";
		String expectedAcademicSkills = "Data Analysis";
		CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, expectedSemester,
				expectedYear, expectedDepartmentCode, expectedCourseNumber, expectedSectionNumber, expectedInstitution,
				expectedLocation, expectedOnline, expectedGeneralRequirement, expectedGeneralCategory,
				expectedFirstMajorRequirement, expectedFirstMajorCategory, expectedSecondMajorRequirement,
				expectedSecondMajorCategory, expectedFirstMinorRequirement, expectedFirstMinorCategory,
				expectedSecondMinorRequirement, expectedSecondMinorCategory, expectedFreeElective, expectedCompleted,
				expectedConsideringEnrollment, expectedCurrentEnrollment, expectedCredits, expectedGpaDesired, expectedGpaEarned,
				expectedCourseStartDate, expectedCourseEndDate, expectedCoursePredictedDifficulty,
				expectedCoursePredictedWorkload, expectedPredictedEnjoyability, expectedRecommendedByWho,
				expectedNotRecommendedByWho, expectedProfessionalSkills, expectedAcademicSkills);
		CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, expectedSemester,
				expectedYear, expectedDepartmentCode, expectedCourseNumber, expectedSectionNumber, expectedInstitution,
				"Lincoln Hall 1234", expectedOnline, expectedGeneralRequirement, expectedGeneralCategory,
				expectedFirstMajorRequirement, expectedFirstMajorCategory, expectedSecondMajorRequirement,
				expectedSecondMajorCategory, expectedFirstMinorRequirement, expectedFirstMinorCategory,
				expectedSecondMinorRequirement, expectedSecondMinorCategory, expectedFreeElective, expectedCompleted,
				expectedConsideringEnrollment, expectedCurrentEnrollment, expectedCredits, expectedGpaDesired, expectedGpaEarned,
				expectedCourseStartDate, expectedCourseEndDate, expectedCoursePredictedDifficulty,
				expectedCoursePredictedWorkload, expectedPredictedEnjoyability, expectedRecommendedByWho,
				expectedNotRecommendedByWho, expectedProfessionalSkills, expectedAcademicSkills);
		assertFalse(course1.equals(course2));
		assertFalse(course1 == course2);

	}

	@Test
	public void testEqualsAllFieldsEqualExceptOnline() {
		String expectedTitle = "Learning Java";
		String expectedInstructor = "The Honorable Dr. Kevin Trainor";
		String expectedSemester = "Summer";
		int expectedYear = 2016;
		String expectedDepartmentCode = "LIS";
		int expectedCourseNumber = 452;
		String expectedSectionNumber = "1";
		String expectedInstitution = "University of Illinois";
		String expectedLocation = "Online";
		String expectedOnline = "Completely Online";
		boolean expectedGeneralRequirement = false;
		String expectedGeneralCategory = "No Category";
		boolean expectedFirstMajorRequirement = false;
		String expectedFirstMajorCategory = "No Category";
		boolean expectedSecondMajorRequirement = false;
		String expectedSecondMajorCategory = "No Category";
		boolean expectedFirstMinorRequirement = false;
		String expectedFirstMinorCategory = "No Category";
		boolean expectedSecondMinorRequirement = false;
		String expectedSecondMinorCategory = "No Category";
		boolean expectedFreeElective = true;
		boolean expectedCompleted = false;
		boolean expectedConsideringEnrollment = false;
		boolean expectedCurrentEnrollment = false;
		double expectedCredits = 4.0;
		double expectedGpaDesired = 4.0;
		double expectedGpaEarned = 4.0;
		String expectedCourseStartDate = "05/21/2016";
		String expectedCourseEndDate = "08/02/2016";
		int expectedCoursePredictedDifficulty = 3;
		int expectedCoursePredictedWorkload = 3;
		int expectedPredictedEnjoyability = 3;
		String expectedRecommendedByWho = "Jana Diesner";
		String expectedNotRecommendedByWho = "Nobody";
		String expectedProfessionalSkills = "Java Programming";
		String expectedAcademicSkills = "Data Analysis";
		CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, expectedSemester,
				expectedYear, expectedDepartmentCode, expectedCourseNumber, expectedSectionNumber, expectedInstitution,
				expectedLocation, expectedOnline, expectedGeneralRequirement, expectedGeneralCategory,
				expectedFirstMajorRequirement, expectedFirstMajorCategory, expectedSecondMajorRequirement,
				expectedSecondMajorCategory, expectedFirstMinorRequirement, expectedFirstMinorCategory,
				expectedSecondMinorRequirement, expectedSecondMinorCategory, expectedFreeElective, expectedCompleted,
				expectedConsideringEnrollment, expectedCurrentEnrollment, expectedCredits, expectedGpaDesired, expectedGpaEarned,
				expectedCourseStartDate, expectedCourseEndDate, expectedCoursePredictedDifficulty,
				expectedCoursePredictedWorkload, expectedPredictedEnjoyability, expectedRecommendedByWho,
				expectedNotRecommendedByWho, expectedProfessionalSkills, expectedAcademicSkills);
		CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, expectedSemester,
				expectedYear, expectedDepartmentCode, expectedCourseNumber, expectedSectionNumber, expectedInstitution,
				expectedLocation, "Hybrid", expectedGeneralRequirement, expectedGeneralCategory,
				expectedFirstMajorRequirement, expectedFirstMajorCategory, expectedSecondMajorRequirement,
				expectedSecondMajorCategory, expectedFirstMinorRequirement, expectedFirstMinorCategory,
				expectedSecondMinorRequirement, expectedSecondMinorCategory, expectedFreeElective, expectedCompleted,
				expectedConsideringEnrollment, expectedCurrentEnrollment, expectedCredits, expectedGpaDesired, expectedGpaEarned,
				expectedCourseStartDate, expectedCourseEndDate, expectedCoursePredictedDifficulty,
				expectedCoursePredictedWorkload, expectedPredictedEnjoyability, expectedRecommendedByWho,
				expectedNotRecommendedByWho, expectedProfessionalSkills, expectedAcademicSkills);
		assertFalse(course1.equals(course2));
		assertFalse(course1 == course2);

	}

	@Test
	public void testEqualsAllFieldsEqualExceptGeneralRequirement() {
		String expectedTitle = "Learning Java";
		String expectedInstructor = "The Honorable Dr. Kevin Trainor";
		String expectedSemester = "Summer";
		int expectedYear = 2016;
		String expectedDepartmentCode = "LIS";
		int expectedCourseNumber = 452;
		String expectedSectionNumber = "1";
		String expectedInstitution = "University of Illinois";
		String expectedLocation = "Online";
		String expectedOnline = "Completely Online";
		boolean expectedGeneralRequirement = false;
		String expectedGeneralCategory = "No Category";
		boolean expectedFirstMajorRequirement = false;
		String expectedFirstMajorCategory = "No Category";
		boolean expectedSecondMajorRequirement = false;
		String expectedSecondMajorCategory = "No Category";
		boolean expectedFirstMinorRequirement = false;
		String expectedFirstMinorCategory = "No Category";
		boolean expectedSecondMinorRequirement = false;
		String expectedSecondMinorCategory = "No Category";
		boolean expectedFreeElective = true;
		boolean expectedCompleted = false;
		boolean expectedConsideringEnrollment = false;
		boolean expectedCurrentEnrollment = false;
		double expectedCredits = 4.0;
		double expectedGpaDesired = 4.0;
		double expectedGpaEarned = 4.0;
		String expectedCourseStartDate = "05/21/2016";
		String expectedCourseEndDate = "08/02/2016";
		int expectedCoursePredictedDifficulty = 3;
		int expectedCoursePredictedWorkload = 3;
		int expectedPredictedEnjoyability = 3;
		String expectedRecommendedByWho = "Jana Diesner";
		String expectedNotRecommendedByWho = "Nobody";
		String expectedProfessionalSkills = "Java Programming";
		String expectedAcademicSkills = "Data Analysis";
		CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, expectedSemester,
				expectedYear, expectedDepartmentCode, expectedCourseNumber, expectedSectionNumber, expectedInstitution,
				expectedLocation, expectedOnline, expectedGeneralRequirement, expectedGeneralCategory,
				expectedFirstMajorRequirement, expectedFirstMajorCategory, expectedSecondMajorRequirement,
				expectedSecondMajorCategory, expectedFirstMinorRequirement, expectedFirstMinorCategory,
				expectedSecondMinorRequirement, expectedSecondMinorCategory, expectedFreeElective, expectedCompleted,
				expectedConsideringEnrollment, expectedCurrentEnrollment, expectedCredits, expectedGpaDesired, expectedGpaEarned,
				expectedCourseStartDate, expectedCourseEndDate, expectedCoursePredictedDifficulty,
				expectedCoursePredictedWorkload, expectedPredictedEnjoyability, expectedRecommendedByWho,
				expectedNotRecommendedByWho, expectedProfessionalSkills, expectedAcademicSkills);
		CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, expectedSemester,
				expectedYear, expectedDepartmentCode, expectedCourseNumber, expectedSectionNumber, expectedInstitution,
				expectedLocation, expectedOnline, true, expectedGeneralCategory, expectedFirstMajorRequirement,
				expectedFirstMajorCategory, expectedSecondMajorRequirement, expectedSecondMajorCategory,
				expectedFirstMinorRequirement, expectedFirstMinorCategory, expectedSecondMinorRequirement,
				expectedSecondMinorCategory, expectedFreeElective, expectedCompleted, expectedConsideringEnrollment, expectedCurrentEnrollment, 
				expectedCredits, expectedGpaDesired, expectedGpaEarned, expectedCourseStartDate, expectedCourseEndDate,
				expectedCoursePredictedDifficulty, expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
				expectedRecommendedByWho, expectedNotRecommendedByWho, expectedProfessionalSkills,
				expectedAcademicSkills);
		assertFalse(course1.equals(course2));
		assertFalse(course1 == course2);

	}

	@Test
	public void testEqualsAllFieldsEqualExceptGeneralCategory() {
		String expectedTitle = "Learning Java";
		String expectedInstructor = "The Honorable Dr. Kevin Trainor";
		String expectedSemester = "Summer";
		int expectedYear = 2016;
		String expectedDepartmentCode = "LIS";
		int expectedCourseNumber = 452;
		String expectedSectionNumber = "1";
		String expectedInstitution = "University of Illinois";
		String expectedLocation = "Online";
		String expectedOnline = "Completely Online";
		boolean expectedGeneralRequirement = false;
		String expectedGeneralCategory = "No Category";
		boolean expectedFirstMajorRequirement = false;
		String expectedFirstMajorCategory = "No Category";
		boolean expectedSecondMajorRequirement = false;
		String expectedSecondMajorCategory = "No Category";
		boolean expectedFirstMinorRequirement = false;
		String expectedFirstMinorCategory = "No Category";
		boolean expectedSecondMinorRequirement = false;
		String expectedSecondMinorCategory = "No Category";
		boolean expectedFreeElective = true;
		boolean expectedCompleted = false;
		boolean expectedConsideringEnrollment = false;
		boolean expectedCurrentEnrollment = false;
		double expectedCredits = 4.0;
		double expectedGpaDesired = 4.0;
		double expectedGpaEarned = 4.0;
		String expectedCourseStartDate = "05/21/2016";
		String expectedCourseEndDate = "08/02/2016";
		int expectedCoursePredictedDifficulty = 3;
		int expectedCoursePredictedWorkload = 3;
		int expectedPredictedEnjoyability = 3;
		String expectedRecommendedByWho = "Jana Diesner";
		String expectedNotRecommendedByWho = "Nobody";
		String expectedProfessionalSkills = "Java Programming";
		String expectedAcademicSkills = "Data Analysis";
		CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, expectedSemester,
				expectedYear, expectedDepartmentCode, expectedCourseNumber, expectedSectionNumber, expectedInstitution,
				expectedLocation, expectedOnline, expectedGeneralRequirement, expectedGeneralCategory,
				expectedFirstMajorRequirement, expectedFirstMajorCategory, expectedSecondMajorRequirement,
				expectedSecondMajorCategory, expectedFirstMinorRequirement, expectedFirstMinorCategory,
				expectedSecondMinorRequirement, expectedSecondMinorCategory, expectedFreeElective, expectedCompleted,
				expectedConsideringEnrollment, expectedCurrentEnrollment, expectedCredits, expectedGpaDesired, expectedGpaEarned,
				expectedCourseStartDate, expectedCourseEndDate, expectedCoursePredictedDifficulty,
				expectedCoursePredictedWorkload, expectedPredictedEnjoyability, expectedRecommendedByWho,
				expectedNotRecommendedByWho, expectedProfessionalSkills, expectedAcademicSkills);
		CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, expectedSemester,
				expectedYear, expectedDepartmentCode, expectedCourseNumber, expectedSectionNumber, expectedInstitution,
				expectedLocation, expectedOnline, expectedGeneralRequirement, "Foreign Language",
				expectedFirstMajorRequirement, expectedFirstMajorCategory, expectedSecondMajorRequirement,
				expectedSecondMajorCategory, expectedFirstMinorRequirement, expectedFirstMinorCategory,
				expectedSecondMinorRequirement, expectedSecondMinorCategory, expectedFreeElective, expectedCompleted,
				expectedConsideringEnrollment, expectedCurrentEnrollment, expectedCredits, expectedGpaDesired, expectedGpaEarned,
				expectedCourseStartDate, expectedCourseEndDate, expectedCoursePredictedDifficulty,
				expectedCoursePredictedWorkload, expectedPredictedEnjoyability, expectedRecommendedByWho,
				expectedNotRecommendedByWho, expectedProfessionalSkills, expectedAcademicSkills);
		assertFalse(course1.equals(course2));
		assertFalse(course1 == course2);

	}

	@Test
	public void testEqualsAllFieldsEqualExceptFirstMajorRequirement() {
		String expectedTitle = "Learning Java";
		String expectedInstructor = "The Honorable Dr. Kevin Trainor";
		String expectedSemester = "Summer";
		int expectedYear = 2016;
		String expectedDepartmentCode = "LIS";
		int expectedCourseNumber = 452;
		String expectedSectionNumber = "1";
		String expectedInstitution = "University of Illinois";
		String expectedLocation = "Online";
		String expectedOnline = "Completely Online";
		boolean expectedGeneralRequirement = false;
		String expectedGeneralCategory = "No Category";
		boolean expectedFirstMajorRequirement = false;
		String expectedFirstMajorCategory = "No Category";
		boolean expectedSecondMajorRequirement = false;
		String expectedSecondMajorCategory = "No Category";
		boolean expectedFirstMinorRequirement = false;
		String expectedFirstMinorCategory = "No Category";
		boolean expectedSecondMinorRequirement = false;
		String expectedSecondMinorCategory = "No Category";
		boolean expectedFreeElective = true;
		boolean expectedCompleted = false;
		boolean expectedConsideringEnrollment = false;
		boolean expectedCurrentEnrollment = false;
		double expectedCredits = 4.0;
		double expectedGpaDesired = 4.0;
		double expectedGpaEarned = 4.0;
		String expectedCourseStartDate = "05/21/2016";
		String expectedCourseEndDate = "08/02/2016";
		int expectedCoursePredictedDifficulty = 3;
		int expectedCoursePredictedWorkload = 3;
		int expectedPredictedEnjoyability = 3;
		String expectedRecommendedByWho = "Jana Diesner";
		String expectedNotRecommendedByWho = "Nobody";
		String expectedProfessionalSkills = "Java Programming";
		String expectedAcademicSkills = "Data Analysis";
		CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, expectedSemester,
				expectedYear, expectedDepartmentCode, expectedCourseNumber, expectedSectionNumber, expectedInstitution,
				expectedLocation, expectedOnline, expectedGeneralRequirement, expectedGeneralCategory,
				expectedFirstMajorRequirement, expectedFirstMajorCategory, expectedSecondMajorRequirement,
				expectedSecondMajorCategory, expectedFirstMinorRequirement, expectedFirstMinorCategory,
				expectedSecondMinorRequirement, expectedSecondMinorCategory, expectedFreeElective, expectedCompleted,
				expectedConsideringEnrollment, expectedCurrentEnrollment, expectedCredits, expectedGpaDesired, expectedGpaEarned,
				expectedCourseStartDate, expectedCourseEndDate, expectedCoursePredictedDifficulty,
				expectedCoursePredictedWorkload, expectedPredictedEnjoyability, expectedRecommendedByWho,
				expectedNotRecommendedByWho, expectedProfessionalSkills, expectedAcademicSkills);
		CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, expectedSemester,
				expectedYear, expectedDepartmentCode, expectedCourseNumber, expectedSectionNumber, expectedInstitution,
				expectedLocation, expectedOnline, expectedGeneralRequirement, expectedGeneralCategory, true,
				expectedFirstMajorCategory, expectedSecondMajorRequirement, expectedSecondMajorCategory,
				expectedFirstMinorRequirement, expectedFirstMinorCategory, expectedSecondMinorRequirement,
				expectedSecondMinorCategory, expectedFreeElective, expectedCompleted, expectedConsideringEnrollment, expectedCurrentEnrollment, 
				expectedCredits, expectedGpaDesired, expectedGpaEarned, expectedCourseStartDate, expectedCourseEndDate,
				expectedCoursePredictedDifficulty, expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
				expectedRecommendedByWho, expectedNotRecommendedByWho, expectedProfessionalSkills,
				expectedAcademicSkills);
		assertFalse(course1.equals(course2));
		assertFalse(course1 == course2);
	}

	@Test
	public void testEqualsAllFieldsEqualExceptFirstMajorCategory() {
		String expectedTitle = "Learning Java";
		String expectedInstructor = "The Honorable Dr. Kevin Trainor";
		String expectedSemester = "Summer";
		int expectedYear = 2016;
		String expectedDepartmentCode = "LIS";
		int expectedCourseNumber = 452;
		String expectedSectionNumber = "1";
		String expectedInstitution = "University of Illinois";
		String expectedLocation = "Online";
		String expectedOnline = "Completely Online";
		boolean expectedGeneralRequirement = false;
		String expectedGeneralCategory = "No Category";
		boolean expectedFirstMajorRequirement = false;
		String expectedFirstMajorCategory = "No Category";
		boolean expectedSecondMajorRequirement = false;
		String expectedSecondMajorCategory = "No Category";
		boolean expectedFirstMinorRequirement = false;
		String expectedFirstMinorCategory = "No Category";
		boolean expectedSecondMinorRequirement = false;
		String expectedSecondMinorCategory = "No Category";
		boolean expectedFreeElective = true;
		boolean expectedCompleted = false;
		boolean expectedConsideringEnrollment = false;
		boolean expectedCurrentEnrollment = false;
		double expectedCredits = 4.0;
		double expectedGpaDesired = 4.0;
		double expectedGpaEarned = 4.0;
		String expectedCourseStartDate = "05/21/2016";
		String expectedCourseEndDate = "08/02/2016";
		int expectedCoursePredictedDifficulty = 3;
		int expectedCoursePredictedWorkload = 3;
		int expectedPredictedEnjoyability = 3;
		String expectedRecommendedByWho = "Jana Diesner";
		String expectedNotRecommendedByWho = "Nobody";
		String expectedProfessionalSkills = "Java Programming";
		String expectedAcademicSkills = "Data Analysis";
		CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, expectedSemester,
				expectedYear, expectedDepartmentCode, expectedCourseNumber, expectedSectionNumber, expectedInstitution,
				expectedLocation, expectedOnline, expectedGeneralRequirement, expectedGeneralCategory,
				expectedFirstMajorRequirement, expectedFirstMajorCategory, expectedSecondMajorRequirement,
				expectedSecondMajorCategory, expectedFirstMinorRequirement, expectedFirstMinorCategory,
				expectedSecondMinorRequirement, expectedSecondMinorCategory, expectedFreeElective, expectedCompleted,
				expectedConsideringEnrollment, expectedCurrentEnrollment, expectedCredits, expectedGpaDesired, expectedGpaEarned,
				expectedCourseStartDate, expectedCourseEndDate, expectedCoursePredictedDifficulty,
				expectedCoursePredictedWorkload, expectedPredictedEnjoyability, expectedRecommendedByWho,
				expectedNotRecommendedByWho, expectedProfessionalSkills, expectedAcademicSkills);
		CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, expectedSemester,
				expectedYear, expectedDepartmentCode, expectedCourseNumber, expectedSectionNumber, expectedInstitution,
				expectedLocation, expectedOnline, expectedGeneralRequirement, expectedGeneralCategory,
				expectedFirstMajorRequirement, "Core", expectedSecondMajorRequirement, expectedSecondMajorCategory,
				expectedFirstMinorRequirement, expectedFirstMinorCategory, expectedSecondMinorRequirement,
				expectedSecondMinorCategory, expectedFreeElective, expectedCompleted, expectedConsideringEnrollment, expectedCurrentEnrollment, 
				expectedCredits, expectedGpaDesired, expectedGpaEarned, expectedCourseStartDate, expectedCourseEndDate,
				expectedCoursePredictedDifficulty, expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
				expectedRecommendedByWho, expectedNotRecommendedByWho, expectedProfessionalSkills,
				expectedAcademicSkills);
		assertFalse(course1.equals(course2));
		assertFalse(course1 == course2);
	}

	@Test
	public void testEqualsAllFieldsEqualExceptSecondMajorRequirement() {
		String expectedTitle = "Learning Java";
		String expectedInstructor = "The Honorable Dr. Kevin Trainor";
		String expectedSemester = "Summer";
		int expectedYear = 2016;
		String expectedDepartmentCode = "LIS";
		int expectedCourseNumber = 452;
		String expectedSectionNumber = "1";
		String expectedInstitution = "University of Illinois";
		String expectedLocation = "Online";
		String expectedOnline = "Completely Online";
		boolean expectedGeneralRequirement = false;
		String expectedGeneralCategory = "No Category";
		boolean expectedFirstMajorRequirement = false;
		String expectedFirstMajorCategory = "No Category";
		boolean expectedSecondMajorRequirement = false;
		String expectedSecondMajorCategory = "No Category";
		boolean expectedFirstMinorRequirement = false;
		String expectedFirstMinorCategory = "No Category";
		boolean expectedSecondMinorRequirement = false;
		String expectedSecondMinorCategory = "No Category";
		boolean expectedFreeElective = true;
		boolean expectedCompleted = false;
		boolean expectedConsideringEnrollment = false;
		boolean expectedCurrentEnrollment = false;
		double expectedCredits = 4.0;
		double expectedGpaDesired = 4.0;
		double expectedGpaEarned = 4.0;
		String expectedCourseStartDate = "05/21/2016";
		String expectedCourseEndDate = "08/02/2016";
		int expectedCoursePredictedDifficulty = 3;
		int expectedCoursePredictedWorkload = 3;
		int expectedPredictedEnjoyability = 3;
		String expectedRecommendedByWho = "Jana Diesner";
		String expectedNotRecommendedByWho = "Nobody";
		String expectedProfessionalSkills = "Java Programming";
		String expectedAcademicSkills = "Data Analysis";
		CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, expectedSemester,
				expectedYear, expectedDepartmentCode, expectedCourseNumber, expectedSectionNumber, expectedInstitution,
				expectedLocation, expectedOnline, expectedGeneralRequirement, expectedGeneralCategory,
				expectedFirstMajorRequirement, expectedFirstMajorCategory, expectedSecondMajorRequirement,
				expectedSecondMajorCategory, expectedFirstMinorRequirement, expectedFirstMinorCategory,
				expectedSecondMinorRequirement, expectedSecondMinorCategory, expectedFreeElective, expectedCompleted,
				expectedConsideringEnrollment, expectedCurrentEnrollment, expectedCredits, expectedGpaDesired, expectedGpaEarned,
				expectedCourseStartDate, expectedCourseEndDate, expectedCoursePredictedDifficulty,
				expectedCoursePredictedWorkload, expectedPredictedEnjoyability, expectedRecommendedByWho,
				expectedNotRecommendedByWho, expectedProfessionalSkills, expectedAcademicSkills);
		CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, expectedSemester,
				expectedYear, expectedDepartmentCode, expectedCourseNumber, expectedSectionNumber, expectedInstitution,
				expectedLocation, expectedOnline, expectedGeneralRequirement, expectedGeneralCategory,
				expectedFirstMajorRequirement, expectedFirstMajorCategory, true, expectedSecondMajorCategory,
				expectedFirstMinorRequirement, expectedFirstMinorCategory, expectedSecondMinorRequirement,
				expectedSecondMinorCategory, expectedFreeElective, expectedCompleted, expectedConsideringEnrollment, expectedCurrentEnrollment, 
				expectedCredits, expectedGpaDesired, expectedGpaEarned, expectedCourseStartDate, expectedCourseEndDate,
				expectedCoursePredictedDifficulty, expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
				expectedRecommendedByWho, expectedNotRecommendedByWho, expectedProfessionalSkills,
				expectedAcademicSkills);
		assertFalse(course1.equals(course2));
		assertFalse(course1 == course2);
	}

	@Test
	public void testEqualsAllFieldsEqualExceptSecondMajorCategory() {
		String expectedTitle = "Learning Java";
		String expectedInstructor = "The Honorable Dr. Kevin Trainor";
		String expectedSemester = "Summer";
		int expectedYear = 2016;
		String expectedDepartmentCode = "LIS";
		int expectedCourseNumber = 452;
		String expectedSectionNumber = "1";
		String expectedInstitution = "University of Illinois";
		String expectedLocation = "Online";
		String expectedOnline = "Completely Online";
		boolean expectedGeneralRequirement = false;
		String expectedGeneralCategory = "No Category";
		boolean expectedFirstMajorRequirement = false;
		String expectedFirstMajorCategory = "No Category";
		boolean expectedSecondMajorRequirement = false;
		String expectedSecondMajorCategory = "No Category";
		boolean expectedFirstMinorRequirement = false;
		String expectedFirstMinorCategory = "No Category";
		boolean expectedSecondMinorRequirement = false;
		String expectedSecondMinorCategory = "No Category";
		boolean expectedFreeElective = true;
		boolean expectedCompleted = false;
		boolean expectedConsideringEnrollment = false;
		boolean expectedCurrentEnrollment = false;
		double expectedCredits = 4.0;
		double expectedGpaDesired = 4.0;
		double expectedGpaEarned = 4.0;
		String expectedCourseStartDate = "05/21/2016";
		String expectedCourseEndDate = "08/02/2016";
		int expectedCoursePredictedDifficulty = 3;
		int expectedCoursePredictedWorkload = 3;
		int expectedPredictedEnjoyability = 3;
		String expectedRecommendedByWho = "Jana Diesner";
		String expectedNotRecommendedByWho = "Nobody";
		String expectedProfessionalSkills = "Java Programming";
		String expectedAcademicSkills = "Data Analysis";
		CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, expectedSemester,
				expectedYear, expectedDepartmentCode, expectedCourseNumber, expectedSectionNumber, expectedInstitution,
				expectedLocation, expectedOnline, expectedGeneralRequirement, expectedGeneralCategory,
				expectedFirstMajorRequirement, expectedFirstMajorCategory, expectedSecondMajorRequirement,
				expectedSecondMajorCategory, expectedFirstMinorRequirement, expectedFirstMinorCategory,
				expectedSecondMinorRequirement, expectedSecondMinorCategory, expectedFreeElective, expectedCompleted,
				expectedConsideringEnrollment, expectedCurrentEnrollment, expectedCredits, expectedGpaDesired, expectedGpaEarned,
				expectedCourseStartDate, expectedCourseEndDate, expectedCoursePredictedDifficulty,
				expectedCoursePredictedWorkload, expectedPredictedEnjoyability, expectedRecommendedByWho,
				expectedNotRecommendedByWho, expectedProfessionalSkills, expectedAcademicSkills);
		CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, expectedSemester,
				expectedYear, expectedDepartmentCode, expectedCourseNumber, expectedSectionNumber, expectedInstitution,
				expectedLocation, expectedOnline, expectedGeneralRequirement, expectedGeneralCategory,
				expectedFirstMajorRequirement, expectedFirstMajorCategory, expectedSecondMajorRequirement, "Core",
				expectedFirstMinorRequirement, expectedFirstMinorCategory, expectedSecondMinorRequirement,
				expectedSecondMinorCategory, expectedFreeElective, expectedCompleted, expectedConsideringEnrollment, expectedCurrentEnrollment, 
				expectedCredits, expectedGpaDesired, expectedGpaEarned, expectedCourseStartDate, expectedCourseEndDate,
				expectedCoursePredictedDifficulty, expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
				expectedRecommendedByWho, expectedNotRecommendedByWho, expectedProfessionalSkills,
				expectedAcademicSkills);
		assertFalse(course1.equals(course2));
		assertFalse(course1 == course2);
	}

	@Test
	public void testEqualsAllFieldsEqualExceptFirstMinorRequirement() {
		String expectedTitle = "Learning Java";
		String expectedInstructor = "The Honorable Dr. Kevin Trainor";
		String expectedSemester = "Summer";
		int expectedYear = 2016;
		String expectedDepartmentCode = "LIS";
		int expectedCourseNumber = 452;
		String expectedSectionNumber = "1";
		String expectedInstitution = "University of Illinois";
		String expectedLocation = "Online";
		String expectedOnline = "Completely Online";
		boolean expectedGeneralRequirement = false;
		String expectedGeneralCategory = "No Category";
		boolean expectedFirstMajorRequirement = false;
		String expectedFirstMajorCategory = "No Category";
		boolean expectedSecondMajorRequirement = false;
		String expectedSecondMajorCategory = "No Category";
		boolean expectedFirstMinorRequirement = false;
		String expectedFirstMinorCategory = "No Category";
		boolean expectedSecondMinorRequirement = false;
		String expectedSecondMinorCategory = "No Category";
		boolean expectedFreeElective = true;
		boolean expectedCompleted = false;
		boolean expectedConsideringEnrollment = false;
		boolean expectedCurrentEnrollment = false;
		double expectedCredits = 4.0;
		double expectedGpaDesired = 4.0;
		double expectedGpaEarned = 4.0;
		String expectedCourseStartDate = "05/21/2016";
		String expectedCourseEndDate = "08/02/2016";
		int expectedCoursePredictedDifficulty = 3;
		int expectedCoursePredictedWorkload = 3;
		int expectedPredictedEnjoyability = 3;
		String expectedRecommendedByWho = "Jana Diesner";
		String expectedNotRecommendedByWho = "Nobody";
		String expectedProfessionalSkills = "Java Programming";
		String expectedAcademicSkills = "Data Analysis";
		CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, expectedSemester,
				expectedYear, expectedDepartmentCode, expectedCourseNumber, expectedSectionNumber, expectedInstitution,
				expectedLocation, expectedOnline, expectedGeneralRequirement, expectedGeneralCategory,
				expectedFirstMajorRequirement, expectedFirstMajorCategory, expectedSecondMajorRequirement,
				expectedSecondMajorCategory, expectedFirstMinorRequirement, expectedFirstMinorCategory,
				expectedSecondMinorRequirement, expectedSecondMinorCategory, expectedFreeElective, expectedCompleted,
				expectedConsideringEnrollment, expectedCurrentEnrollment, expectedCredits, expectedGpaDesired, expectedGpaEarned,
				expectedCourseStartDate, expectedCourseEndDate, expectedCoursePredictedDifficulty,
				expectedCoursePredictedWorkload, expectedPredictedEnjoyability, expectedRecommendedByWho,
				expectedNotRecommendedByWho, expectedProfessionalSkills, expectedAcademicSkills);
		CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, expectedSemester,
				expectedYear, expectedDepartmentCode, expectedCourseNumber, expectedSectionNumber, expectedInstitution,
				expectedLocation, expectedOnline, expectedGeneralRequirement, expectedGeneralCategory,
				expectedFirstMajorRequirement, expectedFirstMajorCategory, expectedSecondMajorRequirement,
				expectedSecondMajorCategory, true, expectedFirstMinorCategory, expectedSecondMinorRequirement,
				expectedSecondMinorCategory, expectedFreeElective, expectedCompleted, expectedConsideringEnrollment, expectedCurrentEnrollment, 
				expectedCredits, expectedGpaDesired, expectedGpaEarned, expectedCourseStartDate, expectedCourseEndDate,
				expectedCoursePredictedDifficulty, expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
				expectedRecommendedByWho, expectedNotRecommendedByWho, expectedProfessionalSkills,
				expectedAcademicSkills);
		assertFalse(course1.equals(course2));
		assertFalse(course1 == course2);
	}

	@Test
	public void testEqualsAllFieldsEqualExceptFirstMinorCategory() {
		String expectedTitle = "Learning Java";
		String expectedInstructor = "The Honorable Dr. Kevin Trainor";
		String expectedSemester = "Summer";
		int expectedYear = 2016;
		String expectedDepartmentCode = "LIS";
		int expectedCourseNumber = 452;
		String expectedSectionNumber = "1";
		String expectedInstitution = "University of Illinois";
		String expectedLocation = "Online";
		String expectedOnline = "Completely Online";
		boolean expectedGeneralRequirement = false;
		String expectedGeneralCategory = "No Category";
		boolean expectedFirstMajorRequirement = false;
		String expectedFirstMajorCategory = "No Category";
		boolean expectedSecondMajorRequirement = false;
		String expectedSecondMajorCategory = "No Category";
		boolean expectedFirstMinorRequirement = false;
		String expectedFirstMinorCategory = "No Category";
		boolean expectedSecondMinorRequirement = false;
		String expectedSecondMinorCategory = "No Category";
		boolean expectedFreeElective = true;
		boolean expectedCompleted = false;
		boolean expectedConsideringEnrollment = false;
		boolean expectedCurrentEnrollment = false;
		double expectedCredits = 4.0;
		double expectedGpaDesired = 4.0;
		double expectedGpaEarned = 4.0;
		String expectedCourseStartDate = "05/21/2016";
		String expectedCourseEndDate = "08/02/2016";
		int expectedCoursePredictedDifficulty = 3;
		int expectedCoursePredictedWorkload = 3;
		int expectedPredictedEnjoyability = 3;
		String expectedRecommendedByWho = "Jana Diesner";
		String expectedNotRecommendedByWho = "Nobody";
		String expectedProfessionalSkills = "Java Programming";
		String expectedAcademicSkills = "Data Analysis";
		CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, expectedSemester,
				expectedYear, expectedDepartmentCode, expectedCourseNumber, expectedSectionNumber, expectedInstitution,
				expectedLocation, expectedOnline, expectedGeneralRequirement, expectedGeneralCategory,
				expectedFirstMajorRequirement, expectedFirstMajorCategory, expectedSecondMajorRequirement,
				expectedSecondMajorCategory, expectedFirstMinorRequirement, expectedFirstMinorCategory,
				expectedSecondMinorRequirement, expectedSecondMinorCategory, expectedFreeElective, expectedCompleted,
				expectedConsideringEnrollment, expectedCurrentEnrollment, expectedCredits, expectedGpaDesired, expectedGpaEarned,
				expectedCourseStartDate, expectedCourseEndDate, expectedCoursePredictedDifficulty,
				expectedCoursePredictedWorkload, expectedPredictedEnjoyability, expectedRecommendedByWho,
				expectedNotRecommendedByWho, expectedProfessionalSkills, expectedAcademicSkills);
		CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, expectedSemester,
				expectedYear, expectedDepartmentCode, expectedCourseNumber, expectedSectionNumber, expectedInstitution,
				expectedLocation, expectedOnline, expectedGeneralRequirement, expectedGeneralCategory,
				expectedFirstMajorRequirement, expectedFirstMajorCategory, expectedSecondMajorRequirement,
				expectedSecondMajorCategory, expectedFirstMinorRequirement, "Core", expectedSecondMinorRequirement,
				expectedSecondMinorCategory, expectedFreeElective, expectedCompleted, expectedConsideringEnrollment, expectedCurrentEnrollment, 
				expectedCredits, expectedGpaDesired, expectedGpaEarned, expectedCourseStartDate, expectedCourseEndDate,
				expectedCoursePredictedDifficulty, expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
				expectedRecommendedByWho, expectedNotRecommendedByWho, expectedProfessionalSkills,
				expectedAcademicSkills);
		assertFalse(course1.equals(course2));
		assertFalse(course1 == course2);
	}

	@Test
	public void testEqualsAllFieldsEqualExceptSecondMinorRequirement() {
		String expectedTitle = "Learning Java";
		String expectedInstructor = "The Honorable Dr. Kevin Trainor";
		String expectedSemester = "Summer";
		int expectedYear = 2016;
		String expectedDepartmentCode = "LIS";
		int expectedCourseNumber = 452;
		String expectedSectionNumber = "1";
		String expectedInstitution = "University of Illinois";
		String expectedLocation = "Online";
		String expectedOnline = "Completely Online";
		boolean expectedGeneralRequirement = false;
		String expectedGeneralCategory = "No Category";
		boolean expectedFirstMajorRequirement = false;
		String expectedFirstMajorCategory = "No Category";
		boolean expectedSecondMajorRequirement = false;
		String expectedSecondMajorCategory = "No Category";
		boolean expectedFirstMinorRequirement = false;
		String expectedFirstMinorCategory = "No Category";
		boolean expectedSecondMinorRequirement = false;
		String expectedSecondMinorCategory = "No Category";
		boolean expectedFreeElective = true;
		boolean expectedCompleted = false;
		boolean expectedConsideringEnrollment = false;
		boolean expectedCurrentEnrollment = false;
		double expectedCredits = 4.0;
		double expectedGpaDesired = 4.0;
		double expectedGpaEarned = 4.0;
		String expectedCourseStartDate = "05/21/2016";
		String expectedCourseEndDate = "08/02/2016";
		int expectedCoursePredictedDifficulty = 3;
		int expectedCoursePredictedWorkload = 3;
		int expectedPredictedEnjoyability = 3;
		String expectedRecommendedByWho = "Jana Diesner";
		String expectedNotRecommendedByWho = "Nobody";
		String expectedProfessionalSkills = "Java Programming";
		String expectedAcademicSkills = "Data Analysis";
		CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, expectedSemester,
				expectedYear, expectedDepartmentCode, expectedCourseNumber, expectedSectionNumber, expectedInstitution,
				expectedLocation, expectedOnline, expectedGeneralRequirement, expectedGeneralCategory,
				expectedFirstMajorRequirement, expectedFirstMajorCategory, expectedSecondMajorRequirement,
				expectedSecondMajorCategory, expectedFirstMinorRequirement, expectedFirstMinorCategory,
				expectedSecondMinorRequirement, expectedSecondMinorCategory, expectedFreeElective, expectedCompleted,
				expectedConsideringEnrollment, expectedCurrentEnrollment, expectedCredits, expectedGpaDesired, expectedGpaEarned,
				expectedCourseStartDate, expectedCourseEndDate, expectedCoursePredictedDifficulty,
				expectedCoursePredictedWorkload, expectedPredictedEnjoyability, expectedRecommendedByWho,
				expectedNotRecommendedByWho, expectedProfessionalSkills, expectedAcademicSkills);
		CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, expectedSemester,
				expectedYear, expectedDepartmentCode, expectedCourseNumber, expectedSectionNumber, expectedInstitution,
				expectedLocation, expectedOnline, expectedGeneralRequirement, expectedGeneralCategory,
				expectedFirstMajorRequirement, expectedFirstMajorCategory, expectedSecondMajorRequirement,
				expectedSecondMajorCategory, expectedFirstMinorRequirement, expectedFirstMinorCategory, true,
				expectedSecondMinorCategory, expectedFreeElective, expectedCompleted, expectedConsideringEnrollment, expectedCurrentEnrollment, 
				expectedCredits, expectedGpaDesired, expectedGpaEarned, expectedCourseStartDate, expectedCourseEndDate,
				expectedCoursePredictedDifficulty, expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
				expectedRecommendedByWho, expectedNotRecommendedByWho, expectedProfessionalSkills,
				expectedAcademicSkills);
		assertFalse(course1.equals(course2));
		assertFalse(course1 == course2);
	}

	@Test
	public void testEqualsAllFieldsEqualExceptFreeElective() {
		String expectedTitle = "Learning Java";
		String expectedInstructor = "The Honorable Dr. Kevin Trainor";
		String expectedSemester = "Summer";
		int expectedYear = 2016;
		String expectedDepartmentCode = "LIS";
		int expectedCourseNumber = 452;
		String expectedSectionNumber = "1";
		String expectedInstitution = "University of Illinois";
		String expectedLocation = "Online";
		String expectedOnline = "Completely Online";
		boolean expectedGeneralRequirement = false;
		String expectedGeneralCategory = "No Category";
		boolean expectedFirstMajorRequirement = false;
		String expectedFirstMajorCategory = "No Category";
		boolean expectedSecondMajorRequirement = false;
		String expectedSecondMajorCategory = "No Category";
		boolean expectedFirstMinorRequirement = false;
		String expectedFirstMinorCategory = "No Category";
		boolean expectedSecondMinorRequirement = false;
		String expectedSecondMinorCategory = "No Category";
		boolean expectedFreeElective = true;
		boolean expectedCompleted = false;
		boolean expectedConsideringEnrollment = false;
		boolean expectedCurrentEnrollment = false;
		double expectedCredits = 4.0;
		double expectedGpaDesired = 4.0;
		double expectedGpaEarned = 4.0;
		String expectedCourseStartDate = "05/21/2016";
		String expectedCourseEndDate = "08/02/2016";
		int expectedCoursePredictedDifficulty = 3;
		int expectedCoursePredictedWorkload = 3;
		int expectedPredictedEnjoyability = 3;
		String expectedRecommendedByWho = "Jana Diesner";
		String expectedNotRecommendedByWho = "Nobody";
		String expectedProfessionalSkills = "Java Programming";
		String expectedAcademicSkills = "Data Analysis";
		CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, expectedSemester,
				expectedYear, expectedDepartmentCode, expectedCourseNumber, expectedSectionNumber, expectedInstitution,
				expectedLocation, expectedOnline, expectedGeneralRequirement, expectedGeneralCategory,
				expectedFirstMajorRequirement, expectedFirstMajorCategory, expectedSecondMajorRequirement,
				expectedSecondMajorCategory, expectedFirstMinorRequirement, expectedFirstMinorCategory,
				expectedSecondMinorRequirement, expectedSecondMinorCategory, expectedFreeElective, expectedCompleted,
				expectedConsideringEnrollment, expectedCurrentEnrollment, expectedCredits, expectedGpaDesired, expectedGpaEarned,
				expectedCourseStartDate, expectedCourseEndDate, expectedCoursePredictedDifficulty,
				expectedCoursePredictedWorkload, expectedPredictedEnjoyability, expectedRecommendedByWho,
				expectedNotRecommendedByWho, expectedProfessionalSkills, expectedAcademicSkills);
		CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, expectedSemester,
				expectedYear, expectedDepartmentCode, expectedCourseNumber, expectedSectionNumber, expectedInstitution,
				expectedLocation, expectedOnline, expectedGeneralRequirement, expectedGeneralCategory,
				expectedFirstMajorRequirement, expectedFirstMajorCategory, expectedSecondMajorRequirement,
				expectedSecondMajorCategory, expectedFirstMinorRequirement, expectedFirstMinorCategory,
				expectedSecondMinorRequirement, expectedSecondMinorCategory, false, expectedCompleted,
				expectedConsideringEnrollment, expectedCurrentEnrollment, expectedCredits, expectedGpaDesired, expectedGpaEarned,
				expectedCourseStartDate, expectedCourseEndDate, expectedCoursePredictedDifficulty,
				expectedCoursePredictedWorkload, expectedPredictedEnjoyability, expectedRecommendedByWho,
				expectedNotRecommendedByWho, expectedProfessionalSkills, expectedAcademicSkills);
		assertFalse(course1.equals(course2));
		assertFalse(course1 == course2);
	}

	@Test
	public void testEqualsAllFieldsEqualExceptCompleted() {
		String expectedTitle = "Learning Java";
		String expectedInstructor = "The Honorable Dr. Kevin Trainor";
		String expectedSemester = "Summer";
		int expectedYear = 2016;
		String expectedDepartmentCode = "LIS";
		int expectedCourseNumber = 452;
		String expectedSectionNumber = "1";
		String expectedInstitution = "University of Illinois";
		String expectedLocation = "Online";
		String expectedOnline = "Completely Online";
		boolean expectedGeneralRequirement = false;
		String expectedGeneralCategory = "No Category";
		boolean expectedFirstMajorRequirement = false;
		String expectedFirstMajorCategory = "No Category";
		boolean expectedSecondMajorRequirement = false;
		String expectedSecondMajorCategory = "No Category";
		boolean expectedFirstMinorRequirement = false;
		String expectedFirstMinorCategory = "No Category";
		boolean expectedSecondMinorRequirement = false;
		String expectedSecondMinorCategory = "No Category";
		boolean expectedFreeElective = true;
		boolean expectedCompleted = false;
		boolean expectedConsideringEnrollment = false;
		boolean expectedCurrentEnrollment = false;
		double expectedCredits = 4.0;
		double expectedGpaDesired = 4.0;
		double expectedGpaEarned = 4.0;
		String expectedCourseStartDate = "05/21/2016";
		String expectedCourseEndDate = "08/02/2016";
		int expectedCoursePredictedDifficulty = 3;
		int expectedCoursePredictedWorkload = 3;
		int expectedPredictedEnjoyability = 3;
		String expectedRecommendedByWho = "Jana Diesner";
		String expectedNotRecommendedByWho = "Nobody";
		String expectedProfessionalSkills = "Java Programming";
		String expectedAcademicSkills = "Data Analysis";
		CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, expectedSemester,
				expectedYear, expectedDepartmentCode, expectedCourseNumber, expectedSectionNumber, expectedInstitution,
				expectedLocation, expectedOnline, expectedGeneralRequirement, expectedGeneralCategory,
				expectedFirstMajorRequirement, expectedFirstMajorCategory, expectedSecondMajorRequirement,
				expectedSecondMajorCategory, expectedFirstMinorRequirement, expectedFirstMinorCategory,
				expectedSecondMinorRequirement, expectedSecondMinorCategory, expectedFreeElective, expectedCompleted,
				expectedConsideringEnrollment, expectedCurrentEnrollment, expectedCredits, expectedGpaDesired, expectedGpaEarned,
				expectedCourseStartDate, expectedCourseEndDate, expectedCoursePredictedDifficulty,
				expectedCoursePredictedWorkload, expectedPredictedEnjoyability, expectedRecommendedByWho,
				expectedNotRecommendedByWho, expectedProfessionalSkills, expectedAcademicSkills);
		CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, expectedSemester,
				expectedYear, expectedDepartmentCode, expectedCourseNumber, expectedSectionNumber, expectedInstitution,
				expectedLocation, expectedOnline, expectedGeneralRequirement, expectedGeneralCategory,
				expectedFirstMajorRequirement, expectedFirstMajorCategory, expectedSecondMajorRequirement,
				expectedSecondMajorCategory, expectedFirstMinorRequirement, expectedFirstMinorCategory,
				expectedSecondMinorRequirement, expectedSecondMinorCategory, expectedFreeElective, true,
				expectedConsideringEnrollment, expectedCurrentEnrollment, expectedCredits, expectedGpaDesired, expectedGpaEarned,
				expectedCourseStartDate, expectedCourseEndDate, expectedCoursePredictedDifficulty,
				expectedCoursePredictedWorkload, expectedPredictedEnjoyability, expectedRecommendedByWho,
				expectedNotRecommendedByWho, expectedProfessionalSkills, expectedAcademicSkills);
		assertFalse(course1.equals(course2));
		assertFalse(course1 == course2);
	}

	@Test
	public void testEqualsAllFieldsEqualExceptConsideringEnrollment() {
		String expectedTitle = "Learning Java";
		String expectedInstructor = "The Honorable Dr. Kevin Trainor";
		String expectedSemester = "Summer";
		int expectedYear = 2016;
		String expectedDepartmentCode = "LIS";
		int expectedCourseNumber = 452;
		String expectedSectionNumber = "1";
		String expectedInstitution = "University of Illinois";
		String expectedLocation = "Online";
		String expectedOnline = "Completely Online";
		boolean expectedGeneralRequirement = false;
		String expectedGeneralCategory = "No Category";
		boolean expectedFirstMajorRequirement = false;
		String expectedFirstMajorCategory = "No Category";
		boolean expectedSecondMajorRequirement = false;
		String expectedSecondMajorCategory = "No Category";
		boolean expectedFirstMinorRequirement = false;
		String expectedFirstMinorCategory = "No Category";
		boolean expectedSecondMinorRequirement = false;
		String expectedSecondMinorCategory = "No Category";
		boolean expectedFreeElective = true;
		boolean expectedCompleted = false;
		boolean expectedConsideringEnrollment = false;
		boolean expectedCurrentEnrollment = false;
		double expectedCredits = 4.0;
		double expectedGpaDesired = 4.0;
		double expectedGpaEarned = 4.0;
		String expectedCourseStartDate = "05/21/2016";
		String expectedCourseEndDate = "08/02/2016";
		int expectedCoursePredictedDifficulty = 3;
		int expectedCoursePredictedWorkload = 3;
		int expectedPredictedEnjoyability = 3;
		String expectedRecommendedByWho = "Jana Diesner";
		String expectedNotRecommendedByWho = "Nobody";
		String expectedProfessionalSkills = "Java Programming";
		String expectedAcademicSkills = "Data Analysis";
		CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, expectedSemester,
				expectedYear, expectedDepartmentCode, expectedCourseNumber, expectedSectionNumber, expectedInstitution,
				expectedLocation, expectedOnline, expectedGeneralRequirement, expectedGeneralCategory,
				expectedFirstMajorRequirement, expectedFirstMajorCategory, expectedSecondMajorRequirement,
				expectedSecondMajorCategory, expectedFirstMinorRequirement, expectedFirstMinorCategory,
				expectedSecondMinorRequirement, expectedSecondMinorCategory, expectedFreeElective, expectedCompleted,
				expectedConsideringEnrollment, expectedCurrentEnrollment, expectedCredits, expectedGpaDesired, expectedGpaEarned,
				expectedCourseStartDate, expectedCourseEndDate, expectedCoursePredictedDifficulty,
				expectedCoursePredictedWorkload, expectedPredictedEnjoyability, expectedRecommendedByWho,
				expectedNotRecommendedByWho, expectedProfessionalSkills, expectedAcademicSkills);
		CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, expectedSemester,
				expectedYear, expectedDepartmentCode, expectedCourseNumber, expectedSectionNumber, expectedInstitution,
				expectedLocation, expectedOnline, expectedGeneralRequirement, expectedGeneralCategory,
				expectedFirstMajorRequirement, expectedFirstMajorCategory, expectedSecondMajorRequirement,
				expectedSecondMajorCategory, expectedFirstMinorRequirement, expectedFirstMinorCategory,
				expectedSecondMinorRequirement, expectedSecondMinorCategory, expectedFreeElective, expectedCompleted, 
				true, expectedCurrentEnrollment, expectedCredits, expectedGpaDesired, expectedGpaEarned, expectedCourseStartDate,
				expectedCourseEndDate, expectedCoursePredictedDifficulty, expectedCoursePredictedWorkload,
				expectedPredictedEnjoyability, expectedRecommendedByWho, expectedNotRecommendedByWho,
				expectedProfessionalSkills, expectedAcademicSkills);
		assertFalse(course1.equals(course2));
		assertFalse(course1 == course2);
	}

	@Test
	public void testEqualsAllFieldsEqualExceptCurrentEnrollment() {
		String expectedTitle = "Learning Java";
		String expectedInstructor = "The Honorable Dr. Kevin Trainor";
		String expectedSemester = "Summer";
		int expectedYear = 2016;
		String expectedDepartmentCode = "LIS";
		int expectedCourseNumber = 452;
		String expectedSectionNumber = "1";
		String expectedInstitution = "University of Illinois";
		String expectedLocation = "Online";
		String expectedOnline = "Completely Online";
		boolean expectedGeneralRequirement = false;
		String expectedGeneralCategory = "No Category";
		boolean expectedFirstMajorRequirement = false;
		String expectedFirstMajorCategory = "No Category";
		boolean expectedSecondMajorRequirement = false;
		String expectedSecondMajorCategory = "No Category";
		boolean expectedFirstMinorRequirement = false;
		String expectedFirstMinorCategory = "No Category";
		boolean expectedSecondMinorRequirement = false;
		String expectedSecondMinorCategory = "No Category";
		boolean expectedFreeElective = true;
		boolean expectedCompleted = false;
		boolean expectedConsideringEnrollment = false;
		boolean expectedCurrentEnrollment = false;
		double expectedCredits = 4.0;
		double expectedGpaDesired = 4.0;
		double expectedGpaEarned = 4.0;
		String expectedCourseStartDate = "05/21/2016";
		String expectedCourseEndDate = "08/02/2016";
		int expectedCoursePredictedDifficulty = 3;
		int expectedCoursePredictedWorkload = 3;
		int expectedPredictedEnjoyability = 3;
		String expectedRecommendedByWho = "Jana Diesner";
		String expectedNotRecommendedByWho = "Nobody";
		String expectedProfessionalSkills = "Java Programming";
		String expectedAcademicSkills = "Data Analysis";
		CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, expectedSemester,
				expectedYear, expectedDepartmentCode, expectedCourseNumber, expectedSectionNumber, expectedInstitution,
				expectedLocation, expectedOnline, expectedGeneralRequirement, expectedGeneralCategory,
				expectedFirstMajorRequirement, expectedFirstMajorCategory, expectedSecondMajorRequirement,
				expectedSecondMajorCategory, expectedFirstMinorRequirement, expectedFirstMinorCategory,
				expectedSecondMinorRequirement, expectedSecondMinorCategory, expectedFreeElective, expectedCompleted,
				expectedConsideringEnrollment, expectedCurrentEnrollment, expectedCredits, expectedGpaDesired, expectedGpaEarned,
				expectedCourseStartDate, expectedCourseEndDate, expectedCoursePredictedDifficulty,
				expectedCoursePredictedWorkload, expectedPredictedEnjoyability, expectedRecommendedByWho,
				expectedNotRecommendedByWho, expectedProfessionalSkills, expectedAcademicSkills);
		CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, expectedSemester,
				expectedYear, expectedDepartmentCode, expectedCourseNumber, expectedSectionNumber, expectedInstitution,
				expectedLocation, expectedOnline, expectedGeneralRequirement, expectedGeneralCategory,
				expectedFirstMajorRequirement, expectedFirstMajorCategory, expectedSecondMajorRequirement,
				expectedSecondMajorCategory, expectedFirstMinorRequirement, expectedFirstMinorCategory,
				expectedSecondMinorRequirement, expectedSecondMinorCategory, expectedFreeElective, expectedCompleted,
				expectedConsideringEnrollment, true, 3.5, expectedGpaDesired, expectedGpaEarned, expectedCourseStartDate,
				expectedCourseEndDate, expectedCoursePredictedDifficulty, expectedCoursePredictedWorkload,
				expectedPredictedEnjoyability, expectedRecommendedByWho, expectedNotRecommendedByWho,
				expectedProfessionalSkills, expectedAcademicSkills);
		assertFalse(course1.equals(course2));
		assertFalse(course1 == course2);
		
	}
	
	@Test
	public void testEqualsAllFieldsEqualExceptCredits() {
		String expectedTitle = "Learning Java";
		String expectedInstructor = "The Honorable Dr. Kevin Trainor";
		String expectedSemester = "Summer";
		int expectedYear = 2016;
		String expectedDepartmentCode = "LIS";
		int expectedCourseNumber = 452;
		String expectedSectionNumber = "1";
		String expectedInstitution = "University of Illinois";
		String expectedLocation = "Online";
		String expectedOnline = "Completely Online";
		boolean expectedGeneralRequirement = false;
		String expectedGeneralCategory = "No Category";
		boolean expectedFirstMajorRequirement = false;
		String expectedFirstMajorCategory = "No Category";
		boolean expectedSecondMajorRequirement = false;
		String expectedSecondMajorCategory = "No Category";
		boolean expectedFirstMinorRequirement = false;
		String expectedFirstMinorCategory = "No Category";
		boolean expectedSecondMinorRequirement = false;
		String expectedSecondMinorCategory = "No Category";
		boolean expectedFreeElective = true;
		boolean expectedCompleted = false;
		boolean expectedConsideringEnrollment = false;
		boolean expectedCurrentEnrollment = false;
		double expectedCredits = 4.0;
		double expectedGpaDesired = 4.0;
		double expectedGpaEarned = 4.0;
		String expectedCourseStartDate = "05/21/2016";
		String expectedCourseEndDate = "08/02/2016";
		int expectedCoursePredictedDifficulty = 3;
		int expectedCoursePredictedWorkload = 3;
		int expectedPredictedEnjoyability = 3;
		String expectedRecommendedByWho = "Jana Diesner";
		String expectedNotRecommendedByWho = "Nobody";
		String expectedProfessionalSkills = "Java Programming";
		String expectedAcademicSkills = "Data Analysis";
		CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, expectedSemester,
				expectedYear, expectedDepartmentCode, expectedCourseNumber, expectedSectionNumber, expectedInstitution,
				expectedLocation, expectedOnline, expectedGeneralRequirement, expectedGeneralCategory,
				expectedFirstMajorRequirement, expectedFirstMajorCategory, expectedSecondMajorRequirement,
				expectedSecondMajorCategory, expectedFirstMinorRequirement, expectedFirstMinorCategory,
				expectedSecondMinorRequirement, expectedSecondMinorCategory, expectedFreeElective, expectedCompleted,
				expectedConsideringEnrollment, expectedCurrentEnrollment, expectedCredits, expectedGpaDesired, expectedGpaEarned,
				expectedCourseStartDate, expectedCourseEndDate, expectedCoursePredictedDifficulty,
				expectedCoursePredictedWorkload, expectedPredictedEnjoyability, expectedRecommendedByWho,
				expectedNotRecommendedByWho, expectedProfessionalSkills, expectedAcademicSkills);
		CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, expectedSemester,
				expectedYear, expectedDepartmentCode, expectedCourseNumber, expectedSectionNumber, expectedInstitution,
				expectedLocation, expectedOnline, expectedGeneralRequirement, expectedGeneralCategory,
				expectedFirstMajorRequirement, expectedFirstMajorCategory, expectedSecondMajorRequirement,
				expectedSecondMajorCategory, expectedFirstMinorRequirement, expectedFirstMinorCategory,
				expectedSecondMinorRequirement, expectedSecondMinorCategory, expectedFreeElective, expectedCompleted,
				expectedConsideringEnrollment, expectedCurrentEnrollment, 3.5, expectedGpaDesired, expectedGpaEarned, expectedCourseStartDate,
				expectedCourseEndDate, expectedCoursePredictedDifficulty, expectedCoursePredictedWorkload,
				expectedPredictedEnjoyability, expectedRecommendedByWho, expectedNotRecommendedByWho,
				expectedProfessionalSkills, expectedAcademicSkills);
		assertFalse(course1.equals(course2));
		assertFalse(course1 == course2);
	}

	@Test
	public void testEqualsAllFieldsEqualExceptGpaDesired() {
		String expectedTitle = "Learning Java";
		String expectedInstructor = "The Honorable Dr. Kevin Trainor";
		String expectedSemester = "Summer";
		int expectedYear = 2016;
		String expectedDepartmentCode = "LIS";
		int expectedCourseNumber = 452;
		String expectedSectionNumber = "1";
		String expectedInstitution = "University of Illinois";
		String expectedLocation = "Online";
		String expectedOnline = "Completely Online";
		boolean expectedGeneralRequirement = false;
		String expectedGeneralCategory = "No Category";
		boolean expectedFirstMajorRequirement = false;
		String expectedFirstMajorCategory = "No Category";
		boolean expectedSecondMajorRequirement = false;
		String expectedSecondMajorCategory = "No Category";
		boolean expectedFirstMinorRequirement = false;
		String expectedFirstMinorCategory = "No Category";
		boolean expectedSecondMinorRequirement = false;
		String expectedSecondMinorCategory = "No Category";
		boolean expectedFreeElective = true;
		boolean expectedCompleted = false;
		boolean expectedConsideringEnrollment = false;
		boolean expectedCurrentEnrollment = false;
		double expectedCredits = 4.0;
		double expectedGpaDesired = 4.0;
		double expectedGpaEarned = 4.0;
		String expectedCourseStartDate = "05/21/2016";
		String expectedCourseEndDate = "08/02/2016";
		int expectedCoursePredictedDifficulty = 3;
		int expectedCoursePredictedWorkload = 3;
		int expectedPredictedEnjoyability = 3;
		String expectedRecommendedByWho = "Jana Diesner";
		String expectedNotRecommendedByWho = "Nobody";
		String expectedProfessionalSkills = "Java Programming";
		String expectedAcademicSkills = "Data Analysis";
		CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, expectedSemester,
				expectedYear, expectedDepartmentCode, expectedCourseNumber, expectedSectionNumber, expectedInstitution,
				expectedLocation, expectedOnline, expectedGeneralRequirement, expectedGeneralCategory,
				expectedFirstMajorRequirement, expectedFirstMajorCategory, expectedSecondMajorRequirement,
				expectedSecondMajorCategory, expectedFirstMinorRequirement, expectedFirstMinorCategory,
				expectedSecondMinorRequirement, expectedSecondMinorCategory, expectedFreeElective, expectedCompleted,
				expectedConsideringEnrollment, expectedCurrentEnrollment, expectedCredits, expectedGpaDesired, expectedGpaEarned,
				expectedCourseStartDate, expectedCourseEndDate, expectedCoursePredictedDifficulty,
				expectedCoursePredictedWorkload, expectedPredictedEnjoyability, expectedRecommendedByWho,
				expectedNotRecommendedByWho, expectedProfessionalSkills, expectedAcademicSkills);
		CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, expectedSemester,
				expectedYear, expectedDepartmentCode, expectedCourseNumber, expectedSectionNumber, expectedInstitution,
				expectedLocation, expectedOnline, expectedGeneralRequirement, expectedGeneralCategory,
				expectedFirstMajorRequirement, expectedFirstMajorCategory, expectedSecondMajorRequirement,
				expectedSecondMajorCategory, expectedFirstMinorRequirement, expectedFirstMinorCategory,
				expectedSecondMinorRequirement, expectedSecondMinorCategory, expectedFreeElective, expectedCompleted,
				expectedConsideringEnrollment, expectedCurrentEnrollment, expectedCredits, 3.5, expectedGpaEarned, expectedCourseStartDate,
				expectedCourseEndDate, expectedCoursePredictedDifficulty, expectedCoursePredictedWorkload,
				expectedPredictedEnjoyability, expectedRecommendedByWho, expectedNotRecommendedByWho,
				expectedProfessionalSkills, expectedAcademicSkills);
		assertFalse(course1.equals(course2));
		assertFalse(course1 == course2);
	}

	@Test
	public void testEqualsAllFieldsEqualExceptGpaEarned() {
		String expectedTitle = "Learning Java";
		String expectedInstructor = "The Honorable Dr. Kevin Trainor";
		String expectedSemester = "Summer";
		int expectedYear = 2016;
		String expectedDepartmentCode = "LIS";
		int expectedCourseNumber = 452;
		String expectedSectionNumber = "1";
		String expectedInstitution = "University of Illinois";
		String expectedLocation = "Online";
		String expectedOnline = "Completely Online";
		boolean expectedGeneralRequirement = false;
		String expectedGeneralCategory = "No Category";
		boolean expectedFirstMajorRequirement = false;
		String expectedFirstMajorCategory = "No Category";
		boolean expectedSecondMajorRequirement = false;
		String expectedSecondMajorCategory = "No Category";
		boolean expectedFirstMinorRequirement = false;
		String expectedFirstMinorCategory = "No Category";
		boolean expectedSecondMinorRequirement = false;
		String expectedSecondMinorCategory = "No Category";
		boolean expectedFreeElective = true;
		boolean expectedCompleted = false;
		boolean expectedConsideringEnrollment = false;
		boolean expectedCurrentEnrollment = false;
		double expectedCredits = 4.0;
		double expectedGpaDesired = 4.0;
		double expectedGpaEarned = 4.0;
		String expectedCourseStartDate = "05/21/2016";
		String expectedCourseEndDate = "08/02/2016";
		int expectedCoursePredictedDifficulty = 3;
		int expectedCoursePredictedWorkload = 3;
		int expectedPredictedEnjoyability = 3;
		String expectedRecommendedByWho = "Jana Diesner";
		String expectedNotRecommendedByWho = "Nobody";
		String expectedProfessionalSkills = "Java Programming";
		String expectedAcademicSkills = "Data Analysis";
		CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, expectedSemester,
				expectedYear, expectedDepartmentCode, expectedCourseNumber, expectedSectionNumber, expectedInstitution,
				expectedLocation, expectedOnline, expectedGeneralRequirement, expectedGeneralCategory,
				expectedFirstMajorRequirement, expectedFirstMajorCategory, expectedSecondMajorRequirement,
				expectedSecondMajorCategory, expectedFirstMinorRequirement, expectedFirstMinorCategory,
				expectedSecondMinorRequirement, expectedSecondMinorCategory, expectedFreeElective, expectedCompleted,
				expectedConsideringEnrollment, expectedCurrentEnrollment, expectedCredits, expectedGpaDesired, expectedGpaEarned,
				expectedCourseStartDate, expectedCourseEndDate, expectedCoursePredictedDifficulty,
				expectedCoursePredictedWorkload, expectedPredictedEnjoyability, expectedRecommendedByWho,
				expectedNotRecommendedByWho, expectedProfessionalSkills, expectedAcademicSkills);
		CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, expectedSemester,
				expectedYear, expectedDepartmentCode, expectedCourseNumber, expectedSectionNumber, expectedInstitution,
				expectedLocation, expectedOnline, expectedGeneralRequirement, expectedGeneralCategory,
				expectedFirstMajorRequirement, expectedFirstMajorCategory, expectedSecondMajorRequirement,
				expectedSecondMajorCategory, expectedFirstMinorRequirement, expectedFirstMinorCategory,
				expectedSecondMinorRequirement, expectedSecondMinorCategory, expectedFreeElective, expectedCompleted,
				expectedConsideringEnrollment, expectedCurrentEnrollment, expectedCredits, expectedGpaDesired, 3.5, expectedCourseStartDate,
				expectedCourseEndDate, expectedCoursePredictedDifficulty, expectedCoursePredictedWorkload,
				expectedPredictedEnjoyability, expectedRecommendedByWho, expectedNotRecommendedByWho,
				expectedProfessionalSkills, expectedAcademicSkills);
		assertFalse(course1.equals(course2));
		assertFalse(course1 == course2);
	}

	@Test
	public void testEqualsAllFieldsEqualExceptCourseStartDate() {
		String expectedTitle = "Learning Java";
		String expectedInstructor = "The Honorable Dr. Kevin Trainor";
		String expectedSemester = "Summer";
		int expectedYear = 2016;
		String expectedDepartmentCode = "LIS";
		int expectedCourseNumber = 452;
		String expectedSectionNumber = "1";
		String expectedInstitution = "University of Illinois";
		String expectedLocation = "Online";
		String expectedOnline = "Completely Online";
		boolean expectedGeneralRequirement = false;
		String expectedGeneralCategory = "No Category";
		boolean expectedFirstMajorRequirement = false;
		String expectedFirstMajorCategory = "No Category";
		boolean expectedSecondMajorRequirement = false;
		String expectedSecondMajorCategory = "No Category";
		boolean expectedFirstMinorRequirement = false;
		String expectedFirstMinorCategory = "No Category";
		boolean expectedSecondMinorRequirement = false;
		String expectedSecondMinorCategory = "No Category";
		boolean expectedFreeElective = true;
		boolean expectedCompleted = false;
		boolean expectedConsideringEnrollment = false;
		boolean expectedCurrentEnrollment = false;
		double expectedCredits = 4.0;
		double expectedGpaDesired = 4.0;
		double expectedGpaEarned = 4.0;
		String expectedCourseStartDate = "05/21/2016";
		String expectedCourseEndDate = "08/02/2016";
		int expectedCoursePredictedDifficulty = 3;
		int expectedCoursePredictedWorkload = 3;
		int expectedPredictedEnjoyability = 3;
		String expectedRecommendedByWho = "Jana Diesner";
		String expectedNotRecommendedByWho = "Nobody";
		String expectedProfessionalSkills = "Java Programming";
		String expectedAcademicSkills = "Data Analysis";
		CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, expectedSemester,
				expectedYear, expectedDepartmentCode, expectedCourseNumber, expectedSectionNumber, expectedInstitution,
				expectedLocation, expectedOnline, expectedGeneralRequirement, expectedGeneralCategory,
				expectedFirstMajorRequirement, expectedFirstMajorCategory, expectedSecondMajorRequirement,
				expectedSecondMajorCategory, expectedFirstMinorRequirement, expectedFirstMinorCategory,
				expectedSecondMinorRequirement, expectedSecondMinorCategory, expectedFreeElective, expectedCompleted,
				expectedConsideringEnrollment, expectedCurrentEnrollment, expectedCredits, expectedGpaDesired, expectedGpaEarned,
				expectedCourseStartDate, expectedCourseEndDate, expectedCoursePredictedDifficulty,
				expectedCoursePredictedWorkload, expectedPredictedEnjoyability, expectedRecommendedByWho,
				expectedNotRecommendedByWho, expectedProfessionalSkills, expectedAcademicSkills);
		CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, expectedSemester,
				expectedYear, expectedDepartmentCode, expectedCourseNumber, expectedSectionNumber, expectedInstitution,
				expectedLocation, expectedOnline, expectedGeneralRequirement, expectedGeneralCategory,
				expectedFirstMajorRequirement, expectedFirstMajorCategory, expectedSecondMajorRequirement,
				expectedSecondMajorCategory, expectedFirstMinorRequirement, expectedFirstMinorCategory,
				expectedSecondMinorRequirement, expectedSecondMinorCategory, expectedFreeElective, expectedCompleted,
				expectedConsideringEnrollment, expectedCurrentEnrollment, expectedCredits, expectedGpaDesired, expectedGpaEarned, "05/22/2016",
				expectedCourseEndDate, expectedCoursePredictedDifficulty, expectedCoursePredictedWorkload,
				expectedPredictedEnjoyability, expectedRecommendedByWho, expectedNotRecommendedByWho,
				expectedProfessionalSkills, expectedAcademicSkills);
		assertFalse(course1.equals(course2));
		assertFalse(course1 == course2);
	}

	@Test
	public void testEqualsAllFieldsEqualExceptCourseEndDate() {
		String expectedTitle = "Learning Java";
		String expectedInstructor = "The Honorable Dr. Kevin Trainor";
		String expectedSemester = "Summer";
		int expectedYear = 2016;
		String expectedDepartmentCode = "LIS";
		int expectedCourseNumber = 452;
		String expectedSectionNumber = "1";
		String expectedInstitution = "University of Illinois";
		String expectedLocation = "Online";
		String expectedOnline = "Completely Online";
		boolean expectedGeneralRequirement = false;
		String expectedGeneralCategory = "No Category";
		boolean expectedFirstMajorRequirement = false;
		String expectedFirstMajorCategory = "No Category";
		boolean expectedSecondMajorRequirement = false;
		String expectedSecondMajorCategory = "No Category";
		boolean expectedFirstMinorRequirement = false;
		String expectedFirstMinorCategory = "No Category";
		boolean expectedSecondMinorRequirement = false;
		String expectedSecondMinorCategory = "No Category";
		boolean expectedFreeElective = true;
		boolean expectedCompleted = false;
		boolean expectedConsideringEnrollment = false;
		boolean expectedCurrentEnrollment = false;
		double expectedCredits = 4.0;
		double expectedGpaDesired = 4.0;
		double expectedGpaEarned = 4.0;
		String expectedCourseStartDate = "05/21/2016";
		String expectedCourseEndDate = "08/02/2016";
		int expectedCoursePredictedDifficulty = 3;
		int expectedCoursePredictedWorkload = 3;
		int expectedPredictedEnjoyability = 3;
		String expectedRecommendedByWho = "Jana Diesner";
		String expectedNotRecommendedByWho = "Nobody";
		String expectedProfessionalSkills = "Java Programming";
		String expectedAcademicSkills = "Data Analysis";
		CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, expectedSemester,
				expectedYear, expectedDepartmentCode, expectedCourseNumber, expectedSectionNumber, expectedInstitution,
				expectedLocation, expectedOnline, expectedGeneralRequirement, expectedGeneralCategory,
				expectedFirstMajorRequirement, expectedFirstMajorCategory, expectedSecondMajorRequirement,
				expectedSecondMajorCategory, expectedFirstMinorRequirement, expectedFirstMinorCategory,
				expectedSecondMinorRequirement, expectedSecondMinorCategory, expectedFreeElective, expectedCompleted,
				expectedConsideringEnrollment, expectedCurrentEnrollment, expectedCredits, expectedGpaDesired, expectedGpaEarned,
				expectedCourseStartDate, expectedCourseEndDate, expectedCoursePredictedDifficulty,
				expectedCoursePredictedWorkload, expectedPredictedEnjoyability, expectedRecommendedByWho,
				expectedNotRecommendedByWho, expectedProfessionalSkills, expectedAcademicSkills);
		CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, expectedSemester,
				expectedYear, expectedDepartmentCode, expectedCourseNumber, expectedSectionNumber, expectedInstitution,
				expectedLocation, expectedOnline, expectedGeneralRequirement, expectedGeneralCategory,
				expectedFirstMajorRequirement, expectedFirstMajorCategory, expectedSecondMajorRequirement,
				expectedSecondMajorCategory, expectedFirstMinorRequirement, expectedFirstMinorCategory,
				expectedSecondMinorRequirement, expectedSecondMinorCategory, expectedFreeElective, expectedCompleted,
				expectedConsideringEnrollment, expectedCurrentEnrollment, expectedCredits, expectedGpaDesired, expectedGpaEarned,
				expectedCourseStartDate, "08/11/2016", expectedCoursePredictedDifficulty,
				expectedCoursePredictedWorkload, expectedPredictedEnjoyability, expectedRecommendedByWho,
				expectedNotRecommendedByWho, expectedProfessionalSkills, expectedAcademicSkills);
		assertFalse(course1.equals(course2));
		assertFalse(course1 == course2);
	}

	@Test
	public void testEqualsAllFieldsEqualExceptExpectedCourseDifficulty() {
		String expectedTitle = "Learning Java";
		String expectedInstructor = "The Honorable Dr. Kevin Trainor";
		String expectedSemester = "Summer";
		int expectedYear = 2016;
		String expectedDepartmentCode = "LIS";
		int expectedCourseNumber = 452;
		String expectedSectionNumber = "1";
		String expectedInstitution = "University of Illinois";
		String expectedLocation = "Online";
		String expectedOnline = "Completely Online";
		boolean expectedGeneralRequirement = false;
		String expectedGeneralCategory = "No Category";
		boolean expectedFirstMajorRequirement = false;
		String expectedFirstMajorCategory = "No Category";
		boolean expectedSecondMajorRequirement = false;
		String expectedSecondMajorCategory = "No Category";
		boolean expectedFirstMinorRequirement = false;
		String expectedFirstMinorCategory = "No Category";
		boolean expectedSecondMinorRequirement = false;
		String expectedSecondMinorCategory = "No Category";
		boolean expectedFreeElective = true;
		boolean expectedCompleted = false;
		boolean expectedConsideringEnrollment = false;
		boolean expectedCurrentEnrollment = false;
		double expectedCredits = 4.0;
		double expectedGpaDesired = 4.0;
		double expectedGpaEarned = 4.0;
		String expectedCourseStartDate = "05/21/2016";
		String expectedCourseEndDate = "08/02/2016";
		int expectedCoursePredictedDifficulty = 3;
		int expectedCoursePredictedWorkload = 3;
		int expectedPredictedEnjoyability = 3;
		String expectedRecommendedByWho = "Jana Diesner";
		String expectedNotRecommendedByWho = "Nobody";
		String expectedProfessionalSkills = "Java Programming";
		String expectedAcademicSkills = "Data Analysis";
		CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, expectedSemester,
				expectedYear, expectedDepartmentCode, expectedCourseNumber, expectedSectionNumber, expectedInstitution,
				expectedLocation, expectedOnline, expectedGeneralRequirement, expectedGeneralCategory,
				expectedFirstMajorRequirement, expectedFirstMajorCategory, expectedSecondMajorRequirement,
				expectedSecondMajorCategory, expectedFirstMinorRequirement, expectedFirstMinorCategory,
				expectedSecondMinorRequirement, expectedSecondMinorCategory, expectedFreeElective, expectedCompleted,
				expectedConsideringEnrollment, expectedCurrentEnrollment, expectedCredits, expectedGpaDesired, expectedGpaEarned,
				expectedCourseStartDate, expectedCourseEndDate, expectedCoursePredictedDifficulty,
				expectedCoursePredictedWorkload, expectedPredictedEnjoyability, expectedRecommendedByWho,
				expectedNotRecommendedByWho, expectedProfessionalSkills, expectedAcademicSkills);
		CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, expectedSemester,
				expectedYear, expectedDepartmentCode, expectedCourseNumber, expectedSectionNumber, expectedInstitution,
				expectedLocation, expectedOnline, expectedGeneralRequirement, expectedGeneralCategory,
				expectedFirstMajorRequirement, expectedFirstMajorCategory, expectedSecondMajorRequirement,
				expectedSecondMajorCategory, expectedFirstMinorRequirement, expectedFirstMinorCategory,
				expectedSecondMinorRequirement, expectedSecondMinorCategory, expectedFreeElective, expectedCompleted,
				expectedConsideringEnrollment, expectedCurrentEnrollment, expectedCredits, expectedGpaDesired, expectedGpaEarned,
				expectedCourseStartDate, expectedCourseEndDate, 4, expectedCoursePredictedWorkload,
				expectedPredictedEnjoyability, expectedRecommendedByWho, expectedNotRecommendedByWho,
				expectedProfessionalSkills, expectedAcademicSkills);
		assertFalse(course1.equals(course2));
		assertFalse(course1 == course2);
	}

	@Test
	public void testEqualsAllFieldsEqualExceptexpectedCorsePredictedWorkload() {
		String expectedTitle = "Learning Java";
		String expectedInstructor = "The Honorable Dr. Kevin Trainor";
		String expectedSemester = "Summer";
		int expectedYear = 2016;
		String expectedDepartmentCode = "LIS";
		int expectedCourseNumber = 452;
		String expectedSectionNumber = "1";
		String expectedInstitution = "University of Illinois";
		String expectedLocation = "Online";
		String expectedOnline = "Completely Online";
		boolean expectedGeneralRequirement = false;
		String expectedGeneralCategory = "No Category";
		boolean expectedFirstMajorRequirement = false;
		String expectedFirstMajorCategory = "No Category";
		boolean expectedSecondMajorRequirement = false;
		String expectedSecondMajorCategory = "No Category";
		boolean expectedFirstMinorRequirement = false;
		String expectedFirstMinorCategory = "No Category";
		boolean expectedSecondMinorRequirement = false;
		String expectedSecondMinorCategory = "No Category";
		boolean expectedFreeElective = true;
		boolean expectedCompleted = false;
		boolean expectedConsideringEnrollment = false;
		boolean expectedCurrentEnrollment = false;
		double expectedCredits = 4.0;
		double expectedGpaDesired = 4.0;
		double expectedGpaEarned = 4.0;
		String expectedCourseStartDate = "05/21/2016";
		String expectedCourseEndDate = "08/02/2016";
		int expectedCoursePredictedDifficulty = 3;
		int expectedCoursePredictedWorkload = 3;
		int expectedPredictedEnjoyability = 3;
		String expectedRecommendedByWho = "Jana Diesner";
		String expectedNotRecommendedByWho = "Nobody";
		String expectedProfessionalSkills = "Java Programming";
		String expectedAcademicSkills = "Data Analysis";
		CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, expectedSemester,
				expectedYear, expectedDepartmentCode, expectedCourseNumber, expectedSectionNumber, expectedInstitution,
				expectedLocation, expectedOnline, expectedGeneralRequirement, expectedGeneralCategory,
				expectedFirstMajorRequirement, expectedFirstMajorCategory, expectedSecondMajorRequirement,
				expectedSecondMajorCategory, expectedFirstMinorRequirement, expectedFirstMinorCategory,
				expectedSecondMinorRequirement, expectedSecondMinorCategory, expectedFreeElective, expectedCompleted,
				expectedConsideringEnrollment, expectedCurrentEnrollment, expectedCredits, expectedGpaDesired, expectedGpaEarned,
				expectedCourseStartDate, expectedCourseEndDate, expectedCoursePredictedDifficulty,
				expectedCoursePredictedWorkload, expectedPredictedEnjoyability, expectedRecommendedByWho,
				expectedNotRecommendedByWho, expectedProfessionalSkills, expectedAcademicSkills);
		CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, expectedSemester,
				expectedYear, expectedDepartmentCode, expectedCourseNumber, expectedSectionNumber, expectedInstitution,
				expectedLocation, expectedOnline, expectedGeneralRequirement, expectedGeneralCategory,
				expectedFirstMajorRequirement, expectedFirstMajorCategory, expectedSecondMajorRequirement,
				expectedSecondMajorCategory, expectedFirstMinorRequirement, expectedFirstMinorCategory,
				expectedSecondMinorRequirement, expectedSecondMinorCategory, expectedFreeElective, expectedCompleted,
				expectedConsideringEnrollment, expectedCurrentEnrollment, expectedCredits, expectedGpaDesired, expectedGpaEarned,
				expectedCourseStartDate, expectedCourseEndDate, expectedCoursePredictedDifficulty, 4,
				expectedPredictedEnjoyability, expectedRecommendedByWho, expectedNotRecommendedByWho,
				expectedProfessionalSkills, expectedAcademicSkills);
		assertFalse(course1.equals(course2));
		assertFalse(course1 == course2);
	}

	@Test
	public void testEqualsAllFieldsEqualExceptCoursePredictedEnjoyability() {
		String expectedTitle = "Learning Java";
		String expectedInstructor = "The Honorable Dr. Kevin Trainor";
		String expectedSemester = "Summer";
		int expectedYear = 2016;
		String expectedDepartmentCode = "LIS";
		int expectedCourseNumber = 452;
		String expectedSectionNumber = "1";
		String expectedInstitution = "University of Illinois";
		String expectedLocation = "Online";
		String expectedOnline = "Completely Online";
		boolean expectedGeneralRequirement = false;
		String expectedGeneralCategory = "No Category";
		boolean expectedFirstMajorRequirement = false;
		String expectedFirstMajorCategory = "No Category";
		boolean expectedSecondMajorRequirement = false;
		String expectedSecondMajorCategory = "No Category";
		boolean expectedFirstMinorRequirement = false;
		String expectedFirstMinorCategory = "No Category";
		boolean expectedSecondMinorRequirement = false;
		String expectedSecondMinorCategory = "No Category";
		boolean expectedFreeElective = true;
		boolean expectedCompleted = false;
		boolean expectedConsideringEnrollment = false;
		boolean expectedCurrentEnrollment = false;
		double expectedCredits = 4.0;
		double expectedGpaDesired = 4.0;
		double expectedGpaEarned = 4.0;
		String expectedCourseStartDate = "05/21/2016";
		String expectedCourseEndDate = "08/02/2016";
		int expectedCoursePredictedDifficulty = 3;
		int expectedCoursePredictedWorkload = 3;
		int expectedPredictedEnjoyability = 3;
		String expectedRecommendedByWho = "Jana Diesner";
		String expectedNotRecommendedByWho = "Nobody";
		String expectedProfessionalSkills = "Java Programming";
		String expectedAcademicSkills = "Data Analysis";
		CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, expectedSemester,
				expectedYear, expectedDepartmentCode, expectedCourseNumber, expectedSectionNumber, expectedInstitution,
				expectedLocation, expectedOnline, expectedGeneralRequirement, expectedGeneralCategory,
				expectedFirstMajorRequirement, expectedFirstMajorCategory, expectedSecondMajorRequirement,
				expectedSecondMajorCategory, expectedFirstMinorRequirement, expectedFirstMinorCategory,
				expectedSecondMinorRequirement, expectedSecondMinorCategory, expectedFreeElective, expectedCompleted,
				expectedConsideringEnrollment, expectedCurrentEnrollment, expectedCredits, expectedGpaDesired, expectedGpaEarned,
				expectedCourseStartDate, expectedCourseEndDate, expectedCoursePredictedDifficulty,
				expectedCoursePredictedWorkload, expectedPredictedEnjoyability, expectedRecommendedByWho,
				expectedNotRecommendedByWho, expectedProfessionalSkills, expectedAcademicSkills);
		CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, expectedSemester,
				expectedYear, expectedDepartmentCode, expectedCourseNumber, expectedSectionNumber, expectedInstitution,
				expectedLocation, expectedOnline, expectedGeneralRequirement, expectedGeneralCategory,
				expectedFirstMajorRequirement, expectedFirstMajorCategory, expectedSecondMajorRequirement,
				expectedSecondMajorCategory, expectedFirstMinorRequirement, expectedFirstMinorCategory,
				expectedSecondMinorRequirement, expectedSecondMinorCategory, expectedFreeElective, expectedCompleted,
				expectedConsideringEnrollment, expectedCurrentEnrollment, expectedCredits, expectedGpaDesired, expectedGpaEarned,
				expectedCourseStartDate, expectedCourseEndDate, expectedCoursePredictedDifficulty,
				expectedCoursePredictedWorkload, 5, expectedRecommendedByWho, expectedNotRecommendedByWho,
				expectedProfessionalSkills, expectedAcademicSkills);
		assertFalse(course1.equals(course2));
		assertFalse(course1 == course2);
	}

	@Test
	public void testEqualsAllFieldsEqualExceptRecommendedByWho() {
		String expectedTitle = "Learning Java";
		String expectedInstructor = "The Honorable Dr. Kevin Trainor";
		String expectedSemester = "Summer";
		int expectedYear = 2016;
		String expectedDepartmentCode = "LIS";
		int expectedCourseNumber = 452;
		String expectedSectionNumber = "1";
		String expectedInstitution = "University of Illinois";
		String expectedLocation = "Online";
		String expectedOnline = "Completely Online";
		boolean expectedGeneralRequirement = false;
		String expectedGeneralCategory = "No Category";
		boolean expectedFirstMajorRequirement = false;
		String expectedFirstMajorCategory = "No Category";
		boolean expectedSecondMajorRequirement = false;
		String expectedSecondMajorCategory = "No Category";
		boolean expectedFirstMinorRequirement = false;
		String expectedFirstMinorCategory = "No Category";
		boolean expectedSecondMinorRequirement = false;
		String expectedSecondMinorCategory = "No Category";
		boolean expectedFreeElective = true;
		boolean expectedCompleted = false;
		boolean expectedConsideringEnrollment = false;
		boolean expectedCurrentEnrollment = false;
		double expectedCredits = 4.0;
		double expectedGpaDesired = 4.0;
		double expectedGpaEarned = 4.0;
		String expectedCourseStartDate = "05/21/2016";
		String expectedCourseEndDate = "08/02/2016";
		int expectedCoursePredictedDifficulty = 3;
		int expectedCoursePredictedWorkload = 3;
		int expectedPredictedEnjoyability = 3;
		String expectedRecommendedByWho = "Jana Diesner";
		String expectedNotRecommendedByWho = "Nobody";
		String expectedProfessionalSkills = "Java Programming";
		String expectedAcademicSkills = "Data Analysis";
		CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, expectedSemester,
				expectedYear, expectedDepartmentCode, expectedCourseNumber, expectedSectionNumber, expectedInstitution,
				expectedLocation, expectedOnline, expectedGeneralRequirement, expectedGeneralCategory,
				expectedFirstMajorRequirement, expectedFirstMajorCategory, expectedSecondMajorRequirement,
				expectedSecondMajorCategory, expectedFirstMinorRequirement, expectedFirstMinorCategory,
				expectedSecondMinorRequirement, expectedSecondMinorCategory, expectedFreeElective, expectedCompleted,
				expectedConsideringEnrollment, expectedCurrentEnrollment, expectedCredits, expectedGpaDesired, expectedGpaEarned,
				expectedCourseStartDate, expectedCourseEndDate, expectedCoursePredictedDifficulty,
				expectedCoursePredictedWorkload, expectedPredictedEnjoyability, expectedRecommendedByWho,
				expectedNotRecommendedByWho, expectedProfessionalSkills, expectedAcademicSkills);
		CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, expectedSemester,
				expectedYear, expectedDepartmentCode, expectedCourseNumber, expectedSectionNumber, expectedInstitution,
				expectedLocation, expectedOnline, expectedGeneralRequirement, expectedGeneralCategory,
				expectedFirstMajorRequirement, expectedFirstMajorCategory, expectedSecondMajorRequirement,
				expectedSecondMajorCategory, expectedFirstMinorRequirement, expectedFirstMinorCategory,
				expectedSecondMinorRequirement, expectedSecondMinorCategory, expectedFreeElective, expectedCompleted,
				expectedConsideringEnrollment, expectedCurrentEnrollment, expectedCredits, expectedGpaDesired, expectedGpaEarned,
				expectedCourseStartDate, expectedCourseEndDate, expectedCoursePredictedDifficulty,
				expectedCoursePredictedWorkload, expectedPredictedEnjoyability, "Dr. X.", expectedNotRecommendedByWho,
				expectedProfessionalSkills, expectedAcademicSkills);
		assertFalse(course1.equals(course2));
		assertFalse(course1 == course2);
	}

	@Test
	public void testEqualsAllFieldsEqualExceptNotRecommendedByWho() {
		String expectedTitle = "Learning Java";
		String expectedInstructor = "The Honorable Dr. Kevin Trainor";
		String expectedSemester = "Summer";
		int expectedYear = 2016;
		String expectedDepartmentCode = "LIS";
		int expectedCourseNumber = 452;
		String expectedSectionNumber = "1";
		String expectedInstitution = "University of Illinois";
		String expectedLocation = "Online";
		String expectedOnline = "Completely Online";
		boolean expectedGeneralRequirement = false;
		String expectedGeneralCategory = "No Category";
		boolean expectedFirstMajorRequirement = false;
		String expectedFirstMajorCategory = "No Category";
		boolean expectedSecondMajorRequirement = false;
		String expectedSecondMajorCategory = "No Category";
		boolean expectedFirstMinorRequirement = false;
		String expectedFirstMinorCategory = "No Category";
		boolean expectedSecondMinorRequirement = false;
		String expectedSecondMinorCategory = "No Category";
		boolean expectedFreeElective = true;
		boolean expectedCompleted = false;
		boolean expectedConsideringEnrollment = false;
		boolean expectedCurrentEnrollment = false;
		double expectedCredits = 4.0;
		double expectedGpaDesired = 4.0;
		double expectedGpaEarned = 4.0;
		String expectedCourseStartDate = "05/21/2016";
		String expectedCourseEndDate = "08/02/2016";
		int expectedCoursePredictedDifficulty = 3;
		int expectedCoursePredictedWorkload = 3;
		int expectedPredictedEnjoyability = 3;
		String expectedRecommendedByWho = "Jana Diesner";
		String expectedNotRecommendedByWho = "Nobody";
		String expectedProfessionalSkills = "Java Programming";
		String expectedAcademicSkills = "Data Analysis";
		CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, expectedSemester,
				expectedYear, expectedDepartmentCode, expectedCourseNumber, expectedSectionNumber, expectedInstitution,
				expectedLocation, expectedOnline, expectedGeneralRequirement, expectedGeneralCategory,
				expectedFirstMajorRequirement, expectedFirstMajorCategory, expectedSecondMajorRequirement,
				expectedSecondMajorCategory, expectedFirstMinorRequirement, expectedFirstMinorCategory,
				expectedSecondMinorRequirement, expectedSecondMinorCategory, expectedFreeElective, expectedCompleted,
				expectedConsideringEnrollment, expectedCurrentEnrollment, expectedCredits, expectedGpaDesired, expectedGpaEarned,
				expectedCourseStartDate, expectedCourseEndDate, expectedCoursePredictedDifficulty,
				expectedCoursePredictedWorkload, expectedPredictedEnjoyability, expectedRecommendedByWho,
				expectedNotRecommendedByWho, expectedProfessionalSkills, expectedAcademicSkills);
		CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, expectedSemester,
				expectedYear, expectedDepartmentCode, expectedCourseNumber, expectedSectionNumber, expectedInstitution,
				expectedLocation, expectedOnline, expectedGeneralRequirement, expectedGeneralCategory,
				expectedFirstMajorRequirement, expectedFirstMajorCategory, expectedSecondMajorRequirement,
				expectedSecondMajorCategory, expectedFirstMinorRequirement, expectedFirstMinorCategory,
				expectedSecondMinorRequirement, expectedSecondMinorCategory, expectedFreeElective, expectedCompleted,
				expectedConsideringEnrollment, expectedCurrentEnrollment, expectedCredits, expectedGpaDesired, expectedGpaEarned,
				expectedCourseStartDate, expectedCourseEndDate, expectedCoursePredictedDifficulty,
				expectedCoursePredictedWorkload, expectedPredictedEnjoyability, expectedRecommendedByWho, "Dr. Y.",
				expectedProfessionalSkills, expectedAcademicSkills);
		assertFalse(course1.equals(course2));
		assertFalse(course1 == course2);
	}

	@Test
	public void testEqualsAllFieldsEqualExceptProfessionalSkills() {
		String expectedTitle = "Learning Java";
		String expectedInstructor = "The Honorable Dr. Kevin Trainor";
		String expectedSemester = "Summer";
		int expectedYear = 2016;
		String expectedDepartmentCode = "LIS";
		int expectedCourseNumber = 452;
		String expectedSectionNumber = "1";
		String expectedInstitution = "University of Illinois";
		String expectedLocation = "Online";
		String expectedOnline = "Completely Online";
		boolean expectedGeneralRequirement = false;
		String expectedGeneralCategory = "No Category";
		boolean expectedFirstMajorRequirement = false;
		String expectedFirstMajorCategory = "No Category";
		boolean expectedSecondMajorRequirement = false;
		String expectedSecondMajorCategory = "No Category";
		boolean expectedFirstMinorRequirement = false;
		String expectedFirstMinorCategory = "No Category";
		boolean expectedSecondMinorRequirement = false;
		String expectedSecondMinorCategory = "No Category";
		boolean expectedFreeElective = true;
		boolean expectedCompleted = false;
		boolean expectedConsideringEnrollment = false;
		boolean expectedCurrentEnrollment = false;
		double expectedCredits = 4.0;
		double expectedGpaDesired = 4.0;
		double expectedGpaEarned = 4.0;
		String expectedCourseStartDate = "05/21/2016";
		String expectedCourseEndDate = "08/02/2016";
		int expectedCoursePredictedDifficulty = 3;
		int expectedCoursePredictedWorkload = 3;
		int expectedPredictedEnjoyability = 3;
		String expectedRecommendedByWho = "Jana Diesner";
		String expectedNotRecommendedByWho = "Nobody";
		String expectedProfessionalSkills = "Java Programming";
		String expectedAcademicSkills = "Data Analysis";
		CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, expectedSemester,
				expectedYear, expectedDepartmentCode, expectedCourseNumber, expectedSectionNumber, expectedInstitution,
				expectedLocation, expectedOnline, expectedGeneralRequirement, expectedGeneralCategory,
				expectedFirstMajorRequirement, expectedFirstMajorCategory, expectedSecondMajorRequirement,
				expectedSecondMajorCategory, expectedFirstMinorRequirement, expectedFirstMinorCategory,
				expectedSecondMinorRequirement, expectedSecondMinorCategory, expectedFreeElective, expectedCompleted,
				expectedConsideringEnrollment, expectedCurrentEnrollment, expectedCredits, expectedGpaDesired, expectedGpaEarned,
				expectedCourseStartDate, expectedCourseEndDate, expectedCoursePredictedDifficulty,
				expectedCoursePredictedWorkload, expectedPredictedEnjoyability, expectedRecommendedByWho,
				expectedNotRecommendedByWho, expectedProfessionalSkills, expectedAcademicSkills);
		CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, expectedSemester,
				expectedYear, expectedDepartmentCode, expectedCourseNumber, expectedSectionNumber, expectedInstitution,
				expectedLocation, expectedOnline, expectedGeneralRequirement, expectedGeneralCategory,
				expectedFirstMajorRequirement, expectedFirstMajorCategory, expectedSecondMajorRequirement,
				expectedSecondMajorCategory, expectedFirstMinorRequirement, expectedFirstMinorCategory,
				expectedSecondMinorRequirement, expectedSecondMinorCategory, expectedFreeElective, expectedCompleted,
				expectedConsideringEnrollment, expectedCurrentEnrollment, expectedCredits, expectedGpaDesired, expectedGpaEarned,
				expectedCourseStartDate, expectedCourseEndDate, expectedCoursePredictedDifficulty,
				expectedCoursePredictedWorkload, expectedPredictedEnjoyability, expectedRecommendedByWho,
				expectedNotRecommendedByWho, "Computer Programming, Java, Data management", expectedAcademicSkills);
		assertFalse(course1.equals(course2));
		assertFalse(course1 == course2);
	}

}

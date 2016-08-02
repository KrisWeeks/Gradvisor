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
	    String expectedInstructor = "Dr. Kevin Trainor";
		String expectedSemester = "Fall";
		Integer expectedYear = 2016;
		String expectedDepartmentCode = "LIS";
		Integer expectedCourseNumber = 452;
		String expectedSectionNumber = "1";
		String expectedInstitution = "University of Illinois";
		String expectedLocation = "Online";
		String expectedOnline = "100% Online";
		boolean expectedGeneralRequirement = true;
		Integer expectedGeneralCategory = 1;
		boolean expectedFirstMajorRequirement = true;
		Integer expectedFirstMajorCategory = 1;
		boolean expectedSecondMajorRequirement = true;
		Integer expectedSecondMajorCategory = 1;
		boolean expectedThirdMajorRequirement = true;
		Integer expectedThirdMajorCategory = 1;
		boolean expectedFourthMajorRequirement = true;
		Integer expectedFourthMajorCategory = 1 ;
		boolean expectedFifthMajorRequirement = true;
		Integer expectedFifthMajorCategory = 1;
		boolean expectedSixthMajorRequirement = true;
		Integer expectedSixthMajorCategory = 1;
		boolean expectedSeventhMajorRequirement = true;
		Integer expectedSeventhMajorCategory = 1;
		boolean expectedEighthMajorRequirement = true;
		Integer expectedEighthMajorCategory = 1;
		boolean expectedNinthMajorRequirement = true;
		Integer expectedNinthMajorCategory = 1;
		boolean expectedTenthMajorRequirement = true;
		Integer expectedTenthMajorCategory = 1;
		boolean expectedFirstMinorRequirement = true;
		Integer expectedFirstMinorCategory = 1;
		boolean expectedSecondMinorRequirement = true;
		Integer expectedSecondMinorCategory = 1;
		boolean expectedThirdMinorRequirement = true;
		Integer expectedThirdMinorCategory = 1;
		boolean expectedFourthMinorRequirement = true;
		Integer expectedFourthMinorCategory = 1;
		boolean expectedFifthMinorRequirement = true;
		Integer expectedFifthMinorCategory = 1;
		boolean expectedSixthMinorRequirement = true;
		Integer expectedSixthMinorCategory = 1;
		boolean expectedSeventhMinorRequirement = true;
		Integer expectedSeventhMinorCategory = 1;
		boolean expectedEighthMinorRequirement = true;
		Integer expectedEighthMinorCategory = 1;
		boolean expectedNinthMinorRequirement = true;
		Integer expectedNinthMinorCategory = 1;
		boolean expectedTenthMinorRequirement = true;
		Integer expectedTenthMinorCategory = 1;
		boolean expectedFreeElective = true;
		boolean expectedCompleted = true;
		boolean expectedConsideringEnrollment = false;
		boolean expectedCurrentEnrollment = false;
		Double expectedCredits = 4.0;
		Double expectedGpaDesired = 4.0;
		Double expectedGpaEarned = 4.0;
		String expectedCourseStartDate = "05/21/2016";
		String expectedCourseEndDate = "08/02/2016";
		Integer expectedCoursePredictedDifficulty = 3;
		Integer expectedCoursePredictedWorkload = 3;
		Integer expectedPredictedEnjoyability = 3;
		String expectedRecommendedByWho = "Jana Diesner";
		String expectedNotRecommendedByWho = "Nobody";
		String expectedProfessionalSkills = "Programming Skills";
		String expectedAcademicSkills = "Logic Based Learning";
		CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
				 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
				 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
				 expectedGeneralRequirement, expectedGeneralCategory, 
				 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
				 expectedSecondMajorRequirement, expectedSecondMajorCategory,
				 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
				 expectedFourthMajorRequirement, expectedFourthMajorCategory,
				 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
				 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
				 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
				 expectedEighthMajorRequirement, expectedEighthMajorCategory,
				 expectedNinthMajorRequirement, expectedNinthMajorCategory,
				 expectedTenthMajorRequirement, expectedTenthMajorCategory,
				 expectedFirstMinorRequirement, expectedFirstMinorCategory,
				 expectedSecondMinorRequirement, expectedSecondMinorCategory,
				 expectedThirdMinorRequirement, expectedThirdMinorCategory,
				 expectedFourthMinorRequirement, expectedFourthMinorCategory,
				 expectedFifthMinorRequirement, expectedFifthMinorCategory,
				 expectedSixthMinorRequirement, expectedSixthMinorCategory,
				 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
				 expectedEighthMinorRequirement, expectedEighthMinorCategory,
				 expectedNinthMinorRequirement, expectedNinthMinorCategory,
				 expectedTenthMinorRequirement, expectedTenthMinorCategory,
				 expectedFreeElective, expectedCompleted,
				 expectedConsideringEnrollment, expectedCurrentEnrollment,
				 expectedCredits, expectedGpaDesired, 
				 expectedGpaEarned, expectedCourseStartDate,
				 expectedCourseEndDate, expectedCoursePredictedDifficulty,
				 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
				 expectedRecommendedByWho, expectedNotRecommendedByWho,
				 expectedProfessionalSkills,  expectedAcademicSkills);
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
		assertEquals(expectedThirdMajorRequirement, course1.isSecondMajorRequirement());
		assertEquals(expectedThirdMajorCategory, course1.getSecondMajorCategory());
		assertEquals(expectedFourthMajorRequirement, course1.isSecondMajorRequirement());
		assertEquals(expectedFourthMajorCategory, course1.getSecondMajorCategory());
		assertEquals(expectedFifthMajorRequirement, course1.isSecondMajorRequirement());
		assertEquals(expectedFifthMajorCategory, course1.getSecondMajorCategory());
		assertEquals(expectedSixthMajorRequirement, course1.isSecondMajorRequirement());
		assertEquals(expectedSixthMajorCategory, course1.getSecondMajorCategory());
		assertEquals(expectedSeventhMajorRequirement, course1.isSecondMajorRequirement());
		assertEquals(expectedSeventhMajorCategory, course1.getSecondMajorCategory());
		assertEquals(expectedEighthMajorRequirement, course1.isSecondMajorRequirement());
		assertEquals(expectedEighthMajorCategory, course1.getSecondMajorCategory());
		assertEquals(expectedNinthMajorRequirement, course1.isSecondMajorRequirement());
		assertEquals(expectedNinthMajorCategory, course1.getSecondMajorCategory());
		assertEquals(expectedTenthMajorRequirement, course1.isSecondMajorRequirement());
		assertEquals(expectedTenthMajorCategory, course1.getSecondMajorCategory());
		assertEquals(expectedFirstMinorRequirement, course1.isFirstMinorRequirement());
		assertEquals(expectedFirstMinorCategory, course1.getFirstMinorCategory());
		assertEquals(expectedSecondMinorRequirement, course1.isSecondMinorRequirement());
		assertEquals(expectedSecondMinorCategory, course1.getSecondMajorCategory());
		assertEquals(expectedThirdMinorRequirement, course1.isSecondMinorRequirement());
		assertEquals(expectedThirdMinorCategory, course1.getSecondMajorCategory());
		assertEquals(expectedFourthMinorRequirement, course1.isSecondMinorRequirement());
		assertEquals(expectedFourthMinorCategory, course1.getSecondMajorCategory());
		assertEquals(expectedFifthMinorRequirement, course1.isSecondMinorRequirement());
		assertEquals(expectedFifthMinorCategory, course1.getSecondMajorCategory());
		assertEquals(expectedSixthMinorRequirement, course1.isSecondMinorRequirement());
		assertEquals(expectedSixthMinorCategory, course1.getSecondMajorCategory());
		assertEquals(expectedSeventhMinorRequirement, course1.isSecondMinorRequirement());
		assertEquals(expectedSeventhMinorCategory, course1.getSecondMajorCategory());
		assertEquals(expectedEighthMinorRequirement, course1.isSecondMinorRequirement());
		assertEquals(expectedEighthMinorCategory, course1.getSecondMajorCategory());
		assertEquals(expectedNinthMinorRequirement, course1.isSecondMinorRequirement());
		assertEquals(expectedNinthMinorCategory, course1.getSecondMajorCategory());
		assertEquals(expectedTenthMinorRequirement, course1.isSecondMinorRequirement());
		assertEquals(expectedTenthMinorCategory, course1.getSecondMajorCategory());
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
		    String expectedInstructor = "Dr. Kevin Trainor";
			String expectedSemester = "Fall";
			Integer expectedYear = 2016;
			String expectedDepartmentCode = "LIS";
			Integer expectedCourseNumber = 452;
			String expectedSectionNumber = "1";
			String expectedInstitution = "University of Illinois";
			String expectedLocation = "Online";
			String expectedOnline = "100% Online";
			boolean expectedGeneralRequirement = true;
			Integer expectedGeneralCategory = 1;
			boolean expectedFirstMajorRequirement = true;
			Integer expectedFirstMajorCategory = 1;
			boolean expectedSecondMajorRequirement = true;
			Integer expectedSecondMajorCategory = 1;
			boolean expectedThirdMajorRequirement = true;
			Integer expectedThirdMajorCategory = 1;
			boolean expectedFourthMajorRequirement = true;
			Integer expectedFourthMajorCategory = 1 ;
			boolean expectedFifthMajorRequirement = true;
			Integer expectedFifthMajorCategory = 1;
			boolean expectedSixthMajorRequirement = true;
			Integer expectedSixthMajorCategory = 1;
			boolean expectedSeventhMajorRequirement = true;
			Integer expectedSeventhMajorCategory = 1;
			boolean expectedEighthMajorRequirement = true;
			Integer expectedEighthMajorCategory = 1;
			boolean expectedNinthMajorRequirement = true;
			Integer expectedNinthMajorCategory = 1;
			boolean expectedTenthMajorRequirement = true;
			Integer expectedTenthMajorCategory = 1;
			boolean expectedFirstMinorRequirement = true;
			Integer expectedFirstMinorCategory = 1;
			boolean expectedSecondMinorRequirement = true;
			Integer expectedSecondMinorCategory = 1;
			boolean expectedThirdMinorRequirement = true;
			Integer expectedThirdMinorCategory = 1;
			boolean expectedFourthMinorRequirement = true;
			Integer expectedFourthMinorCategory = 1;
			boolean expectedFifthMinorRequirement = true;
			Integer expectedFifthMinorCategory = 1;
			boolean expectedSixthMinorRequirement = true;
			Integer expectedSixthMinorCategory = 1;
			boolean expectedSeventhMinorRequirement = true;
			Integer expectedSeventhMinorCategory = 1;
			boolean expectedEighthMinorRequirement = true;
			Integer expectedEighthMinorCategory = 1;
			boolean expectedNinthMinorRequirement = true;
			Integer expectedNinthMinorCategory = 1;
			boolean expectedTenthMinorRequirement = true;
			Integer expectedTenthMinorCategory = 1;
			boolean expectedFreeElective = true;
			boolean expectedCompleted = true;
			boolean expectedConsideringEnrollment = false;
			boolean expectedCurrentEnrollment = false;
			Double expectedCredits = 4.0;
			Double expectedGpaDesired = 4.0;
			Double expectedGpaEarned = 4.0;
			String expectedCourseStartDate = "05/21/2016";
			String expectedCourseEndDate = "08/02/2016";
			Integer expectedCoursePredictedDifficulty = 3;
			Integer expectedCoursePredictedWorkload = 3;
			Integer expectedPredictedEnjoyability = 3;
			String expectedRecommendedByWho = "Jana Diesner";
			String expectedNotRecommendedByWho = "Nobody";
			String expectedProfessionalSkills = "Programming Skills";
			String expectedAcademicSkills = "Logic Based Learning";
			CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			String expected = "CourseInfoGeneral [title=Learning Java, instructor=Dr. Kevin Trainor, semester=Fall, year=2016, departmentCode=LIS, courseNumber=452, sectionNumber=1, institution=University of Illinois, location=Online, online=100% Online, generalRequirement=true, generalCategory=1, firstMajorRequirement=true, firstMajorCategory=1, secondMajorRequirement=true, secondMajorCategory=1, firstMinorRequirement=true, firstMinorCategory=1, secondMinorRequirement=true, secondMinorCategory=1, freeElective=true, completed=true, consideringEnrollment=false, currentEnrollment=false, credits=4.0, gpaDesired=4.0, gpaEarned=4.0, courseStartDate=05/21/2016, courseEndDate=08/02/2016, coursePredictedDifficulty=3, coursePredictedWorkload=3, predictedEnjoyability=3, recommendedByWho=Jana Diesner, notRecommendedByWho=Nobody, professionalSkills=Programming Skills, academicSkills=Logic Based Learning]";
			String actual = course1.toString();
			assertEquals(expected, actual);	
		}
			
		@Test
		public void testAllFieldsEqual() {
			String expectedTitle = "Learning Java";
		    String expectedInstructor = "Dr. Kevin Trainor";
			String expectedSemester = "Fall";
			Integer expectedYear = 2016;
			String expectedDepartmentCode = "LIS";
			Integer expectedCourseNumber = 452;
			String expectedSectionNumber = "1";
			String expectedInstitution = "University of Illinois";
			String expectedLocation = "Online";
			String expectedOnline = "100% Online";
			boolean expectedGeneralRequirement = true;
			Integer expectedGeneralCategory = 1;
			boolean expectedFirstMajorRequirement = true;
			Integer expectedFirstMajorCategory = 1;
			boolean expectedSecondMajorRequirement = true;
			Integer expectedSecondMajorCategory = 1;
			boolean expectedThirdMajorRequirement = true;
			Integer expectedThirdMajorCategory = 1;
			boolean expectedFourthMajorRequirement = true;
			Integer expectedFourthMajorCategory = 1 ;
			boolean expectedFifthMajorRequirement = true;
			Integer expectedFifthMajorCategory = 1;
			boolean expectedSixthMajorRequirement = true;
			Integer expectedSixthMajorCategory = 1;
			boolean expectedSeventhMajorRequirement = true;
			Integer expectedSeventhMajorCategory = 1;
			boolean expectedEighthMajorRequirement = true;
			Integer expectedEighthMajorCategory = 1;
			boolean expectedNinthMajorRequirement = true;
			Integer expectedNinthMajorCategory = 1;
			boolean expectedTenthMajorRequirement = true;
			Integer expectedTenthMajorCategory = 1;
			boolean expectedFirstMinorRequirement = true;
			Integer expectedFirstMinorCategory = 1;
			boolean expectedSecondMinorRequirement = true;
			Integer expectedSecondMinorCategory = 1;
			boolean expectedThirdMinorRequirement = true;
			Integer expectedThirdMinorCategory = 1;
			boolean expectedFourthMinorRequirement = true;
			Integer expectedFourthMinorCategory = 1;
			boolean expectedFifthMinorRequirement = true;
			Integer expectedFifthMinorCategory = 1;
			boolean expectedSixthMinorRequirement = true;
			Integer expectedSixthMinorCategory = 1;
			boolean expectedSeventhMinorRequirement = true;
			Integer expectedSeventhMinorCategory = 1;
			boolean expectedEighthMinorRequirement = true;
			Integer expectedEighthMinorCategory = 1;
			boolean expectedNinthMinorRequirement = true;
			Integer expectedNinthMinorCategory = 1;
			boolean expectedTenthMinorRequirement = true;
			Integer expectedTenthMinorCategory = 1;
			boolean expectedFreeElective = true;
			boolean expectedCompleted = true;
			boolean expectedConsideringEnrollment = false;
			boolean expectedCurrentEnrollment = false;
			Double expectedCredits = 4.0;
			Double expectedGpaDesired = 4.0;
			Double expectedGpaEarned = 4.0;
			String expectedCourseStartDate = "05/21/2016";
			String expectedCourseEndDate = "08/02/2016";
			Integer expectedCoursePredictedDifficulty = 3;
			Integer expectedCoursePredictedWorkload = 3;
			Integer expectedPredictedEnjoyability = 3;
			String expectedRecommendedByWho = "Jana Diesner";
			String expectedNotRecommendedByWho = "Nobody";
			String expectedProfessionalSkills = "Programming Skills";
			String expectedAcademicSkills = "Logic Based Learning";
			CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			assertTrue(course1.equals(course2));
			assertFalse(course1 == course2);
		
		}

		@Test
		public void testAllFieldsEqualExceptTitle() {
			String expectedTitle = "Learning Java";
		    String expectedInstructor = "Dr. Kevin Trainor";
			String expectedSemester = "Fall";
			Integer expectedYear = 2016;
			String expectedDepartmentCode = "LIS";
			Integer expectedCourseNumber = 452;
			String expectedSectionNumber = "1";
			String expectedInstitution = "University of Illinois";
			String expectedLocation = "Online";
			String expectedOnline = "100% Online";
			boolean expectedGeneralRequirement = true;
			Integer expectedGeneralCategory = 1;
			boolean expectedFirstMajorRequirement = true;
			Integer expectedFirstMajorCategory = 1;
			boolean expectedSecondMajorRequirement = true;
			Integer expectedSecondMajorCategory = 1;
			boolean expectedThirdMajorRequirement = true;
			Integer expectedThirdMajorCategory = 1;
			boolean expectedFourthMajorRequirement = true;
			Integer expectedFourthMajorCategory = 1 ;
			boolean expectedFifthMajorRequirement = true;
			Integer expectedFifthMajorCategory = 1;
			boolean expectedSixthMajorRequirement = true;
			Integer expectedSixthMajorCategory = 1;
			boolean expectedSeventhMajorRequirement = true;
			Integer expectedSeventhMajorCategory = 1;
			boolean expectedEighthMajorRequirement = true;
			Integer expectedEighthMajorCategory = 1;
			boolean expectedNinthMajorRequirement = true;
			Integer expectedNinthMajorCategory = 1;
			boolean expectedTenthMajorRequirement = true;
			Integer expectedTenthMajorCategory = 1;
			boolean expectedFirstMinorRequirement = true;
			Integer expectedFirstMinorCategory = 1;
			boolean expectedSecondMinorRequirement = true;
			Integer expectedSecondMinorCategory = 1;
			boolean expectedThirdMinorRequirement = true;
			Integer expectedThirdMinorCategory = 1;
			boolean expectedFourthMinorRequirement = true;
			Integer expectedFourthMinorCategory = 1;
			boolean expectedFifthMinorRequirement = true;
			Integer expectedFifthMinorCategory = 1;
			boolean expectedSixthMinorRequirement = true;
			Integer expectedSixthMinorCategory = 1;
			boolean expectedSeventhMinorRequirement = true;
			Integer expectedSeventhMinorCategory = 1;
			boolean expectedEighthMinorRequirement = true;
			Integer expectedEighthMinorCategory = 1;
			boolean expectedNinthMinorRequirement = true;
			Integer expectedNinthMinorCategory = 1;
			boolean expectedTenthMinorRequirement = true;
			Integer expectedTenthMinorCategory = 1;
			boolean expectedFreeElective = true;
			boolean expectedCompleted = true;
			boolean expectedConsideringEnrollment = false;
			boolean expectedCurrentEnrollment = false;
			Double expectedCredits = 4.0;
			Double expectedGpaDesired = 4.0;
			Double expectedGpaEarned = 4.0;
			String expectedCourseStartDate = "05/21/2016";
			String expectedCourseEndDate = "08/02/2016";
			Integer expectedCoursePredictedDifficulty = 3;
			Integer expectedCoursePredictedWorkload = 3;
			Integer expectedPredictedEnjoyability = 3;
			String expectedRecommendedByWho = "Jana Diesner";
			String expectedNotRecommendedByWho = "Nobody";
			String expectedProfessionalSkills = "Programming Skills";
			String expectedAcademicSkills = "Logic Based Learning";
			CourseInfoGeneral course1 = new CourseInfoGeneral("Unlearning Java", expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			assertFalse(course1.equals(course2));
			assertFalse(course1 == course2);
	
		}

		@Test
		public void testAllFieldsEqualExceptInstructor() {
			String expectedTitle = "Learning Java";
		    String expectedInstructor = "Dr. Kevin Trainor";
			String expectedSemester = "Fall";
			Integer expectedYear = 2016;
			String expectedDepartmentCode = "LIS";
			Integer expectedCourseNumber = 452;
			String expectedSectionNumber = "1";
			String expectedInstitution = "University of Illinois";
			String expectedLocation = "Online";
			String expectedOnline = "100% Online";
			boolean expectedGeneralRequirement = true;
			Integer expectedGeneralCategory = 1;
			boolean expectedFirstMajorRequirement = true;
			Integer expectedFirstMajorCategory = 1;
			boolean expectedSecondMajorRequirement = true;
			Integer expectedSecondMajorCategory = 1;
			boolean expectedThirdMajorRequirement = true;
			Integer expectedThirdMajorCategory = 1;
			boolean expectedFourthMajorRequirement = true;
			Integer expectedFourthMajorCategory = 1 ;
			boolean expectedFifthMajorRequirement = true;
			Integer expectedFifthMajorCategory = 1;
			boolean expectedSixthMajorRequirement = true;
			Integer expectedSixthMajorCategory = 1;
			boolean expectedSeventhMajorRequirement = true;
			Integer expectedSeventhMajorCategory = 1;
			boolean expectedEighthMajorRequirement = true;
			Integer expectedEighthMajorCategory = 1;
			boolean expectedNinthMajorRequirement = true;
			Integer expectedNinthMajorCategory = 1;
			boolean expectedTenthMajorRequirement = true;
			Integer expectedTenthMajorCategory = 1;
			boolean expectedFirstMinorRequirement = true;
			Integer expectedFirstMinorCategory = 1;
			boolean expectedSecondMinorRequirement = true;
			Integer expectedSecondMinorCategory = 1;
			boolean expectedThirdMinorRequirement = true;
			Integer expectedThirdMinorCategory = 1;
			boolean expectedFourthMinorRequirement = true;
			Integer expectedFourthMinorCategory = 1;
			boolean expectedFifthMinorRequirement = true;
			Integer expectedFifthMinorCategory = 1;
			boolean expectedSixthMinorRequirement = true;
			Integer expectedSixthMinorCategory = 1;
			boolean expectedSeventhMinorRequirement = true;
			Integer expectedSeventhMinorCategory = 1;
			boolean expectedEighthMinorRequirement = true;
			Integer expectedEighthMinorCategory = 1;
			boolean expectedNinthMinorRequirement = true;
			Integer expectedNinthMinorCategory = 1;
			boolean expectedTenthMinorRequirement = true;
			Integer expectedTenthMinorCategory = 1;
			boolean expectedFreeElective = true;
			boolean expectedCompleted = true;
			boolean expectedConsideringEnrollment = false;
			boolean expectedCurrentEnrollment = false;
			Double expectedCredits = 4.0;
			Double expectedGpaDesired = 4.0;
			Double expectedGpaEarned = 4.0;
			String expectedCourseStartDate = "05/21/2016";
			String expectedCourseEndDate = "08/02/2016";
			Integer expectedCoursePredictedDifficulty = 3;
			Integer expectedCoursePredictedWorkload = 3;
			Integer expectedPredictedEnjoyability = 3;
			String expectedRecommendedByWho = "Jana Diesner";
			String expectedNotRecommendedByWho = "Nobody";
			String expectedProfessionalSkills = "Programming Skills";
			String expectedAcademicSkills = "Logic Based Learning";
			CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, "Dr. Strangelove", 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			assertFalse(course1.equals(course2));
			assertFalse(course1 == course2);
	
		}
	
		@Test
		public void testAllFieldsEqualExceptSemester() {
			String expectedTitle = "Learning Java";
		    String expectedInstructor = "Dr. Kevin Trainor";
			String expectedSemester = "Fall";
			Integer expectedYear = 2016;
			String expectedDepartmentCode = "LIS";
			Integer expectedCourseNumber = 452;
			String expectedSectionNumber = "1";
			String expectedInstitution = "University of Illinois";
			String expectedLocation = "Online";
			String expectedOnline = "100% Online";
			boolean expectedGeneralRequirement = true;
			Integer expectedGeneralCategory = 1;
			boolean expectedFirstMajorRequirement = true;
			Integer expectedFirstMajorCategory = 1;
			boolean expectedSecondMajorRequirement = true;
			Integer expectedSecondMajorCategory = 1;
			boolean expectedThirdMajorRequirement = true;
			Integer expectedThirdMajorCategory = 1;
			boolean expectedFourthMajorRequirement = true;
			Integer expectedFourthMajorCategory = 1 ;
			boolean expectedFifthMajorRequirement = true;
			Integer expectedFifthMajorCategory = 1;
			boolean expectedSixthMajorRequirement = true;
			Integer expectedSixthMajorCategory = 1;
			boolean expectedSeventhMajorRequirement = true;
			Integer expectedSeventhMajorCategory = 1;
			boolean expectedEighthMajorRequirement = true;
			Integer expectedEighthMajorCategory = 1;
			boolean expectedNinthMajorRequirement = true;
			Integer expectedNinthMajorCategory = 1;
			boolean expectedTenthMajorRequirement = true;
			Integer expectedTenthMajorCategory = 1;
			boolean expectedFirstMinorRequirement = true;
			Integer expectedFirstMinorCategory = 1;
			boolean expectedSecondMinorRequirement = true;
			Integer expectedSecondMinorCategory = 1;
			boolean expectedThirdMinorRequirement = true;
			Integer expectedThirdMinorCategory = 1;
			boolean expectedFourthMinorRequirement = true;
			Integer expectedFourthMinorCategory = 1;
			boolean expectedFifthMinorRequirement = true;
			Integer expectedFifthMinorCategory = 1;
			boolean expectedSixthMinorRequirement = true;
			Integer expectedSixthMinorCategory = 1;
			boolean expectedSeventhMinorRequirement = true;
			Integer expectedSeventhMinorCategory = 1;
			boolean expectedEighthMinorRequirement = true;
			Integer expectedEighthMinorCategory = 1;
			boolean expectedNinthMinorRequirement = true;
			Integer expectedNinthMinorCategory = 1;
			boolean expectedTenthMinorRequirement = true;
			Integer expectedTenthMinorCategory = 1;
			boolean expectedFreeElective = true;
			boolean expectedCompleted = true;
			boolean expectedConsideringEnrollment = false;
			boolean expectedCurrentEnrollment = false;
			Double expectedCredits = 4.0;
			Double expectedGpaDesired = 4.0;
			Double expectedGpaEarned = 4.0;
			String expectedCourseStartDate = "05/21/2016";
			String expectedCourseEndDate = "08/02/2016";
			Integer expectedCoursePredictedDifficulty = 3;
			Integer expectedCoursePredictedWorkload = 3;
			Integer expectedPredictedEnjoyability = 3;
			String expectedRecommendedByWho = "Jana Diesner";
			String expectedNotRecommendedByWho = "Nobody";
			String expectedProfessionalSkills = "Programming Skills";
			String expectedAcademicSkills = "Logic Based Learning";
			CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 "Summer", expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			assertFalse(course1.equals(course2));
			assertFalse(course1 == course2);
	
		}
	
		@Test
		public void testAllFieldsEqualExceptYear() {
			String expectedTitle = "Learning Java";
		    String expectedInstructor = "Dr. Kevin Trainor";
			String expectedSemester = "Fall";
			Integer expectedYear = 2016;
			String expectedDepartmentCode = "LIS";
			Integer expectedCourseNumber = 452;
			String expectedSectionNumber = "1";
			String expectedInstitution = "University of Illinois";
			String expectedLocation = "Online";
			String expectedOnline = "100% Online";
			boolean expectedGeneralRequirement = true;
			Integer expectedGeneralCategory = 1;
			boolean expectedFirstMajorRequirement = true;
			Integer expectedFirstMajorCategory = 1;
			boolean expectedSecondMajorRequirement = true;
			Integer expectedSecondMajorCategory = 1;
			boolean expectedThirdMajorRequirement = true;
			Integer expectedThirdMajorCategory = 1;
			boolean expectedFourthMajorRequirement = true;
			Integer expectedFourthMajorCategory = 1 ;
			boolean expectedFifthMajorRequirement = true;
			Integer expectedFifthMajorCategory = 1;
			boolean expectedSixthMajorRequirement = true;
			Integer expectedSixthMajorCategory = 1;
			boolean expectedSeventhMajorRequirement = true;
			Integer expectedSeventhMajorCategory = 1;
			boolean expectedEighthMajorRequirement = true;
			Integer expectedEighthMajorCategory = 1;
			boolean expectedNinthMajorRequirement = true;
			Integer expectedNinthMajorCategory = 1;
			boolean expectedTenthMajorRequirement = true;
			Integer expectedTenthMajorCategory = 1;
			boolean expectedFirstMinorRequirement = true;
			Integer expectedFirstMinorCategory = 1;
			boolean expectedSecondMinorRequirement = true;
			Integer expectedSecondMinorCategory = 1;
			boolean expectedThirdMinorRequirement = true;
			Integer expectedThirdMinorCategory = 1;
			boolean expectedFourthMinorRequirement = true;
			Integer expectedFourthMinorCategory = 1;
			boolean expectedFifthMinorRequirement = true;
			Integer expectedFifthMinorCategory = 1;
			boolean expectedSixthMinorRequirement = true;
			Integer expectedSixthMinorCategory = 1;
			boolean expectedSeventhMinorRequirement = true;
			Integer expectedSeventhMinorCategory = 1;
			boolean expectedEighthMinorRequirement = true;
			Integer expectedEighthMinorCategory = 1;
			boolean expectedNinthMinorRequirement = true;
			Integer expectedNinthMinorCategory = 1;
			boolean expectedTenthMinorRequirement = true;
			Integer expectedTenthMinorCategory = 1;
			boolean expectedFreeElective = true;
			boolean expectedCompleted = true;
			boolean expectedConsideringEnrollment = false;
			boolean expectedCurrentEnrollment = false;
			Double expectedCredits = 4.0;
			Double expectedGpaDesired = 4.0;
			Double expectedGpaEarned = 4.0;
			String expectedCourseStartDate = "05/21/2016";
			String expectedCourseEndDate = "08/02/2016";
			Integer expectedCoursePredictedDifficulty = 3;
			Integer expectedCoursePredictedWorkload = 3;
			Integer expectedPredictedEnjoyability = 3;
			String expectedRecommendedByWho = "Jana Diesner";
			String expectedNotRecommendedByWho = "Nobody";
			String expectedProfessionalSkills = "Programming Skills";
			String expectedAcademicSkills = "Logic Based Learning";
			CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, 1999,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			assertFalse(course1.equals(course2));
			assertFalse(course1 == course2);
	
		}

		@Test
		public void testAllFieldsEqualExceptDepartmentCode() {
			String expectedTitle = "Learning Java";
		    String expectedInstructor = "Dr. Kevin Trainor";
			String expectedSemester = "Fall";
			Integer expectedYear = 2016;
			String expectedDepartmentCode = "LIS";
			Integer expectedCourseNumber = 452;
			String expectedSectionNumber = "1";
			String expectedInstitution = "University of Illinois";
			String expectedLocation = "Online";
			String expectedOnline = "100% Online";
			boolean expectedGeneralRequirement = true;
			Integer expectedGeneralCategory = 1;
			boolean expectedFirstMajorRequirement = true;
			Integer expectedFirstMajorCategory = 1;
			boolean expectedSecondMajorRequirement = true;
			Integer expectedSecondMajorCategory = 1;
			boolean expectedThirdMajorRequirement = true;
			Integer expectedThirdMajorCategory = 1;
			boolean expectedFourthMajorRequirement = true;
			Integer expectedFourthMajorCategory = 1 ;
			boolean expectedFifthMajorRequirement = true;
			Integer expectedFifthMajorCategory = 1;
			boolean expectedSixthMajorRequirement = true;
			Integer expectedSixthMajorCategory = 1;
			boolean expectedSeventhMajorRequirement = true;
			Integer expectedSeventhMajorCategory = 1;
			boolean expectedEighthMajorRequirement = true;
			Integer expectedEighthMajorCategory = 1;
			boolean expectedNinthMajorRequirement = true;
			Integer expectedNinthMajorCategory = 1;
			boolean expectedTenthMajorRequirement = true;
			Integer expectedTenthMajorCategory = 1;
			boolean expectedFirstMinorRequirement = true;
			Integer expectedFirstMinorCategory = 1;
			boolean expectedSecondMinorRequirement = true;
			Integer expectedSecondMinorCategory = 1;
			boolean expectedThirdMinorRequirement = true;
			Integer expectedThirdMinorCategory = 1;
			boolean expectedFourthMinorRequirement = true;
			Integer expectedFourthMinorCategory = 1;
			boolean expectedFifthMinorRequirement = true;
			Integer expectedFifthMinorCategory = 1;
			boolean expectedSixthMinorRequirement = true;
			Integer expectedSixthMinorCategory = 1;
			boolean expectedSeventhMinorRequirement = true;
			Integer expectedSeventhMinorCategory = 1;
			boolean expectedEighthMinorRequirement = true;
			Integer expectedEighthMinorCategory = 1;
			boolean expectedNinthMinorRequirement = true;
			Integer expectedNinthMinorCategory = 1;
			boolean expectedTenthMinorRequirement = true;
			Integer expectedTenthMinorCategory = 1;
			boolean expectedFreeElective = true;
			boolean expectedCompleted = true;
			boolean expectedConsideringEnrollment = false;
			boolean expectedCurrentEnrollment = false;
			Double expectedCredits = 4.0;
			Double expectedGpaDesired = 4.0;
			Double expectedGpaEarned = 4.0;
			String expectedCourseStartDate = "05/21/2016";
			String expectedCourseEndDate = "08/02/2016";
			Integer expectedCoursePredictedDifficulty = 3;
			Integer expectedCoursePredictedWorkload = 3;
			Integer expectedPredictedEnjoyability = 3;
			String expectedRecommendedByWho = "Jana Diesner";
			String expectedNotRecommendedByWho = "Nobody";
			String expectedProfessionalSkills = "Programming Skills";
			String expectedAcademicSkills = "Logic Based Learning";
			CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  "COM", expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			assertFalse(course1.equals(course2));
			assertFalse(course1 == course2);
		}
		
	
		@Test
		public void testAllFieldsEqualExceptCourseNumber() {
			String expectedTitle = "Learning Java";
		    String expectedInstructor = "Dr. Kevin Trainor";
			String expectedSemester = "Fall";
			Integer expectedYear = 2016;
			String expectedDepartmentCode = "LIS";
			Integer expectedCourseNumber = 452;
			String expectedSectionNumber = "1";
			String expectedInstitution = "University of Illinois";
			String expectedLocation = "Online";
			String expectedOnline = "100% Online";
			boolean expectedGeneralRequirement = true;
			Integer expectedGeneralCategory = 1;
			boolean expectedFirstMajorRequirement = true;
			Integer expectedFirstMajorCategory = 1;
			boolean expectedSecondMajorRequirement = true;
			Integer expectedSecondMajorCategory = 1;
			boolean expectedThirdMajorRequirement = true;
			Integer expectedThirdMajorCategory = 1;
			boolean expectedFourthMajorRequirement = true;
			Integer expectedFourthMajorCategory = 1 ;
			boolean expectedFifthMajorRequirement = true;
			Integer expectedFifthMajorCategory = 1;
			boolean expectedSixthMajorRequirement = true;
			Integer expectedSixthMajorCategory = 1;
			boolean expectedSeventhMajorRequirement = true;
			Integer expectedSeventhMajorCategory = 1;
			boolean expectedEighthMajorRequirement = true;
			Integer expectedEighthMajorCategory = 1;
			boolean expectedNinthMajorRequirement = true;
			Integer expectedNinthMajorCategory = 1;
			boolean expectedTenthMajorRequirement = true;
			Integer expectedTenthMajorCategory = 1;
			boolean expectedFirstMinorRequirement = true;
			Integer expectedFirstMinorCategory = 1;
			boolean expectedSecondMinorRequirement = true;
			Integer expectedSecondMinorCategory = 1;
			boolean expectedThirdMinorRequirement = true;
			Integer expectedThirdMinorCategory = 1;
			boolean expectedFourthMinorRequirement = true;
			Integer expectedFourthMinorCategory = 1;
			boolean expectedFifthMinorRequirement = true;
			Integer expectedFifthMinorCategory = 1;
			boolean expectedSixthMinorRequirement = true;
			Integer expectedSixthMinorCategory = 1;
			boolean expectedSeventhMinorRequirement = true;
			Integer expectedSeventhMinorCategory = 1;
			boolean expectedEighthMinorRequirement = true;
			Integer expectedEighthMinorCategory = 1;
			boolean expectedNinthMinorRequirement = true;
			Integer expectedNinthMinorCategory = 1;
			boolean expectedTenthMinorRequirement = true;
			Integer expectedTenthMinorCategory = 1;
			boolean expectedFreeElective = true;
			boolean expectedCompleted = true;
			boolean expectedConsideringEnrollment = false;
			boolean expectedCurrentEnrollment = false;
			Double expectedCredits = 4.0;
			Double expectedGpaDesired = 4.0;
			Double expectedGpaEarned = 4.0;
			String expectedCourseStartDate = "05/21/2016";
			String expectedCourseEndDate = "08/02/2016";
			Integer expectedCoursePredictedDifficulty = 3;
			Integer expectedCoursePredictedWorkload = 3;
			Integer expectedPredictedEnjoyability = 3;
			String expectedRecommendedByWho = "Jana Diesner";
			String expectedNotRecommendedByWho = "Nobody";
			String expectedProfessionalSkills = "Programming Skills";
			String expectedAcademicSkills = "Logic Based Learning";
			CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, 453, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			assertFalse(course1.equals(course2));
			assertFalse(course1 == course2);
	
		}
		
		@Test
		public void testAllFieldsEqualExceptSectionNumber() {
			String expectedTitle = "Learning Java";
		    String expectedInstructor = "Dr. Kevin Trainor";
			String expectedSemester = "Fall";
			Integer expectedYear = 2016;
			String expectedDepartmentCode = "LIS";
			Integer expectedCourseNumber = 452;
			String expectedSectionNumber = "1";
			String expectedInstitution = "University of Illinois";
			String expectedLocation = "Online";
			String expectedOnline = "100% Online";
			boolean expectedGeneralRequirement = true;
			Integer expectedGeneralCategory = 1;
			boolean expectedFirstMajorRequirement = true;
			Integer expectedFirstMajorCategory = 1;
			boolean expectedSecondMajorRequirement = true;
			Integer expectedSecondMajorCategory = 1;
			boolean expectedThirdMajorRequirement = true;
			Integer expectedThirdMajorCategory = 1;
			boolean expectedFourthMajorRequirement = true;
			Integer expectedFourthMajorCategory = 1 ;
			boolean expectedFifthMajorRequirement = true;
			Integer expectedFifthMajorCategory = 1;
			boolean expectedSixthMajorRequirement = true;
			Integer expectedSixthMajorCategory = 1;
			boolean expectedSeventhMajorRequirement = true;
			Integer expectedSeventhMajorCategory = 1;
			boolean expectedEighthMajorRequirement = true;
			Integer expectedEighthMajorCategory = 1;
			boolean expectedNinthMajorRequirement = true;
			Integer expectedNinthMajorCategory = 1;
			boolean expectedTenthMajorRequirement = true;
			Integer expectedTenthMajorCategory = 1;
			boolean expectedFirstMinorRequirement = true;
			Integer expectedFirstMinorCategory = 1;
			boolean expectedSecondMinorRequirement = true;
			Integer expectedSecondMinorCategory = 1;
			boolean expectedThirdMinorRequirement = true;
			Integer expectedThirdMinorCategory = 1;
			boolean expectedFourthMinorRequirement = true;
			Integer expectedFourthMinorCategory = 1;
			boolean expectedFifthMinorRequirement = true;
			Integer expectedFifthMinorCategory = 1;
			boolean expectedSixthMinorRequirement = true;
			Integer expectedSixthMinorCategory = 1;
			boolean expectedSeventhMinorRequirement = true;
			Integer expectedSeventhMinorCategory = 1;
			boolean expectedEighthMinorRequirement = true;
			Integer expectedEighthMinorCategory = 1;
			boolean expectedNinthMinorRequirement = true;
			Integer expectedNinthMinorCategory = 1;
			boolean expectedTenthMinorRequirement = true;
			Integer expectedTenthMinorCategory = 1;
			boolean expectedFreeElective = true;
			boolean expectedCompleted = true;
			boolean expectedConsideringEnrollment = false;
			boolean expectedCurrentEnrollment = false;
			Double expectedCredits = 4.0;
			Double expectedGpaDesired = 4.0;
			Double expectedGpaEarned = 4.0;
			String expectedCourseStartDate = "05/21/2016";
			String expectedCourseEndDate = "08/02/2016";
			Integer expectedCoursePredictedDifficulty = 3;
			Integer expectedCoursePredictedWorkload = 3;
			Integer expectedPredictedEnjoyability = 3;
			String expectedRecommendedByWho = "Jana Diesner";
			String expectedNotRecommendedByWho = "Nobody";
			String expectedProfessionalSkills = "Programming Skills";
			String expectedAcademicSkills = "Logic Based Learning";
			CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 "15A", expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			assertFalse(course1.equals(course2));
			assertFalse(course1 == course2);
	
		}
		
		@Test
		public void testAllFieldsEqualExceptInstitution() {
			String expectedTitle = "Learning Java";
		    String expectedInstructor = "Dr. Kevin Trainor";
			String expectedSemester = "Fall";
			Integer expectedYear = 2016;
			String expectedDepartmentCode = "LIS";
			Integer expectedCourseNumber = 452;
			String expectedSectionNumber = "1";
			String expectedInstitution = "University of Illinois";
			String expectedLocation = "Online";
			String expectedOnline = "100% Online";
			boolean expectedGeneralRequirement = true;
			Integer expectedGeneralCategory = 1;
			boolean expectedFirstMajorRequirement = true;
			Integer expectedFirstMajorCategory = 1;
			boolean expectedSecondMajorRequirement = true;
			Integer expectedSecondMajorCategory = 1;
			boolean expectedThirdMajorRequirement = true;
			Integer expectedThirdMajorCategory = 1;
			boolean expectedFourthMajorRequirement = true;
			Integer expectedFourthMajorCategory = 1 ;
			boolean expectedFifthMajorRequirement = true;
			Integer expectedFifthMajorCategory = 1;
			boolean expectedSixthMajorRequirement = true;
			Integer expectedSixthMajorCategory = 1;
			boolean expectedSeventhMajorRequirement = true;
			Integer expectedSeventhMajorCategory = 1;
			boolean expectedEighthMajorRequirement = true;
			Integer expectedEighthMajorCategory = 1;
			boolean expectedNinthMajorRequirement = true;
			Integer expectedNinthMajorCategory = 1;
			boolean expectedTenthMajorRequirement = true;
			Integer expectedTenthMajorCategory = 1;
			boolean expectedFirstMinorRequirement = true;
			Integer expectedFirstMinorCategory = 1;
			boolean expectedSecondMinorRequirement = true;
			Integer expectedSecondMinorCategory = 1;
			boolean expectedThirdMinorRequirement = true;
			Integer expectedThirdMinorCategory = 1;
			boolean expectedFourthMinorRequirement = true;
			Integer expectedFourthMinorCategory = 1;
			boolean expectedFifthMinorRequirement = true;
			Integer expectedFifthMinorCategory = 1;
			boolean expectedSixthMinorRequirement = true;
			Integer expectedSixthMinorCategory = 1;
			boolean expectedSeventhMinorRequirement = true;
			Integer expectedSeventhMinorCategory = 1;
			boolean expectedEighthMinorRequirement = true;
			Integer expectedEighthMinorCategory = 1;
			boolean expectedNinthMinorRequirement = true;
			Integer expectedNinthMinorCategory = 1;
			boolean expectedTenthMinorRequirement = true;
			Integer expectedTenthMinorCategory = 1;
			boolean expectedFreeElective = true;
			boolean expectedCompleted = true;
			boolean expectedConsideringEnrollment = false;
			boolean expectedCurrentEnrollment = false;
			Double expectedCredits = 4.0;
			Double expectedGpaDesired = 4.0;
			Double expectedGpaEarned = 4.0;
			String expectedCourseStartDate = "05/21/2016";
			String expectedCourseEndDate = "08/02/2016";
			Integer expectedCoursePredictedDifficulty = 3;
			Integer expectedCoursePredictedWorkload = 3;
			Integer expectedPredictedEnjoyability = 3;
			String expectedRecommendedByWho = "Jana Diesner";
			String expectedNotRecommendedByWho = "Nobody";
			String expectedProfessionalSkills = "Programming Skills";
			String expectedAcademicSkills = "Logic Based Learning";
			CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, "Northwestern", expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			assertFalse(course1.equals(course2));
			assertFalse(course1 == course2);
	
		}
	
		@Test
		public void testAllFieldsEqualExceptLocation() {
			String expectedTitle = "Learning Java";
		    String expectedInstructor = "Dr. Kevin Trainor";
			String expectedSemester = "Fall";
			Integer expectedYear = 2016;
			String expectedDepartmentCode = "LIS";
			Integer expectedCourseNumber = 452;
			String expectedSectionNumber = "1";
			String expectedInstitution = "University of Illinois";
			String expectedLocation = "Online";
			String expectedOnline = "100% Online";
			boolean expectedGeneralRequirement = true;
			Integer expectedGeneralCategory = 1;
			boolean expectedFirstMajorRequirement = true;
			Integer expectedFirstMajorCategory = 1;
			boolean expectedSecondMajorRequirement = true;
			Integer expectedSecondMajorCategory = 1;
			boolean expectedThirdMajorRequirement = true;
			Integer expectedThirdMajorCategory = 1;
			boolean expectedFourthMajorRequirement = true;
			Integer expectedFourthMajorCategory = 1 ;
			boolean expectedFifthMajorRequirement = true;
			Integer expectedFifthMajorCategory = 1;
			boolean expectedSixthMajorRequirement = true;
			Integer expectedSixthMajorCategory = 1;
			boolean expectedSeventhMajorRequirement = true;
			Integer expectedSeventhMajorCategory = 1;
			boolean expectedEighthMajorRequirement = true;
			Integer expectedEighthMajorCategory = 1;
			boolean expectedNinthMajorRequirement = true;
			Integer expectedNinthMajorCategory = 1;
			boolean expectedTenthMajorRequirement = true;
			Integer expectedTenthMajorCategory = 1;
			boolean expectedFirstMinorRequirement = true;
			Integer expectedFirstMinorCategory = 1;
			boolean expectedSecondMinorRequirement = true;
			Integer expectedSecondMinorCategory = 1;
			boolean expectedThirdMinorRequirement = true;
			Integer expectedThirdMinorCategory = 1;
			boolean expectedFourthMinorRequirement = true;
			Integer expectedFourthMinorCategory = 1;
			boolean expectedFifthMinorRequirement = true;
			Integer expectedFifthMinorCategory = 1;
			boolean expectedSixthMinorRequirement = true;
			Integer expectedSixthMinorCategory = 1;
			boolean expectedSeventhMinorRequirement = true;
			Integer expectedSeventhMinorCategory = 1;
			boolean expectedEighthMinorRequirement = true;
			Integer expectedEighthMinorCategory = 1;
			boolean expectedNinthMinorRequirement = true;
			Integer expectedNinthMinorCategory = 1;
			boolean expectedTenthMinorRequirement = true;
			Integer expectedTenthMinorCategory = 1;
			boolean expectedFreeElective = true;
			boolean expectedCompleted = true;
			boolean expectedConsideringEnrollment = false;
			boolean expectedCurrentEnrollment = false;
			Double expectedCredits = 4.0;
			Double expectedGpaDesired = 4.0;
			Double expectedGpaEarned = 4.0;
			String expectedCourseStartDate = "05/21/2016";
			String expectedCourseEndDate = "08/02/2016";
			Integer expectedCoursePredictedDifficulty = 3;
			Integer expectedCoursePredictedWorkload = 3;
			Integer expectedPredictedEnjoyability = 3;
			String expectedRecommendedByWho = "Jana Diesner";
			String expectedNotRecommendedByWho = "Nobody";
			String expectedProfessionalSkills = "Programming Skills";
			String expectedAcademicSkills = "Logic Based Learning";
			CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, "Lincoln Hall", expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			assertFalse(course1.equals(course2));
			assertFalse(course1 == course2);
	
		}
		
		@Test
		public void testAllFieldsEqualExceptOnline() {
			String expectedTitle = "Learning Java";
		    String expectedInstructor = "Dr. Kevin Trainor";
			String expectedSemester = "Fall";
			Integer expectedYear = 2016;
			String expectedDepartmentCode = "LIS";
			Integer expectedCourseNumber = 452;
			String expectedSectionNumber = "1";
			String expectedInstitution = "University of Illinois";
			String expectedLocation = "Online";
			String expectedOnline = "100% Online";
			boolean expectedGeneralRequirement = true;
			Integer expectedGeneralCategory = 1;
			boolean expectedFirstMajorRequirement = true;
			Integer expectedFirstMajorCategory = 1;
			boolean expectedSecondMajorRequirement = true;
			Integer expectedSecondMajorCategory = 1;
			boolean expectedThirdMajorRequirement = true;
			Integer expectedThirdMajorCategory = 1;
			boolean expectedFourthMajorRequirement = true;
			Integer expectedFourthMajorCategory = 1 ;
			boolean expectedFifthMajorRequirement = true;
			Integer expectedFifthMajorCategory = 1;
			boolean expectedSixthMajorRequirement = true;
			Integer expectedSixthMajorCategory = 1;
			boolean expectedSeventhMajorRequirement = true;
			Integer expectedSeventhMajorCategory = 1;
			boolean expectedEighthMajorRequirement = true;
			Integer expectedEighthMajorCategory = 1;
			boolean expectedNinthMajorRequirement = true;
			Integer expectedNinthMajorCategory = 1;
			boolean expectedTenthMajorRequirement = true;
			Integer expectedTenthMajorCategory = 1;
			boolean expectedFirstMinorRequirement = true;
			Integer expectedFirstMinorCategory = 1;
			boolean expectedSecondMinorRequirement = true;
			Integer expectedSecondMinorCategory = 1;
			boolean expectedThirdMinorRequirement = true;
			Integer expectedThirdMinorCategory = 1;
			boolean expectedFourthMinorRequirement = true;
			Integer expectedFourthMinorCategory = 1;
			boolean expectedFifthMinorRequirement = true;
			Integer expectedFifthMinorCategory = 1;
			boolean expectedSixthMinorRequirement = true;
			Integer expectedSixthMinorCategory = 1;
			boolean expectedSeventhMinorRequirement = true;
			Integer expectedSeventhMinorCategory = 1;
			boolean expectedEighthMinorRequirement = true;
			Integer expectedEighthMinorCategory = 1;
			boolean expectedNinthMinorRequirement = true;
			Integer expectedNinthMinorCategory = 1;
			boolean expectedTenthMinorRequirement = true;
			Integer expectedTenthMinorCategory = 1;
			boolean expectedFreeElective = true;
			boolean expectedCompleted = true;
			boolean expectedConsideringEnrollment = false;
			boolean expectedCurrentEnrollment = false;
			Double expectedCredits = 4.0;
			Double expectedGpaDesired = 4.0;
			Double expectedGpaEarned = 4.0;
			String expectedCourseStartDate = "05/21/2016";
			String expectedCourseEndDate = "08/02/2016";
			Integer expectedCoursePredictedDifficulty = 3;
			Integer expectedCoursePredictedWorkload = 3;
			Integer expectedPredictedEnjoyability = 3;
			String expectedRecommendedByWho = "Jana Diesner";
			String expectedNotRecommendedByWho = "Nobody";
			String expectedProfessionalSkills = "Programming Skills";
			String expectedAcademicSkills = "Logic Based Learning";
			CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, "Hybrid",
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			assertFalse(course1.equals(course2));
			assertFalse(course1 == course2);
		
		}
		
		@Test
		public void testAllFieldsEqualExceptGeneralRequirement() {
			String expectedTitle = "Learning Java";
		    String expectedInstructor = "Dr. Kevin Trainor";
			String expectedSemester = "Fall";
			Integer expectedYear = 2016;
			String expectedDepartmentCode = "LIS";
			Integer expectedCourseNumber = 452;
			String expectedSectionNumber = "1";
			String expectedInstitution = "University of Illinois";
			String expectedLocation = "Online";
			String expectedOnline = "100% Online";
			boolean expectedGeneralRequirement = true;
			Integer expectedGeneralCategory = 1;
			boolean expectedFirstMajorRequirement = true;
			Integer expectedFirstMajorCategory = 1;
			boolean expectedSecondMajorRequirement = true;
			Integer expectedSecondMajorCategory = 1;
			boolean expectedThirdMajorRequirement = true;
			Integer expectedThirdMajorCategory = 1;
			boolean expectedFourthMajorRequirement = true;
			Integer expectedFourthMajorCategory = 1 ;
			boolean expectedFifthMajorRequirement = true;
			Integer expectedFifthMajorCategory = 1;
			boolean expectedSixthMajorRequirement = true;
			Integer expectedSixthMajorCategory = 1;
			boolean expectedSeventhMajorRequirement = true;
			Integer expectedSeventhMajorCategory = 1;
			boolean expectedEighthMajorRequirement = true;
			Integer expectedEighthMajorCategory = 1;
			boolean expectedNinthMajorRequirement = true;
			Integer expectedNinthMajorCategory = 1;
			boolean expectedTenthMajorRequirement = true;
			Integer expectedTenthMajorCategory = 1;
			boolean expectedFirstMinorRequirement = true;
			Integer expectedFirstMinorCategory = 1;
			boolean expectedSecondMinorRequirement = true;
			Integer expectedSecondMinorCategory = 1;
			boolean expectedThirdMinorRequirement = true;
			Integer expectedThirdMinorCategory = 1;
			boolean expectedFourthMinorRequirement = true;
			Integer expectedFourthMinorCategory = 1;
			boolean expectedFifthMinorRequirement = true;
			Integer expectedFifthMinorCategory = 1;
			boolean expectedSixthMinorRequirement = true;
			Integer expectedSixthMinorCategory = 1;
			boolean expectedSeventhMinorRequirement = true;
			Integer expectedSeventhMinorCategory = 1;
			boolean expectedEighthMinorRequirement = true;
			Integer expectedEighthMinorCategory = 1;
			boolean expectedNinthMinorRequirement = true;
			Integer expectedNinthMinorCategory = 1;
			boolean expectedTenthMinorRequirement = true;
			Integer expectedTenthMinorCategory = 1;
			boolean expectedFreeElective = true;
			boolean expectedCompleted = true;
			boolean expectedConsideringEnrollment = false;
			boolean expectedCurrentEnrollment = false;
			Double expectedCredits = 4.0;
			Double expectedGpaDesired = 4.0;
			Double expectedGpaEarned = 4.0;
			String expectedCourseStartDate = "05/21/2016";
			String expectedCourseEndDate = "08/02/2016";
			Integer expectedCoursePredictedDifficulty = 3;
			Integer expectedCoursePredictedWorkload = 3;
			Integer expectedPredictedEnjoyability = 3;
			String expectedRecommendedByWho = "Jana Diesner";
			String expectedNotRecommendedByWho = "Nobody";
			String expectedProfessionalSkills = "Programming Skills";
			String expectedAcademicSkills = "Logic Based Learning";
			CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 false, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			assertFalse(course1.equals(course2));
			assertFalse(course1 == course2);
			
	
		}
	
		@Test
		public void testAllFieldsEqualExceptGeneralCategory() {
			String expectedTitle = "Learning Java";
		    String expectedInstructor = "Dr. Kevin Trainor";
			String expectedSemester = "Fall";
			Integer expectedYear = 2016;
			String expectedDepartmentCode = "LIS";
			Integer expectedCourseNumber = 452;
			String expectedSectionNumber = "1";
			String expectedInstitution = "University of Illinois";
			String expectedLocation = "Online";
			String expectedOnline = "100% Online";
			boolean expectedGeneralRequirement = true;
			Integer expectedGeneralCategory = 1;
			boolean expectedFirstMajorRequirement = true;
			Integer expectedFirstMajorCategory = 1;
			boolean expectedSecondMajorRequirement = true;
			Integer expectedSecondMajorCategory = 1;
			boolean expectedThirdMajorRequirement = true;
			Integer expectedThirdMajorCategory = 1;
			boolean expectedFourthMajorRequirement = true;
			Integer expectedFourthMajorCategory = 1 ;
			boolean expectedFifthMajorRequirement = true;
			Integer expectedFifthMajorCategory = 1;
			boolean expectedSixthMajorRequirement = true;
			Integer expectedSixthMajorCategory = 1;
			boolean expectedSeventhMajorRequirement = true;
			Integer expectedSeventhMajorCategory = 1;
			boolean expectedEighthMajorRequirement = true;
			Integer expectedEighthMajorCategory = 1;
			boolean expectedNinthMajorRequirement = true;
			Integer expectedNinthMajorCategory = 1;
			boolean expectedTenthMajorRequirement = true;
			Integer expectedTenthMajorCategory = 1;
			boolean expectedFirstMinorRequirement = true;
			Integer expectedFirstMinorCategory = 1;
			boolean expectedSecondMinorRequirement = true;
			Integer expectedSecondMinorCategory = 1;
			boolean expectedThirdMinorRequirement = true;
			Integer expectedThirdMinorCategory = 1;
			boolean expectedFourthMinorRequirement = true;
			Integer expectedFourthMinorCategory = 1;
			boolean expectedFifthMinorRequirement = true;
			Integer expectedFifthMinorCategory = 1;
			boolean expectedSixthMinorRequirement = true;
			Integer expectedSixthMinorCategory = 1;
			boolean expectedSeventhMinorRequirement = true;
			Integer expectedSeventhMinorCategory = 1;
			boolean expectedEighthMinorRequirement = true;
			Integer expectedEighthMinorCategory = 1;
			boolean expectedNinthMinorRequirement = true;
			Integer expectedNinthMinorCategory = 1;
			boolean expectedTenthMinorRequirement = true;
			Integer expectedTenthMinorCategory = 1;
			boolean expectedFreeElective = true;
			boolean expectedCompleted = true;
			boolean expectedConsideringEnrollment = false;
			boolean expectedCurrentEnrollment = false;
			Double expectedCredits = 4.0;
			Double expectedGpaDesired = 4.0;
			Double expectedGpaEarned = 4.0;
			String expectedCourseStartDate = "05/21/2016";
			String expectedCourseEndDate = "08/02/2016";
			Integer expectedCoursePredictedDifficulty = 3;
			Integer expectedCoursePredictedWorkload = 3;
			Integer expectedPredictedEnjoyability = 3;
			String expectedRecommendedByWho = "Jana Diesner";
			String expectedNotRecommendedByWho = "Nobody";
			String expectedProfessionalSkills = "Programming Skills";
			String expectedAcademicSkills = "Logic Based Learning";
			CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, 2, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			assertFalse(course1.equals(course2));
			assertFalse(course1 == course2);
	
		}
	
		@Test
		public void testAllFieldsEqualExceptFirstMajorRequirement() {
			String expectedTitle = "Learning Java";
		    String expectedInstructor = "Dr. Kevin Trainor";
			String expectedSemester = "Fall";
			Integer expectedYear = 2016;
			String expectedDepartmentCode = "LIS";
			Integer expectedCourseNumber = 452;
			String expectedSectionNumber = "1";
			String expectedInstitution = "University of Illinois";
			String expectedLocation = "Online";
			String expectedOnline = "100% Online";
			boolean expectedGeneralRequirement = true;
			Integer expectedGeneralCategory = 1;
			boolean expectedFirstMajorRequirement = true;
			Integer expectedFirstMajorCategory = 1;
			boolean expectedSecondMajorRequirement = true;
			Integer expectedSecondMajorCategory = 1;
			boolean expectedThirdMajorRequirement = true;
			Integer expectedThirdMajorCategory = 1;
			boolean expectedFourthMajorRequirement = true;
			Integer expectedFourthMajorCategory = 1 ;
			boolean expectedFifthMajorRequirement = true;
			Integer expectedFifthMajorCategory = 1;
			boolean expectedSixthMajorRequirement = true;
			Integer expectedSixthMajorCategory = 1;
			boolean expectedSeventhMajorRequirement = true;
			Integer expectedSeventhMajorCategory = 1;
			boolean expectedEighthMajorRequirement = true;
			Integer expectedEighthMajorCategory = 1;
			boolean expectedNinthMajorRequirement = true;
			Integer expectedNinthMajorCategory = 1;
			boolean expectedTenthMajorRequirement = true;
			Integer expectedTenthMajorCategory = 1;
			boolean expectedFirstMinorRequirement = true;
			Integer expectedFirstMinorCategory = 1;
			boolean expectedSecondMinorRequirement = true;
			Integer expectedSecondMinorCategory = 1;
			boolean expectedThirdMinorRequirement = true;
			Integer expectedThirdMinorCategory = 1;
			boolean expectedFourthMinorRequirement = true;
			Integer expectedFourthMinorCategory = 1;
			boolean expectedFifthMinorRequirement = true;
			Integer expectedFifthMinorCategory = 1;
			boolean expectedSixthMinorRequirement = true;
			Integer expectedSixthMinorCategory = 1;
			boolean expectedSeventhMinorRequirement = true;
			Integer expectedSeventhMinorCategory = 1;
			boolean expectedEighthMinorRequirement = true;
			Integer expectedEighthMinorCategory = 1;
			boolean expectedNinthMinorRequirement = true;
			Integer expectedNinthMinorCategory = 1;
			boolean expectedTenthMinorRequirement = true;
			Integer expectedTenthMinorCategory = 1;
			boolean expectedFreeElective = true;
			boolean expectedCompleted = true;
			boolean expectedConsideringEnrollment = false;
			boolean expectedCurrentEnrollment = false;
			Double expectedCredits = 4.0;
			Double expectedGpaDesired = 4.0;
			Double expectedGpaEarned = 4.0;
			String expectedCourseStartDate = "05/21/2016";
			String expectedCourseEndDate = "08/02/2016";
			Integer expectedCoursePredictedDifficulty = 3;
			Integer expectedCoursePredictedWorkload = 3;
			Integer expectedPredictedEnjoyability = 3;
			String expectedRecommendedByWho = "Jana Diesner";
			String expectedNotRecommendedByWho = "Nobody";
			String expectedProfessionalSkills = "Programming Skills";
			String expectedAcademicSkills = "Logic Based Learning";
			CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 false, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			assertFalse(course1.equals(course2));
			assertFalse(course1 == course2);
	
		}
	
		@Test
		public void testAllFieldsEqualExceptFirstMajorCategory() {
			String expectedTitle = "Learning Java";
		    String expectedInstructor = "Dr. Kevin Trainor";
			String expectedSemester = "Fall";
			Integer expectedYear = 2016;
			String expectedDepartmentCode = "LIS";
			Integer expectedCourseNumber = 452;
			String expectedSectionNumber = "1";
			String expectedInstitution = "University of Illinois";
			String expectedLocation = "Online";
			String expectedOnline = "100% Online";
			boolean expectedGeneralRequirement = true;
			Integer expectedGeneralCategory = 1;
			boolean expectedFirstMajorRequirement = true;
			Integer expectedFirstMajorCategory = 1;
			boolean expectedSecondMajorRequirement = true;
			Integer expectedSecondMajorCategory = 1;
			boolean expectedThirdMajorRequirement = true;
			Integer expectedThirdMajorCategory = 1;
			boolean expectedFourthMajorRequirement = true;
			Integer expectedFourthMajorCategory = 1 ;
			boolean expectedFifthMajorRequirement = true;
			Integer expectedFifthMajorCategory = 1;
			boolean expectedSixthMajorRequirement = true;
			Integer expectedSixthMajorCategory = 1;
			boolean expectedSeventhMajorRequirement = true;
			Integer expectedSeventhMajorCategory = 1;
			boolean expectedEighthMajorRequirement = true;
			Integer expectedEighthMajorCategory = 1;
			boolean expectedNinthMajorRequirement = true;
			Integer expectedNinthMajorCategory = 1;
			boolean expectedTenthMajorRequirement = true;
			Integer expectedTenthMajorCategory = 1;
			boolean expectedFirstMinorRequirement = true;
			Integer expectedFirstMinorCategory = 1;
			boolean expectedSecondMinorRequirement = true;
			Integer expectedSecondMinorCategory = 1;
			boolean expectedThirdMinorRequirement = true;
			Integer expectedThirdMinorCategory = 1;
			boolean expectedFourthMinorRequirement = true;
			Integer expectedFourthMinorCategory = 1;
			boolean expectedFifthMinorRequirement = true;
			Integer expectedFifthMinorCategory = 1;
			boolean expectedSixthMinorRequirement = true;
			Integer expectedSixthMinorCategory = 1;
			boolean expectedSeventhMinorRequirement = true;
			Integer expectedSeventhMinorCategory = 1;
			boolean expectedEighthMinorRequirement = true;
			Integer expectedEighthMinorCategory = 1;
			boolean expectedNinthMinorRequirement = true;
			Integer expectedNinthMinorCategory = 1;
			boolean expectedTenthMinorRequirement = true;
			Integer expectedTenthMinorCategory = 1;
			boolean expectedFreeElective = true;
			boolean expectedCompleted = true;
			boolean expectedConsideringEnrollment = false;
			boolean expectedCurrentEnrollment = false;
			Double expectedCredits = 4.0;
			Double expectedGpaDesired = 4.0;
			Double expectedGpaEarned = 4.0;
			String expectedCourseStartDate = "05/21/2016";
			String expectedCourseEndDate = "08/02/2016";
			Integer expectedCoursePredictedDifficulty = 3;
			Integer expectedCoursePredictedWorkload = 3;
			Integer expectedPredictedEnjoyability = 3;
			String expectedRecommendedByWho = "Jana Diesner";
			String expectedNotRecommendedByWho = "Nobody";
			String expectedProfessionalSkills = "Programming Skills";
			String expectedAcademicSkills = "Logic Based Learning";
			CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, 2, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			assertFalse(course1.equals(course2));
			assertFalse(course1 == course2);
	
		}
	
		@Test
		public void testAllFieldsEqualExceptSecondMajorRequirement() {
			String expectedTitle = "Learning Java";
		    String expectedInstructor = "Dr. Kevin Trainor";
			String expectedSemester = "Fall";
			Integer expectedYear = 2016;
			String expectedDepartmentCode = "LIS";
			Integer expectedCourseNumber = 452;
			String expectedSectionNumber = "1";
			String expectedInstitution = "University of Illinois";
			String expectedLocation = "Online";
			String expectedOnline = "100% Online";
			boolean expectedGeneralRequirement = true;
			Integer expectedGeneralCategory = 1;
			boolean expectedFirstMajorRequirement = true;
			Integer expectedFirstMajorCategory = 1;
			boolean expectedSecondMajorRequirement = true;
			Integer expectedSecondMajorCategory = 1;
			boolean expectedThirdMajorRequirement = true;
			Integer expectedThirdMajorCategory = 1;
			boolean expectedFourthMajorRequirement = true;
			Integer expectedFourthMajorCategory = 1 ;
			boolean expectedFifthMajorRequirement = true;
			Integer expectedFifthMajorCategory = 1;
			boolean expectedSixthMajorRequirement = true;
			Integer expectedSixthMajorCategory = 1;
			boolean expectedSeventhMajorRequirement = true;
			Integer expectedSeventhMajorCategory = 1;
			boolean expectedEighthMajorRequirement = true;
			Integer expectedEighthMajorCategory = 1;
			boolean expectedNinthMajorRequirement = true;
			Integer expectedNinthMajorCategory = 1;
			boolean expectedTenthMajorRequirement = true;
			Integer expectedTenthMajorCategory = 1;
			boolean expectedFirstMinorRequirement = true;
			Integer expectedFirstMinorCategory = 1;
			boolean expectedSecondMinorRequirement = true;
			Integer expectedSecondMinorCategory = 1;
			boolean expectedThirdMinorRequirement = true;
			Integer expectedThirdMinorCategory = 1;
			boolean expectedFourthMinorRequirement = true;
			Integer expectedFourthMinorCategory = 1;
			boolean expectedFifthMinorRequirement = true;
			Integer expectedFifthMinorCategory = 1;
			boolean expectedSixthMinorRequirement = true;
			Integer expectedSixthMinorCategory = 1;
			boolean expectedSeventhMinorRequirement = true;
			Integer expectedSeventhMinorCategory = 1;
			boolean expectedEighthMinorRequirement = true;
			Integer expectedEighthMinorCategory = 1;
			boolean expectedNinthMinorRequirement = true;
			Integer expectedNinthMinorCategory = 1;
			boolean expectedTenthMinorRequirement = true;
			Integer expectedTenthMinorCategory = 1;
			boolean expectedFreeElective = true;
			boolean expectedCompleted = true;
			boolean expectedConsideringEnrollment = false;
			boolean expectedCurrentEnrollment = false;
			Double expectedCredits = 4.0;
			Double expectedGpaDesired = 4.0;
			Double expectedGpaEarned = 4.0;
			String expectedCourseStartDate = "05/21/2016";
			String expectedCourseEndDate = "08/02/2016";
			Integer expectedCoursePredictedDifficulty = 3;
			Integer expectedCoursePredictedWorkload = 3;
			Integer expectedPredictedEnjoyability = 3;
			String expectedRecommendedByWho = "Jana Diesner";
			String expectedNotRecommendedByWho = "Nobody";
			String expectedProfessionalSkills = "Programming Skills";
			String expectedAcademicSkills = "Logic Based Learning";
			CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 false, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			assertFalse(course1.equals(course2));
			assertFalse(course1 == course2);
	
		}
	
		@Test
		public void testAllFieldsEqualExceptSecondMajorCategory() {
			String expectedTitle = "Learning Java";
		    String expectedInstructor = "Dr. Kevin Trainor";
			String expectedSemester = "Fall";
			Integer expectedYear = 2016;
			String expectedDepartmentCode = "LIS";
			Integer expectedCourseNumber = 452;
			String expectedSectionNumber = "1";
			String expectedInstitution = "University of Illinois";
			String expectedLocation = "Online";
			String expectedOnline = "100% Online";
			boolean expectedGeneralRequirement = true;
			Integer expectedGeneralCategory = 1;
			boolean expectedFirstMajorRequirement = true;
			Integer expectedFirstMajorCategory = 1;
			boolean expectedSecondMajorRequirement = true;
			Integer expectedSecondMajorCategory = 1;
			boolean expectedThirdMajorRequirement = true;
			Integer expectedThirdMajorCategory = 1;
			boolean expectedFourthMajorRequirement = true;
			Integer expectedFourthMajorCategory = 1 ;
			boolean expectedFifthMajorRequirement = true;
			Integer expectedFifthMajorCategory = 1;
			boolean expectedSixthMajorRequirement = true;
			Integer expectedSixthMajorCategory = 1;
			boolean expectedSeventhMajorRequirement = true;
			Integer expectedSeventhMajorCategory = 1;
			boolean expectedEighthMajorRequirement = true;
			Integer expectedEighthMajorCategory = 1;
			boolean expectedNinthMajorRequirement = true;
			Integer expectedNinthMajorCategory = 1;
			boolean expectedTenthMajorRequirement = true;
			Integer expectedTenthMajorCategory = 1;
			boolean expectedFirstMinorRequirement = true;
			Integer expectedFirstMinorCategory = 1;
			boolean expectedSecondMinorRequirement = true;
			Integer expectedSecondMinorCategory = 1;
			boolean expectedThirdMinorRequirement = true;
			Integer expectedThirdMinorCategory = 1;
			boolean expectedFourthMinorRequirement = true;
			Integer expectedFourthMinorCategory = 1;
			boolean expectedFifthMinorRequirement = true;
			Integer expectedFifthMinorCategory = 1;
			boolean expectedSixthMinorRequirement = true;
			Integer expectedSixthMinorCategory = 1;
			boolean expectedSeventhMinorRequirement = true;
			Integer expectedSeventhMinorCategory = 1;
			boolean expectedEighthMinorRequirement = true;
			Integer expectedEighthMinorCategory = 1;
			boolean expectedNinthMinorRequirement = true;
			Integer expectedNinthMinorCategory = 1;
			boolean expectedTenthMinorRequirement = true;
			Integer expectedTenthMinorCategory = 1;
			boolean expectedFreeElective = true;
			boolean expectedCompleted = true;
			boolean expectedConsideringEnrollment = false;
			boolean expectedCurrentEnrollment = false;
			Double expectedCredits = 4.0;
			Double expectedGpaDesired = 4.0;
			Double expectedGpaEarned = 4.0;
			String expectedCourseStartDate = "05/21/2016";
			String expectedCourseEndDate = "08/02/2016";
			Integer expectedCoursePredictedDifficulty = 3;
			Integer expectedCoursePredictedWorkload = 3;
			Integer expectedPredictedEnjoyability = 3;
			String expectedRecommendedByWho = "Jana Diesner";
			String expectedNotRecommendedByWho = "Nobody";
			String expectedProfessionalSkills = "Programming Skills";
			String expectedAcademicSkills = "Logic Based Learning";
			CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, 2,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			assertFalse(course1.equals(course2));
			assertFalse(course1 == course2);
	
		}
	
		@Test
		public void testAllFieldsEqualExceptThirdMajorRequirement() {
			String expectedTitle = "Learning Java";
		    String expectedInstructor = "Dr. Kevin Trainor";
			String expectedSemester = "Fall";
			Integer expectedYear = 2016;
			String expectedDepartmentCode = "LIS";
			Integer expectedCourseNumber = 452;
			String expectedSectionNumber = "1";
			String expectedInstitution = "University of Illinois";
			String expectedLocation = "Online";
			String expectedOnline = "100% Online";
			boolean expectedGeneralRequirement = true;
			Integer expectedGeneralCategory = 1;
			boolean expectedFirstMajorRequirement = true;
			Integer expectedFirstMajorCategory = 1;
			boolean expectedSecondMajorRequirement = true;
			Integer expectedSecondMajorCategory = 1;
			boolean expectedThirdMajorRequirement = true;
			Integer expectedThirdMajorCategory = 1;
			boolean expectedFourthMajorRequirement = true;
			Integer expectedFourthMajorCategory = 1 ;
			boolean expectedFifthMajorRequirement = true;
			Integer expectedFifthMajorCategory = 1;
			boolean expectedSixthMajorRequirement = true;
			Integer expectedSixthMajorCategory = 1;
			boolean expectedSeventhMajorRequirement = true;
			Integer expectedSeventhMajorCategory = 1;
			boolean expectedEighthMajorRequirement = true;
			Integer expectedEighthMajorCategory = 1;
			boolean expectedNinthMajorRequirement = true;
			Integer expectedNinthMajorCategory = 1;
			boolean expectedTenthMajorRequirement = true;
			Integer expectedTenthMajorCategory = 1;
			boolean expectedFirstMinorRequirement = true;
			Integer expectedFirstMinorCategory = 1;
			boolean expectedSecondMinorRequirement = true;
			Integer expectedSecondMinorCategory = 1;
			boolean expectedThirdMinorRequirement = true;
			Integer expectedThirdMinorCategory = 1;
			boolean expectedFourthMinorRequirement = true;
			Integer expectedFourthMinorCategory = 1;
			boolean expectedFifthMinorRequirement = true;
			Integer expectedFifthMinorCategory = 1;
			boolean expectedSixthMinorRequirement = true;
			Integer expectedSixthMinorCategory = 1;
			boolean expectedSeventhMinorRequirement = true;
			Integer expectedSeventhMinorCategory = 1;
			boolean expectedEighthMinorRequirement = true;
			Integer expectedEighthMinorCategory = 1;
			boolean expectedNinthMinorRequirement = true;
			Integer expectedNinthMinorCategory = 1;
			boolean expectedTenthMinorRequirement = true;
			Integer expectedTenthMinorCategory = 1;
			boolean expectedFreeElective = true;
			boolean expectedCompleted = true;
			boolean expectedConsideringEnrollment = false;
			boolean expectedCurrentEnrollment = false;
			Double expectedCredits = 4.0;
			Double expectedGpaDesired = 4.0;
			Double expectedGpaEarned = 4.0;
			String expectedCourseStartDate = "05/21/2016";
			String expectedCourseEndDate = "08/02/2016";
			Integer expectedCoursePredictedDifficulty = 3;
			Integer expectedCoursePredictedWorkload = 3;
			Integer expectedPredictedEnjoyability = 3;
			String expectedRecommendedByWho = "Jana Diesner";
			String expectedNotRecommendedByWho = "Nobody";
			String expectedProfessionalSkills = "Programming Skills";
			String expectedAcademicSkills = "Logic Based Learning";
			CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 false, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			assertFalse(course1.equals(course2));
			assertFalse(course1 == course2);
	
		}
	
		@Test
		public void testAllFieldsEqualExceptThirdMajorCategory() {
			String expectedTitle = "Learning Java";
		    String expectedInstructor = "Dr. Kevin Trainor";
			String expectedSemester = "Fall";
			Integer expectedYear = 2016;
			String expectedDepartmentCode = "LIS";
			Integer expectedCourseNumber = 452;
			String expectedSectionNumber = "1";
			String expectedInstitution = "University of Illinois";
			String expectedLocation = "Online";
			String expectedOnline = "100% Online";
			boolean expectedGeneralRequirement = true;
			Integer expectedGeneralCategory = 1;
			boolean expectedFirstMajorRequirement = true;
			Integer expectedFirstMajorCategory = 1;
			boolean expectedSecondMajorRequirement = true;
			Integer expectedSecondMajorCategory = 1;
			boolean expectedThirdMajorRequirement = true;
			Integer expectedThirdMajorCategory = 1;
			boolean expectedFourthMajorRequirement = true;
			Integer expectedFourthMajorCategory = 1 ;
			boolean expectedFifthMajorRequirement = true;
			Integer expectedFifthMajorCategory = 1;
			boolean expectedSixthMajorRequirement = true;
			Integer expectedSixthMajorCategory = 1;
			boolean expectedSeventhMajorRequirement = true;
			Integer expectedSeventhMajorCategory = 1;
			boolean expectedEighthMajorRequirement = true;
			Integer expectedEighthMajorCategory = 1;
			boolean expectedNinthMajorRequirement = true;
			Integer expectedNinthMajorCategory = 1;
			boolean expectedTenthMajorRequirement = true;
			Integer expectedTenthMajorCategory = 1;
			boolean expectedFirstMinorRequirement = true;
			Integer expectedFirstMinorCategory = 1;
			boolean expectedSecondMinorRequirement = true;
			Integer expectedSecondMinorCategory = 1;
			boolean expectedThirdMinorRequirement = true;
			Integer expectedThirdMinorCategory = 1;
			boolean expectedFourthMinorRequirement = true;
			Integer expectedFourthMinorCategory = 1;
			boolean expectedFifthMinorRequirement = true;
			Integer expectedFifthMinorCategory = 1;
			boolean expectedSixthMinorRequirement = true;
			Integer expectedSixthMinorCategory = 1;
			boolean expectedSeventhMinorRequirement = true;
			Integer expectedSeventhMinorCategory = 1;
			boolean expectedEighthMinorRequirement = true;
			Integer expectedEighthMinorCategory = 1;
			boolean expectedNinthMinorRequirement = true;
			Integer expectedNinthMinorCategory = 1;
			boolean expectedTenthMinorRequirement = true;
			Integer expectedTenthMinorCategory = 1;
			boolean expectedFreeElective = true;
			boolean expectedCompleted = true;
			boolean expectedConsideringEnrollment = false;
			boolean expectedCurrentEnrollment = false;
			Double expectedCredits = 4.0;
			Double expectedGpaDesired = 4.0;
			Double expectedGpaEarned = 4.0;
			String expectedCourseStartDate = "05/21/2016";
			String expectedCourseEndDate = "08/02/2016";
			Integer expectedCoursePredictedDifficulty = 3;
			Integer expectedCoursePredictedWorkload = 3;
			Integer expectedPredictedEnjoyability = 3;
			String expectedRecommendedByWho = "Jana Diesner";
			String expectedNotRecommendedByWho = "Nobody";
			String expectedProfessionalSkills = "Programming Skills";
			String expectedAcademicSkills = "Logic Based Learning";
			CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, 2, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			assertFalse(course1.equals(course2));
			assertFalse(course1 == course2);
	
		}
		
		@Test
		public void testAllFieldsEqualExceptFourthMajorRequirement() {
			String expectedTitle = "Learning Java";
		    String expectedInstructor = "Dr. Kevin Trainor";
			String expectedSemester = "Fall";
			Integer expectedYear = 2016;
			String expectedDepartmentCode = "LIS";
			Integer expectedCourseNumber = 452;
			String expectedSectionNumber = "1";
			String expectedInstitution = "University of Illinois";
			String expectedLocation = "Online";
			String expectedOnline = "100% Online";
			boolean expectedGeneralRequirement = true;
			Integer expectedGeneralCategory = 1;
			boolean expectedFirstMajorRequirement = true;
			Integer expectedFirstMajorCategory = 1;
			boolean expectedSecondMajorRequirement = true;
			Integer expectedSecondMajorCategory = 1;
			boolean expectedThirdMajorRequirement = true;
			Integer expectedThirdMajorCategory = 1;
			boolean expectedFourthMajorRequirement = true;
			Integer expectedFourthMajorCategory = 1 ;
			boolean expectedFifthMajorRequirement = true;
			Integer expectedFifthMajorCategory = 1;
			boolean expectedSixthMajorRequirement = true;
			Integer expectedSixthMajorCategory = 1;
			boolean expectedSeventhMajorRequirement = true;
			Integer expectedSeventhMajorCategory = 1;
			boolean expectedEighthMajorRequirement = true;
			Integer expectedEighthMajorCategory = 1;
			boolean expectedNinthMajorRequirement = true;
			Integer expectedNinthMajorCategory = 1;
			boolean expectedTenthMajorRequirement = true;
			Integer expectedTenthMajorCategory = 1;
			boolean expectedFirstMinorRequirement = true;
			Integer expectedFirstMinorCategory = 1;
			boolean expectedSecondMinorRequirement = true;
			Integer expectedSecondMinorCategory = 1;
			boolean expectedThirdMinorRequirement = true;
			Integer expectedThirdMinorCategory = 1;
			boolean expectedFourthMinorRequirement = true;
			Integer expectedFourthMinorCategory = 1;
			boolean expectedFifthMinorRequirement = true;
			Integer expectedFifthMinorCategory = 1;
			boolean expectedSixthMinorRequirement = true;
			Integer expectedSixthMinorCategory = 1;
			boolean expectedSeventhMinorRequirement = true;
			Integer expectedSeventhMinorCategory = 1;
			boolean expectedEighthMinorRequirement = true;
			Integer expectedEighthMinorCategory = 1;
			boolean expectedNinthMinorRequirement = true;
			Integer expectedNinthMinorCategory = 1;
			boolean expectedTenthMinorRequirement = true;
			Integer expectedTenthMinorCategory = 1;
			boolean expectedFreeElective = true;
			boolean expectedCompleted = true;
			boolean expectedConsideringEnrollment = false;
			boolean expectedCurrentEnrollment = false;
			Double expectedCredits = 4.0;
			Double expectedGpaDesired = 4.0;
			Double expectedGpaEarned = 4.0;
			String expectedCourseStartDate = "05/21/2016";
			String expectedCourseEndDate = "08/02/2016";
			Integer expectedCoursePredictedDifficulty = 3;
			Integer expectedCoursePredictedWorkload = 3;
			Integer expectedPredictedEnjoyability = 3;
			String expectedRecommendedByWho = "Jana Diesner";
			String expectedNotRecommendedByWho = "Nobody";
			String expectedProfessionalSkills = "Programming Skills";
			String expectedAcademicSkills = "Logic Based Learning";
			CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 false, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			assertFalse(course1.equals(course2));
			assertFalse(course1 == course2);
	
		}
	
		@Test
		public void testAllFieldsEqualExceptFourthMajorCategorye() {
			String expectedTitle = "Learning Java";
		    String expectedInstructor = "Dr. Kevin Trainor";
			String expectedSemester = "Fall";
			Integer expectedYear = 2016;
			String expectedDepartmentCode = "LIS";
			Integer expectedCourseNumber = 452;
			String expectedSectionNumber = "1";
			String expectedInstitution = "University of Illinois";
			String expectedLocation = "Online";
			String expectedOnline = "100% Online";
			boolean expectedGeneralRequirement = true;
			Integer expectedGeneralCategory = 1;
			boolean expectedFirstMajorRequirement = true;
			Integer expectedFirstMajorCategory = 1;
			boolean expectedSecondMajorRequirement = true;
			Integer expectedSecondMajorCategory = 1;
			boolean expectedThirdMajorRequirement = true;
			Integer expectedThirdMajorCategory = 1;
			boolean expectedFourthMajorRequirement = true;
			Integer expectedFourthMajorCategory = 1 ;
			boolean expectedFifthMajorRequirement = true;
			Integer expectedFifthMajorCategory = 1;
			boolean expectedSixthMajorRequirement = true;
			Integer expectedSixthMajorCategory = 1;
			boolean expectedSeventhMajorRequirement = true;
			Integer expectedSeventhMajorCategory = 1;
			boolean expectedEighthMajorRequirement = true;
			Integer expectedEighthMajorCategory = 1;
			boolean expectedNinthMajorRequirement = true;
			Integer expectedNinthMajorCategory = 1;
			boolean expectedTenthMajorRequirement = true;
			Integer expectedTenthMajorCategory = 1;
			boolean expectedFirstMinorRequirement = true;
			Integer expectedFirstMinorCategory = 1;
			boolean expectedSecondMinorRequirement = true;
			Integer expectedSecondMinorCategory = 1;
			boolean expectedThirdMinorRequirement = true;
			Integer expectedThirdMinorCategory = 1;
			boolean expectedFourthMinorRequirement = true;
			Integer expectedFourthMinorCategory = 1;
			boolean expectedFifthMinorRequirement = true;
			Integer expectedFifthMinorCategory = 1;
			boolean expectedSixthMinorRequirement = true;
			Integer expectedSixthMinorCategory = 1;
			boolean expectedSeventhMinorRequirement = true;
			Integer expectedSeventhMinorCategory = 1;
			boolean expectedEighthMinorRequirement = true;
			Integer expectedEighthMinorCategory = 1;
			boolean expectedNinthMinorRequirement = true;
			Integer expectedNinthMinorCategory = 1;
			boolean expectedTenthMinorRequirement = true;
			Integer expectedTenthMinorCategory = 1;
			boolean expectedFreeElective = true;
			boolean expectedCompleted = true;
			boolean expectedConsideringEnrollment = false;
			boolean expectedCurrentEnrollment = false;
			Double expectedCredits = 4.0;
			Double expectedGpaDesired = 4.0;
			Double expectedGpaEarned = 4.0;
			String expectedCourseStartDate = "05/21/2016";
			String expectedCourseEndDate = "08/02/2016";
			Integer expectedCoursePredictedDifficulty = 3;
			Integer expectedCoursePredictedWorkload = 3;
			Integer expectedPredictedEnjoyability = 3;
			String expectedRecommendedByWho = "Jana Diesner";
			String expectedNotRecommendedByWho = "Nobody";
			String expectedProfessionalSkills = "Programming Skills";
			String expectedAcademicSkills = "Logic Based Learning";
			CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, 2,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			assertFalse(course1.equals(course2));
			assertFalse(course1 == course2);
	
		}
	
		@Test
		public void testAllFieldsEqualExceptFifthMajorRequirement() {
			String expectedTitle = "Learning Java";
		    String expectedInstructor = "Dr. Kevin Trainor";
			String expectedSemester = "Fall";
			Integer expectedYear = 2016;
			String expectedDepartmentCode = "LIS";
			Integer expectedCourseNumber = 452;
			String expectedSectionNumber = "1";
			String expectedInstitution = "University of Illinois";
			String expectedLocation = "Online";
			String expectedOnline = "100% Online";
			boolean expectedGeneralRequirement = true;
			Integer expectedGeneralCategory = 1;
			boolean expectedFirstMajorRequirement = true;
			Integer expectedFirstMajorCategory = 1;
			boolean expectedSecondMajorRequirement = true;
			Integer expectedSecondMajorCategory = 1;
			boolean expectedThirdMajorRequirement = true;
			Integer expectedThirdMajorCategory = 1;
			boolean expectedFourthMajorRequirement = true;
			Integer expectedFourthMajorCategory = 1 ;
			boolean expectedFifthMajorRequirement = true;
			Integer expectedFifthMajorCategory = 1;
			boolean expectedSixthMajorRequirement = true;
			Integer expectedSixthMajorCategory = 1;
			boolean expectedSeventhMajorRequirement = true;
			Integer expectedSeventhMajorCategory = 1;
			boolean expectedEighthMajorRequirement = true;
			Integer expectedEighthMajorCategory = 1;
			boolean expectedNinthMajorRequirement = true;
			Integer expectedNinthMajorCategory = 1;
			boolean expectedTenthMajorRequirement = true;
			Integer expectedTenthMajorCategory = 1;
			boolean expectedFirstMinorRequirement = true;
			Integer expectedFirstMinorCategory = 1;
			boolean expectedSecondMinorRequirement = true;
			Integer expectedSecondMinorCategory = 1;
			boolean expectedThirdMinorRequirement = true;
			Integer expectedThirdMinorCategory = 1;
			boolean expectedFourthMinorRequirement = true;
			Integer expectedFourthMinorCategory = 1;
			boolean expectedFifthMinorRequirement = true;
			Integer expectedFifthMinorCategory = 1;
			boolean expectedSixthMinorRequirement = true;
			Integer expectedSixthMinorCategory = 1;
			boolean expectedSeventhMinorRequirement = true;
			Integer expectedSeventhMinorCategory = 1;
			boolean expectedEighthMinorRequirement = true;
			Integer expectedEighthMinorCategory = 1;
			boolean expectedNinthMinorRequirement = true;
			Integer expectedNinthMinorCategory = 1;
			boolean expectedTenthMinorRequirement = true;
			Integer expectedTenthMinorCategory = 1;
			boolean expectedFreeElective = true;
			boolean expectedCompleted = true;
			boolean expectedConsideringEnrollment = false;
			boolean expectedCurrentEnrollment = false;
			Double expectedCredits = 4.0;
			Double expectedGpaDesired = 4.0;
			Double expectedGpaEarned = 4.0;
			String expectedCourseStartDate = "05/21/2016";
			String expectedCourseEndDate = "08/02/2016";
			Integer expectedCoursePredictedDifficulty = 3;
			Integer expectedCoursePredictedWorkload = 3;
			Integer expectedPredictedEnjoyability = 3;
			String expectedRecommendedByWho = "Jana Diesner";
			String expectedNotRecommendedByWho = "Nobody";
			String expectedProfessionalSkills = "Programming Skills";
			String expectedAcademicSkills = "Logic Based Learning";
			CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 false,  expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			assertFalse(course1.equals(course2));
			assertFalse(course1 == course2);
	
		}
		
		@Test
		public void testAllFieldsEqualExceptFifthMajorCategory() {
			String expectedTitle = "Learning Java";
		    String expectedInstructor = "Dr. Kevin Trainor";
			String expectedSemester = "Fall";
			Integer expectedYear = 2016;
			String expectedDepartmentCode = "LIS";
			Integer expectedCourseNumber = 452;
			String expectedSectionNumber = "1";
			String expectedInstitution = "University of Illinois";
			String expectedLocation = "Online";
			String expectedOnline = "100% Online";
			boolean expectedGeneralRequirement = true;
			Integer expectedGeneralCategory = 1;
			boolean expectedFirstMajorRequirement = true;
			Integer expectedFirstMajorCategory = 1;
			boolean expectedSecondMajorRequirement = true;
			Integer expectedSecondMajorCategory = 1;
			boolean expectedThirdMajorRequirement = true;
			Integer expectedThirdMajorCategory = 1;
			boolean expectedFourthMajorRequirement = true;
			Integer expectedFourthMajorCategory = 1 ;
			boolean expectedFifthMajorRequirement = true;
			Integer expectedFifthMajorCategory = 1;
			boolean expectedSixthMajorRequirement = true;
			Integer expectedSixthMajorCategory = 1;
			boolean expectedSeventhMajorRequirement = true;
			Integer expectedSeventhMajorCategory = 1;
			boolean expectedEighthMajorRequirement = true;
			Integer expectedEighthMajorCategory = 1;
			boolean expectedNinthMajorRequirement = true;
			Integer expectedNinthMajorCategory = 1;
			boolean expectedTenthMajorRequirement = true;
			Integer expectedTenthMajorCategory = 1;
			boolean expectedFirstMinorRequirement = true;
			Integer expectedFirstMinorCategory = 1;
			boolean expectedSecondMinorRequirement = true;
			Integer expectedSecondMinorCategory = 1;
			boolean expectedThirdMinorRequirement = true;
			Integer expectedThirdMinorCategory = 1;
			boolean expectedFourthMinorRequirement = true;
			Integer expectedFourthMinorCategory = 1;
			boolean expectedFifthMinorRequirement = true;
			Integer expectedFifthMinorCategory = 1;
			boolean expectedSixthMinorRequirement = true;
			Integer expectedSixthMinorCategory = 1;
			boolean expectedSeventhMinorRequirement = true;
			Integer expectedSeventhMinorCategory = 1;
			boolean expectedEighthMinorRequirement = true;
			Integer expectedEighthMinorCategory = 1;
			boolean expectedNinthMinorRequirement = true;
			Integer expectedNinthMinorCategory = 1;
			boolean expectedTenthMinorRequirement = true;
			Integer expectedTenthMinorCategory = 1;
			boolean expectedFreeElective = true;
			boolean expectedCompleted = true;
			boolean expectedConsideringEnrollment = false;
			boolean expectedCurrentEnrollment = false;
			Double expectedCredits = 4.0;
			Double expectedGpaDesired = 4.0;
			Double expectedGpaEarned = 4.0;
			String expectedCourseStartDate = "05/21/2016";
			String expectedCourseEndDate = "08/02/2016";
			Integer expectedCoursePredictedDifficulty = 3;
			Integer expectedCoursePredictedWorkload = 3;
			Integer expectedPredictedEnjoyability = 3;
			String expectedRecommendedByWho = "Jana Diesner";
			String expectedNotRecommendedByWho = "Nobody";
			String expectedProfessionalSkills = "Programming Skills";
			String expectedAcademicSkills = "Logic Based Learning";
			CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, 2, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			assertFalse(course1.equals(course2));
			assertFalse(course1 == course2);
	
		}
		
		@Test
		public void testAllFieldsEqualExceptSixthMajorRequirement() {
			String expectedTitle = "Learning Java";
		    String expectedInstructor = "Dr. Kevin Trainor";
			String expectedSemester = "Fall";
			Integer expectedYear = 2016;
			String expectedDepartmentCode = "LIS";
			Integer expectedCourseNumber = 452;
			String expectedSectionNumber = "1";
			String expectedInstitution = "University of Illinois";
			String expectedLocation = "Online";
			String expectedOnline = "100% Online";
			boolean expectedGeneralRequirement = true;
			Integer expectedGeneralCategory = 1;
			boolean expectedFirstMajorRequirement = true;
			Integer expectedFirstMajorCategory = 1;
			boolean expectedSecondMajorRequirement = true;
			Integer expectedSecondMajorCategory = 1;
			boolean expectedThirdMajorRequirement = true;
			Integer expectedThirdMajorCategory = 1;
			boolean expectedFourthMajorRequirement = true;
			Integer expectedFourthMajorCategory = 1 ;
			boolean expectedFifthMajorRequirement = true;
			Integer expectedFifthMajorCategory = 1;
			boolean expectedSixthMajorRequirement = true;
			Integer expectedSixthMajorCategory = 1;
			boolean expectedSeventhMajorRequirement = true;
			Integer expectedSeventhMajorCategory = 1;
			boolean expectedEighthMajorRequirement = true;
			Integer expectedEighthMajorCategory = 1;
			boolean expectedNinthMajorRequirement = true;
			Integer expectedNinthMajorCategory = 1;
			boolean expectedTenthMajorRequirement = true;
			Integer expectedTenthMajorCategory = 1;
			boolean expectedFirstMinorRequirement = true;
			Integer expectedFirstMinorCategory = 1;
			boolean expectedSecondMinorRequirement = true;
			Integer expectedSecondMinorCategory = 1;
			boolean expectedThirdMinorRequirement = true;
			Integer expectedThirdMinorCategory = 1;
			boolean expectedFourthMinorRequirement = true;
			Integer expectedFourthMinorCategory = 1;
			boolean expectedFifthMinorRequirement = true;
			Integer expectedFifthMinorCategory = 1;
			boolean expectedSixthMinorRequirement = true;
			Integer expectedSixthMinorCategory = 1;
			boolean expectedSeventhMinorRequirement = true;
			Integer expectedSeventhMinorCategory = 1;
			boolean expectedEighthMinorRequirement = true;
			Integer expectedEighthMinorCategory = 1;
			boolean expectedNinthMinorRequirement = true;
			Integer expectedNinthMinorCategory = 1;
			boolean expectedTenthMinorRequirement = true;
			Integer expectedTenthMinorCategory = 1;
			boolean expectedFreeElective = true;
			boolean expectedCompleted = true;
			boolean expectedConsideringEnrollment = false;
			boolean expectedCurrentEnrollment = false;
			Double expectedCredits = 4.0;
			Double expectedGpaDesired = 4.0;
			Double expectedGpaEarned = 4.0;
			String expectedCourseStartDate = "05/21/2016";
			String expectedCourseEndDate = "08/02/2016";
			Integer expectedCoursePredictedDifficulty = 3;
			Integer expectedCoursePredictedWorkload = 3;
			Integer expectedPredictedEnjoyability = 3;
			String expectedRecommendedByWho = "Jana Diesner";
			String expectedNotRecommendedByWho = "Nobody";
			String expectedProfessionalSkills = "Programming Skills";
			String expectedAcademicSkills = "Logic Based Learning";
			CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 false, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			assertFalse(course1.equals(course2));
			assertFalse(course1 == course2);
	
		}
	
		@Test
		public void testAllFieldsEqualExceptSixthMajorCategory() {
			String expectedTitle = "Learning Java";
		    String expectedInstructor = "Dr. Kevin Trainor";
			String expectedSemester = "Fall";
			Integer expectedYear = 2016;
			String expectedDepartmentCode = "LIS";
			Integer expectedCourseNumber = 452;
			String expectedSectionNumber = "1";
			String expectedInstitution = "University of Illinois";
			String expectedLocation = "Online";
			String expectedOnline = "100% Online";
			boolean expectedGeneralRequirement = true;
			Integer expectedGeneralCategory = 1;
			boolean expectedFirstMajorRequirement = true;
			Integer expectedFirstMajorCategory = 1;
			boolean expectedSecondMajorRequirement = true;
			Integer expectedSecondMajorCategory = 1;
			boolean expectedThirdMajorRequirement = true;
			Integer expectedThirdMajorCategory = 1;
			boolean expectedFourthMajorRequirement = true;
			Integer expectedFourthMajorCategory = 1 ;
			boolean expectedFifthMajorRequirement = true;
			Integer expectedFifthMajorCategory = 1;
			boolean expectedSixthMajorRequirement = true;
			Integer expectedSixthMajorCategory = 1;
			boolean expectedSeventhMajorRequirement = true;
			Integer expectedSeventhMajorCategory = 1;
			boolean expectedEighthMajorRequirement = true;
			Integer expectedEighthMajorCategory = 1;
			boolean expectedNinthMajorRequirement = true;
			Integer expectedNinthMajorCategory = 1;
			boolean expectedTenthMajorRequirement = true;
			Integer expectedTenthMajorCategory = 1;
			boolean expectedFirstMinorRequirement = true;
			Integer expectedFirstMinorCategory = 1;
			boolean expectedSecondMinorRequirement = true;
			Integer expectedSecondMinorCategory = 1;
			boolean expectedThirdMinorRequirement = true;
			Integer expectedThirdMinorCategory = 1;
			boolean expectedFourthMinorRequirement = true;
			Integer expectedFourthMinorCategory = 1;
			boolean expectedFifthMinorRequirement = true;
			Integer expectedFifthMinorCategory = 1;
			boolean expectedSixthMinorRequirement = true;
			Integer expectedSixthMinorCategory = 1;
			boolean expectedSeventhMinorRequirement = true;
			Integer expectedSeventhMinorCategory = 1;
			boolean expectedEighthMinorRequirement = true;
			Integer expectedEighthMinorCategory = 1;
			boolean expectedNinthMinorRequirement = true;
			Integer expectedNinthMinorCategory = 1;
			boolean expectedTenthMinorRequirement = true;
			Integer expectedTenthMinorCategory = 1;
			boolean expectedFreeElective = true;
			boolean expectedCompleted = true;
			boolean expectedConsideringEnrollment = false;
			boolean expectedCurrentEnrollment = false;
			Double expectedCredits = 4.0;
			Double expectedGpaDesired = 4.0;
			Double expectedGpaEarned = 4.0;
			String expectedCourseStartDate = "05/21/2016";
			String expectedCourseEndDate = "08/02/2016";
			Integer expectedCoursePredictedDifficulty = 3;
			Integer expectedCoursePredictedWorkload = 3;
			Integer expectedPredictedEnjoyability = 3;
			String expectedRecommendedByWho = "Jana Diesner";
			String expectedNotRecommendedByWho = "Nobody";
			String expectedProfessionalSkills = "Programming Skills";
			String expectedAcademicSkills = "Logic Based Learning";
			CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, 2, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			assertFalse(course1.equals(course2));
			assertFalse(course1 == course2);
	
		}

		@Test
		public void testAllFieldsEqualExceptSeventhMajorRequirement() {
			String expectedTitle = "Learning Java";
		    String expectedInstructor = "Dr. Kevin Trainor";
			String expectedSemester = "Fall";
			Integer expectedYear = 2016;
			String expectedDepartmentCode = "LIS";
			Integer expectedCourseNumber = 452;
			String expectedSectionNumber = "1";
			String expectedInstitution = "University of Illinois";
			String expectedLocation = "Online";
			String expectedOnline = "100% Online";
			boolean expectedGeneralRequirement = true;
			Integer expectedGeneralCategory = 1;
			boolean expectedFirstMajorRequirement = true;
			Integer expectedFirstMajorCategory = 1;
			boolean expectedSecondMajorRequirement = true;
			Integer expectedSecondMajorCategory = 1;
			boolean expectedThirdMajorRequirement = true;
			Integer expectedThirdMajorCategory = 1;
			boolean expectedFourthMajorRequirement = true;
			Integer expectedFourthMajorCategory = 1 ;
			boolean expectedFifthMajorRequirement = true;
			Integer expectedFifthMajorCategory = 1;
			boolean expectedSixthMajorRequirement = true;
			Integer expectedSixthMajorCategory = 1;
			boolean expectedSeventhMajorRequirement = true;
			Integer expectedSeventhMajorCategory = 1;
			boolean expectedEighthMajorRequirement = true;
			Integer expectedEighthMajorCategory = 1;
			boolean expectedNinthMajorRequirement = true;
			Integer expectedNinthMajorCategory = 1;
			boolean expectedTenthMajorRequirement = true;
			Integer expectedTenthMajorCategory = 1;
			boolean expectedFirstMinorRequirement = true;
			Integer expectedFirstMinorCategory = 1;
			boolean expectedSecondMinorRequirement = true;
			Integer expectedSecondMinorCategory = 1;
			boolean expectedThirdMinorRequirement = true;
			Integer expectedThirdMinorCategory = 1;
			boolean expectedFourthMinorRequirement = true;
			Integer expectedFourthMinorCategory = 1;
			boolean expectedFifthMinorRequirement = true;
			Integer expectedFifthMinorCategory = 1;
			boolean expectedSixthMinorRequirement = true;
			Integer expectedSixthMinorCategory = 1;
			boolean expectedSeventhMinorRequirement = true;
			Integer expectedSeventhMinorCategory = 1;
			boolean expectedEighthMinorRequirement = true;
			Integer expectedEighthMinorCategory = 1;
			boolean expectedNinthMinorRequirement = true;
			Integer expectedNinthMinorCategory = 1;
			boolean expectedTenthMinorRequirement = true;
			Integer expectedTenthMinorCategory = 1;
			boolean expectedFreeElective = true;
			boolean expectedCompleted = true;
			boolean expectedConsideringEnrollment = false;
			boolean expectedCurrentEnrollment = false;
			Double expectedCredits = 4.0;
			Double expectedGpaDesired = 4.0;
			Double expectedGpaEarned = 4.0;
			String expectedCourseStartDate = "05/21/2016";
			String expectedCourseEndDate = "08/02/2016";
			Integer expectedCoursePredictedDifficulty = 3;
			Integer expectedCoursePredictedWorkload = 3;
			Integer expectedPredictedEnjoyability = 3;
			String expectedRecommendedByWho = "Jana Diesner";
			String expectedNotRecommendedByWho = "Nobody";
			String expectedProfessionalSkills = "Programming Skills";
			String expectedAcademicSkills = "Logic Based Learning";
			CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 false, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			assertFalse(course1.equals(course2));
			assertFalse(course1 == course2);
	
		}
	
		@Test
		public void testAllFieldsEqualExceptSeventhMajorCategory() {
			String expectedTitle = "Learning Java";
		    String expectedInstructor = "Dr. Kevin Trainor";
			String expectedSemester = "Fall";
			Integer expectedYear = 2016;
			String expectedDepartmentCode = "LIS";
			Integer expectedCourseNumber = 452;
			String expectedSectionNumber = "1";
			String expectedInstitution = "University of Illinois";
			String expectedLocation = "Online";
			String expectedOnline = "100% Online";
			boolean expectedGeneralRequirement = true;
			Integer expectedGeneralCategory = 1;
			boolean expectedFirstMajorRequirement = true;
			Integer expectedFirstMajorCategory = 1;
			boolean expectedSecondMajorRequirement = true;
			Integer expectedSecondMajorCategory = 1;
			boolean expectedThirdMajorRequirement = true;
			Integer expectedThirdMajorCategory = 1;
			boolean expectedFourthMajorRequirement = true;
			Integer expectedFourthMajorCategory = 1 ;
			boolean expectedFifthMajorRequirement = true;
			Integer expectedFifthMajorCategory = 1;
			boolean expectedSixthMajorRequirement = true;
			Integer expectedSixthMajorCategory = 1;
			boolean expectedSeventhMajorRequirement = true;
			Integer expectedSeventhMajorCategory = 1;
			boolean expectedEighthMajorRequirement = true;
			Integer expectedEighthMajorCategory = 1;
			boolean expectedNinthMajorRequirement = true;
			Integer expectedNinthMajorCategory = 1;
			boolean expectedTenthMajorRequirement = true;
			Integer expectedTenthMajorCategory = 1;
			boolean expectedFirstMinorRequirement = true;
			Integer expectedFirstMinorCategory = 1;
			boolean expectedSecondMinorRequirement = true;
			Integer expectedSecondMinorCategory = 1;
			boolean expectedThirdMinorRequirement = true;
			Integer expectedThirdMinorCategory = 1;
			boolean expectedFourthMinorRequirement = true;
			Integer expectedFourthMinorCategory = 1;
			boolean expectedFifthMinorRequirement = true;
			Integer expectedFifthMinorCategory = 1;
			boolean expectedSixthMinorRequirement = true;
			Integer expectedSixthMinorCategory = 1;
			boolean expectedSeventhMinorRequirement = true;
			Integer expectedSeventhMinorCategory = 1;
			boolean expectedEighthMinorRequirement = true;
			Integer expectedEighthMinorCategory = 1;
			boolean expectedNinthMinorRequirement = true;
			Integer expectedNinthMinorCategory = 1;
			boolean expectedTenthMinorRequirement = true;
			Integer expectedTenthMinorCategory = 1;
			boolean expectedFreeElective = true;
			boolean expectedCompleted = true;
			boolean expectedConsideringEnrollment = false;
			boolean expectedCurrentEnrollment = false;
			Double expectedCredits = 4.0;
			Double expectedGpaDesired = 4.0;
			Double expectedGpaEarned = 4.0;
			String expectedCourseStartDate = "05/21/2016";
			String expectedCourseEndDate = "08/02/2016";
			Integer expectedCoursePredictedDifficulty = 3;
			Integer expectedCoursePredictedWorkload = 3;
			Integer expectedPredictedEnjoyability = 3;
			String expectedRecommendedByWho = "Jana Diesner";
			String expectedNotRecommendedByWho = "Nobody";
			String expectedProfessionalSkills = "Programming Skills";
			String expectedAcademicSkills = "Logic Based Learning";
			CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, 2,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			assertFalse(course1.equals(course2));
			assertFalse(course1 == course2);
	
		}
	
		@Test
		public void testAllFieldsEqualExceptEighthMajorRequirement() {
			String expectedTitle = "Learning Java";
		    String expectedInstructor = "Dr. Kevin Trainor";
			String expectedSemester = "Fall";
			Integer expectedYear = 2016;
			String expectedDepartmentCode = "LIS";
			Integer expectedCourseNumber = 452;
			String expectedSectionNumber = "1";
			String expectedInstitution = "University of Illinois";
			String expectedLocation = "Online";
			String expectedOnline = "100% Online";
			boolean expectedGeneralRequirement = true;
			Integer expectedGeneralCategory = 1;
			boolean expectedFirstMajorRequirement = true;
			Integer expectedFirstMajorCategory = 1;
			boolean expectedSecondMajorRequirement = true;
			Integer expectedSecondMajorCategory = 1;
			boolean expectedThirdMajorRequirement = true;
			Integer expectedThirdMajorCategory = 1;
			boolean expectedFourthMajorRequirement = true;
			Integer expectedFourthMajorCategory = 1 ;
			boolean expectedFifthMajorRequirement = true;
			Integer expectedFifthMajorCategory = 1;
			boolean expectedSixthMajorRequirement = true;
			Integer expectedSixthMajorCategory = 1;
			boolean expectedSeventhMajorRequirement = true;
			Integer expectedSeventhMajorCategory = 1;
			boolean expectedEighthMajorRequirement = true;
			Integer expectedEighthMajorCategory = 1;
			boolean expectedNinthMajorRequirement = true;
			Integer expectedNinthMajorCategory = 1;
			boolean expectedTenthMajorRequirement = true;
			Integer expectedTenthMajorCategory = 1;
			boolean expectedFirstMinorRequirement = true;
			Integer expectedFirstMinorCategory = 1;
			boolean expectedSecondMinorRequirement = true;
			Integer expectedSecondMinorCategory = 1;
			boolean expectedThirdMinorRequirement = true;
			Integer expectedThirdMinorCategory = 1;
			boolean expectedFourthMinorRequirement = true;
			Integer expectedFourthMinorCategory = 1;
			boolean expectedFifthMinorRequirement = true;
			Integer expectedFifthMinorCategory = 1;
			boolean expectedSixthMinorRequirement = true;
			Integer expectedSixthMinorCategory = 1;
			boolean expectedSeventhMinorRequirement = true;
			Integer expectedSeventhMinorCategory = 1;
			boolean expectedEighthMinorRequirement = true;
			Integer expectedEighthMinorCategory = 1;
			boolean expectedNinthMinorRequirement = true;
			Integer expectedNinthMinorCategory = 1;
			boolean expectedTenthMinorRequirement = true;
			Integer expectedTenthMinorCategory = 1;
			boolean expectedFreeElective = true;
			boolean expectedCompleted = true;
			boolean expectedConsideringEnrollment = false;
			boolean expectedCurrentEnrollment = false;
			Double expectedCredits = 4.0;
			Double expectedGpaDesired = 4.0;
			Double expectedGpaEarned = 4.0;
			String expectedCourseStartDate = "05/21/2016";
			String expectedCourseEndDate = "08/02/2016";
			Integer expectedCoursePredictedDifficulty = 3;
			Integer expectedCoursePredictedWorkload = 3;
			Integer expectedPredictedEnjoyability = 3;
			String expectedRecommendedByWho = "Jana Diesner";
			String expectedNotRecommendedByWho = "Nobody";
			String expectedProfessionalSkills = "Programming Skills";
			String expectedAcademicSkills = "Logic Based Learning";
			CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 false, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			assertFalse(course1.equals(course2));
			assertFalse(course1 == course2);
	
		}
		
		@Test
		public void testAllFieldsEqualExceptEighthMajorCategory() {
			String expectedTitle = "Learning Java";
		    String expectedInstructor = "Dr. Kevin Trainor";
			String expectedSemester = "Fall";
			Integer expectedYear = 2016;
			String expectedDepartmentCode = "LIS";
			Integer expectedCourseNumber = 452;
			String expectedSectionNumber = "1";
			String expectedInstitution = "University of Illinois";
			String expectedLocation = "Online";
			String expectedOnline = "100% Online";
			boolean expectedGeneralRequirement = true;
			Integer expectedGeneralCategory = 1;
			boolean expectedFirstMajorRequirement = true;
			Integer expectedFirstMajorCategory = 1;
			boolean expectedSecondMajorRequirement = true;
			Integer expectedSecondMajorCategory = 1;
			boolean expectedThirdMajorRequirement = true;
			Integer expectedThirdMajorCategory = 1;
			boolean expectedFourthMajorRequirement = true;
			Integer expectedFourthMajorCategory = 1 ;
			boolean expectedFifthMajorRequirement = true;
			Integer expectedFifthMajorCategory = 1;
			boolean expectedSixthMajorRequirement = true;
			Integer expectedSixthMajorCategory = 1;
			boolean expectedSeventhMajorRequirement = true;
			Integer expectedSeventhMajorCategory = 1;
			boolean expectedEighthMajorRequirement = true;
			Integer expectedEighthMajorCategory = 1;
			boolean expectedNinthMajorRequirement = true;
			Integer expectedNinthMajorCategory = 1;
			boolean expectedTenthMajorRequirement = true;
			Integer expectedTenthMajorCategory = 1;
			boolean expectedFirstMinorRequirement = true;
			Integer expectedFirstMinorCategory = 1;
			boolean expectedSecondMinorRequirement = true;
			Integer expectedSecondMinorCategory = 1;
			boolean expectedThirdMinorRequirement = true;
			Integer expectedThirdMinorCategory = 1;
			boolean expectedFourthMinorRequirement = true;
			Integer expectedFourthMinorCategory = 1;
			boolean expectedFifthMinorRequirement = true;
			Integer expectedFifthMinorCategory = 1;
			boolean expectedSixthMinorRequirement = true;
			Integer expectedSixthMinorCategory = 1;
			boolean expectedSeventhMinorRequirement = true;
			Integer expectedSeventhMinorCategory = 1;
			boolean expectedEighthMinorRequirement = true;
			Integer expectedEighthMinorCategory = 1;
			boolean expectedNinthMinorRequirement = true;
			Integer expectedNinthMinorCategory = 1;
			boolean expectedTenthMinorRequirement = true;
			Integer expectedTenthMinorCategory = 1;
			boolean expectedFreeElective = true;
			boolean expectedCompleted = true;
			boolean expectedConsideringEnrollment = false;
			boolean expectedCurrentEnrollment = false;
			Double expectedCredits = 4.0;
			Double expectedGpaDesired = 4.0;
			Double expectedGpaEarned = 4.0;
			String expectedCourseStartDate = "05/21/2016";
			String expectedCourseEndDate = "08/02/2016";
			Integer expectedCoursePredictedDifficulty = 3;
			Integer expectedCoursePredictedWorkload = 3;
			Integer expectedPredictedEnjoyability = 3;
			String expectedRecommendedByWho = "Jana Diesner";
			String expectedNotRecommendedByWho = "Nobody";
			String expectedProfessionalSkills = "Programming Skills";
			String expectedAcademicSkills = "Logic Based Learning";
			CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, 2,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			assertFalse(course1.equals(course2));
			assertFalse(course1 == course2);
	
		}

		@Test
		public void testAllFieldsEqualExceptNinthMajorRequirement() {
			String expectedTitle = "Learning Java";
		    String expectedInstructor = "Dr. Kevin Trainor";
			String expectedSemester = "Fall";
			Integer expectedYear = 2016;
			String expectedDepartmentCode = "LIS";
			Integer expectedCourseNumber = 452;
			String expectedSectionNumber = "1";
			String expectedInstitution = "University of Illinois";
			String expectedLocation = "Online";
			String expectedOnline = "100% Online";
			boolean expectedGeneralRequirement = true;
			Integer expectedGeneralCategory = 1;
			boolean expectedFirstMajorRequirement = true;
			Integer expectedFirstMajorCategory = 1;
			boolean expectedSecondMajorRequirement = true;
			Integer expectedSecondMajorCategory = 1;
			boolean expectedThirdMajorRequirement = true;
			Integer expectedThirdMajorCategory = 1;
			boolean expectedFourthMajorRequirement = true;
			Integer expectedFourthMajorCategory = 1 ;
			boolean expectedFifthMajorRequirement = true;
			Integer expectedFifthMajorCategory = 1;
			boolean expectedSixthMajorRequirement = true;
			Integer expectedSixthMajorCategory = 1;
			boolean expectedSeventhMajorRequirement = true;
			Integer expectedSeventhMajorCategory = 1;
			boolean expectedEighthMajorRequirement = true;
			Integer expectedEighthMajorCategory = 1;
			boolean expectedNinthMajorRequirement = true;
			Integer expectedNinthMajorCategory = 1;
			boolean expectedTenthMajorRequirement = true;
			Integer expectedTenthMajorCategory = 1;
			boolean expectedFirstMinorRequirement = true;
			Integer expectedFirstMinorCategory = 1;
			boolean expectedSecondMinorRequirement = true;
			Integer expectedSecondMinorCategory = 1;
			boolean expectedThirdMinorRequirement = true;
			Integer expectedThirdMinorCategory = 1;
			boolean expectedFourthMinorRequirement = true;
			Integer expectedFourthMinorCategory = 1;
			boolean expectedFifthMinorRequirement = true;
			Integer expectedFifthMinorCategory = 1;
			boolean expectedSixthMinorRequirement = true;
			Integer expectedSixthMinorCategory = 1;
			boolean expectedSeventhMinorRequirement = true;
			Integer expectedSeventhMinorCategory = 1;
			boolean expectedEighthMinorRequirement = true;
			Integer expectedEighthMinorCategory = 1;
			boolean expectedNinthMinorRequirement = true;
			Integer expectedNinthMinorCategory = 1;
			boolean expectedTenthMinorRequirement = true;
			Integer expectedTenthMinorCategory = 1;
			boolean expectedFreeElective = true;
			boolean expectedCompleted = true;
			boolean expectedConsideringEnrollment = false;
			boolean expectedCurrentEnrollment = false;
			Double expectedCredits = 4.0;
			Double expectedGpaDesired = 4.0;
			Double expectedGpaEarned = 4.0;
			String expectedCourseStartDate = "05/21/2016";
			String expectedCourseEndDate = "08/02/2016";
			Integer expectedCoursePredictedDifficulty = 3;
			Integer expectedCoursePredictedWorkload = 3;
			Integer expectedPredictedEnjoyability = 3;
			String expectedRecommendedByWho = "Jana Diesner";
			String expectedNotRecommendedByWho = "Nobody";
			String expectedProfessionalSkills = "Programming Skills";
			String expectedAcademicSkills = "Logic Based Learning";
			CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 false, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			assertFalse(course1.equals(course2));
			assertFalse(course1 == course2);
	
		}
	
		@Test
		public void testAllFieldsEqualExceptNinthMajorCategory() {
			String expectedTitle = "Learning Java";
		    String expectedInstructor = "Dr. Kevin Trainor";
			String expectedSemester = "Fall";
			Integer expectedYear = 2016;
			String expectedDepartmentCode = "LIS";
			Integer expectedCourseNumber = 452;
			String expectedSectionNumber = "1";
			String expectedInstitution = "University of Illinois";
			String expectedLocation = "Online";
			String expectedOnline = "100% Online";
			boolean expectedGeneralRequirement = true;
			Integer expectedGeneralCategory = 1;
			boolean expectedFirstMajorRequirement = true;
			Integer expectedFirstMajorCategory = 1;
			boolean expectedSecondMajorRequirement = true;
			Integer expectedSecondMajorCategory = 1;
			boolean expectedThirdMajorRequirement = true;
			Integer expectedThirdMajorCategory = 1;
			boolean expectedFourthMajorRequirement = true;
			Integer expectedFourthMajorCategory = 1 ;
			boolean expectedFifthMajorRequirement = true;
			Integer expectedFifthMajorCategory = 1;
			boolean expectedSixthMajorRequirement = true;
			Integer expectedSixthMajorCategory = 1;
			boolean expectedSeventhMajorRequirement = true;
			Integer expectedSeventhMajorCategory = 1;
			boolean expectedEighthMajorRequirement = true;
			Integer expectedEighthMajorCategory = 1;
			boolean expectedNinthMajorRequirement = true;
			Integer expectedNinthMajorCategory = 1;
			boolean expectedTenthMajorRequirement = true;
			Integer expectedTenthMajorCategory = 1;
			boolean expectedFirstMinorRequirement = true;
			Integer expectedFirstMinorCategory = 1;
			boolean expectedSecondMinorRequirement = true;
			Integer expectedSecondMinorCategory = 1;
			boolean expectedThirdMinorRequirement = true;
			Integer expectedThirdMinorCategory = 1;
			boolean expectedFourthMinorRequirement = true;
			Integer expectedFourthMinorCategory = 1;
			boolean expectedFifthMinorRequirement = true;
			Integer expectedFifthMinorCategory = 1;
			boolean expectedSixthMinorRequirement = true;
			Integer expectedSixthMinorCategory = 1;
			boolean expectedSeventhMinorRequirement = true;
			Integer expectedSeventhMinorCategory = 1;
			boolean expectedEighthMinorRequirement = true;
			Integer expectedEighthMinorCategory = 1;
			boolean expectedNinthMinorRequirement = true;
			Integer expectedNinthMinorCategory = 1;
			boolean expectedTenthMinorRequirement = true;
			Integer expectedTenthMinorCategory = 1;
			boolean expectedFreeElective = true;
			boolean expectedCompleted = true;
			boolean expectedConsideringEnrollment = false;
			boolean expectedCurrentEnrollment = false;
			Double expectedCredits = 4.0;
			Double expectedGpaDesired = 4.0;
			Double expectedGpaEarned = 4.0;
			String expectedCourseStartDate = "05/21/2016";
			String expectedCourseEndDate = "08/02/2016";
			Integer expectedCoursePredictedDifficulty = 3;
			Integer expectedCoursePredictedWorkload = 3;
			Integer expectedPredictedEnjoyability = 3;
			String expectedRecommendedByWho = "Jana Diesner";
			String expectedNotRecommendedByWho = "Nobody";
			String expectedProfessionalSkills = "Programming Skills";
			String expectedAcademicSkills = "Logic Based Learning";
			CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, 2,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			assertFalse(course1.equals(course2));
			assertFalse(course1 == course2);
	
		}
		@Test
		public void testAllFieldsEqualExceptTenthMajorRequirement() {
			String expectedTitle = "Learning Java";
		    String expectedInstructor = "Dr. Kevin Trainor";
			String expectedSemester = "Fall";
			Integer expectedYear = 2016;
			String expectedDepartmentCode = "LIS";
			Integer expectedCourseNumber = 452;
			String expectedSectionNumber = "1";
			String expectedInstitution = "University of Illinois";
			String expectedLocation = "Online";
			String expectedOnline = "100% Online";
			boolean expectedGeneralRequirement = true;
			Integer expectedGeneralCategory = 1;
			boolean expectedFirstMajorRequirement = true;
			Integer expectedFirstMajorCategory = 1;
			boolean expectedSecondMajorRequirement = true;
			Integer expectedSecondMajorCategory = 1;
			boolean expectedThirdMajorRequirement = true;
			Integer expectedThirdMajorCategory = 1;
			boolean expectedFourthMajorRequirement = true;
			Integer expectedFourthMajorCategory = 1 ;
			boolean expectedFifthMajorRequirement = true;
			Integer expectedFifthMajorCategory = 1;
			boolean expectedSixthMajorRequirement = true;
			Integer expectedSixthMajorCategory = 1;
			boolean expectedSeventhMajorRequirement = true;
			Integer expectedSeventhMajorCategory = 1;
			boolean expectedEighthMajorRequirement = true;
			Integer expectedEighthMajorCategory = 1;
			boolean expectedNinthMajorRequirement = true;
			Integer expectedNinthMajorCategory = 1;
			boolean expectedTenthMajorRequirement = true;
			Integer expectedTenthMajorCategory = 1;
			boolean expectedFirstMinorRequirement = true;
			Integer expectedFirstMinorCategory = 1;
			boolean expectedSecondMinorRequirement = true;
			Integer expectedSecondMinorCategory = 1;
			boolean expectedThirdMinorRequirement = true;
			Integer expectedThirdMinorCategory = 1;
			boolean expectedFourthMinorRequirement = true;
			Integer expectedFourthMinorCategory = 1;
			boolean expectedFifthMinorRequirement = true;
			Integer expectedFifthMinorCategory = 1;
			boolean expectedSixthMinorRequirement = true;
			Integer expectedSixthMinorCategory = 1;
			boolean expectedSeventhMinorRequirement = true;
			Integer expectedSeventhMinorCategory = 1;
			boolean expectedEighthMinorRequirement = true;
			Integer expectedEighthMinorCategory = 1;
			boolean expectedNinthMinorRequirement = true;
			Integer expectedNinthMinorCategory = 1;
			boolean expectedTenthMinorRequirement = true;
			Integer expectedTenthMinorCategory = 1;
			boolean expectedFreeElective = true;
			boolean expectedCompleted = true;
			boolean expectedConsideringEnrollment = false;
			boolean expectedCurrentEnrollment = false;
			Double expectedCredits = 4.0;
			Double expectedGpaDesired = 4.0;
			Double expectedGpaEarned = 4.0;
			String expectedCourseStartDate = "05/21/2016";
			String expectedCourseEndDate = "08/02/2016";
			Integer expectedCoursePredictedDifficulty = 3;
			Integer expectedCoursePredictedWorkload = 3;
			Integer expectedPredictedEnjoyability = 3;
			String expectedRecommendedByWho = "Jana Diesner";
			String expectedNotRecommendedByWho = "Nobody";
			String expectedProfessionalSkills = "Programming Skills";
			String expectedAcademicSkills = "Logic Based Learning";
			CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 false, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			assertFalse(course1.equals(course2));
			assertFalse(course1 == course2);
	
		}
		
		@Test
		public void testAllFieldsEqualExceptTenthMajorCategory() {
			String expectedTitle = "Learning Java";
		    String expectedInstructor = "Dr. Kevin Trainor";
			String expectedSemester = "Fall";
			Integer expectedYear = 2016;
			String expectedDepartmentCode = "LIS";
			Integer expectedCourseNumber = 452;
			String expectedSectionNumber = "1";
			String expectedInstitution = "University of Illinois";
			String expectedLocation = "Online";
			String expectedOnline = "100% Online";
			boolean expectedGeneralRequirement = true;
			Integer expectedGeneralCategory = 1;
			boolean expectedFirstMajorRequirement = true;
			Integer expectedFirstMajorCategory = 1;
			boolean expectedSecondMajorRequirement = true;
			Integer expectedSecondMajorCategory = 1;
			boolean expectedThirdMajorRequirement = true;
			Integer expectedThirdMajorCategory = 1;
			boolean expectedFourthMajorRequirement = true;
			Integer expectedFourthMajorCategory = 1 ;
			boolean expectedFifthMajorRequirement = true;
			Integer expectedFifthMajorCategory = 1;
			boolean expectedSixthMajorRequirement = true;
			Integer expectedSixthMajorCategory = 1;
			boolean expectedSeventhMajorRequirement = true;
			Integer expectedSeventhMajorCategory = 1;
			boolean expectedEighthMajorRequirement = true;
			Integer expectedEighthMajorCategory = 1;
			boolean expectedNinthMajorRequirement = true;
			Integer expectedNinthMajorCategory = 1;
			boolean expectedTenthMajorRequirement = true;
			Integer expectedTenthMajorCategory = 1;
			boolean expectedFirstMinorRequirement = true;
			Integer expectedFirstMinorCategory = 1;
			boolean expectedSecondMinorRequirement = true;
			Integer expectedSecondMinorCategory = 1;
			boolean expectedThirdMinorRequirement = true;
			Integer expectedThirdMinorCategory = 1;
			boolean expectedFourthMinorRequirement = true;
			Integer expectedFourthMinorCategory = 1;
			boolean expectedFifthMinorRequirement = true;
			Integer expectedFifthMinorCategory = 1;
			boolean expectedSixthMinorRequirement = true;
			Integer expectedSixthMinorCategory = 1;
			boolean expectedSeventhMinorRequirement = true;
			Integer expectedSeventhMinorCategory = 1;
			boolean expectedEighthMinorRequirement = true;
			Integer expectedEighthMinorCategory = 1;
			boolean expectedNinthMinorRequirement = true;
			Integer expectedNinthMinorCategory = 1;
			boolean expectedTenthMinorRequirement = true;
			Integer expectedTenthMinorCategory = 1;
			boolean expectedFreeElective = true;
			boolean expectedCompleted = true;
			boolean expectedConsideringEnrollment = false;
			boolean expectedCurrentEnrollment = false;
			Double expectedCredits = 4.0;
			Double expectedGpaDesired = 4.0;
			Double expectedGpaEarned = 4.0;
			String expectedCourseStartDate = "05/21/2016";
			String expectedCourseEndDate = "08/02/2016";
			Integer expectedCoursePredictedDifficulty = 3;
			Integer expectedCoursePredictedWorkload = 3;
			Integer expectedPredictedEnjoyability = 3;
			String expectedRecommendedByWho = "Jana Diesner";
			String expectedNotRecommendedByWho = "Nobody";
			String expectedProfessionalSkills = "Programming Skills";
			String expectedAcademicSkills = "Logic Based Learning";
			CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, 2,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			assertFalse(course1.equals(course2));
			assertFalse(course1 == course2);
	
		}
		@Test
		public void testAllFieldsEqualExceptFirstMinorRequirement() {
			String expectedTitle = "Learning Java";
		    String expectedInstructor = "Dr. Kevin Trainor";
			String expectedSemester = "Fall";
			Integer expectedYear = 2016;
			String expectedDepartmentCode = "LIS";
			Integer expectedCourseNumber = 452;
			String expectedSectionNumber = "1";
			String expectedInstitution = "University of Illinois";
			String expectedLocation = "Online";
			String expectedOnline = "100% Online";
			boolean expectedGeneralRequirement = true;
			Integer expectedGeneralCategory = 1;
			boolean expectedFirstMajorRequirement = true;
			Integer expectedFirstMajorCategory = 1;
			boolean expectedSecondMajorRequirement = true;
			Integer expectedSecondMajorCategory = 1;
			boolean expectedThirdMajorRequirement = true;
			Integer expectedThirdMajorCategory = 1;
			boolean expectedFourthMajorRequirement = true;
			Integer expectedFourthMajorCategory = 1 ;
			boolean expectedFifthMajorRequirement = true;
			Integer expectedFifthMajorCategory = 1;
			boolean expectedSixthMajorRequirement = true;
			Integer expectedSixthMajorCategory = 1;
			boolean expectedSeventhMajorRequirement = true;
			Integer expectedSeventhMajorCategory = 1;
			boolean expectedEighthMajorRequirement = true;
			Integer expectedEighthMajorCategory = 1;
			boolean expectedNinthMajorRequirement = true;
			Integer expectedNinthMajorCategory = 1;
			boolean expectedTenthMajorRequirement = true;
			Integer expectedTenthMajorCategory = 1;
			boolean expectedFirstMinorRequirement = true;
			Integer expectedFirstMinorCategory = 1;
			boolean expectedSecondMinorRequirement = true;
			Integer expectedSecondMinorCategory = 1;
			boolean expectedThirdMinorRequirement = true;
			Integer expectedThirdMinorCategory = 1;
			boolean expectedFourthMinorRequirement = true;
			Integer expectedFourthMinorCategory = 1;
			boolean expectedFifthMinorRequirement = true;
			Integer expectedFifthMinorCategory = 1;
			boolean expectedSixthMinorRequirement = true;
			Integer expectedSixthMinorCategory = 1;
			boolean expectedSeventhMinorRequirement = true;
			Integer expectedSeventhMinorCategory = 1;
			boolean expectedEighthMinorRequirement = true;
			Integer expectedEighthMinorCategory = 1;
			boolean expectedNinthMinorRequirement = true;
			Integer expectedNinthMinorCategory = 1;
			boolean expectedTenthMinorRequirement = true;
			Integer expectedTenthMinorCategory = 1;
			boolean expectedFreeElective = true;
			boolean expectedCompleted = true;
			boolean expectedConsideringEnrollment = false;
			boolean expectedCurrentEnrollment = false;
			Double expectedCredits = 4.0;
			Double expectedGpaDesired = 4.0;
			Double expectedGpaEarned = 4.0;
			String expectedCourseStartDate = "05/21/2016";
			String expectedCourseEndDate = "08/02/2016";
			Integer expectedCoursePredictedDifficulty = 3;
			Integer expectedCoursePredictedWorkload = 3;
			Integer expectedPredictedEnjoyability = 3;
			String expectedRecommendedByWho = "Jana Diesner";
			String expectedNotRecommendedByWho = "Nobody";
			String expectedProfessionalSkills = "Programming Skills";
			String expectedAcademicSkills = "Logic Based Learning";
			CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 false, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			assertFalse(course1.equals(course2));
			assertFalse(course1 == course2);
	
		}
		@Test
		public void testAllFieldsEqualExceptFirstMinorCategory() {
			String expectedTitle = "Learning Java";
		    String expectedInstructor = "Dr. Kevin Trainor";
			String expectedSemester = "Fall";
			Integer expectedYear = 2016;
			String expectedDepartmentCode = "LIS";
			Integer expectedCourseNumber = 452;
			String expectedSectionNumber = "1";
			String expectedInstitution = "University of Illinois";
			String expectedLocation = "Online";
			String expectedOnline = "100% Online";
			boolean expectedGeneralRequirement = true;
			Integer expectedGeneralCategory = 1;
			boolean expectedFirstMajorRequirement = true;
			Integer expectedFirstMajorCategory = 1;
			boolean expectedSecondMajorRequirement = true;
			Integer expectedSecondMajorCategory = 1;
			boolean expectedThirdMajorRequirement = true;
			Integer expectedThirdMajorCategory = 1;
			boolean expectedFourthMajorRequirement = true;
			Integer expectedFourthMajorCategory = 1 ;
			boolean expectedFifthMajorRequirement = true;
			Integer expectedFifthMajorCategory = 1;
			boolean expectedSixthMajorRequirement = true;
			Integer expectedSixthMajorCategory = 1;
			boolean expectedSeventhMajorRequirement = true;
			Integer expectedSeventhMajorCategory = 1;
			boolean expectedEighthMajorRequirement = true;
			Integer expectedEighthMajorCategory = 1;
			boolean expectedNinthMajorRequirement = true;
			Integer expectedNinthMajorCategory = 1;
			boolean expectedTenthMajorRequirement = true;
			Integer expectedTenthMajorCategory = 1;
			boolean expectedFirstMinorRequirement = true;
			Integer expectedFirstMinorCategory = 1;
			boolean expectedSecondMinorRequirement = true;
			Integer expectedSecondMinorCategory = 1;
			boolean expectedThirdMinorRequirement = true;
			Integer expectedThirdMinorCategory = 1;
			boolean expectedFourthMinorRequirement = true;
			Integer expectedFourthMinorCategory = 1;
			boolean expectedFifthMinorRequirement = true;
			Integer expectedFifthMinorCategory = 1;
			boolean expectedSixthMinorRequirement = true;
			Integer expectedSixthMinorCategory = 1;
			boolean expectedSeventhMinorRequirement = true;
			Integer expectedSeventhMinorCategory = 1;
			boolean expectedEighthMinorRequirement = true;
			Integer expectedEighthMinorCategory = 1;
			boolean expectedNinthMinorRequirement = true;
			Integer expectedNinthMinorCategory = 1;
			boolean expectedTenthMinorRequirement = true;
			Integer expectedTenthMinorCategory = 1;
			boolean expectedFreeElective = true;
			boolean expectedCompleted = true;
			boolean expectedConsideringEnrollment = false;
			boolean expectedCurrentEnrollment = false;
			Double expectedCredits = 4.0;
			Double expectedGpaDesired = 4.0;
			Double expectedGpaEarned = 4.0;
			String expectedCourseStartDate = "05/21/2016";
			String expectedCourseEndDate = "08/02/2016";
			Integer expectedCoursePredictedDifficulty = 3;
			Integer expectedCoursePredictedWorkload = 3;
			Integer expectedPredictedEnjoyability = 3;
			String expectedRecommendedByWho = "Jana Diesner";
			String expectedNotRecommendedByWho = "Nobody";
			String expectedProfessionalSkills = "Programming Skills";
			String expectedAcademicSkills = "Logic Based Learning";
			CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, 2,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			assertFalse(course1.equals(course2));
			assertFalse(course1 == course2);
	
		}
		@Test
		public void testAllFieldsEqualExceptSecondMinorRequirement() {
			String expectedTitle = "Learning Java";
		    String expectedInstructor = "Dr. Kevin Trainor";
			String expectedSemester = "Fall";
			Integer expectedYear = 2016;
			String expectedDepartmentCode = "LIS";
			Integer expectedCourseNumber = 452;
			String expectedSectionNumber = "1";
			String expectedInstitution = "University of Illinois";
			String expectedLocation = "Online";
			String expectedOnline = "100% Online";
			boolean expectedGeneralRequirement = true;
			Integer expectedGeneralCategory = 1;
			boolean expectedFirstMajorRequirement = true;
			Integer expectedFirstMajorCategory = 1;
			boolean expectedSecondMajorRequirement = true;
			Integer expectedSecondMajorCategory = 1;
			boolean expectedThirdMajorRequirement = true;
			Integer expectedThirdMajorCategory = 1;
			boolean expectedFourthMajorRequirement = true;
			Integer expectedFourthMajorCategory = 1 ;
			boolean expectedFifthMajorRequirement = true;
			Integer expectedFifthMajorCategory = 1;
			boolean expectedSixthMajorRequirement = true;
			Integer expectedSixthMajorCategory = 1;
			boolean expectedSeventhMajorRequirement = true;
			Integer expectedSeventhMajorCategory = 1;
			boolean expectedEighthMajorRequirement = true;
			Integer expectedEighthMajorCategory = 1;
			boolean expectedNinthMajorRequirement = true;
			Integer expectedNinthMajorCategory = 1;
			boolean expectedTenthMajorRequirement = true;
			Integer expectedTenthMajorCategory = 1;
			boolean expectedFirstMinorRequirement = true;
			Integer expectedFirstMinorCategory = 1;
			boolean expectedSecondMinorRequirement = true;
			Integer expectedSecondMinorCategory = 1;
			boolean expectedThirdMinorRequirement = true;
			Integer expectedThirdMinorCategory = 1;
			boolean expectedFourthMinorRequirement = true;
			Integer expectedFourthMinorCategory = 1;
			boolean expectedFifthMinorRequirement = true;
			Integer expectedFifthMinorCategory = 1;
			boolean expectedSixthMinorRequirement = true;
			Integer expectedSixthMinorCategory = 1;
			boolean expectedSeventhMinorRequirement = true;
			Integer expectedSeventhMinorCategory = 1;
			boolean expectedEighthMinorRequirement = true;
			Integer expectedEighthMinorCategory = 1;
			boolean expectedNinthMinorRequirement = true;
			Integer expectedNinthMinorCategory = 1;
			boolean expectedTenthMinorRequirement = true;
			Integer expectedTenthMinorCategory = 1;
			boolean expectedFreeElective = true;
			boolean expectedCompleted = true;
			boolean expectedConsideringEnrollment = false;
			boolean expectedCurrentEnrollment = false;
			Double expectedCredits = 4.0;
			Double expectedGpaDesired = 4.0;
			Double expectedGpaEarned = 4.0;
			String expectedCourseStartDate = "05/21/2016";
			String expectedCourseEndDate = "08/02/2016";
			Integer expectedCoursePredictedDifficulty = 3;
			Integer expectedCoursePredictedWorkload = 3;
			Integer expectedPredictedEnjoyability = 3;
			String expectedRecommendedByWho = "Jana Diesner";
			String expectedNotRecommendedByWho = "Nobody";
			String expectedProfessionalSkills = "Programming Skills";
			String expectedAcademicSkills = "Logic Based Learning";
			CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 false, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			assertFalse(course1.equals(course2));
			assertFalse(course1 == course2);
	
		}
		@Test
		public void testAllFieldsEqualExceptSecondMinorCategory() {
			String expectedTitle = "Learning Java";
		    String expectedInstructor = "Dr. Kevin Trainor";
			String expectedSemester = "Fall";
			Integer expectedYear = 2016;
			String expectedDepartmentCode = "LIS";
			Integer expectedCourseNumber = 452;
			String expectedSectionNumber = "1";
			String expectedInstitution = "University of Illinois";
			String expectedLocation = "Online";
			String expectedOnline = "100% Online";
			boolean expectedGeneralRequirement = true;
			Integer expectedGeneralCategory = 1;
			boolean expectedFirstMajorRequirement = true;
			Integer expectedFirstMajorCategory = 1;
			boolean expectedSecondMajorRequirement = true;
			Integer expectedSecondMajorCategory = 1;
			boolean expectedThirdMajorRequirement = true;
			Integer expectedThirdMajorCategory = 1;
			boolean expectedFourthMajorRequirement = true;
			Integer expectedFourthMajorCategory = 1 ;
			boolean expectedFifthMajorRequirement = true;
			Integer expectedFifthMajorCategory = 1;
			boolean expectedSixthMajorRequirement = true;
			Integer expectedSixthMajorCategory = 1;
			boolean expectedSeventhMajorRequirement = true;
			Integer expectedSeventhMajorCategory = 1;
			boolean expectedEighthMajorRequirement = true;
			Integer expectedEighthMajorCategory = 1;
			boolean expectedNinthMajorRequirement = true;
			Integer expectedNinthMajorCategory = 1;
			boolean expectedTenthMajorRequirement = true;
			Integer expectedTenthMajorCategory = 1;
			boolean expectedFirstMinorRequirement = true;
			Integer expectedFirstMinorCategory = 1;
			boolean expectedSecondMinorRequirement = true;
			Integer expectedSecondMinorCategory = 1;
			boolean expectedThirdMinorRequirement = true;
			Integer expectedThirdMinorCategory = 1;
			boolean expectedFourthMinorRequirement = true;
			Integer expectedFourthMinorCategory = 1;
			boolean expectedFifthMinorRequirement = true;
			Integer expectedFifthMinorCategory = 1;
			boolean expectedSixthMinorRequirement = true;
			Integer expectedSixthMinorCategory = 1;
			boolean expectedSeventhMinorRequirement = true;
			Integer expectedSeventhMinorCategory = 1;
			boolean expectedEighthMinorRequirement = true;
			Integer expectedEighthMinorCategory = 1;
			boolean expectedNinthMinorRequirement = true;
			Integer expectedNinthMinorCategory = 1;
			boolean expectedTenthMinorRequirement = true;
			Integer expectedTenthMinorCategory = 1;
			boolean expectedFreeElective = true;
			boolean expectedCompleted = true;
			boolean expectedConsideringEnrollment = false;
			boolean expectedCurrentEnrollment = false;
			Double expectedCredits = 4.0;
			Double expectedGpaDesired = 4.0;
			Double expectedGpaEarned = 4.0;
			String expectedCourseStartDate = "05/21/2016";
			String expectedCourseEndDate = "08/02/2016";
			Integer expectedCoursePredictedDifficulty = 3;
			Integer expectedCoursePredictedWorkload = 3;
			Integer expectedPredictedEnjoyability = 3;
			String expectedRecommendedByWho = "Jana Diesner";
			String expectedNotRecommendedByWho = "Nobody";
			String expectedProfessionalSkills = "Programming Skills";
			String expectedAcademicSkills = "Logic Based Learning";
			CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, 2,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			assertFalse(course1.equals(course2));
			assertFalse(course1 == course2);
	
		}
		@Test
		public void testAllFieldsEqualExceptThirdMinorRequirement() {
			String expectedTitle = "Learning Java";
		    String expectedInstructor = "Dr. Kevin Trainor";
			String expectedSemester = "Fall";
			Integer expectedYear = 2016;
			String expectedDepartmentCode = "LIS";
			Integer expectedCourseNumber = 452;
			String expectedSectionNumber = "1";
			String expectedInstitution = "University of Illinois";
			String expectedLocation = "Online";
			String expectedOnline = "100% Online";
			boolean expectedGeneralRequirement = true;
			Integer expectedGeneralCategory = 1;
			boolean expectedFirstMajorRequirement = true;
			Integer expectedFirstMajorCategory = 1;
			boolean expectedSecondMajorRequirement = true;
			Integer expectedSecondMajorCategory = 1;
			boolean expectedThirdMajorRequirement = true;
			Integer expectedThirdMajorCategory = 1;
			boolean expectedFourthMajorRequirement = true;
			Integer expectedFourthMajorCategory = 1 ;
			boolean expectedFifthMajorRequirement = true;
			Integer expectedFifthMajorCategory = 1;
			boolean expectedSixthMajorRequirement = true;
			Integer expectedSixthMajorCategory = 1;
			boolean expectedSeventhMajorRequirement = true;
			Integer expectedSeventhMajorCategory = 1;
			boolean expectedEighthMajorRequirement = true;
			Integer expectedEighthMajorCategory = 1;
			boolean expectedNinthMajorRequirement = true;
			Integer expectedNinthMajorCategory = 1;
			boolean expectedTenthMajorRequirement = true;
			Integer expectedTenthMajorCategory = 1;
			boolean expectedFirstMinorRequirement = true;
			Integer expectedFirstMinorCategory = 1;
			boolean expectedSecondMinorRequirement = true;
			Integer expectedSecondMinorCategory = 1;
			boolean expectedThirdMinorRequirement = true;
			Integer expectedThirdMinorCategory = 1;
			boolean expectedFourthMinorRequirement = true;
			Integer expectedFourthMinorCategory = 1;
			boolean expectedFifthMinorRequirement = true;
			Integer expectedFifthMinorCategory = 1;
			boolean expectedSixthMinorRequirement = true;
			Integer expectedSixthMinorCategory = 1;
			boolean expectedSeventhMinorRequirement = true;
			Integer expectedSeventhMinorCategory = 1;
			boolean expectedEighthMinorRequirement = true;
			Integer expectedEighthMinorCategory = 1;
			boolean expectedNinthMinorRequirement = true;
			Integer expectedNinthMinorCategory = 1;
			boolean expectedTenthMinorRequirement = true;
			Integer expectedTenthMinorCategory = 1;
			boolean expectedFreeElective = true;
			boolean expectedCompleted = true;
			boolean expectedConsideringEnrollment = false;
			boolean expectedCurrentEnrollment = false;
			Double expectedCredits = 4.0;
			Double expectedGpaDesired = 4.0;
			Double expectedGpaEarned = 4.0;
			String expectedCourseStartDate = "05/21/2016";
			String expectedCourseEndDate = "08/02/2016";
			Integer expectedCoursePredictedDifficulty = 3;
			Integer expectedCoursePredictedWorkload = 3;
			Integer expectedPredictedEnjoyability = 3;
			String expectedRecommendedByWho = "Jana Diesner";
			String expectedNotRecommendedByWho = "Nobody";
			String expectedProfessionalSkills = "Programming Skills";
			String expectedAcademicSkills = "Logic Based Learning";
			CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 false, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			assertFalse(course1.equals(course2));
			assertFalse(course1 == course2);
	
		}
		@Test
		public void testAllFieldsEqualExceptThirdMinorCategory() {
			String expectedTitle = "Learning Java";
		    String expectedInstructor = "Dr. Kevin Trainor";
			String expectedSemester = "Fall";
			Integer expectedYear = 2016;
			String expectedDepartmentCode = "LIS";
			Integer expectedCourseNumber = 452;
			String expectedSectionNumber = "1";
			String expectedInstitution = "University of Illinois";
			String expectedLocation = "Online";
			String expectedOnline = "100% Online";
			boolean expectedGeneralRequirement = true;
			Integer expectedGeneralCategory = 1;
			boolean expectedFirstMajorRequirement = true;
			Integer expectedFirstMajorCategory = 1;
			boolean expectedSecondMajorRequirement = true;
			Integer expectedSecondMajorCategory = 1;
			boolean expectedThirdMajorRequirement = true;
			Integer expectedThirdMajorCategory = 1;
			boolean expectedFourthMajorRequirement = true;
			Integer expectedFourthMajorCategory = 1 ;
			boolean expectedFifthMajorRequirement = true;
			Integer expectedFifthMajorCategory = 1;
			boolean expectedSixthMajorRequirement = true;
			Integer expectedSixthMajorCategory = 1;
			boolean expectedSeventhMajorRequirement = true;
			Integer expectedSeventhMajorCategory = 1;
			boolean expectedEighthMajorRequirement = true;
			Integer expectedEighthMajorCategory = 1;
			boolean expectedNinthMajorRequirement = true;
			Integer expectedNinthMajorCategory = 1;
			boolean expectedTenthMajorRequirement = true;
			Integer expectedTenthMajorCategory = 1;
			boolean expectedFirstMinorRequirement = true;
			Integer expectedFirstMinorCategory = 1;
			boolean expectedSecondMinorRequirement = true;
			Integer expectedSecondMinorCategory = 1;
			boolean expectedThirdMinorRequirement = true;
			Integer expectedThirdMinorCategory = 1;
			boolean expectedFourthMinorRequirement = true;
			Integer expectedFourthMinorCategory = 1;
			boolean expectedFifthMinorRequirement = true;
			Integer expectedFifthMinorCategory = 1;
			boolean expectedSixthMinorRequirement = true;
			Integer expectedSixthMinorCategory = 1;
			boolean expectedSeventhMinorRequirement = true;
			Integer expectedSeventhMinorCategory = 1;
			boolean expectedEighthMinorRequirement = true;
			Integer expectedEighthMinorCategory = 1;
			boolean expectedNinthMinorRequirement = true;
			Integer expectedNinthMinorCategory = 1;
			boolean expectedTenthMinorRequirement = true;
			Integer expectedTenthMinorCategory = 1;
			boolean expectedFreeElective = true;
			boolean expectedCompleted = true;
			boolean expectedConsideringEnrollment = false;
			boolean expectedCurrentEnrollment = false;
			Double expectedCredits = 4.0;
			Double expectedGpaDesired = 4.0;
			Double expectedGpaEarned = 4.0;
			String expectedCourseStartDate = "05/21/2016";
			String expectedCourseEndDate = "08/02/2016";
			Integer expectedCoursePredictedDifficulty = 3;
			Integer expectedCoursePredictedWorkload = 3;
			Integer expectedPredictedEnjoyability = 3;
			String expectedRecommendedByWho = "Jana Diesner";
			String expectedNotRecommendedByWho = "Nobody";
			String expectedProfessionalSkills = "Programming Skills";
			String expectedAcademicSkills = "Logic Based Learning";
			CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, 2,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			assertFalse(course1.equals(course2));
			assertFalse(course1 == course2);
	
		}
		@Test
		public void testAllFieldsEqualExceptFourthMinorRequirement() {
			String expectedTitle = "Learning Java";
		    String expectedInstructor = "Dr. Kevin Trainor";
			String expectedSemester = "Fall";
			Integer expectedYear = 2016;
			String expectedDepartmentCode = "LIS";
			Integer expectedCourseNumber = 452;
			String expectedSectionNumber = "1";
			String expectedInstitution = "University of Illinois";
			String expectedLocation = "Online";
			String expectedOnline = "100% Online";
			boolean expectedGeneralRequirement = true;
			Integer expectedGeneralCategory = 1;
			boolean expectedFirstMajorRequirement = true;
			Integer expectedFirstMajorCategory = 1;
			boolean expectedSecondMajorRequirement = true;
			Integer expectedSecondMajorCategory = 1;
			boolean expectedThirdMajorRequirement = true;
			Integer expectedThirdMajorCategory = 1;
			boolean expectedFourthMajorRequirement = true;
			Integer expectedFourthMajorCategory = 1 ;
			boolean expectedFifthMajorRequirement = true;
			Integer expectedFifthMajorCategory = 1;
			boolean expectedSixthMajorRequirement = true;
			Integer expectedSixthMajorCategory = 1;
			boolean expectedSeventhMajorRequirement = true;
			Integer expectedSeventhMajorCategory = 1;
			boolean expectedEighthMajorRequirement = true;
			Integer expectedEighthMajorCategory = 1;
			boolean expectedNinthMajorRequirement = true;
			Integer expectedNinthMajorCategory = 1;
			boolean expectedTenthMajorRequirement = true;
			Integer expectedTenthMajorCategory = 1;
			boolean expectedFirstMinorRequirement = true;
			Integer expectedFirstMinorCategory = 1;
			boolean expectedSecondMinorRequirement = true;
			Integer expectedSecondMinorCategory = 1;
			boolean expectedThirdMinorRequirement = true;
			Integer expectedThirdMinorCategory = 1;
			boolean expectedFourthMinorRequirement = true;
			Integer expectedFourthMinorCategory = 1;
			boolean expectedFifthMinorRequirement = true;
			Integer expectedFifthMinorCategory = 1;
			boolean expectedSixthMinorRequirement = true;
			Integer expectedSixthMinorCategory = 1;
			boolean expectedSeventhMinorRequirement = true;
			Integer expectedSeventhMinorCategory = 1;
			boolean expectedEighthMinorRequirement = true;
			Integer expectedEighthMinorCategory = 1;
			boolean expectedNinthMinorRequirement = true;
			Integer expectedNinthMinorCategory = 1;
			boolean expectedTenthMinorRequirement = true;
			Integer expectedTenthMinorCategory = 1;
			boolean expectedFreeElective = true;
			boolean expectedCompleted = true;
			boolean expectedConsideringEnrollment = false;
			boolean expectedCurrentEnrollment = false;
			Double expectedCredits = 4.0;
			Double expectedGpaDesired = 4.0;
			Double expectedGpaEarned = 4.0;
			String expectedCourseStartDate = "05/21/2016";
			String expectedCourseEndDate = "08/02/2016";
			Integer expectedCoursePredictedDifficulty = 3;
			Integer expectedCoursePredictedWorkload = 3;
			Integer expectedPredictedEnjoyability = 3;
			String expectedRecommendedByWho = "Jana Diesner";
			String expectedNotRecommendedByWho = "Nobody";
			String expectedProfessionalSkills = "Programming Skills";
			String expectedAcademicSkills = "Logic Based Learning";
			CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 false, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			assertFalse(course1.equals(course2));
			assertFalse(course1 == course2);
	
		}
		@Test
		public void testAllFieldsEqualExceptFourthMinorCategory() {
			String expectedTitle = "Learning Java";
		    String expectedInstructor = "Dr. Kevin Trainor";
			String expectedSemester = "Fall";
			Integer expectedYear = 2016;
			String expectedDepartmentCode = "LIS";
			Integer expectedCourseNumber = 452;
			String expectedSectionNumber = "1";
			String expectedInstitution = "University of Illinois";
			String expectedLocation = "Online";
			String expectedOnline = "100% Online";
			boolean expectedGeneralRequirement = true;
			Integer expectedGeneralCategory = 1;
			boolean expectedFirstMajorRequirement = true;
			Integer expectedFirstMajorCategory = 1;
			boolean expectedSecondMajorRequirement = true;
			Integer expectedSecondMajorCategory = 1;
			boolean expectedThirdMajorRequirement = true;
			Integer expectedThirdMajorCategory = 1;
			boolean expectedFourthMajorRequirement = true;
			Integer expectedFourthMajorCategory = 1 ;
			boolean expectedFifthMajorRequirement = true;
			Integer expectedFifthMajorCategory = 1;
			boolean expectedSixthMajorRequirement = true;
			Integer expectedSixthMajorCategory = 1;
			boolean expectedSeventhMajorRequirement = true;
			Integer expectedSeventhMajorCategory = 1;
			boolean expectedEighthMajorRequirement = true;
			Integer expectedEighthMajorCategory = 1;
			boolean expectedNinthMajorRequirement = true;
			Integer expectedNinthMajorCategory = 1;
			boolean expectedTenthMajorRequirement = true;
			Integer expectedTenthMajorCategory = 1;
			boolean expectedFirstMinorRequirement = true;
			Integer expectedFirstMinorCategory = 1;
			boolean expectedSecondMinorRequirement = true;
			Integer expectedSecondMinorCategory = 1;
			boolean expectedThirdMinorRequirement = true;
			Integer expectedThirdMinorCategory = 1;
			boolean expectedFourthMinorRequirement = true;
			Integer expectedFourthMinorCategory = 1;
			boolean expectedFifthMinorRequirement = true;
			Integer expectedFifthMinorCategory = 1;
			boolean expectedSixthMinorRequirement = true;
			Integer expectedSixthMinorCategory = 1;
			boolean expectedSeventhMinorRequirement = true;
			Integer expectedSeventhMinorCategory = 1;
			boolean expectedEighthMinorRequirement = true;
			Integer expectedEighthMinorCategory = 1;
			boolean expectedNinthMinorRequirement = true;
			Integer expectedNinthMinorCategory = 1;
			boolean expectedTenthMinorRequirement = true;
			Integer expectedTenthMinorCategory = 1;
			boolean expectedFreeElective = true;
			boolean expectedCompleted = true;
			boolean expectedConsideringEnrollment = false;
			boolean expectedCurrentEnrollment = false;
			Double expectedCredits = 4.0;
			Double expectedGpaDesired = 4.0;
			Double expectedGpaEarned = 4.0;
			String expectedCourseStartDate = "05/21/2016";
			String expectedCourseEndDate = "08/02/2016";
			Integer expectedCoursePredictedDifficulty = 3;
			Integer expectedCoursePredictedWorkload = 3;
			Integer expectedPredictedEnjoyability = 3;
			String expectedRecommendedByWho = "Jana Diesner";
			String expectedNotRecommendedByWho = "Nobody";
			String expectedProfessionalSkills = "Programming Skills";
			String expectedAcademicSkills = "Logic Based Learning";
			CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, 2,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			assertFalse(course1.equals(course2));
			assertFalse(course1 == course2);
	
		}
		@Test
		public void testAllFieldsEqualExceptFifthMinorRequirement() {
			String expectedTitle = "Learning Java";
		    String expectedInstructor = "Dr. Kevin Trainor";
			String expectedSemester = "Fall";
			Integer expectedYear = 2016;
			String expectedDepartmentCode = "LIS";
			Integer expectedCourseNumber = 452;
			String expectedSectionNumber = "1";
			String expectedInstitution = "University of Illinois";
			String expectedLocation = "Online";
			String expectedOnline = "100% Online";
			boolean expectedGeneralRequirement = true;
			Integer expectedGeneralCategory = 1;
			boolean expectedFirstMajorRequirement = true;
			Integer expectedFirstMajorCategory = 1;
			boolean expectedSecondMajorRequirement = true;
			Integer expectedSecondMajorCategory = 1;
			boolean expectedThirdMajorRequirement = true;
			Integer expectedThirdMajorCategory = 1;
			boolean expectedFourthMajorRequirement = true;
			Integer expectedFourthMajorCategory = 1 ;
			boolean expectedFifthMajorRequirement = true;
			Integer expectedFifthMajorCategory = 1;
			boolean expectedSixthMajorRequirement = true;
			Integer expectedSixthMajorCategory = 1;
			boolean expectedSeventhMajorRequirement = true;
			Integer expectedSeventhMajorCategory = 1;
			boolean expectedEighthMajorRequirement = true;
			Integer expectedEighthMajorCategory = 1;
			boolean expectedNinthMajorRequirement = true;
			Integer expectedNinthMajorCategory = 1;
			boolean expectedTenthMajorRequirement = true;
			Integer expectedTenthMajorCategory = 1;
			boolean expectedFirstMinorRequirement = true;
			Integer expectedFirstMinorCategory = 1;
			boolean expectedSecondMinorRequirement = true;
			Integer expectedSecondMinorCategory = 1;
			boolean expectedThirdMinorRequirement = true;
			Integer expectedThirdMinorCategory = 1;
			boolean expectedFourthMinorRequirement = true;
			Integer expectedFourthMinorCategory = 1;
			boolean expectedFifthMinorRequirement = true;
			Integer expectedFifthMinorCategory = 1;
			boolean expectedSixthMinorRequirement = true;
			Integer expectedSixthMinorCategory = 1;
			boolean expectedSeventhMinorRequirement = true;
			Integer expectedSeventhMinorCategory = 1;
			boolean expectedEighthMinorRequirement = true;
			Integer expectedEighthMinorCategory = 1;
			boolean expectedNinthMinorRequirement = true;
			Integer expectedNinthMinorCategory = 1;
			boolean expectedTenthMinorRequirement = true;
			Integer expectedTenthMinorCategory = 1;
			boolean expectedFreeElective = true;
			boolean expectedCompleted = true;
			boolean expectedConsideringEnrollment = false;
			boolean expectedCurrentEnrollment = false;
			Double expectedCredits = 4.0;
			Double expectedGpaDesired = 4.0;
			Double expectedGpaEarned = 4.0;
			String expectedCourseStartDate = "05/21/2016";
			String expectedCourseEndDate = "08/02/2016";
			Integer expectedCoursePredictedDifficulty = 3;
			Integer expectedCoursePredictedWorkload = 3;
			Integer expectedPredictedEnjoyability = 3;
			String expectedRecommendedByWho = "Jana Diesner";
			String expectedNotRecommendedByWho = "Nobody";
			String expectedProfessionalSkills = "Programming Skills";
			String expectedAcademicSkills = "Logic Based Learning";
			CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 false, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			assertFalse(course1.equals(course2));
			assertFalse(course1 == course2);
	
		}
		@Test
		public void testAllFieldsEqualExceptFifthMinorCategory() {
			String expectedTitle = "Learning Java";
		    String expectedInstructor = "Dr. Kevin Trainor";
			String expectedSemester = "Fall";
			Integer expectedYear = 2016;
			String expectedDepartmentCode = "LIS";
			Integer expectedCourseNumber = 452;
			String expectedSectionNumber = "1";
			String expectedInstitution = "University of Illinois";
			String expectedLocation = "Online";
			String expectedOnline = "100% Online";
			boolean expectedGeneralRequirement = true;
			Integer expectedGeneralCategory = 1;
			boolean expectedFirstMajorRequirement = true;
			Integer expectedFirstMajorCategory = 1;
			boolean expectedSecondMajorRequirement = true;
			Integer expectedSecondMajorCategory = 1;
			boolean expectedThirdMajorRequirement = true;
			Integer expectedThirdMajorCategory = 1;
			boolean expectedFourthMajorRequirement = true;
			Integer expectedFourthMajorCategory = 1 ;
			boolean expectedFifthMajorRequirement = true;
			Integer expectedFifthMajorCategory = 1;
			boolean expectedSixthMajorRequirement = true;
			Integer expectedSixthMajorCategory = 1;
			boolean expectedSeventhMajorRequirement = true;
			Integer expectedSeventhMajorCategory = 1;
			boolean expectedEighthMajorRequirement = true;
			Integer expectedEighthMajorCategory = 1;
			boolean expectedNinthMajorRequirement = true;
			Integer expectedNinthMajorCategory = 1;
			boolean expectedTenthMajorRequirement = true;
			Integer expectedTenthMajorCategory = 1;
			boolean expectedFirstMinorRequirement = true;
			Integer expectedFirstMinorCategory = 1;
			boolean expectedSecondMinorRequirement = true;
			Integer expectedSecondMinorCategory = 1;
			boolean expectedThirdMinorRequirement = true;
			Integer expectedThirdMinorCategory = 1;
			boolean expectedFourthMinorRequirement = true;
			Integer expectedFourthMinorCategory = 1;
			boolean expectedFifthMinorRequirement = true;
			Integer expectedFifthMinorCategory = 1;
			boolean expectedSixthMinorRequirement = true;
			Integer expectedSixthMinorCategory = 1;
			boolean expectedSeventhMinorRequirement = true;
			Integer expectedSeventhMinorCategory = 1;
			boolean expectedEighthMinorRequirement = true;
			Integer expectedEighthMinorCategory = 1;
			boolean expectedNinthMinorRequirement = true;
			Integer expectedNinthMinorCategory = 1;
			boolean expectedTenthMinorRequirement = true;
			Integer expectedTenthMinorCategory = 1;
			boolean expectedFreeElective = true;
			boolean expectedCompleted = true;
			boolean expectedConsideringEnrollment = false;
			boolean expectedCurrentEnrollment = false;
			Double expectedCredits = 4.0;
			Double expectedGpaDesired = 4.0;
			Double expectedGpaEarned = 4.0;
			String expectedCourseStartDate = "05/21/2016";
			String expectedCourseEndDate = "08/02/2016";
			Integer expectedCoursePredictedDifficulty = 3;
			Integer expectedCoursePredictedWorkload = 3;
			Integer expectedPredictedEnjoyability = 3;
			String expectedRecommendedByWho = "Jana Diesner";
			String expectedNotRecommendedByWho = "Nobody";
			String expectedProfessionalSkills = "Programming Skills";
			String expectedAcademicSkills = "Logic Based Learning";
			CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, 2,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			assertFalse(course1.equals(course2));
			assertFalse(course1 == course2);
	
		}
		@Test
		public void testAllFieldsEqualExceptSixthMinorRequirement() {
			String expectedTitle = "Learning Java";
		    String expectedInstructor = "Dr. Kevin Trainor";
			String expectedSemester = "Fall";
			Integer expectedYear = 2016;
			String expectedDepartmentCode = "LIS";
			Integer expectedCourseNumber = 452;
			String expectedSectionNumber = "1";
			String expectedInstitution = "University of Illinois";
			String expectedLocation = "Online";
			String expectedOnline = "100% Online";
			boolean expectedGeneralRequirement = true;
			Integer expectedGeneralCategory = 1;
			boolean expectedFirstMajorRequirement = true;
			Integer expectedFirstMajorCategory = 1;
			boolean expectedSecondMajorRequirement = true;
			Integer expectedSecondMajorCategory = 1;
			boolean expectedThirdMajorRequirement = true;
			Integer expectedThirdMajorCategory = 1;
			boolean expectedFourthMajorRequirement = true;
			Integer expectedFourthMajorCategory = 1 ;
			boolean expectedFifthMajorRequirement = true;
			Integer expectedFifthMajorCategory = 1;
			boolean expectedSixthMajorRequirement = true;
			Integer expectedSixthMajorCategory = 1;
			boolean expectedSeventhMajorRequirement = true;
			Integer expectedSeventhMajorCategory = 1;
			boolean expectedEighthMajorRequirement = true;
			Integer expectedEighthMajorCategory = 1;
			boolean expectedNinthMajorRequirement = true;
			Integer expectedNinthMajorCategory = 1;
			boolean expectedTenthMajorRequirement = true;
			Integer expectedTenthMajorCategory = 1;
			boolean expectedFirstMinorRequirement = true;
			Integer expectedFirstMinorCategory = 1;
			boolean expectedSecondMinorRequirement = true;
			Integer expectedSecondMinorCategory = 1;
			boolean expectedThirdMinorRequirement = true;
			Integer expectedThirdMinorCategory = 1;
			boolean expectedFourthMinorRequirement = true;
			Integer expectedFourthMinorCategory = 1;
			boolean expectedFifthMinorRequirement = true;
			Integer expectedFifthMinorCategory = 1;
			boolean expectedSixthMinorRequirement = true;
			Integer expectedSixthMinorCategory = 1;
			boolean expectedSeventhMinorRequirement = true;
			Integer expectedSeventhMinorCategory = 1;
			boolean expectedEighthMinorRequirement = true;
			Integer expectedEighthMinorCategory = 1;
			boolean expectedNinthMinorRequirement = true;
			Integer expectedNinthMinorCategory = 1;
			boolean expectedTenthMinorRequirement = true;
			Integer expectedTenthMinorCategory = 1;
			boolean expectedFreeElective = true;
			boolean expectedCompleted = true;
			boolean expectedConsideringEnrollment = false;
			boolean expectedCurrentEnrollment = false;
			Double expectedCredits = 4.0;
			Double expectedGpaDesired = 4.0;
			Double expectedGpaEarned = 4.0;
			String expectedCourseStartDate = "05/21/2016";
			String expectedCourseEndDate = "08/02/2016";
			Integer expectedCoursePredictedDifficulty = 3;
			Integer expectedCoursePredictedWorkload = 3;
			Integer expectedPredictedEnjoyability = 3;
			String expectedRecommendedByWho = "Jana Diesner";
			String expectedNotRecommendedByWho = "Nobody";
			String expectedProfessionalSkills = "Programming Skills";
			String expectedAcademicSkills = "Logic Based Learning";
			CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 false, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			assertFalse(course1.equals(course2));
			assertFalse(course1 == course2);
	
		}
		@Test
		public void testAllFieldsEqualExceptSixthMinorCategory() {
			String expectedTitle = "Learning Java";
		    String expectedInstructor = "Dr. Kevin Trainor";
			String expectedSemester = "Fall";
			Integer expectedYear = 2016;
			String expectedDepartmentCode = "LIS";
			Integer expectedCourseNumber = 452;
			String expectedSectionNumber = "1";
			String expectedInstitution = "University of Illinois";
			String expectedLocation = "Online";
			String expectedOnline = "100% Online";
			boolean expectedGeneralRequirement = true;
			Integer expectedGeneralCategory = 1;
			boolean expectedFirstMajorRequirement = true;
			Integer expectedFirstMajorCategory = 1;
			boolean expectedSecondMajorRequirement = true;
			Integer expectedSecondMajorCategory = 1;
			boolean expectedThirdMajorRequirement = true;
			Integer expectedThirdMajorCategory = 1;
			boolean expectedFourthMajorRequirement = true;
			Integer expectedFourthMajorCategory = 1 ;
			boolean expectedFifthMajorRequirement = true;
			Integer expectedFifthMajorCategory = 1;
			boolean expectedSixthMajorRequirement = true;
			Integer expectedSixthMajorCategory = 1;
			boolean expectedSeventhMajorRequirement = true;
			Integer expectedSeventhMajorCategory = 1;
			boolean expectedEighthMajorRequirement = true;
			Integer expectedEighthMajorCategory = 1;
			boolean expectedNinthMajorRequirement = true;
			Integer expectedNinthMajorCategory = 1;
			boolean expectedTenthMajorRequirement = true;
			Integer expectedTenthMajorCategory = 1;
			boolean expectedFirstMinorRequirement = true;
			Integer expectedFirstMinorCategory = 1;
			boolean expectedSecondMinorRequirement = true;
			Integer expectedSecondMinorCategory = 1;
			boolean expectedThirdMinorRequirement = true;
			Integer expectedThirdMinorCategory = 1;
			boolean expectedFourthMinorRequirement = true;
			Integer expectedFourthMinorCategory = 1;
			boolean expectedFifthMinorRequirement = true;
			Integer expectedFifthMinorCategory = 1;
			boolean expectedSixthMinorRequirement = true;
			Integer expectedSixthMinorCategory = 1;
			boolean expectedSeventhMinorRequirement = true;
			Integer expectedSeventhMinorCategory = 1;
			boolean expectedEighthMinorRequirement = true;
			Integer expectedEighthMinorCategory = 1;
			boolean expectedNinthMinorRequirement = true;
			Integer expectedNinthMinorCategory = 1;
			boolean expectedTenthMinorRequirement = true;
			Integer expectedTenthMinorCategory = 1;
			boolean expectedFreeElective = true;
			boolean expectedCompleted = true;
			boolean expectedConsideringEnrollment = false;
			boolean expectedCurrentEnrollment = false;
			Double expectedCredits = 4.0;
			Double expectedGpaDesired = 4.0;
			Double expectedGpaEarned = 4.0;
			String expectedCourseStartDate = "05/21/2016";
			String expectedCourseEndDate = "08/02/2016";
			Integer expectedCoursePredictedDifficulty = 3;
			Integer expectedCoursePredictedWorkload = 3;
			Integer expectedPredictedEnjoyability = 3;
			String expectedRecommendedByWho = "Jana Diesner";
			String expectedNotRecommendedByWho = "Nobody";
			String expectedProfessionalSkills = "Programming Skills";
			String expectedAcademicSkills = "Logic Based Learning";
			CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, 2,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			assertFalse(course1.equals(course2));
			assertFalse(course1 == course2);
	
		}
		@Test
		public void testAllFieldsEqualExceptSeventhMinorRequirement() {
			String expectedTitle = "Learning Java";
		    String expectedInstructor = "Dr. Kevin Trainor";
			String expectedSemester = "Fall";
			Integer expectedYear = 2016;
			String expectedDepartmentCode = "LIS";
			Integer expectedCourseNumber = 452;
			String expectedSectionNumber = "1";
			String expectedInstitution = "University of Illinois";
			String expectedLocation = "Online";
			String expectedOnline = "100% Online";
			boolean expectedGeneralRequirement = true;
			Integer expectedGeneralCategory = 1;
			boolean expectedFirstMajorRequirement = true;
			Integer expectedFirstMajorCategory = 1;
			boolean expectedSecondMajorRequirement = true;
			Integer expectedSecondMajorCategory = 1;
			boolean expectedThirdMajorRequirement = true;
			Integer expectedThirdMajorCategory = 1;
			boolean expectedFourthMajorRequirement = true;
			Integer expectedFourthMajorCategory = 1 ;
			boolean expectedFifthMajorRequirement = true;
			Integer expectedFifthMajorCategory = 1;
			boolean expectedSixthMajorRequirement = true;
			Integer expectedSixthMajorCategory = 1;
			boolean expectedSeventhMajorRequirement = true;
			Integer expectedSeventhMajorCategory = 1;
			boolean expectedEighthMajorRequirement = true;
			Integer expectedEighthMajorCategory = 1;
			boolean expectedNinthMajorRequirement = true;
			Integer expectedNinthMajorCategory = 1;
			boolean expectedTenthMajorRequirement = true;
			Integer expectedTenthMajorCategory = 1;
			boolean expectedFirstMinorRequirement = true;
			Integer expectedFirstMinorCategory = 1;
			boolean expectedSecondMinorRequirement = true;
			Integer expectedSecondMinorCategory = 1;
			boolean expectedThirdMinorRequirement = true;
			Integer expectedThirdMinorCategory = 1;
			boolean expectedFourthMinorRequirement = true;
			Integer expectedFourthMinorCategory = 1;
			boolean expectedFifthMinorRequirement = true;
			Integer expectedFifthMinorCategory = 1;
			boolean expectedSixthMinorRequirement = true;
			Integer expectedSixthMinorCategory = 1;
			boolean expectedSeventhMinorRequirement = true;
			Integer expectedSeventhMinorCategory = 1;
			boolean expectedEighthMinorRequirement = true;
			Integer expectedEighthMinorCategory = 1;
			boolean expectedNinthMinorRequirement = true;
			Integer expectedNinthMinorCategory = 1;
			boolean expectedTenthMinorRequirement = true;
			Integer expectedTenthMinorCategory = 1;
			boolean expectedFreeElective = true;
			boolean expectedCompleted = true;
			boolean expectedConsideringEnrollment = false;
			boolean expectedCurrentEnrollment = false;
			Double expectedCredits = 4.0;
			Double expectedGpaDesired = 4.0;
			Double expectedGpaEarned = 4.0;
			String expectedCourseStartDate = "05/21/2016";
			String expectedCourseEndDate = "08/02/2016";
			Integer expectedCoursePredictedDifficulty = 3;
			Integer expectedCoursePredictedWorkload = 3;
			Integer expectedPredictedEnjoyability = 3;
			String expectedRecommendedByWho = "Jana Diesner";
			String expectedNotRecommendedByWho = "Nobody";
			String expectedProfessionalSkills = "Programming Skills";
			String expectedAcademicSkills = "Logic Based Learning";
			CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 false, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			assertFalse(course1.equals(course2));
			assertFalse(course1 == course2);
	
		}
		@Test
		public void testAllFieldsEqualExceptSeventhMinorCategory() {
			String expectedTitle = "Learning Java";
		    String expectedInstructor = "Dr. Kevin Trainor";
			String expectedSemester = "Fall";
			Integer expectedYear = 2016;
			String expectedDepartmentCode = "LIS";
			Integer expectedCourseNumber = 452;
			String expectedSectionNumber = "1";
			String expectedInstitution = "University of Illinois";
			String expectedLocation = "Online";
			String expectedOnline = "100% Online";
			boolean expectedGeneralRequirement = true;
			Integer expectedGeneralCategory = 1;
			boolean expectedFirstMajorRequirement = true;
			Integer expectedFirstMajorCategory = 1;
			boolean expectedSecondMajorRequirement = true;
			Integer expectedSecondMajorCategory = 1;
			boolean expectedThirdMajorRequirement = true;
			Integer expectedThirdMajorCategory = 1;
			boolean expectedFourthMajorRequirement = true;
			Integer expectedFourthMajorCategory = 1 ;
			boolean expectedFifthMajorRequirement = true;
			Integer expectedFifthMajorCategory = 1;
			boolean expectedSixthMajorRequirement = true;
			Integer expectedSixthMajorCategory = 1;
			boolean expectedSeventhMajorRequirement = true;
			Integer expectedSeventhMajorCategory = 1;
			boolean expectedEighthMajorRequirement = true;
			Integer expectedEighthMajorCategory = 1;
			boolean expectedNinthMajorRequirement = true;
			Integer expectedNinthMajorCategory = 1;
			boolean expectedTenthMajorRequirement = true;
			Integer expectedTenthMajorCategory = 1;
			boolean expectedFirstMinorRequirement = true;
			Integer expectedFirstMinorCategory = 1;
			boolean expectedSecondMinorRequirement = true;
			Integer expectedSecondMinorCategory = 1;
			boolean expectedThirdMinorRequirement = true;
			Integer expectedThirdMinorCategory = 1;
			boolean expectedFourthMinorRequirement = true;
			Integer expectedFourthMinorCategory = 1;
			boolean expectedFifthMinorRequirement = true;
			Integer expectedFifthMinorCategory = 1;
			boolean expectedSixthMinorRequirement = true;
			Integer expectedSixthMinorCategory = 1;
			boolean expectedSeventhMinorRequirement = true;
			Integer expectedSeventhMinorCategory = 1;
			boolean expectedEighthMinorRequirement = true;
			Integer expectedEighthMinorCategory = 1;
			boolean expectedNinthMinorRequirement = true;
			Integer expectedNinthMinorCategory = 1;
			boolean expectedTenthMinorRequirement = true;
			Integer expectedTenthMinorCategory = 1;
			boolean expectedFreeElective = true;
			boolean expectedCompleted = true;
			boolean expectedConsideringEnrollment = false;
			boolean expectedCurrentEnrollment = false;
			Double expectedCredits = 4.0;
			Double expectedGpaDesired = 4.0;
			Double expectedGpaEarned = 4.0;
			String expectedCourseStartDate = "05/21/2016";
			String expectedCourseEndDate = "08/02/2016";
			Integer expectedCoursePredictedDifficulty = 3;
			Integer expectedCoursePredictedWorkload = 3;
			Integer expectedPredictedEnjoyability = 3;
			String expectedRecommendedByWho = "Jana Diesner";
			String expectedNotRecommendedByWho = "Nobody";
			String expectedProfessionalSkills = "Programming Skills";
			String expectedAcademicSkills = "Logic Based Learning";
			CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, 2,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			assertFalse(course1.equals(course2));
			assertFalse(course1 == course2);
	
		}
		@Test
		public void testAllFieldsEqualExceptEigthMinorRequirement() {
			String expectedTitle = "Learning Java";
		    String expectedInstructor = "Dr. Kevin Trainor";
			String expectedSemester = "Fall";
			Integer expectedYear = 2016;
			String expectedDepartmentCode = "LIS";
			Integer expectedCourseNumber = 452;
			String expectedSectionNumber = "1";
			String expectedInstitution = "University of Illinois";
			String expectedLocation = "Online";
			String expectedOnline = "100% Online";
			boolean expectedGeneralRequirement = true;
			Integer expectedGeneralCategory = 1;
			boolean expectedFirstMajorRequirement = true;
			Integer expectedFirstMajorCategory = 1;
			boolean expectedSecondMajorRequirement = true;
			Integer expectedSecondMajorCategory = 1;
			boolean expectedThirdMajorRequirement = true;
			Integer expectedThirdMajorCategory = 1;
			boolean expectedFourthMajorRequirement = true;
			Integer expectedFourthMajorCategory = 1 ;
			boolean expectedFifthMajorRequirement = true;
			Integer expectedFifthMajorCategory = 1;
			boolean expectedSixthMajorRequirement = true;
			Integer expectedSixthMajorCategory = 1;
			boolean expectedSeventhMajorRequirement = true;
			Integer expectedSeventhMajorCategory = 1;
			boolean expectedEighthMajorRequirement = true;
			Integer expectedEighthMajorCategory = 1;
			boolean expectedNinthMajorRequirement = true;
			Integer expectedNinthMajorCategory = 1;
			boolean expectedTenthMajorRequirement = true;
			Integer expectedTenthMajorCategory = 1;
			boolean expectedFirstMinorRequirement = true;
			Integer expectedFirstMinorCategory = 1;
			boolean expectedSecondMinorRequirement = true;
			Integer expectedSecondMinorCategory = 1;
			boolean expectedThirdMinorRequirement = true;
			Integer expectedThirdMinorCategory = 1;
			boolean expectedFourthMinorRequirement = true;
			Integer expectedFourthMinorCategory = 1;
			boolean expectedFifthMinorRequirement = true;
			Integer expectedFifthMinorCategory = 1;
			boolean expectedSixthMinorRequirement = true;
			Integer expectedSixthMinorCategory = 1;
			boolean expectedSeventhMinorRequirement = true;
			Integer expectedSeventhMinorCategory = 1;
			boolean expectedEighthMinorRequirement = true;
			Integer expectedEighthMinorCategory = 1;
			boolean expectedNinthMinorRequirement = true;
			Integer expectedNinthMinorCategory = 1;
			boolean expectedTenthMinorRequirement = true;
			Integer expectedTenthMinorCategory = 1;
			boolean expectedFreeElective = true;
			boolean expectedCompleted = true;
			boolean expectedConsideringEnrollment = false;
			boolean expectedCurrentEnrollment = false;
			Double expectedCredits = 4.0;
			Double expectedGpaDesired = 4.0;
			Double expectedGpaEarned = 4.0;
			String expectedCourseStartDate = "05/21/2016";
			String expectedCourseEndDate = "08/02/2016";
			Integer expectedCoursePredictedDifficulty = 3;
			Integer expectedCoursePredictedWorkload = 3;
			Integer expectedPredictedEnjoyability = 3;
			String expectedRecommendedByWho = "Jana Diesner";
			String expectedNotRecommendedByWho = "Nobody";
			String expectedProfessionalSkills = "Programming Skills";
			String expectedAcademicSkills = "Logic Based Learning";
			CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 false, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			assertFalse(course1.equals(course2));
			assertFalse(course1 == course2);
	
		}
		@Test
		public void testAllFieldsEqualExceptEigthMinorCategory() {
			String expectedTitle = "Learning Java";
		    String expectedInstructor = "Dr. Kevin Trainor";
			String expectedSemester = "Fall";
			Integer expectedYear = 2016;
			String expectedDepartmentCode = "LIS";
			Integer expectedCourseNumber = 452;
			String expectedSectionNumber = "1";
			String expectedInstitution = "University of Illinois";
			String expectedLocation = "Online";
			String expectedOnline = "100% Online";
			boolean expectedGeneralRequirement = true;
			Integer expectedGeneralCategory = 1;
			boolean expectedFirstMajorRequirement = true;
			Integer expectedFirstMajorCategory = 1;
			boolean expectedSecondMajorRequirement = true;
			Integer expectedSecondMajorCategory = 1;
			boolean expectedThirdMajorRequirement = true;
			Integer expectedThirdMajorCategory = 1;
			boolean expectedFourthMajorRequirement = true;
			Integer expectedFourthMajorCategory = 1 ;
			boolean expectedFifthMajorRequirement = true;
			Integer expectedFifthMajorCategory = 1;
			boolean expectedSixthMajorRequirement = true;
			Integer expectedSixthMajorCategory = 1;
			boolean expectedSeventhMajorRequirement = true;
			Integer expectedSeventhMajorCategory = 1;
			boolean expectedEighthMajorRequirement = true;
			Integer expectedEighthMajorCategory = 1;
			boolean expectedNinthMajorRequirement = true;
			Integer expectedNinthMajorCategory = 1;
			boolean expectedTenthMajorRequirement = true;
			Integer expectedTenthMajorCategory = 1;
			boolean expectedFirstMinorRequirement = true;
			Integer expectedFirstMinorCategory = 1;
			boolean expectedSecondMinorRequirement = true;
			Integer expectedSecondMinorCategory = 1;
			boolean expectedThirdMinorRequirement = true;
			Integer expectedThirdMinorCategory = 1;
			boolean expectedFourthMinorRequirement = true;
			Integer expectedFourthMinorCategory = 1;
			boolean expectedFifthMinorRequirement = true;
			Integer expectedFifthMinorCategory = 1;
			boolean expectedSixthMinorRequirement = true;
			Integer expectedSixthMinorCategory = 1;
			boolean expectedSeventhMinorRequirement = true;
			Integer expectedSeventhMinorCategory = 1;
			boolean expectedEighthMinorRequirement = true;
			Integer expectedEighthMinorCategory = 1;
			boolean expectedNinthMinorRequirement = true;
			Integer expectedNinthMinorCategory = 1;
			boolean expectedTenthMinorRequirement = true;
			Integer expectedTenthMinorCategory = 1;
			boolean expectedFreeElective = true;
			boolean expectedCompleted = true;
			boolean expectedConsideringEnrollment = false;
			boolean expectedCurrentEnrollment = false;
			Double expectedCredits = 4.0;
			Double expectedGpaDesired = 4.0;
			Double expectedGpaEarned = 4.0;
			String expectedCourseStartDate = "05/21/2016";
			String expectedCourseEndDate = "08/02/2016";
			Integer expectedCoursePredictedDifficulty = 3;
			Integer expectedCoursePredictedWorkload = 3;
			Integer expectedPredictedEnjoyability = 3;
			String expectedRecommendedByWho = "Jana Diesner";
			String expectedNotRecommendedByWho = "Nobody";
			String expectedProfessionalSkills = "Programming Skills";
			String expectedAcademicSkills = "Logic Based Learning";
			CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, 2,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			assertFalse(course1.equals(course2));
			assertFalse(course1 == course2);
	
		}
		@Test
		public void testAllFieldsEqualExceptNinthMinorRequirement() {
			String expectedTitle = "Learning Java";
		    String expectedInstructor = "Dr. Kevin Trainor";
			String expectedSemester = "Fall";
			Integer expectedYear = 2016;
			String expectedDepartmentCode = "LIS";
			Integer expectedCourseNumber = 452;
			String expectedSectionNumber = "1";
			String expectedInstitution = "University of Illinois";
			String expectedLocation = "Online";
			String expectedOnline = "100% Online";
			boolean expectedGeneralRequirement = true;
			Integer expectedGeneralCategory = 1;
			boolean expectedFirstMajorRequirement = true;
			Integer expectedFirstMajorCategory = 1;
			boolean expectedSecondMajorRequirement = true;
			Integer expectedSecondMajorCategory = 1;
			boolean expectedThirdMajorRequirement = true;
			Integer expectedThirdMajorCategory = 1;
			boolean expectedFourthMajorRequirement = true;
			Integer expectedFourthMajorCategory = 1 ;
			boolean expectedFifthMajorRequirement = true;
			Integer expectedFifthMajorCategory = 1;
			boolean expectedSixthMajorRequirement = true;
			Integer expectedSixthMajorCategory = 1;
			boolean expectedSeventhMajorRequirement = true;
			Integer expectedSeventhMajorCategory = 1;
			boolean expectedEighthMajorRequirement = true;
			Integer expectedEighthMajorCategory = 1;
			boolean expectedNinthMajorRequirement = true;
			Integer expectedNinthMajorCategory = 1;
			boolean expectedTenthMajorRequirement = true;
			Integer expectedTenthMajorCategory = 1;
			boolean expectedFirstMinorRequirement = true;
			Integer expectedFirstMinorCategory = 1;
			boolean expectedSecondMinorRequirement = true;
			Integer expectedSecondMinorCategory = 1;
			boolean expectedThirdMinorRequirement = true;
			Integer expectedThirdMinorCategory = 1;
			boolean expectedFourthMinorRequirement = true;
			Integer expectedFourthMinorCategory = 1;
			boolean expectedFifthMinorRequirement = true;
			Integer expectedFifthMinorCategory = 1;
			boolean expectedSixthMinorRequirement = true;
			Integer expectedSixthMinorCategory = 1;
			boolean expectedSeventhMinorRequirement = true;
			Integer expectedSeventhMinorCategory = 1;
			boolean expectedEighthMinorRequirement = true;
			Integer expectedEighthMinorCategory = 1;
			boolean expectedNinthMinorRequirement = true;
			Integer expectedNinthMinorCategory = 1;
			boolean expectedTenthMinorRequirement = true;
			Integer expectedTenthMinorCategory = 1;
			boolean expectedFreeElective = true;
			boolean expectedCompleted = true;
			boolean expectedConsideringEnrollment = false;
			boolean expectedCurrentEnrollment = false;
			Double expectedCredits = 4.0;
			Double expectedGpaDesired = 4.0;
			Double expectedGpaEarned = 4.0;
			String expectedCourseStartDate = "05/21/2016";
			String expectedCourseEndDate = "08/02/2016";
			Integer expectedCoursePredictedDifficulty = 3;
			Integer expectedCoursePredictedWorkload = 3;
			Integer expectedPredictedEnjoyability = 3;
			String expectedRecommendedByWho = "Jana Diesner";
			String expectedNotRecommendedByWho = "Nobody";
			String expectedProfessionalSkills = "Programming Skills";
			String expectedAcademicSkills = "Logic Based Learning";
			CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 false, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			assertFalse(course1.equals(course2));
			assertFalse(course1 == course2);
	
		}
		@Test
		public void testAllFieldsEqualExceptNinthMinorCategory() {
			String expectedTitle = "Learning Java";
		    String expectedInstructor = "Dr. Kevin Trainor";
			String expectedSemester = "Fall";
			Integer expectedYear = 2016;
			String expectedDepartmentCode = "LIS";
			Integer expectedCourseNumber = 452;
			String expectedSectionNumber = "1";
			String expectedInstitution = "University of Illinois";
			String expectedLocation = "Online";
			String expectedOnline = "100% Online";
			boolean expectedGeneralRequirement = true;
			Integer expectedGeneralCategory = 1;
			boolean expectedFirstMajorRequirement = true;
			Integer expectedFirstMajorCategory = 1;
			boolean expectedSecondMajorRequirement = true;
			Integer expectedSecondMajorCategory = 1;
			boolean expectedThirdMajorRequirement = true;
			Integer expectedThirdMajorCategory = 1;
			boolean expectedFourthMajorRequirement = true;
			Integer expectedFourthMajorCategory = 1 ;
			boolean expectedFifthMajorRequirement = true;
			Integer expectedFifthMajorCategory = 1;
			boolean expectedSixthMajorRequirement = true;
			Integer expectedSixthMajorCategory = 1;
			boolean expectedSeventhMajorRequirement = true;
			Integer expectedSeventhMajorCategory = 1;
			boolean expectedEighthMajorRequirement = true;
			Integer expectedEighthMajorCategory = 1;
			boolean expectedNinthMajorRequirement = true;
			Integer expectedNinthMajorCategory = 1;
			boolean expectedTenthMajorRequirement = true;
			Integer expectedTenthMajorCategory = 1;
			boolean expectedFirstMinorRequirement = true;
			Integer expectedFirstMinorCategory = 1;
			boolean expectedSecondMinorRequirement = true;
			Integer expectedSecondMinorCategory = 1;
			boolean expectedThirdMinorRequirement = true;
			Integer expectedThirdMinorCategory = 1;
			boolean expectedFourthMinorRequirement = true;
			Integer expectedFourthMinorCategory = 1;
			boolean expectedFifthMinorRequirement = true;
			Integer expectedFifthMinorCategory = 1;
			boolean expectedSixthMinorRequirement = true;
			Integer expectedSixthMinorCategory = 1;
			boolean expectedSeventhMinorRequirement = true;
			Integer expectedSeventhMinorCategory = 1;
			boolean expectedEighthMinorRequirement = true;
			Integer expectedEighthMinorCategory = 1;
			boolean expectedNinthMinorRequirement = true;
			Integer expectedNinthMinorCategory = 1;
			boolean expectedTenthMinorRequirement = true;
			Integer expectedTenthMinorCategory = 1;
			boolean expectedFreeElective = true;
			boolean expectedCompleted = true;
			boolean expectedConsideringEnrollment = false;
			boolean expectedCurrentEnrollment = false;
			Double expectedCredits = 4.0;
			Double expectedGpaDesired = 4.0;
			Double expectedGpaEarned = 4.0;
			String expectedCourseStartDate = "05/21/2016";
			String expectedCourseEndDate = "08/02/2016";
			Integer expectedCoursePredictedDifficulty = 3;
			Integer expectedCoursePredictedWorkload = 3;
			Integer expectedPredictedEnjoyability = 3;
			String expectedRecommendedByWho = "Jana Diesner";
			String expectedNotRecommendedByWho = "Nobody";
			String expectedProfessionalSkills = "Programming Skills";
			String expectedAcademicSkills = "Logic Based Learning";
			CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, 2,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			assertFalse(course1.equals(course2));
			assertFalse(course1 == course2);
	
		}
		@Test
		public void testAllFieldsEqualExceptTenthMinorRequirement() {
			String expectedTitle = "Learning Java";
		    String expectedInstructor = "Dr. Kevin Trainor";
			String expectedSemester = "Fall";
			Integer expectedYear = 2016;
			String expectedDepartmentCode = "LIS";
			Integer expectedCourseNumber = 452;
			String expectedSectionNumber = "1";
			String expectedInstitution = "University of Illinois";
			String expectedLocation = "Online";
			String expectedOnline = "100% Online";
			boolean expectedGeneralRequirement = true;
			Integer expectedGeneralCategory = 1;
			boolean expectedFirstMajorRequirement = true;
			Integer expectedFirstMajorCategory = 1;
			boolean expectedSecondMajorRequirement = true;
			Integer expectedSecondMajorCategory = 1;
			boolean expectedThirdMajorRequirement = true;
			Integer expectedThirdMajorCategory = 1;
			boolean expectedFourthMajorRequirement = true;
			Integer expectedFourthMajorCategory = 1 ;
			boolean expectedFifthMajorRequirement = true;
			Integer expectedFifthMajorCategory = 1;
			boolean expectedSixthMajorRequirement = true;
			Integer expectedSixthMajorCategory = 1;
			boolean expectedSeventhMajorRequirement = true;
			Integer expectedSeventhMajorCategory = 1;
			boolean expectedEighthMajorRequirement = true;
			Integer expectedEighthMajorCategory = 1;
			boolean expectedNinthMajorRequirement = true;
			Integer expectedNinthMajorCategory = 1;
			boolean expectedTenthMajorRequirement = true;
			Integer expectedTenthMajorCategory = 1;
			boolean expectedFirstMinorRequirement = true;
			Integer expectedFirstMinorCategory = 1;
			boolean expectedSecondMinorRequirement = true;
			Integer expectedSecondMinorCategory = 1;
			boolean expectedThirdMinorRequirement = true;
			Integer expectedThirdMinorCategory = 1;
			boolean expectedFourthMinorRequirement = true;
			Integer expectedFourthMinorCategory = 1;
			boolean expectedFifthMinorRequirement = true;
			Integer expectedFifthMinorCategory = 1;
			boolean expectedSixthMinorRequirement = true;
			Integer expectedSixthMinorCategory = 1;
			boolean expectedSeventhMinorRequirement = true;
			Integer expectedSeventhMinorCategory = 1;
			boolean expectedEighthMinorRequirement = true;
			Integer expectedEighthMinorCategory = 1;
			boolean expectedNinthMinorRequirement = true;
			Integer expectedNinthMinorCategory = 1;
			boolean expectedTenthMinorRequirement = true;
			Integer expectedTenthMinorCategory = 1;
			boolean expectedFreeElective = true;
			boolean expectedCompleted = true;
			boolean expectedConsideringEnrollment = false;
			boolean expectedCurrentEnrollment = false;
			Double expectedCredits = 4.0;
			Double expectedGpaDesired = 4.0;
			Double expectedGpaEarned = 4.0;
			String expectedCourseStartDate = "05/21/2016";
			String expectedCourseEndDate = "08/02/2016";
			Integer expectedCoursePredictedDifficulty = 3;
			Integer expectedCoursePredictedWorkload = 3;
			Integer expectedPredictedEnjoyability = 3;
			String expectedRecommendedByWho = "Jana Diesner";
			String expectedNotRecommendedByWho = "Nobody";
			String expectedProfessionalSkills = "Programming Skills";
			String expectedAcademicSkills = "Logic Based Learning";
			CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 false, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			assertFalse(course1.equals(course2));
			assertFalse(course1 == course2);
	
		}
		@Test
		public void testAllFieldsEqualExceptTenthMinorCategory() {
			String expectedTitle = "Learning Java";
		    String expectedInstructor = "Dr. Kevin Trainor";
			String expectedSemester = "Fall";
			Integer expectedYear = 2016;
			String expectedDepartmentCode = "LIS";
			Integer expectedCourseNumber = 452;
			String expectedSectionNumber = "1";
			String expectedInstitution = "University of Illinois";
			String expectedLocation = "Online";
			String expectedOnline = "100% Online";
			boolean expectedGeneralRequirement = true;
			Integer expectedGeneralCategory = 1;
			boolean expectedFirstMajorRequirement = true;
			Integer expectedFirstMajorCategory = 1;
			boolean expectedSecondMajorRequirement = true;
			Integer expectedSecondMajorCategory = 1;
			boolean expectedThirdMajorRequirement = true;
			Integer expectedThirdMajorCategory = 1;
			boolean expectedFourthMajorRequirement = true;
			Integer expectedFourthMajorCategory = 1 ;
			boolean expectedFifthMajorRequirement = true;
			Integer expectedFifthMajorCategory = 1;
			boolean expectedSixthMajorRequirement = true;
			Integer expectedSixthMajorCategory = 1;
			boolean expectedSeventhMajorRequirement = true;
			Integer expectedSeventhMajorCategory = 1;
			boolean expectedEighthMajorRequirement = true;
			Integer expectedEighthMajorCategory = 1;
			boolean expectedNinthMajorRequirement = true;
			Integer expectedNinthMajorCategory = 1;
			boolean expectedTenthMajorRequirement = true;
			Integer expectedTenthMajorCategory = 1;
			boolean expectedFirstMinorRequirement = true;
			Integer expectedFirstMinorCategory = 1;
			boolean expectedSecondMinorRequirement = true;
			Integer expectedSecondMinorCategory = 1;
			boolean expectedThirdMinorRequirement = true;
			Integer expectedThirdMinorCategory = 1;
			boolean expectedFourthMinorRequirement = true;
			Integer expectedFourthMinorCategory = 1;
			boolean expectedFifthMinorRequirement = true;
			Integer expectedFifthMinorCategory = 1;
			boolean expectedSixthMinorRequirement = true;
			Integer expectedSixthMinorCategory = 1;
			boolean expectedSeventhMinorRequirement = true;
			Integer expectedSeventhMinorCategory = 1;
			boolean expectedEighthMinorRequirement = true;
			Integer expectedEighthMinorCategory = 1;
			boolean expectedNinthMinorRequirement = true;
			Integer expectedNinthMinorCategory = 1;
			boolean expectedTenthMinorRequirement = true;
			Integer expectedTenthMinorCategory = 1;
			boolean expectedFreeElective = true;
			boolean expectedCompleted = true;
			boolean expectedConsideringEnrollment = false;
			boolean expectedCurrentEnrollment = false;
			Double expectedCredits = 4.0;
			Double expectedGpaDesired = 4.0;
			Double expectedGpaEarned = 4.0;
			String expectedCourseStartDate = "05/21/2016";
			String expectedCourseEndDate = "08/02/2016";
			Integer expectedCoursePredictedDifficulty = 3;
			Integer expectedCoursePredictedWorkload = 3;
			Integer expectedPredictedEnjoyability = 3;
			String expectedRecommendedByWho = "Jana Diesner";
			String expectedNotRecommendedByWho = "Nobody";
			String expectedProfessionalSkills = "Programming Skills";
			String expectedAcademicSkills = "Logic Based Learning";
			CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, 2,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			assertFalse(course1.equals(course2));
			assertFalse(course1 == course2);
	
		}
		@Test
		public void testAllFieldsEqualExceptFreeElective() {
			String expectedTitle = "Learning Java";
		    String expectedInstructor = "Dr. Kevin Trainor";
			String expectedSemester = "Fall";
			Integer expectedYear = 2016;
			String expectedDepartmentCode = "LIS";
			Integer expectedCourseNumber = 452;
			String expectedSectionNumber = "1";
			String expectedInstitution = "University of Illinois";
			String expectedLocation = "Online";
			String expectedOnline = "100% Online";
			boolean expectedGeneralRequirement = true;
			Integer expectedGeneralCategory = 1;
			boolean expectedFirstMajorRequirement = true;
			Integer expectedFirstMajorCategory = 1;
			boolean expectedSecondMajorRequirement = true;
			Integer expectedSecondMajorCategory = 1;
			boolean expectedThirdMajorRequirement = true;
			Integer expectedThirdMajorCategory = 1;
			boolean expectedFourthMajorRequirement = true;
			Integer expectedFourthMajorCategory = 1 ;
			boolean expectedFifthMajorRequirement = true;
			Integer expectedFifthMajorCategory = 1;
			boolean expectedSixthMajorRequirement = true;
			Integer expectedSixthMajorCategory = 1;
			boolean expectedSeventhMajorRequirement = true;
			Integer expectedSeventhMajorCategory = 1;
			boolean expectedEighthMajorRequirement = true;
			Integer expectedEighthMajorCategory = 1;
			boolean expectedNinthMajorRequirement = true;
			Integer expectedNinthMajorCategory = 1;
			boolean expectedTenthMajorRequirement = true;
			Integer expectedTenthMajorCategory = 1;
			boolean expectedFirstMinorRequirement = true;
			Integer expectedFirstMinorCategory = 1;
			boolean expectedSecondMinorRequirement = true;
			Integer expectedSecondMinorCategory = 1;
			boolean expectedThirdMinorRequirement = true;
			Integer expectedThirdMinorCategory = 1;
			boolean expectedFourthMinorRequirement = true;
			Integer expectedFourthMinorCategory = 1;
			boolean expectedFifthMinorRequirement = true;
			Integer expectedFifthMinorCategory = 1;
			boolean expectedSixthMinorRequirement = true;
			Integer expectedSixthMinorCategory = 1;
			boolean expectedSeventhMinorRequirement = true;
			Integer expectedSeventhMinorCategory = 1;
			boolean expectedEighthMinorRequirement = true;
			Integer expectedEighthMinorCategory = 1;
			boolean expectedNinthMinorRequirement = true;
			Integer expectedNinthMinorCategory = 1;
			boolean expectedTenthMinorRequirement = true;
			Integer expectedTenthMinorCategory = 1;
			boolean expectedFreeElective = true;
			boolean expectedCompleted = true;
			boolean expectedConsideringEnrollment = false;
			boolean expectedCurrentEnrollment = false;
			Double expectedCredits = 4.0;
			Double expectedGpaDesired = 4.0;
			Double expectedGpaEarned = 4.0;
			String expectedCourseStartDate = "05/21/2016";
			String expectedCourseEndDate = "08/02/2016";
			Integer expectedCoursePredictedDifficulty = 3;
			Integer expectedCoursePredictedWorkload = 3;
			Integer expectedPredictedEnjoyability = 3;
			String expectedRecommendedByWho = "Jana Diesner";
			String expectedNotRecommendedByWho = "Nobody";
			String expectedProfessionalSkills = "Programming Skills";
			String expectedAcademicSkills = "Logic Based Learning";
			CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 false, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			assertFalse(course1.equals(course2));
			assertFalse(course1 == course2);
	
		}
		@Test
		public void testAllFieldsEqualExceptCompleted() {
			String expectedTitle = "Learning Java";
		    String expectedInstructor = "Dr. Kevin Trainor";
			String expectedSemester = "Fall";
			Integer expectedYear = 2016;
			String expectedDepartmentCode = "LIS";
			Integer expectedCourseNumber = 452;
			String expectedSectionNumber = "1";
			String expectedInstitution = "University of Illinois";
			String expectedLocation = "Online";
			String expectedOnline = "100% Online";
			boolean expectedGeneralRequirement = true;
			Integer expectedGeneralCategory = 1;
			boolean expectedFirstMajorRequirement = true;
			Integer expectedFirstMajorCategory = 1;
			boolean expectedSecondMajorRequirement = true;
			Integer expectedSecondMajorCategory = 1;
			boolean expectedThirdMajorRequirement = true;
			Integer expectedThirdMajorCategory = 1;
			boolean expectedFourthMajorRequirement = true;
			Integer expectedFourthMajorCategory = 1 ;
			boolean expectedFifthMajorRequirement = true;
			Integer expectedFifthMajorCategory = 1;
			boolean expectedSixthMajorRequirement = true;
			Integer expectedSixthMajorCategory = 1;
			boolean expectedSeventhMajorRequirement = true;
			Integer expectedSeventhMajorCategory = 1;
			boolean expectedEighthMajorRequirement = true;
			Integer expectedEighthMajorCategory = 1;
			boolean expectedNinthMajorRequirement = true;
			Integer expectedNinthMajorCategory = 1;
			boolean expectedTenthMajorRequirement = true;
			Integer expectedTenthMajorCategory = 1;
			boolean expectedFirstMinorRequirement = true;
			Integer expectedFirstMinorCategory = 1;
			boolean expectedSecondMinorRequirement = true;
			Integer expectedSecondMinorCategory = 1;
			boolean expectedThirdMinorRequirement = true;
			Integer expectedThirdMinorCategory = 1;
			boolean expectedFourthMinorRequirement = true;
			Integer expectedFourthMinorCategory = 1;
			boolean expectedFifthMinorRequirement = true;
			Integer expectedFifthMinorCategory = 1;
			boolean expectedSixthMinorRequirement = true;
			Integer expectedSixthMinorCategory = 1;
			boolean expectedSeventhMinorRequirement = true;
			Integer expectedSeventhMinorCategory = 1;
			boolean expectedEighthMinorRequirement = true;
			Integer expectedEighthMinorCategory = 1;
			boolean expectedNinthMinorRequirement = true;
			Integer expectedNinthMinorCategory = 1;
			boolean expectedTenthMinorRequirement = true;
			Integer expectedTenthMinorCategory = 1;
			boolean expectedFreeElective = true;
			boolean expectedCompleted = true;
			boolean expectedConsideringEnrollment = false;
			boolean expectedCurrentEnrollment = false;
			Double expectedCredits = 4.0;
			Double expectedGpaDesired = 4.0;
			Double expectedGpaEarned = 4.0;
			String expectedCourseStartDate = "05/21/2016";
			String expectedCourseEndDate = "08/02/2016";
			Integer expectedCoursePredictedDifficulty = 3;
			Integer expectedCoursePredictedWorkload = 3;
			Integer expectedPredictedEnjoyability = 3;
			String expectedRecommendedByWho = "Jana Diesner";
			String expectedNotRecommendedByWho = "Nobody";
			String expectedProfessionalSkills = "Programming Skills";
			String expectedAcademicSkills = "Logic Based Learning";
			CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, false,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			assertFalse(course1.equals(course2));
			assertFalse(course1 == course2);
	
		}
		@Test
		public void testAllFieldsEqualExceptConsideringEnrollment() {
			String expectedTitle = "Learning Java";
		    String expectedInstructor = "Dr. Kevin Trainor";
			String expectedSemester = "Fall";
			Integer expectedYear = 2016;
			String expectedDepartmentCode = "LIS";
			Integer expectedCourseNumber = 452;
			String expectedSectionNumber = "1";
			String expectedInstitution = "University of Illinois";
			String expectedLocation = "Online";
			String expectedOnline = "100% Online";
			boolean expectedGeneralRequirement = true;
			Integer expectedGeneralCategory = 1;
			boolean expectedFirstMajorRequirement = true;
			Integer expectedFirstMajorCategory = 1;
			boolean expectedSecondMajorRequirement = true;
			Integer expectedSecondMajorCategory = 1;
			boolean expectedThirdMajorRequirement = true;
			Integer expectedThirdMajorCategory = 1;
			boolean expectedFourthMajorRequirement = true;
			Integer expectedFourthMajorCategory = 1 ;
			boolean expectedFifthMajorRequirement = true;
			Integer expectedFifthMajorCategory = 1;
			boolean expectedSixthMajorRequirement = true;
			Integer expectedSixthMajorCategory = 1;
			boolean expectedSeventhMajorRequirement = true;
			Integer expectedSeventhMajorCategory = 1;
			boolean expectedEighthMajorRequirement = true;
			Integer expectedEighthMajorCategory = 1;
			boolean expectedNinthMajorRequirement = true;
			Integer expectedNinthMajorCategory = 1;
			boolean expectedTenthMajorRequirement = true;
			Integer expectedTenthMajorCategory = 1;
			boolean expectedFirstMinorRequirement = true;
			Integer expectedFirstMinorCategory = 1;
			boolean expectedSecondMinorRequirement = true;
			Integer expectedSecondMinorCategory = 1;
			boolean expectedThirdMinorRequirement = true;
			Integer expectedThirdMinorCategory = 1;
			boolean expectedFourthMinorRequirement = true;
			Integer expectedFourthMinorCategory = 1;
			boolean expectedFifthMinorRequirement = true;
			Integer expectedFifthMinorCategory = 1;
			boolean expectedSixthMinorRequirement = true;
			Integer expectedSixthMinorCategory = 1;
			boolean expectedSeventhMinorRequirement = true;
			Integer expectedSeventhMinorCategory = 1;
			boolean expectedEighthMinorRequirement = true;
			Integer expectedEighthMinorCategory = 1;
			boolean expectedNinthMinorRequirement = true;
			Integer expectedNinthMinorCategory = 1;
			boolean expectedTenthMinorRequirement = true;
			Integer expectedTenthMinorCategory = 1;
			boolean expectedFreeElective = true;
			boolean expectedCompleted = true;
			boolean expectedConsideringEnrollment = false;
			boolean expectedCurrentEnrollment = false;
			Double expectedCredits = 4.0;
			Double expectedGpaDesired = 4.0;
			Double expectedGpaEarned = 4.0;
			String expectedCourseStartDate = "05/21/2016";
			String expectedCourseEndDate = "08/02/2016";
			Integer expectedCoursePredictedDifficulty = 3;
			Integer expectedCoursePredictedWorkload = 3;
			Integer expectedPredictedEnjoyability = 3;
			String expectedRecommendedByWho = "Jana Diesner";
			String expectedNotRecommendedByWho = "Nobody";
			String expectedProfessionalSkills = "Programming Skills";
			String expectedAcademicSkills = "Logic Based Learning";
			CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 true, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			assertFalse(course1.equals(course2));
			assertFalse(course1 == course2);
	
		}
		@Test
		public void testAllFieldsEqualExceptCurrentEnrollment() {
			String expectedTitle = "Learning Java";
		    String expectedInstructor = "Dr. Kevin Trainor";
			String expectedSemester = "Fall";
			Integer expectedYear = 2016;
			String expectedDepartmentCode = "LIS";
			Integer expectedCourseNumber = 452;
			String expectedSectionNumber = "1";
			String expectedInstitution = "University of Illinois";
			String expectedLocation = "Online";
			String expectedOnline = "100% Online";
			boolean expectedGeneralRequirement = true;
			Integer expectedGeneralCategory = 1;
			boolean expectedFirstMajorRequirement = true;
			Integer expectedFirstMajorCategory = 1;
			boolean expectedSecondMajorRequirement = true;
			Integer expectedSecondMajorCategory = 1;
			boolean expectedThirdMajorRequirement = true;
			Integer expectedThirdMajorCategory = 1;
			boolean expectedFourthMajorRequirement = true;
			Integer expectedFourthMajorCategory = 1 ;
			boolean expectedFifthMajorRequirement = true;
			Integer expectedFifthMajorCategory = 1;
			boolean expectedSixthMajorRequirement = true;
			Integer expectedSixthMajorCategory = 1;
			boolean expectedSeventhMajorRequirement = true;
			Integer expectedSeventhMajorCategory = 1;
			boolean expectedEighthMajorRequirement = true;
			Integer expectedEighthMajorCategory = 1;
			boolean expectedNinthMajorRequirement = true;
			Integer expectedNinthMajorCategory = 1;
			boolean expectedTenthMajorRequirement = true;
			Integer expectedTenthMajorCategory = 1;
			boolean expectedFirstMinorRequirement = true;
			Integer expectedFirstMinorCategory = 1;
			boolean expectedSecondMinorRequirement = true;
			Integer expectedSecondMinorCategory = 1;
			boolean expectedThirdMinorRequirement = true;
			Integer expectedThirdMinorCategory = 1;
			boolean expectedFourthMinorRequirement = true;
			Integer expectedFourthMinorCategory = 1;
			boolean expectedFifthMinorRequirement = true;
			Integer expectedFifthMinorCategory = 1;
			boolean expectedSixthMinorRequirement = true;
			Integer expectedSixthMinorCategory = 1;
			boolean expectedSeventhMinorRequirement = true;
			Integer expectedSeventhMinorCategory = 1;
			boolean expectedEighthMinorRequirement = true;
			Integer expectedEighthMinorCategory = 1;
			boolean expectedNinthMinorRequirement = true;
			Integer expectedNinthMinorCategory = 1;
			boolean expectedTenthMinorRequirement = true;
			Integer expectedTenthMinorCategory = 1;
			boolean expectedFreeElective = true;
			boolean expectedCompleted = true;
			boolean expectedConsideringEnrollment = false;
			boolean expectedCurrentEnrollment = false;
			Double expectedCredits = 4.0;
			Double expectedGpaDesired = 4.0;
			Double expectedGpaEarned = 4.0;
			String expectedCourseStartDate = "05/21/2016";
			String expectedCourseEndDate = "08/02/2016";
			Integer expectedCoursePredictedDifficulty = 3;
			Integer expectedCoursePredictedWorkload = 3;
			Integer expectedPredictedEnjoyability = 3;
			String expectedRecommendedByWho = "Jana Diesner";
			String expectedNotRecommendedByWho = "Nobody";
			String expectedProfessionalSkills = "Programming Skills";
			String expectedAcademicSkills = "Logic Based Learning";
			CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, true,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			assertFalse(course1.equals(course2));
			assertFalse(course1 == course2);
	
		}
		@Test
		public void testAllFieldsEqualExceptCredits() {
			String expectedTitle = "Learning Java";
		    String expectedInstructor = "Dr. Kevin Trainor";
			String expectedSemester = "Fall";
			Integer expectedYear = 2016;
			String expectedDepartmentCode = "LIS";
			Integer expectedCourseNumber = 452;
			String expectedSectionNumber = "1";
			String expectedInstitution = "University of Illinois";
			String expectedLocation = "Online";
			String expectedOnline = "100% Online";
			boolean expectedGeneralRequirement = true;
			Integer expectedGeneralCategory = 1;
			boolean expectedFirstMajorRequirement = true;
			Integer expectedFirstMajorCategory = 1;
			boolean expectedSecondMajorRequirement = true;
			Integer expectedSecondMajorCategory = 1;
			boolean expectedThirdMajorRequirement = true;
			Integer expectedThirdMajorCategory = 1;
			boolean expectedFourthMajorRequirement = true;
			Integer expectedFourthMajorCategory = 1 ;
			boolean expectedFifthMajorRequirement = true;
			Integer expectedFifthMajorCategory = 1;
			boolean expectedSixthMajorRequirement = true;
			Integer expectedSixthMajorCategory = 1;
			boolean expectedSeventhMajorRequirement = true;
			Integer expectedSeventhMajorCategory = 1;
			boolean expectedEighthMajorRequirement = true;
			Integer expectedEighthMajorCategory = 1;
			boolean expectedNinthMajorRequirement = true;
			Integer expectedNinthMajorCategory = 1;
			boolean expectedTenthMajorRequirement = true;
			Integer expectedTenthMajorCategory = 1;
			boolean expectedFirstMinorRequirement = true;
			Integer expectedFirstMinorCategory = 1;
			boolean expectedSecondMinorRequirement = true;
			Integer expectedSecondMinorCategory = 1;
			boolean expectedThirdMinorRequirement = true;
			Integer expectedThirdMinorCategory = 1;
			boolean expectedFourthMinorRequirement = true;
			Integer expectedFourthMinorCategory = 1;
			boolean expectedFifthMinorRequirement = true;
			Integer expectedFifthMinorCategory = 1;
			boolean expectedSixthMinorRequirement = true;
			Integer expectedSixthMinorCategory = 1;
			boolean expectedSeventhMinorRequirement = true;
			Integer expectedSeventhMinorCategory = 1;
			boolean expectedEighthMinorRequirement = true;
			Integer expectedEighthMinorCategory = 1;
			boolean expectedNinthMinorRequirement = true;
			Integer expectedNinthMinorCategory = 1;
			boolean expectedTenthMinorRequirement = true;
			Integer expectedTenthMinorCategory = 1;
			boolean expectedFreeElective = true;
			boolean expectedCompleted = true;
			boolean expectedConsideringEnrollment = false;
			boolean expectedCurrentEnrollment = false;
			Double expectedCredits = 4.0;
			Double expectedGpaDesired = 4.0;
			Double expectedGpaEarned = 4.0;
			String expectedCourseStartDate = "05/21/2016";
			String expectedCourseEndDate = "08/02/2016";
			Integer expectedCoursePredictedDifficulty = 3;
			Integer expectedCoursePredictedWorkload = 3;
			Integer expectedPredictedEnjoyability = 3;
			String expectedRecommendedByWho = "Jana Diesner";
			String expectedNotRecommendedByWho = "Nobody";
			String expectedProfessionalSkills = "Programming Skills";
			String expectedAcademicSkills = "Logic Based Learning";
			CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 3.0, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			assertFalse(course1.equals(course2));
			assertFalse(course1 == course2);
	
		}
		@Test
		public void testAllFieldsEqualExceptGpaDesired() {
			String expectedTitle = "Learning Java";
		    String expectedInstructor = "Dr. Kevin Trainor";
			String expectedSemester = "Fall";
			Integer expectedYear = 2016;
			String expectedDepartmentCode = "LIS";
			Integer expectedCourseNumber = 452;
			String expectedSectionNumber = "1";
			String expectedInstitution = "University of Illinois";
			String expectedLocation = "Online";
			String expectedOnline = "100% Online";
			boolean expectedGeneralRequirement = true;
			Integer expectedGeneralCategory = 1;
			boolean expectedFirstMajorRequirement = true;
			Integer expectedFirstMajorCategory = 1;
			boolean expectedSecondMajorRequirement = true;
			Integer expectedSecondMajorCategory = 1;
			boolean expectedThirdMajorRequirement = true;
			Integer expectedThirdMajorCategory = 1;
			boolean expectedFourthMajorRequirement = true;
			Integer expectedFourthMajorCategory = 1 ;
			boolean expectedFifthMajorRequirement = true;
			Integer expectedFifthMajorCategory = 1;
			boolean expectedSixthMajorRequirement = true;
			Integer expectedSixthMajorCategory = 1;
			boolean expectedSeventhMajorRequirement = true;
			Integer expectedSeventhMajorCategory = 1;
			boolean expectedEighthMajorRequirement = true;
			Integer expectedEighthMajorCategory = 1;
			boolean expectedNinthMajorRequirement = true;
			Integer expectedNinthMajorCategory = 1;
			boolean expectedTenthMajorRequirement = true;
			Integer expectedTenthMajorCategory = 1;
			boolean expectedFirstMinorRequirement = true;
			Integer expectedFirstMinorCategory = 1;
			boolean expectedSecondMinorRequirement = true;
			Integer expectedSecondMinorCategory = 1;
			boolean expectedThirdMinorRequirement = true;
			Integer expectedThirdMinorCategory = 1;
			boolean expectedFourthMinorRequirement = true;
			Integer expectedFourthMinorCategory = 1;
			boolean expectedFifthMinorRequirement = true;
			Integer expectedFifthMinorCategory = 1;
			boolean expectedSixthMinorRequirement = true;
			Integer expectedSixthMinorCategory = 1;
			boolean expectedSeventhMinorRequirement = true;
			Integer expectedSeventhMinorCategory = 1;
			boolean expectedEighthMinorRequirement = true;
			Integer expectedEighthMinorCategory = 1;
			boolean expectedNinthMinorRequirement = true;
			Integer expectedNinthMinorCategory = 1;
			boolean expectedTenthMinorRequirement = true;
			Integer expectedTenthMinorCategory = 1;
			boolean expectedFreeElective = true;
			boolean expectedCompleted = true;
			boolean expectedConsideringEnrollment = false;
			boolean expectedCurrentEnrollment = false;
			Double expectedCredits = 4.0;
			Double expectedGpaDesired = 4.0;
			Double expectedGpaEarned = 4.0;
			String expectedCourseStartDate = "05/21/2016";
			String expectedCourseEndDate = "08/02/2016";
			Integer expectedCoursePredictedDifficulty = 3;
			Integer expectedCoursePredictedWorkload = 3;
			Integer expectedPredictedEnjoyability = 3;
			String expectedRecommendedByWho = "Jana Diesner";
			String expectedNotRecommendedByWho = "Nobody";
			String expectedProfessionalSkills = "Programming Skills";
			String expectedAcademicSkills = "Logic Based Learning";
			CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, 3.5, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			assertFalse(course1.equals(course2));
			assertFalse(course1 == course2);
	
		}
		@Test
		public void testAllFieldsEqualExceptGpaEarned() {
			String expectedTitle = "Learning Java";
		    String expectedInstructor = "Dr. Kevin Trainor";
			String expectedSemester = "Fall";
			Integer expectedYear = 2016;
			String expectedDepartmentCode = "LIS";
			Integer expectedCourseNumber = 452;
			String expectedSectionNumber = "1";
			String expectedInstitution = "University of Illinois";
			String expectedLocation = "Online";
			String expectedOnline = "100% Online";
			boolean expectedGeneralRequirement = true;
			Integer expectedGeneralCategory = 1;
			boolean expectedFirstMajorRequirement = true;
			Integer expectedFirstMajorCategory = 1;
			boolean expectedSecondMajorRequirement = true;
			Integer expectedSecondMajorCategory = 1;
			boolean expectedThirdMajorRequirement = true;
			Integer expectedThirdMajorCategory = 1;
			boolean expectedFourthMajorRequirement = true;
			Integer expectedFourthMajorCategory = 1 ;
			boolean expectedFifthMajorRequirement = true;
			Integer expectedFifthMajorCategory = 1;
			boolean expectedSixthMajorRequirement = true;
			Integer expectedSixthMajorCategory = 1;
			boolean expectedSeventhMajorRequirement = true;
			Integer expectedSeventhMajorCategory = 1;
			boolean expectedEighthMajorRequirement = true;
			Integer expectedEighthMajorCategory = 1;
			boolean expectedNinthMajorRequirement = true;
			Integer expectedNinthMajorCategory = 1;
			boolean expectedTenthMajorRequirement = true;
			Integer expectedTenthMajorCategory = 1;
			boolean expectedFirstMinorRequirement = true;
			Integer expectedFirstMinorCategory = 1;
			boolean expectedSecondMinorRequirement = true;
			Integer expectedSecondMinorCategory = 1;
			boolean expectedThirdMinorRequirement = true;
			Integer expectedThirdMinorCategory = 1;
			boolean expectedFourthMinorRequirement = true;
			Integer expectedFourthMinorCategory = 1;
			boolean expectedFifthMinorRequirement = true;
			Integer expectedFifthMinorCategory = 1;
			boolean expectedSixthMinorRequirement = true;
			Integer expectedSixthMinorCategory = 1;
			boolean expectedSeventhMinorRequirement = true;
			Integer expectedSeventhMinorCategory = 1;
			boolean expectedEighthMinorRequirement = true;
			Integer expectedEighthMinorCategory = 1;
			boolean expectedNinthMinorRequirement = true;
			Integer expectedNinthMinorCategory = 1;
			boolean expectedTenthMinorRequirement = true;
			Integer expectedTenthMinorCategory = 1;
			boolean expectedFreeElective = true;
			boolean expectedCompleted = true;
			boolean expectedConsideringEnrollment = false;
			boolean expectedCurrentEnrollment = false;
			Double expectedCredits = 4.0;
			Double expectedGpaDesired = 4.0;
			Double expectedGpaEarned = 4.0;
			String expectedCourseStartDate = "05/21/2016";
			String expectedCourseEndDate = "08/02/2016";
			Integer expectedCoursePredictedDifficulty = 3;
			Integer expectedCoursePredictedWorkload = 3;
			Integer expectedPredictedEnjoyability = 3;
			String expectedRecommendedByWho = "Jana Diesner";
			String expectedNotRecommendedByWho = "Nobody";
			String expectedProfessionalSkills = "Programming Skills";
			String expectedAcademicSkills = "Logic Based Learning";
			CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 3.0, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			assertFalse(course1.equals(course2));
			assertFalse(course1 == course2);
	
		}
		
		@Test
		public void testAllFieldsEqualExceptCourseStartDate() {
			String expectedTitle = "Learning Java";
		    String expectedInstructor = "Dr. Kevin Trainor";
			String expectedSemester = "Fall";
			Integer expectedYear = 2016;
			String expectedDepartmentCode = "LIS";
			Integer expectedCourseNumber = 452;
			String expectedSectionNumber = "1";
			String expectedInstitution = "University of Illinois";
			String expectedLocation = "Online";
			String expectedOnline = "100% Online";
			boolean expectedGeneralRequirement = true;
			Integer expectedGeneralCategory = 1;
			boolean expectedFirstMajorRequirement = true;
			Integer expectedFirstMajorCategory = 1;
			boolean expectedSecondMajorRequirement = true;
			Integer expectedSecondMajorCategory = 1;
			boolean expectedThirdMajorRequirement = true;
			Integer expectedThirdMajorCategory = 1;
			boolean expectedFourthMajorRequirement = true;
			Integer expectedFourthMajorCategory = 1 ;
			boolean expectedFifthMajorRequirement = true;
			Integer expectedFifthMajorCategory = 1;
			boolean expectedSixthMajorRequirement = true;
			Integer expectedSixthMajorCategory = 1;
			boolean expectedSeventhMajorRequirement = true;
			Integer expectedSeventhMajorCategory = 1;
			boolean expectedEighthMajorRequirement = true;
			Integer expectedEighthMajorCategory = 1;
			boolean expectedNinthMajorRequirement = true;
			Integer expectedNinthMajorCategory = 1;
			boolean expectedTenthMajorRequirement = true;
			Integer expectedTenthMajorCategory = 1;
			boolean expectedFirstMinorRequirement = true;
			Integer expectedFirstMinorCategory = 1;
			boolean expectedSecondMinorRequirement = true;
			Integer expectedSecondMinorCategory = 1;
			boolean expectedThirdMinorRequirement = true;
			Integer expectedThirdMinorCategory = 1;
			boolean expectedFourthMinorRequirement = true;
			Integer expectedFourthMinorCategory = 1;
			boolean expectedFifthMinorRequirement = true;
			Integer expectedFifthMinorCategory = 1;
			boolean expectedSixthMinorRequirement = true;
			Integer expectedSixthMinorCategory = 1;
			boolean expectedSeventhMinorRequirement = true;
			Integer expectedSeventhMinorCategory = 1;
			boolean expectedEighthMinorRequirement = true;
			Integer expectedEighthMinorCategory = 1;
			boolean expectedNinthMinorRequirement = true;
			Integer expectedNinthMinorCategory = 1;
			boolean expectedTenthMinorRequirement = true;
			Integer expectedTenthMinorCategory = 1;
			boolean expectedFreeElective = true;
			boolean expectedCompleted = true;
			boolean expectedConsideringEnrollment = false;
			boolean expectedCurrentEnrollment = false;
			Double expectedCredits = 4.0;
			Double expectedGpaDesired = 4.0;
			Double expectedGpaEarned = 4.0;
			String expectedCourseStartDate = "05/21/2016";
			String expectedCourseEndDate = "08/02/2016";
			Integer expectedCoursePredictedDifficulty = 3;
			Integer expectedCoursePredictedWorkload = 3;
			Integer expectedPredictedEnjoyability = 3;
			String expectedRecommendedByWho = "Jana Diesner";
			String expectedNotRecommendedByWho = "Nobody";
			String expectedProfessionalSkills = "Programming Skills";
			String expectedAcademicSkills = "Logic Based Learning";
			CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, "05/10/2016",
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			assertFalse(course1.equals(course2));
			assertFalse(course1 == course2);
	
		}
		@Test
		public void testAllFieldsEqualExceptCourseEndDate() {
			String expectedTitle = "Learning Java";
		    String expectedInstructor = "Dr. Kevin Trainor";
			String expectedSemester = "Fall";
			Integer expectedYear = 2016;
			String expectedDepartmentCode = "LIS";
			Integer expectedCourseNumber = 452;
			String expectedSectionNumber = "1";
			String expectedInstitution = "University of Illinois";
			String expectedLocation = "Online";
			String expectedOnline = "100% Online";
			boolean expectedGeneralRequirement = true;
			Integer expectedGeneralCategory = 1;
			boolean expectedFirstMajorRequirement = true;
			Integer expectedFirstMajorCategory = 1;
			boolean expectedSecondMajorRequirement = true;
			Integer expectedSecondMajorCategory = 1;
			boolean expectedThirdMajorRequirement = true;
			Integer expectedThirdMajorCategory = 1;
			boolean expectedFourthMajorRequirement = true;
			Integer expectedFourthMajorCategory = 1 ;
			boolean expectedFifthMajorRequirement = true;
			Integer expectedFifthMajorCategory = 1;
			boolean expectedSixthMajorRequirement = true;
			Integer expectedSixthMajorCategory = 1;
			boolean expectedSeventhMajorRequirement = true;
			Integer expectedSeventhMajorCategory = 1;
			boolean expectedEighthMajorRequirement = true;
			Integer expectedEighthMajorCategory = 1;
			boolean expectedNinthMajorRequirement = true;
			Integer expectedNinthMajorCategory = 1;
			boolean expectedTenthMajorRequirement = true;
			Integer expectedTenthMajorCategory = 1;
			boolean expectedFirstMinorRequirement = true;
			Integer expectedFirstMinorCategory = 1;
			boolean expectedSecondMinorRequirement = true;
			Integer expectedSecondMinorCategory = 1;
			boolean expectedThirdMinorRequirement = true;
			Integer expectedThirdMinorCategory = 1;
			boolean expectedFourthMinorRequirement = true;
			Integer expectedFourthMinorCategory = 1;
			boolean expectedFifthMinorRequirement = true;
			Integer expectedFifthMinorCategory = 1;
			boolean expectedSixthMinorRequirement = true;
			Integer expectedSixthMinorCategory = 1;
			boolean expectedSeventhMinorRequirement = true;
			Integer expectedSeventhMinorCategory = 1;
			boolean expectedEighthMinorRequirement = true;
			Integer expectedEighthMinorCategory = 1;
			boolean expectedNinthMinorRequirement = true;
			Integer expectedNinthMinorCategory = 1;
			boolean expectedTenthMinorRequirement = true;
			Integer expectedTenthMinorCategory = 1;
			boolean expectedFreeElective = true;
			boolean expectedCompleted = true;
			boolean expectedConsideringEnrollment = false;
			boolean expectedCurrentEnrollment = false;
			Double expectedCredits = 4.0;
			Double expectedGpaDesired = 4.0;
			Double expectedGpaEarned = 4.0;
			String expectedCourseStartDate = "05/21/2016";
			String expectedCourseEndDate = "08/02/2016";
			Integer expectedCoursePredictedDifficulty = 3;
			Integer expectedCoursePredictedWorkload = 3;
			Integer expectedPredictedEnjoyability = 3;
			String expectedRecommendedByWho = "Jana Diesner";
			String expectedNotRecommendedByWho = "Nobody";
			String expectedProfessionalSkills = "Programming Skills";
			String expectedAcademicSkills = "Logic Based Learning";
			CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 "08/19/2016", expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			assertFalse(course1.equals(course2));
			assertFalse(course1 == course2);
	
		}
		@Test
		public void testAllFieldsEqualExceptCoursePredictedDifficulty() {
			String expectedTitle = "Learning Java";
		    String expectedInstructor = "Dr. Kevin Trainor";
			String expectedSemester = "Fall";
			Integer expectedYear = 2016;
			String expectedDepartmentCode = "LIS";
			Integer expectedCourseNumber = 452;
			String expectedSectionNumber = "1";
			String expectedInstitution = "University of Illinois";
			String expectedLocation = "Online";
			String expectedOnline = "100% Online";
			boolean expectedGeneralRequirement = true;
			Integer expectedGeneralCategory = 1;
			boolean expectedFirstMajorRequirement = true;
			Integer expectedFirstMajorCategory = 1;
			boolean expectedSecondMajorRequirement = true;
			Integer expectedSecondMajorCategory = 1;
			boolean expectedThirdMajorRequirement = true;
			Integer expectedThirdMajorCategory = 1;
			boolean expectedFourthMajorRequirement = true;
			Integer expectedFourthMajorCategory = 1 ;
			boolean expectedFifthMajorRequirement = true;
			Integer expectedFifthMajorCategory = 1;
			boolean expectedSixthMajorRequirement = true;
			Integer expectedSixthMajorCategory = 1;
			boolean expectedSeventhMajorRequirement = true;
			Integer expectedSeventhMajorCategory = 1;
			boolean expectedEighthMajorRequirement = true;
			Integer expectedEighthMajorCategory = 1;
			boolean expectedNinthMajorRequirement = true;
			Integer expectedNinthMajorCategory = 1;
			boolean expectedTenthMajorRequirement = true;
			Integer expectedTenthMajorCategory = 1;
			boolean expectedFirstMinorRequirement = true;
			Integer expectedFirstMinorCategory = 1;
			boolean expectedSecondMinorRequirement = true;
			Integer expectedSecondMinorCategory = 1;
			boolean expectedThirdMinorRequirement = true;
			Integer expectedThirdMinorCategory = 1;
			boolean expectedFourthMinorRequirement = true;
			Integer expectedFourthMinorCategory = 1;
			boolean expectedFifthMinorRequirement = true;
			Integer expectedFifthMinorCategory = 1;
			boolean expectedSixthMinorRequirement = true;
			Integer expectedSixthMinorCategory = 1;
			boolean expectedSeventhMinorRequirement = true;
			Integer expectedSeventhMinorCategory = 1;
			boolean expectedEighthMinorRequirement = true;
			Integer expectedEighthMinorCategory = 1;
			boolean expectedNinthMinorRequirement = true;
			Integer expectedNinthMinorCategory = 1;
			boolean expectedTenthMinorRequirement = true;
			Integer expectedTenthMinorCategory = 1;
			boolean expectedFreeElective = true;
			boolean expectedCompleted = true;
			boolean expectedConsideringEnrollment = false;
			boolean expectedCurrentEnrollment = false;
			Double expectedCredits = 4.0;
			Double expectedGpaDesired = 4.0;
			Double expectedGpaEarned = 4.0;
			String expectedCourseStartDate = "05/21/2016";
			String expectedCourseEndDate = "08/02/2016";
			Integer expectedCoursePredictedDifficulty = 3;
			Integer expectedCoursePredictedWorkload = 3;
			Integer expectedPredictedEnjoyability = 3;
			String expectedRecommendedByWho = "Jana Diesner";
			String expectedNotRecommendedByWho = "Nobody";
			String expectedProfessionalSkills = "Programming Skills";
			String expectedAcademicSkills = "Logic Based Learning";
			CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, 4,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			assertFalse(course1.equals(course2));
			assertFalse(course1 == course2);
	
		}
		@Test
		public void testAllFieldsEqualExceptCoursePredictedWorkload() {
			String expectedTitle = "Learning Java";
		    String expectedInstructor = "Dr. Kevin Trainor";
			String expectedSemester = "Fall";
			Integer expectedYear = 2016;
			String expectedDepartmentCode = "LIS";
			Integer expectedCourseNumber = 452;
			String expectedSectionNumber = "1";
			String expectedInstitution = "University of Illinois";
			String expectedLocation = "Online";
			String expectedOnline = "100% Online";
			boolean expectedGeneralRequirement = true;
			Integer expectedGeneralCategory = 1;
			boolean expectedFirstMajorRequirement = true;
			Integer expectedFirstMajorCategory = 1;
			boolean expectedSecondMajorRequirement = true;
			Integer expectedSecondMajorCategory = 1;
			boolean expectedThirdMajorRequirement = true;
			Integer expectedThirdMajorCategory = 1;
			boolean expectedFourthMajorRequirement = true;
			Integer expectedFourthMajorCategory = 1 ;
			boolean expectedFifthMajorRequirement = true;
			Integer expectedFifthMajorCategory = 1;
			boolean expectedSixthMajorRequirement = true;
			Integer expectedSixthMajorCategory = 1;
			boolean expectedSeventhMajorRequirement = true;
			Integer expectedSeventhMajorCategory = 1;
			boolean expectedEighthMajorRequirement = true;
			Integer expectedEighthMajorCategory = 1;
			boolean expectedNinthMajorRequirement = true;
			Integer expectedNinthMajorCategory = 1;
			boolean expectedTenthMajorRequirement = true;
			Integer expectedTenthMajorCategory = 1;
			boolean expectedFirstMinorRequirement = true;
			Integer expectedFirstMinorCategory = 1;
			boolean expectedSecondMinorRequirement = true;
			Integer expectedSecondMinorCategory = 1;
			boolean expectedThirdMinorRequirement = true;
			Integer expectedThirdMinorCategory = 1;
			boolean expectedFourthMinorRequirement = true;
			Integer expectedFourthMinorCategory = 1;
			boolean expectedFifthMinorRequirement = true;
			Integer expectedFifthMinorCategory = 1;
			boolean expectedSixthMinorRequirement = true;
			Integer expectedSixthMinorCategory = 1;
			boolean expectedSeventhMinorRequirement = true;
			Integer expectedSeventhMinorCategory = 1;
			boolean expectedEighthMinorRequirement = true;
			Integer expectedEighthMinorCategory = 1;
			boolean expectedNinthMinorRequirement = true;
			Integer expectedNinthMinorCategory = 1;
			boolean expectedTenthMinorRequirement = true;
			Integer expectedTenthMinorCategory = 1;
			boolean expectedFreeElective = true;
			boolean expectedCompleted = true;
			boolean expectedConsideringEnrollment = false;
			boolean expectedCurrentEnrollment = false;
			Double expectedCredits = 4.0;
			Double expectedGpaDesired = 4.0;
			Double expectedGpaEarned = 4.0;
			String expectedCourseStartDate = "05/21/2016";
			String expectedCourseEndDate = "08/02/2016";
			Integer expectedCoursePredictedDifficulty = 3;
			Integer expectedCoursePredictedWorkload = 3;
			Integer expectedPredictedEnjoyability = 3;
			String expectedRecommendedByWho = "Jana Diesner";
			String expectedNotRecommendedByWho = "Nobody";
			String expectedProfessionalSkills = "Programming Skills";
			String expectedAcademicSkills = "Logic Based Learning";
			CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 4, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			assertFalse(course1.equals(course2));
			assertFalse(course1 == course2);
	
		}
		@Test
		public void testAllFieldsEqualExceptPredictedEnjoyability() {
			String expectedTitle = "Learning Java";
		    String expectedInstructor = "Dr. Kevin Trainor";
			String expectedSemester = "Fall";
			Integer expectedYear = 2016;
			String expectedDepartmentCode = "LIS";
			Integer expectedCourseNumber = 452;
			String expectedSectionNumber = "1";
			String expectedInstitution = "University of Illinois";
			String expectedLocation = "Online";
			String expectedOnline = "100% Online";
			boolean expectedGeneralRequirement = true;
			Integer expectedGeneralCategory = 1;
			boolean expectedFirstMajorRequirement = true;
			Integer expectedFirstMajorCategory = 1;
			boolean expectedSecondMajorRequirement = true;
			Integer expectedSecondMajorCategory = 1;
			boolean expectedThirdMajorRequirement = true;
			Integer expectedThirdMajorCategory = 1;
			boolean expectedFourthMajorRequirement = true;
			Integer expectedFourthMajorCategory = 1 ;
			boolean expectedFifthMajorRequirement = true;
			Integer expectedFifthMajorCategory = 1;
			boolean expectedSixthMajorRequirement = true;
			Integer expectedSixthMajorCategory = 1;
			boolean expectedSeventhMajorRequirement = true;
			Integer expectedSeventhMajorCategory = 1;
			boolean expectedEighthMajorRequirement = true;
			Integer expectedEighthMajorCategory = 1;
			boolean expectedNinthMajorRequirement = true;
			Integer expectedNinthMajorCategory = 1;
			boolean expectedTenthMajorRequirement = true;
			Integer expectedTenthMajorCategory = 1;
			boolean expectedFirstMinorRequirement = true;
			Integer expectedFirstMinorCategory = 1;
			boolean expectedSecondMinorRequirement = true;
			Integer expectedSecondMinorCategory = 1;
			boolean expectedThirdMinorRequirement = true;
			Integer expectedThirdMinorCategory = 1;
			boolean expectedFourthMinorRequirement = true;
			Integer expectedFourthMinorCategory = 1;
			boolean expectedFifthMinorRequirement = true;
			Integer expectedFifthMinorCategory = 1;
			boolean expectedSixthMinorRequirement = true;
			Integer expectedSixthMinorCategory = 1;
			boolean expectedSeventhMinorRequirement = true;
			Integer expectedSeventhMinorCategory = 1;
			boolean expectedEighthMinorRequirement = true;
			Integer expectedEighthMinorCategory = 1;
			boolean expectedNinthMinorRequirement = true;
			Integer expectedNinthMinorCategory = 1;
			boolean expectedTenthMinorRequirement = true;
			Integer expectedTenthMinorCategory = 1;
			boolean expectedFreeElective = true;
			boolean expectedCompleted = true;
			boolean expectedConsideringEnrollment = false;
			boolean expectedCurrentEnrollment = false;
			Double expectedCredits = 4.0;
			Double expectedGpaDesired = 4.0;
			Double expectedGpaEarned = 4.0;
			String expectedCourseStartDate = "05/21/2016";
			String expectedCourseEndDate = "08/02/2016";
			Integer expectedCoursePredictedDifficulty = 3;
			Integer expectedCoursePredictedWorkload = 3;
			Integer expectedPredictedEnjoyability = 3;
			String expectedRecommendedByWho = "Jana Diesner";
			String expectedNotRecommendedByWho = "Nobody";
			String expectedProfessionalSkills = "Programming Skills";
			String expectedAcademicSkills = "Logic Based Learning";
			CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, 4,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			assertFalse(course1.equals(course2));
			assertFalse(course1 == course2);
	
		}
		@Test
		public void testAllFieldsEqualExceptRecommendedByWho() {
			String expectedTitle = "Learning Java";
		    String expectedInstructor = "Dr. Kevin Trainor";
			String expectedSemester = "Fall";
			Integer expectedYear = 2016;
			String expectedDepartmentCode = "LIS";
			Integer expectedCourseNumber = 452;
			String expectedSectionNumber = "1";
			String expectedInstitution = "University of Illinois";
			String expectedLocation = "Online";
			String expectedOnline = "100% Online";
			boolean expectedGeneralRequirement = true;
			Integer expectedGeneralCategory = 1;
			boolean expectedFirstMajorRequirement = true;
			Integer expectedFirstMajorCategory = 1;
			boolean expectedSecondMajorRequirement = true;
			Integer expectedSecondMajorCategory = 1;
			boolean expectedThirdMajorRequirement = true;
			Integer expectedThirdMajorCategory = 1;
			boolean expectedFourthMajorRequirement = true;
			Integer expectedFourthMajorCategory = 1 ;
			boolean expectedFifthMajorRequirement = true;
			Integer expectedFifthMajorCategory = 1;
			boolean expectedSixthMajorRequirement = true;
			Integer expectedSixthMajorCategory = 1;
			boolean expectedSeventhMajorRequirement = true;
			Integer expectedSeventhMajorCategory = 1;
			boolean expectedEighthMajorRequirement = true;
			Integer expectedEighthMajorCategory = 1;
			boolean expectedNinthMajorRequirement = true;
			Integer expectedNinthMajorCategory = 1;
			boolean expectedTenthMajorRequirement = true;
			Integer expectedTenthMajorCategory = 1;
			boolean expectedFirstMinorRequirement = true;
			Integer expectedFirstMinorCategory = 1;
			boolean expectedSecondMinorRequirement = true;
			Integer expectedSecondMinorCategory = 1;
			boolean expectedThirdMinorRequirement = true;
			Integer expectedThirdMinorCategory = 1;
			boolean expectedFourthMinorRequirement = true;
			Integer expectedFourthMinorCategory = 1;
			boolean expectedFifthMinorRequirement = true;
			Integer expectedFifthMinorCategory = 1;
			boolean expectedSixthMinorRequirement = true;
			Integer expectedSixthMinorCategory = 1;
			boolean expectedSeventhMinorRequirement = true;
			Integer expectedSeventhMinorCategory = 1;
			boolean expectedEighthMinorRequirement = true;
			Integer expectedEighthMinorCategory = 1;
			boolean expectedNinthMinorRequirement = true;
			Integer expectedNinthMinorCategory = 1;
			boolean expectedTenthMinorRequirement = true;
			Integer expectedTenthMinorCategory = 1;
			boolean expectedFreeElective = true;
			boolean expectedCompleted = true;
			boolean expectedConsideringEnrollment = false;
			boolean expectedCurrentEnrollment = false;
			Double expectedCredits = 4.0;
			Double expectedGpaDesired = 4.0;
			Double expectedGpaEarned = 4.0;
			String expectedCourseStartDate = "05/21/2016";
			String expectedCourseEndDate = "08/02/2016";
			Integer expectedCoursePredictedDifficulty = 3;
			Integer expectedCoursePredictedWorkload = 3;
			Integer expectedPredictedEnjoyability = 3;
			String expectedRecommendedByWho = "Diesner Jana";
			String expectedNotRecommendedByWho = "Nobody";
			String expectedProfessionalSkills = "Programming Skills";
			String expectedAcademicSkills = "Logic Based Learning";
			CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 "Diesner Jana3", expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			assertFalse(course1.equals(course2));
			assertFalse(course1 == course2);
	
		}
		@Test
		public void testAllFieldsEqualExceptNotRecommendedByWho() {
			String expectedTitle = "Learning Java";
		    String expectedInstructor = "Dr. Kevin Trainor";
			String expectedSemester = "Fall";
			Integer expectedYear = 2016;
			String expectedDepartmentCode = "LIS";
			Integer expectedCourseNumber = 452;
			String expectedSectionNumber = "1";
			String expectedInstitution = "University of Illinois";
			String expectedLocation = "Online";
			String expectedOnline = "100% Online";
			boolean expectedGeneralRequirement = true;
			Integer expectedGeneralCategory = 1;
			boolean expectedFirstMajorRequirement = true;
			Integer expectedFirstMajorCategory = 1;
			boolean expectedSecondMajorRequirement = true;
			Integer expectedSecondMajorCategory = 1;
			boolean expectedThirdMajorRequirement = true;
			Integer expectedThirdMajorCategory = 1;
			boolean expectedFourthMajorRequirement = true;
			Integer expectedFourthMajorCategory = 1 ;
			boolean expectedFifthMajorRequirement = true;
			Integer expectedFifthMajorCategory = 1;
			boolean expectedSixthMajorRequirement = true;
			Integer expectedSixthMajorCategory = 1;
			boolean expectedSeventhMajorRequirement = true;
			Integer expectedSeventhMajorCategory = 1;
			boolean expectedEighthMajorRequirement = true;
			Integer expectedEighthMajorCategory = 1;
			boolean expectedNinthMajorRequirement = true;
			Integer expectedNinthMajorCategory = 1;
			boolean expectedTenthMajorRequirement = true;
			Integer expectedTenthMajorCategory = 1;
			boolean expectedFirstMinorRequirement = true;
			Integer expectedFirstMinorCategory = 1;
			boolean expectedSecondMinorRequirement = true;
			Integer expectedSecondMinorCategory = 1;
			boolean expectedThirdMinorRequirement = true;
			Integer expectedThirdMinorCategory = 1;
			boolean expectedFourthMinorRequirement = true;
			Integer expectedFourthMinorCategory = 1;
			boolean expectedFifthMinorRequirement = true;
			Integer expectedFifthMinorCategory = 1;
			boolean expectedSixthMinorRequirement = true;
			Integer expectedSixthMinorCategory = 1;
			boolean expectedSeventhMinorRequirement = true;
			Integer expectedSeventhMinorCategory = 1;
			boolean expectedEighthMinorRequirement = true;
			Integer expectedEighthMinorCategory = 1;
			boolean expectedNinthMinorRequirement = true;
			Integer expectedNinthMinorCategory = 1;
			boolean expectedTenthMinorRequirement = true;
			Integer expectedTenthMinorCategory = 1;
			boolean expectedFreeElective = true;
			boolean expectedCompleted = true;
			boolean expectedConsideringEnrollment = false;
			boolean expectedCurrentEnrollment = false;
			Double expectedCredits = 4.0;
			Double expectedGpaDesired = 4.0;
			Double expectedGpaEarned = 4.0;
			String expectedCourseStartDate = "05/21/2016";
			String expectedCourseEndDate = "08/02/2016";
			Integer expectedCoursePredictedDifficulty = 3;
			Integer expectedCoursePredictedWorkload = 3;
			Integer expectedPredictedEnjoyability = 3;
			String expectedRecommendedByWho = "Jana Diesner";
			String expectedNotRecommendedByWho = "Nobody";
			String expectedProfessionalSkills = "Programming Skills";
			String expectedAcademicSkills = "Logic Based Learning";
			CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, "Someone Cranky",
					 expectedProfessionalSkills,  expectedAcademicSkills);
			assertFalse(course1.equals(course2));
			assertFalse(course1 == course2);
	
		}
		@Test
		public void testAllFieldsEqualExceptProfessionalSkills() {
			String expectedTitle = "Learning Java";
		    String expectedInstructor = "Dr. Kevin Trainor";
			String expectedSemester = "Fall";
			Integer expectedYear = 2016;
			String expectedDepartmentCode = "LIS";
			Integer expectedCourseNumber = 452;
			String expectedSectionNumber = "1";
			String expectedInstitution = "University of Illinois";
			String expectedLocation = "Online";
			String expectedOnline = "100% Online";
			boolean expectedGeneralRequirement = true;
			Integer expectedGeneralCategory = 1;
			boolean expectedFirstMajorRequirement = true;
			Integer expectedFirstMajorCategory = 1;
			boolean expectedSecondMajorRequirement = true;
			Integer expectedSecondMajorCategory = 1;
			boolean expectedThirdMajorRequirement = true;
			Integer expectedThirdMajorCategory = 1;
			boolean expectedFourthMajorRequirement = true;
			Integer expectedFourthMajorCategory = 1 ;
			boolean expectedFifthMajorRequirement = true;
			Integer expectedFifthMajorCategory = 1;
			boolean expectedSixthMajorRequirement = true;
			Integer expectedSixthMajorCategory = 1;
			boolean expectedSeventhMajorRequirement = true;
			Integer expectedSeventhMajorCategory = 1;
			boolean expectedEighthMajorRequirement = true;
			Integer expectedEighthMajorCategory = 1;
			boolean expectedNinthMajorRequirement = true;
			Integer expectedNinthMajorCategory = 1;
			boolean expectedTenthMajorRequirement = true;
			Integer expectedTenthMajorCategory = 1;
			boolean expectedFirstMinorRequirement = true;
			Integer expectedFirstMinorCategory = 1;
			boolean expectedSecondMinorRequirement = true;
			Integer expectedSecondMinorCategory = 1;
			boolean expectedThirdMinorRequirement = true;
			Integer expectedThirdMinorCategory = 1;
			boolean expectedFourthMinorRequirement = true;
			Integer expectedFourthMinorCategory = 1;
			boolean expectedFifthMinorRequirement = true;
			Integer expectedFifthMinorCategory = 1;
			boolean expectedSixthMinorRequirement = true;
			Integer expectedSixthMinorCategory = 1;
			boolean expectedSeventhMinorRequirement = true;
			Integer expectedSeventhMinorCategory = 1;
			boolean expectedEighthMinorRequirement = true;
			Integer expectedEighthMinorCategory = 1;
			boolean expectedNinthMinorRequirement = true;
			Integer expectedNinthMinorCategory = 1;
			boolean expectedTenthMinorRequirement = true;
			Integer expectedTenthMinorCategory = 1;
			boolean expectedFreeElective = true;
			boolean expectedCompleted = true;
			boolean expectedConsideringEnrollment = false;
			boolean expectedCurrentEnrollment = false;
			Double expectedCredits = 4.0;
			Double expectedGpaDesired = 4.0;
			Double expectedGpaEarned = 4.0;
			String expectedCourseStartDate = "05/21/2016";
			String expectedCourseEndDate = "08/02/2016";
			Integer expectedCoursePredictedDifficulty = 3;
			Integer expectedCoursePredictedWorkload = 3;
			Integer expectedPredictedEnjoyability = 3;
			String expectedRecommendedByWho = "Jana Diesner";
			String expectedNotRecommendedByWho = "Nobody";
			String expectedProfessionalSkills = "Programming Skills";
			String expectedAcademicSkills = "Logic Based Learning";
			CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			CourseInfoGeneral course2 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 "Computer Unprogramming",  expectedAcademicSkills);
			assertFalse(course1.equals(course2));
			assertFalse(course1 == course2);
	
		}
		@Test
		public void testAllFieldsEqualExceptAcademicSkills() {
			String expectedTitle = "Learning Java";
		    String expectedInstructor = "Dr. Kevin Trainor";
			String expectedSemester = "Fall";
			Integer expectedYear = 2016;
			String expectedDepartmentCode = "LIS";
			Integer expectedCourseNumber = 452;
			String expectedSectionNumber = "1";
			String expectedInstitution = "University of Illinois";
			String expectedLocation = "Online";
			String expectedOnline = "100% Online";
			boolean expectedGeneralRequirement = true;
			Integer expectedGeneralCategory = 1;
			boolean expectedFirstMajorRequirement = true;
			Integer expectedFirstMajorCategory = 1;
			boolean expectedSecondMajorRequirement = true;
			Integer expectedSecondMajorCategory = 1;
			boolean expectedThirdMajorRequirement = true;
			Integer expectedThirdMajorCategory = 1;
			boolean expectedFourthMajorRequirement = true;
			Integer expectedFourthMajorCategory = 1 ;
			boolean expectedFifthMajorRequirement = true;
			Integer expectedFifthMajorCategory = 1;
			boolean expectedSixthMajorRequirement = true;
			Integer expectedSixthMajorCategory = 1;
			boolean expectedSeventhMajorRequirement = true;
			Integer expectedSeventhMajorCategory = 1;
			boolean expectedEighthMajorRequirement = true;
			Integer expectedEighthMajorCategory = 1;
			boolean expectedNinthMajorRequirement = true;
			Integer expectedNinthMajorCategory = 1;
			boolean expectedTenthMajorRequirement = true;
			Integer expectedTenthMajorCategory = 1;
			boolean expectedFirstMinorRequirement = true;
			Integer expectedFirstMinorCategory = 1;
			boolean expectedSecondMinorRequirement = true;
			Integer expectedSecondMinorCategory = 1;
			boolean expectedThirdMinorRequirement = true;
			Integer expectedThirdMinorCategory = 1;
			boolean expectedFourthMinorRequirement = true;
			Integer expectedFourthMinorCategory = 1;
			boolean expectedFifthMinorRequirement = true;
			Integer expectedFifthMinorCategory = 1;
			boolean expectedSixthMinorRequirement = true;
			Integer expectedSixthMinorCategory = 1;
			boolean expectedSeventhMinorRequirement = true;
			Integer expectedSeventhMinorCategory = 1;
			boolean expectedEighthMinorRequirement = true;
			Integer expectedEighthMinorCategory = 1;
			boolean expectedNinthMinorRequirement = true;
			Integer expectedNinthMinorCategory = 1;
			boolean expectedTenthMinorRequirement = true;
			Integer expectedTenthMinorCategory = 1;
			boolean expectedFreeElective = true;
			boolean expectedCompleted = true;
			boolean expectedConsideringEnrollment = false;
			boolean expectedCurrentEnrollment = false;
			Double expectedCredits = 4.0;
			Double expectedGpaDesired = 4.0;
			Double expectedGpaEarned = 4.0;
			String expectedCourseStartDate = "05/21/2016";
			String expectedCourseEndDate = "08/02/2016";
			Integer expectedCoursePredictedDifficulty = 3;
			Integer expectedCoursePredictedWorkload = 3;
			Integer expectedPredictedEnjoyability = 3;
			String expectedRecommendedByWho = "Jana Diesner";
			String expectedNotRecommendedByWho = "Nobody";
			String expectedProfessionalSkills = "Programming Skills";
			String expectedAcademicSkills = "Logic Based Learning";
			CourseInfoGeneral course1 = new CourseInfoGeneral(expectedTitle, expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills,  expectedAcademicSkills);
			CourseInfoGeneral course2 = new CourseInfoGeneral("Unlearning Java", expectedInstructor, 
					 expectedSemester, expectedYear,  expectedDepartmentCode, expectedCourseNumber, 
					 expectedSectionNumber, expectedInstitution, expectedLocation, expectedOnline,
					 expectedGeneralRequirement, expectedGeneralCategory, 
					 expectedFirstMajorRequirement, expectedFirstMajorCategory, 
					 expectedSecondMajorRequirement, expectedSecondMajorCategory,
					 expectedThirdMajorRequirement, expectedThirdMajorCategory, 
					 expectedFourthMajorRequirement, expectedFourthMajorCategory,
					 expectedFifthMajorRequirement, expectedFifthMajorCategory, 
					 expectedSixthMajorRequirement, expectedSixthMajorCategory, 
					 expectedSeventhMajorRequirement, expectedSeventhMajorCategory,
					 expectedEighthMajorRequirement, expectedEighthMajorCategory,
					 expectedNinthMajorRequirement, expectedNinthMajorCategory,
					 expectedTenthMajorRequirement, expectedTenthMajorCategory,
					 expectedFirstMinorRequirement, expectedFirstMinorCategory,
					 expectedSecondMinorRequirement, expectedSecondMinorCategory,
					 expectedThirdMinorRequirement, expectedThirdMinorCategory,
					 expectedFourthMinorRequirement, expectedFourthMinorCategory,
					 expectedFifthMinorRequirement, expectedFifthMinorCategory,
					 expectedSixthMinorRequirement, expectedSixthMinorCategory,
					 expectedSeventhMinorRequirement, expectedSeventhMinorCategory,
					 expectedEighthMinorRequirement, expectedEighthMinorCategory,
					 expectedNinthMinorRequirement, expectedNinthMinorCategory,
					 expectedTenthMinorRequirement, expectedTenthMinorCategory,
					 expectedFreeElective, expectedCompleted,
					 expectedConsideringEnrollment, expectedCurrentEnrollment,
					 expectedCredits, expectedGpaDesired, 
					 expectedGpaEarned, expectedCourseStartDate,
					 expectedCourseEndDate, expectedCoursePredictedDifficulty,
					 expectedCoursePredictedWorkload, expectedPredictedEnjoyability,
					 expectedRecommendedByWho, expectedNotRecommendedByWho,
					 expectedProfessionalSkills, "Illogical learning");
			assertFalse(course1.equals(course2));
			assertFalse(course1 == course2);	
		}
		
}	
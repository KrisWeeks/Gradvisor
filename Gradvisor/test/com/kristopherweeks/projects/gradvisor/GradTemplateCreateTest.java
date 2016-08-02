package com.kristopherweeks.projects.gradvisor;

import static org.junit.Assert.*;

import org.junit.Test;

import com.kristopherweeks.projects.gradvisor.GradTemplateCreate;

public class GradTemplateCreateTest {

	@Test
	public void testNoArgumentConstructor() {
		GradTemplateCreate template1 = new GradTemplateCreate();
		assertNotNull(template1);
	}

	@Test
	public void fullyOverLoadedConstructorTest() {
		int expectedTotalCreditsToGraduate = 120;
		int expectedTotalCreditsToMajor = 66;
		int expectedTotalCreditsToMinor = 24;
		String expectedMajorName = "Political Science";
		boolean expectedMajor = true;
		int expectedMajorOrder = 1;
		String expectedConcentrationName = "Constitutional Law";
		int expectedConcentrationOrder = 1;
		boolean expectedMinor = true;
		String expectedMinorName = "Speech Communication";
		int expectedMinorOrder = 1;
		String expectedCategoryName = ;
		boolean expectedCategoryGeneralRequirement;
		String expectedCategoryGeneralRequirementName;
		boolean expectedCategoryCore;
		int expectedCategoryMinimumCredits;
		int expectedCategoryMaximumCredits;
		boolean expectedCategoryElective;
		boolean expectedCategoryGroupCategoryChoice;
		String expectedCategoryGroupCategoryChoiceName;
		int expectedCategoryGroupMinimumCategories;
		int expectedCategoryGroupMinimumCoursesPerCategory;
		int expectedMinimumCourseLevelCourses;
		int expectedMinimumCourseLevelCredits;
		int expectedMinimumOfCourseLevelCourses;
		int expectedMinimumOfCourseLevelCredits;
		int expectedMaximumCourseLevelCourses;
		int expectedMaximumCourseLevelCredits;
		int expectedMaximumOfCourseLevelCourses;
		int expectedMaximumOfCourseLevelCredits;
		int expectedMinimumOfCoursesForNoGrade;
		GradTemplateCreate template1 = new GradTemplateCreate(expectedTotalCreditsToGraduate,
															  expectedTotalCreditsToMajor,	
															  expectedTotalCreditsToMinor,
															  expectedMajorName,
															  expectedMajor,
															  expectedMajorOrder,
															  expectedConcentrationName,
															  expectedConcentrationOrder,
															  expectedMinor,
															  expectedMinorName,
															  expectedMinorOrder,
															  expectedCategoryName,
															  expectedCategoryGeneralRequirement,
															  expectedCategoryGeneralRequirementName,
															  expectedCategoryCore,
															  expectedCategoryMinimumCredits,
															  expectedCategoryMaximumCredits,
															  expectedCategoryElective,
															  expectedCategoryGroupCategoryChoice,
															  expectedCategoryGroupCategoryChoiceName,
															  expectedCategoryGroupMinimumCategories,
															  expectedCategoryGroupMinimumCoursesPerCategory,
															  expectedMinimumCourseLevelCourses,
															  expectedMinimumCourseLevelCredits,
															  expectedMinimumOfCourseLevelCourses,
															  expectedMinimumOfCourseLevelCredits,
															  expectedMaximumCourseLevelCourses,
															  expectedMaximumCourseLevelCredits,
															  expectedMaximumOfCourseLevelCourses,
															  expectedMaximumOfCourseLevelCredits,
															  expectedMinimumOfCoursesForNoGrade);
		assertNotNull(template1);
		assertEquals(expectedTotalCreditsToGraduate, template1.getTotalCreditsToGraduate());
		assertEquals(expectedTotalCreditsToMajor, template1.getTotalCreditsToMajor());
		assertEquals(expectedTotalCreditsToMinor, template1.getTotalCreditsToMinor());
		assertEquals(expectedMajorName, template1.getMajorName());
		assertEquals(expectedMajorOrder, template1.getMajorOrder());
		assertEquals(expectedConcentrationName, template1.getConcentrationName());
		assertEquals(expectedConcentrationOrder, template1.getConcentrationOrder());
		assertEquals(expectedMinor, template1.isMinor());
		assertEquals(expectedMinorName, template1.getMinorName());
		assertEquals(expectedMinorOrder, template1.getMinorOrder());
		assertEquals(expectedCategoryName, template1.getCategoryName());
		assertEquals(expectedCategoryGeneralRequirement, template1.isCategoryGeneralRequirement());
		assertEquals(expectedCategoryGeneralRequirementName, template1.getCategoryGeneralRequirementName());
		assertEquals(expectedCategoryCore, template1.isCategoryCore());
		assertEquals(expectedTotalCreditsToMajor, template1.getTotalCreditsToMajor());
		assertEquals(expectedCategoryMinimumCredits, template1.getCategoryMinimumCredits());
		assertEquals(expectedCategoryMaximumCredits, template1.getCategoryMaximumCredits());
		assertEquals(expectedCategoryElective, template1.isCategoryElective());
		assertEquals(expectedCategoryGroupCategoryChoice, template1.isCategoryGroupCategoryChoice());
		assertEquals(expectedCategoryGroupCategoryChoiceName, template1.getCategoryGroupCategoryChoiceName());
		assertEquals(expectedCategoryGroupMinimumCategories, template1.getCategoryGroupMinimumCategories());
		assertEquals(expectedCategoryGroupMinimumCoursesPerCategory, template1.getCategoryGroupMinimumCoursesPerCategory());
		assertEquals(expectedMinimumCourseLevelCourses, template1.getMinimumCourseLevelCourses());
		assertEquals(expectedMinimumCourseLevelCredits, template1.getMinimumCourseLevelCredits());
		assertEquals(expectedMinimumOfCourseLevelCourses, template1.getMinimumOfCourseLevelCourses());
		assertEquals(expectedMinimumOfCourseLevelCredits, template1.getMinimumOfCourseLevelCredits());
		assertEquals(expectedMaximumCourseLevelCourses, template1.getMaximumCourseLevelCourses());
		assertEquals(expectedMaximumCourseLevelCredits, template1.getMaximumCourseLevelCredits());
		assertEquals(expectedMaximumOfCourseLevelCourses, template1.getMaximumOfCourseLevelCourses());
		assertEquals(expectedMaximumOfCourseLevelCredits, template1.getMaximumOfCourseLevelCredits());
		
		
				}
}
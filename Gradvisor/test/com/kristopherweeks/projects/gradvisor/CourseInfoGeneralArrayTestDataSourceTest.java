package com.kristopherweeks.projects.gradvisor;

import static org.junit.Assert.*;

import org.junit.Test;

public class CourseInfoGeneralArrayTestDataSourceTest {

	@Test
	public void testProperInitializationOfTestDataSource() {
		CourseInfoGeneralArrayTestDataSource source = new CourseInfoGeneralArrayTestDataSource();
		
		// expect 5 test courses 
		
		for (int i = 1; i <= 5; i++);
			CourseInfoGeneral course = source.getNextCourseInfoGeneral();
			assertTrue(course instanceof CourseInfoGeneral);
			
	}
}

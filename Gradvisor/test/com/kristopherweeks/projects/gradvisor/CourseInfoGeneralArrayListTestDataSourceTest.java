package com.kristopherweeks.projects.gradvisor;

import static org.junit.Assert.*;

import org.junit.Test;

public class CourseInfoGeneralArrayListTestDataSourceTest {

	@Test
	public void testProperInitializationOfTestDataSource() {
		CourseInfoGeneralArrayListTestDataSource source = new CourseInfoGeneralArrayListTestDataSource();
		
		// expect 5 test courses 
		
		for (int i = 1; i <= 5; i++);
			CourseInfoGeneral course = source.getNextCourseInfoGeneral();
			assertTrue(course instanceof CourseInfoGeneral);
			
	}
}



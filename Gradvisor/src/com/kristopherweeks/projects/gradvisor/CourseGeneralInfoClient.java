package com.kristopherweeks.projects.gradvisor;

import java.text.DecimalFormat;

public class CourseGeneralInfoClient {

	public static void main(String[] args) {

//		CourseInfoGeneralDataSource source = new CourseInfoGeneralArrayTestDataSource();
		CourseInfoGeneralDataSource source = new CourseInfoGeneralArrayListTestDataSource();
		
		
		Double totalCredits =  (double) 0;
		Double potentialCredits =  (double) 0;
		Double predictedCredits = (double) 0;
		Double averageGpa = (double) 0;
		Double qualityPoints = (double) 0;
		Double averageDesiredGpa = (double) 0;
		Double desiredQualityPoints = (double) 0;
		Double averagePredictedGpa = (double) 0;
		Double predictedQualityPoints = (double) 0;
		
	
		
		
		DecimalFormat df = new DecimalFormat("0.0000");
		
		CourseInfoGeneral currentCourse;

		currentCourse = source.getNextCourseInfoGeneral();
		
		// to string print
		
		while (currentCourse != null) {
			System.out.println(currentCourse.toString());
		
		// total credits - expected 8
		// potential credits - expected 12
	    // planned credits - expected 16
			boolean completed = currentCourse.isCompleted();
				if (completed == true) {
			Double tempCredits;
				tempCredits = currentCourse.getCredits();
			    totalCredits += tempCredits;
					} else {
				    	boolean currentEnrollment = currentCourse.isCurrentEnrollment();
				    	if (currentEnrollment == true) {
				    		Double tempPotentialCredits;
				    		tempPotentialCredits = currentCourse.getCredits();
				    		potentialCredits += tempPotentialCredits;
				    } else{
				    	boolean consideringEnrollment = currentCourse.isConsideringEnrollment();
				    	if (consideringEnrollment == true) {
				    		Double tempPredictedCredits; 
				    		tempPredictedCredits = currentCourse.getCredits();
				    		predictedCredits += tempPredictedCredits;
				    	    }
				    }
			}
		
			
		 //currentGPA - expected 3.0    
			completed = currentCourse.isCompleted();
				Double tempCredits;
			    Double tempGpa;
			    Double tempQualityPoints;
			    if (completed == true) {
			    	tempGpa = currentCourse.getGpaEarned();
			    	if (tempGpa != null); {
			    		tempCredits = currentCourse.getCredits();
			        	tempQualityPoints = (tempCredits * tempGpa);
			        	qualityPoints += tempQualityPoints;
			    	}
			    }
				
			
	   //Desired GPA - expected 3.33
			 
			boolean currentEnrollment2 = currentCourse.isCurrentEnrollment();
					if (currentEnrollment2 == true) {
						Double tempDesiredGpa;
						Double tempDesiredQualityPoints;
			 			Double tempCredits1 = currentCourse.getCredits();
			 			tempDesiredGpa = currentCourse.getGpaDesired();
			 			if (tempDesiredGpa != null) {
			 				tempDesiredGpa = currentCourse.getGpaDesired();
			 				tempDesiredQualityPoints = (tempCredits1 * tempDesiredGpa);
			 				desiredQualityPoints += tempDesiredQualityPoints;
			 			}	
					}
					
		 //Planned GPA - expected 3.125
				boolean consideringEnrollment = currentCourse.isConsideringEnrollment();
					if (consideringEnrollment == true) {
						Double tempPredictedGpa;
						Double tempPredictedQualityPoints;
			 			Double tempCredits3 = currentCourse.getCredits();
			 			tempPredictedGpa = currentCourse.getGpaDesired();
			 			if (tempPredictedGpa != 0) {
			 				tempPredictedQualityPoints = (tempCredits3 * tempPredictedGpa);
			 				predictedQualityPoints += tempPredictedQualityPoints;
						}
					 		
					}	
							
					currentCourse = source.getNextCourseInfoGeneral();
		}
			
		potentialCredits += totalCredits;
		predictedCredits += potentialCredits;
		averageGpa = (qualityPoints / totalCredits);
		averageDesiredGpa = ((qualityPoints + desiredQualityPoints) / (potentialCredits));
		averagePredictedGpa = ((qualityPoints + desiredQualityPoints + predictedQualityPoints) / (predictedCredits));
		
			
		System.out.println("Credits earned: " + totalCredits);
		System.out.println("Potential credits earned after semester ends: " + potentialCredits);
		System.out.println("Total number of planned credits " + predictedCredits);
		System.out.println("Current GPA: " + df.format(averageGpa));
		System.out.println("Desired GPA after semester ends: " + df.format(averageDesiredGpa));
		System.out.println("Potential GPA based on future courses: " + df.format(averagePredictedGpa));
		
	}
}
		
		
	




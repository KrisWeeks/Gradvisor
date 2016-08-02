package com.kristopherweeks.projects.gradvisor;

public class CourseInfoGeneral {

	// instance variables
	private String title;
	private String instructor;
	private String semester;
	private Integer year;
	private String departmentCode;
	private Integer courseNumber;
	private String sectionNumber;
	private String institution;
	private String location;
	private String online;
	private boolean generalRequirement;
	private Integer generalCategory;
	private boolean firstMajorRequirement;
	private Integer firstMajorCategory;
	private boolean secondMajorRequirement;
	private Integer secondMajorCategory;
	private boolean thirdMajorRequirement;
	private Integer thirdMajorCategory;
	private boolean fourthMajorRequirement;
	private Integer fourthMajorCategory;
	private boolean fifthMajorRequirement;
	private Integer fifthMajorCategory;
	private boolean sixthMajorRequirement;
	private Integer sixthMajorCategory;
	private boolean seventhMajorRequirement;
	private Integer seventhMajorCategory;
	private boolean eighthMajorRequirement;
	private Integer eighthMajorCategory;
	private boolean ninthMajorRequirement;
	private Integer ninthMajorCategory;
	private boolean tenthMajorRequirement;
	private Integer tenthMajorCategory;
	private boolean firstMinorRequirement;
	private Integer firstMinorCategory;
	private boolean secondMinorRequirement;
	private Integer secondMinorCategory;
	private boolean thirdMinorRequirement;
	private Integer thirdMinorCategory;
	private boolean fourthMinorRequirement;
	private Integer fourthMinorCategory;
	private boolean fifthMinorRequirement;
	private Integer fifthMinorCategory;
	private boolean sixthMinorRequirement;
	private Integer sixthMinorCategory;
	private boolean seventhMinorRequirement;
	private Integer seventhMinorCategory;
	private boolean eighthMinorRequirement;
	private Integer eighthMinorCategory;
	private boolean ninthMinorRequirement;
	private Integer ninthMinorCategory;
	private boolean tenthMinorRequirement;
	private Integer tenthMinorCategory;
	private boolean freeElective;
	private boolean completed;
	private boolean consideringEnrollment;
	private boolean currentEnrollment;
	private Double credits;
	private Double gpaDesired;
	private Double gpaEarned;
	private String courseStartDate;
	private String courseEndDate;
	private Integer coursePredictedDifficulty;
	private Integer coursePredictedWorkload;
	private Integer predictedEnjoyability;
	private String recommendedByWho;
	private String notRecommendedByWho;
	private String professionalSkills;
	private String academicSkills;

	// no argument constructor
	public CourseInfoGeneral() {
		
	}
	
	// to string
	@Override
	public String toString() {
		return "CourseInfoGeneral [title=Learning Java, instructor=Dr. Kevin Trainor, semester=Fall, year=2016, departmentCode=LIS, courseNumber=452, sectionNumber=1, institution=University of Illinois, location=Online, online=100% Online, generalRequirement=true, generalCategory=1, firstMajorRequirement=true, firstMajorCategory=1, secondMajorRequirement=true, secondMajorCategory=1, firstMinorRequirement=true, firstMinorCategory=1, secondMinorRequirement=true, secondMinorCategory=1, freeElective=true, completed=true, consideringEnrollment=false, currentEnrollment=false, credits=4.0, gpaDesired=4.0, gpaEarned=4.0, courseStartDate=05/21/2016, courseEndDate=08/02/2016, coursePredictedDifficulty=3, coursePredictedWorkload=3, predictedEnjoyability=3, recommendedByWho=Jana Diesner, notRecommendedByWho=Nobody, professionalSkills=Programming Skills, academicSkills=Logic Based Learning]";
	}

	// constructors
	public CourseInfoGeneral(String title, String instructor, String semester, Integer year, String departmentCode,
			Integer courseNumber, String sectionNumber, String institution, String location, String online,
			boolean generalRequirement, Integer generalCategory, boolean firstMajorRequirement,
			Integer firstMajorCategory, boolean secondMajorRequirement, Integer secondMajorCategory,
			boolean thirdMajorRequirement, Integer thirdMajorCategory, boolean fourthMajorRequirement,
			Integer fourthMajorCategory, boolean fifthMajorRequirement, Integer fifthMajorCategory,
			boolean sixthMajorRequirement, Integer sixthMajorCategory, boolean seventhMajorRequirement,
			Integer seventhMajorCategory, boolean eighthMajorRequirement, Integer eigthMajorCategory,
			boolean ninthMajorRequirement, Integer ninthMajorCategory, boolean tenthMajorRequirement,
			Integer tenthMajorCategory, boolean firstMinorRequirement, Integer firstMinorCategory,
			boolean secondMinorRequirement, Integer secondMinorCategory, boolean thirdMinorRequirement,
			Integer thirdMinorCategory, boolean fourthMinorRequirement, Integer fourthMinorCategory,
			boolean fifthMinorRequirement, Integer fifthMinorCategory, boolean sixthMinorRequirement,
			Integer sixthMinorCategory, boolean seventhMinorRequirement, Integer seventhMinorCategory,
			boolean eighthMinorRequirement, Integer eighthMinorCategory, boolean ninthMinorRequirement,
			Integer ninthMinorCategory, boolean tenthMinorRequirement, Integer tenthMinorCategory, boolean freeElective,
			boolean completed, boolean consideringEnrollment, boolean currentEnrollment, Double credits,
			Double gpaDesired, Double gpaEarned, String courseStartDate, String courseEndDate,
			Integer coursePredictedDifficulty, Integer coursePredictedWorkload, Integer predictedEnjoyability,
			String recommendedByWho, String notRecommendedByWho, String professionalSkills, String academicSkills) {

		// fully overloaded constructor
		setTitle(title);
		setInstructor(instructor);
		setSemester(semester);
		setYear(year);
		setDepartmentCode(departmentCode);
		setCourseNumber(courseNumber);
		setSectionNumber(sectionNumber);
		setInstitution(institution);
		setLocation(location);
		setOnline(online);
		setGeneralRequirement(generalRequirement);
		setGeneralCategory(generalCategory);
		setFirstMajorRequirement(firstMajorRequirement);
		setFirstMajorCategory(firstMajorCategory);
		setSecondMajorRequirement(secondMajorRequirement);
		setSecondMajorCategory(secondMajorCategory);
		setThirdMajorCategory(thirdMajorCategory);
		setThirdMajorRequirement(thirdMajorRequirement);
		setFourthMajorCategory(fourthMajorCategory);
		setFourthMajorRequirement(fourthMajorRequirement);
		setFifthMajorCategory(fifthMajorCategory);
		setFifthMajorRequirement(fifthMajorRequirement);
		setSixthMajorCategory(sixthMajorCategory);
		setSixthMajorRequirement(sixthMajorRequirement);
		setSeventhMajorRequirement(seventhMajorRequirement);
		setSeventhMajorCategory(seventhMajorCategory);
		setEighthMajorRequirement(eighthMajorRequirement);
		setEighthMajorCategory(eigthMajorCategory);
		setNinthMajorRequirement(ninthMajorRequirement);
		setNinthMajorCategory(ninthMajorCategory);
		setTenthMajorRequirement(tenthMajorRequirement);
		setTenthMajorCategory(tenthMajorCategory);
		setFirstMinorRequirement(firstMinorRequirement);
		setFirstMinorCategory(firstMinorCategory);
		setSecondMinorRequirement(secondMinorRequirement);
		setSecondMinorCategory(secondMinorCategory);
		setThirdMinorRequirement(thirdMinorRequirement);
		setThirdMinorCategory(thirdMinorCategory);
		setFourthMinorRequirement(fourthMinorRequirement);
		setFourthMinorCategory(fourthMinorCategory);
		setFifthMinorRequirement(fifthMinorRequirement);
		setFifthMinorCategory(fifthMinorCategory);
		setSixthMinorRequirement(sixthMinorRequirement);
		setSixthMinorCategory(sixthMinorCategory);
		setSeventhMinorRequirement(seventhMinorRequirement);
		setSeventhMinorCategory(seventhMinorCategory);
		setEighthMinorRequirement(eighthMinorRequirement);
		setEighthMinorCategory(eighthMinorCategory);
		setNinthMinorRequirement(ninthMinorRequirement);
		setNinthMinorCategory(ninthMinorCategory);
		setTenthMinorRequirement(tenthMinorRequirement);
		setTenthMinorCategory(tenthMinorCategory);
		setFreeElective(freeElective);
		setCompleted(completed);
		setConsideringEnrollment(consideringEnrollment);
		setCurrentEnrollment(currentEnrollment);
		setCredits(credits);
		setGpaDesired(gpaDesired);
		setGpaEarned(gpaEarned);
		setCourseStartDate(courseStartDate);
		setCourseEndDate(courseEndDate);
		setCoursePredictedDifficulty(coursePredictedDifficulty);
		setCoursePredictedWorkload(coursePredictedWorkload);
		setPredictedEnjoyability(predictedEnjoyability);
		setRecommendedByWho(recommendedByWho);
		setNotRecommendedByWho(notRecommendedByWho);
		setProfessionalSkills(professionalSkills);
		setAcademicSkills(academicSkills);

		// getters and setters
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getDepartmentCode() {
		return departmentCode;
	}

	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}

	public Integer getCourseNumber() {
		return courseNumber;
	}

	public void setCourseNumber(Integer courseNumber) {
		this.courseNumber = courseNumber;
	}

	public String getSectionNumber() {
		return sectionNumber;
	}

	public void setSectionNumber(String sectionNumber) {
		this.sectionNumber = sectionNumber;
	}

	public String getInstitution() {
		return institution;
	}

	public void setInstitution(String institution) {
		this.institution = institution;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getOnline() {
		return online;
	}

	public void setOnline(String online) {
		this.online = online;
	}

	public boolean isGeneralRequirement() {
		return generalRequirement;
	}

	public void setGeneralRequirement(boolean generalRequirement) {
		this.generalRequirement = generalRequirement;
	}

	public Integer getGeneralCategory() {
		return generalCategory;
	}

	public void setGeneralCategory(Integer generalCategory) {
		this.generalCategory = generalCategory;
	}

	public boolean isFirstMajorRequirement() {
		return firstMajorRequirement;
	}

	public void setFirstMajorRequirement(boolean firstMajorRequirement) {
		this.firstMajorRequirement = firstMajorRequirement;
	}

	public Integer getFirstMajorCategory() {
		return firstMajorCategory;
	}

	public void setFirstMajorCategory(Integer firstMajorCategory) {
		this.firstMajorCategory = firstMajorCategory;
	}

	public boolean isSecondMajorRequirement() {
		return secondMajorRequirement;
	}

	public void setSecondMajorRequirement(boolean secondMajorRequirement) {
		this.secondMajorRequirement = secondMajorRequirement;
	}

	public Integer getSecondMajorCategory() {
		return secondMajorCategory;
	}

	public void setSecondMajorCategory(Integer secondMajorCategory) {
		this.secondMajorCategory = secondMajorCategory;
	}

	public boolean isThirdMajorRequirement() {
		return thirdMajorRequirement;
	}

	public void setThirdMajorRequirement(boolean thirdMajorRequirement) {
		this.thirdMajorRequirement = thirdMajorRequirement;
	}

	public Integer getThirdMajorCategory() {
		return thirdMajorCategory;
	}

	public void setThirdMajorCategory(Integer thirdMajorCategory) {
		this.thirdMajorCategory = thirdMajorCategory;
	}

	public boolean isFourthMajorRequirement() {
		return fourthMajorRequirement;
	}

	public void setFourthMajorRequirement(boolean fourthMajorRequirement) {
		this.fourthMajorRequirement = fourthMajorRequirement;
	}

	public Integer getFourthMajorCategory() {
		return fourthMajorCategory;
	}

	public void setFourthMajorCategory(Integer fourthMajorCategory) {
		this.fourthMajorCategory = fourthMajorCategory;
	}

	public boolean isFifthMajorRequirement() {
		return fifthMajorRequirement;
	}

	public void setFifthMajorRequirement(boolean fifthMajorRequirement) {
		this.fifthMajorRequirement = fifthMajorRequirement;
	}

	public Integer getFifthMajorCategory() {
		return fifthMajorCategory;
	}

	public void setFifthMajorCategory(Integer fifthMajorCategory) {
		this.fifthMajorCategory = fifthMajorCategory;
	}

	public boolean isSixthMajorRequirement() {
		return sixthMajorRequirement;
	}

	public void setSixthMajorRequirement(boolean sixthMajorRequirement) {
		this.sixthMajorRequirement = sixthMajorRequirement;
	}

	public Integer getSixthMajorCategory() {
		return sixthMajorCategory;
	}

	public void setSixthMajorCategory(Integer sixthMajorCategory) {
		this.sixthMajorCategory = sixthMajorCategory;
	}

	public boolean isSeventhMajorRequirement() {
		return seventhMajorRequirement;
	}

	public void setSeventhMajorRequirement(boolean seventhMajorRequirement) {
		this.seventhMajorRequirement = seventhMajorRequirement;
	}

	public Integer getSeventhMajorCategory() {
		return seventhMajorCategory;
	}

	public void setSeventhMajorCategory(Integer seventhMajorCategory) {
		this.seventhMajorCategory = seventhMajorCategory;
	}

	public boolean isEighthMajorRequirement() {
		return eighthMajorRequirement;
	}

	public void setEighthMajorRequirement(boolean eighthMajorRequirement) {
		this.eighthMajorRequirement = eighthMajorRequirement;
	}

	public Integer getEighthMajorCategory() {
		return eighthMajorCategory;
	}

	public void setEighthMajorCategory(Integer eighthMajorCategory) {
		this.eighthMajorCategory = eighthMajorCategory;
	}

	public boolean isNinthMajorRequirement() {
		return ninthMajorRequirement;
	}

	public void setNinthMajorRequirement(boolean ninthMajorRequirement) {
		this.ninthMajorRequirement = ninthMajorRequirement;
	}

	public Integer getNinthMajorCategory() {
		return ninthMajorCategory;
	}

	public void setNinthMajorCategory(Integer ninthMajorCategory) {
		this.ninthMajorCategory = ninthMajorCategory;
	}

	public boolean isTenthMajorRequirement() {
		return tenthMajorRequirement;
	}

	public void setTenthMajorRequirement(boolean tenthMajorRequirement) {
		this.tenthMajorRequirement = tenthMajorRequirement;
	}

	public Integer getTenthMajorCategory() {
		return tenthMajorCategory;
	}

	public void setTenthMajorCategory(Integer tenthMajorCategory) {
		this.tenthMajorCategory = tenthMajorCategory;
	}

	public boolean isFirstMinorRequirement() {
		return firstMinorRequirement;
	}

	public void setFirstMinorRequirement(boolean firstMinorRequirement) {
		this.firstMinorRequirement = firstMinorRequirement;
	}

	public Integer getFirstMinorCategory() {
		return firstMinorCategory;
	}

	public void setFirstMinorCategory(Integer firstMinorCategory) {
		this.firstMinorCategory = firstMinorCategory;
	}

	public boolean isSecondMinorRequirement() {
		return secondMinorRequirement;
	}

	public void setSecondMinorRequirement(boolean secondMinorRequirement) {
		this.secondMinorRequirement = secondMinorRequirement;
	}

	public Integer getSecondMinorCategory() {
		return secondMinorCategory;
	}

	public void setSecondMinorCategory(Integer secondMinorCategory) {
		this.secondMinorCategory = secondMinorCategory;
	}

	public boolean isThirdMinorRequirement() {
		return thirdMinorRequirement;
	}

	public void setThirdMinorRequirement(boolean thirdMinorRequirement) {
		this.thirdMinorRequirement = thirdMinorRequirement;
	}

	public Integer getThirdMinorCategory() {
		return thirdMinorCategory;
	}

	public void setThirdMinorCategory(Integer thirdMinorCategory) {
		this.thirdMinorCategory = thirdMinorCategory;
	}

	public boolean isFourthMinorRequirement() {
		return fourthMinorRequirement;
	}

	public void setFourthMinorRequirement(boolean fourthMinorRequirement) {
		this.fourthMinorRequirement = fourthMinorRequirement;
	}

	public Integer getFourthMinorCategory() {
		return fourthMinorCategory;
	}

	public void setFourthMinorCategory(Integer fourthMinorCategory) {
		this.fourthMinorCategory = fourthMinorCategory;
	}

	public boolean isFifthMinorRequirement() {
		return fifthMinorRequirement;
	}

	public void setFifthMinorRequirement(boolean fifthMinorRequirement) {
		this.fifthMinorRequirement = fifthMinorRequirement;
	}

	public Integer getFifthMinorCategory() {
		return fifthMinorCategory;
	}

	public void setFifthMinorCategory(Integer fifthMinorCategory) {
		this.fifthMinorCategory = fifthMinorCategory;
	}

	public boolean isSixthMinorRequirement() {
		return sixthMinorRequirement;
	}

	public void setSixthMinorRequirement(boolean sixthMinorRequirement) {
		this.sixthMinorRequirement = sixthMinorRequirement;
	}

	public Integer getSixthMinorCategory() {
		return sixthMinorCategory;
	}

	public void setSixthMinorCategory(Integer sixthMinorCategory) {
		this.sixthMinorCategory = sixthMinorCategory;
	}

	public boolean isSeventhMinorRequirement() {
		return seventhMinorRequirement;
	}

	public void setSeventhMinorRequirement(boolean seventhMinorRequirement) {
		this.seventhMinorRequirement = seventhMinorRequirement;
	}

	public Integer getSeventhMinorCategory() {
		return seventhMinorCategory;
	}

	public void setSeventhMinorCategory(Integer seventhMinorCategory) {
		this.seventhMinorCategory = seventhMinorCategory;
	}

	public boolean isEighthMinorRequirement() {
		return eighthMinorRequirement;
	}

	public void setEighthMinorRequirement(boolean eighthMinorRequirement) {
		this.eighthMinorRequirement = eighthMinorRequirement;
	}

	public Integer getEighthMinorCategory() {
		return eighthMinorCategory;
	}

	public void setEighthMinorCategory(Integer eighthMinorCategory) {
		this.eighthMinorCategory = eighthMinorCategory;
	}

	public boolean isNinthMinorRequirement() {
		return ninthMinorRequirement;
	}

	public void setNinthMinorRequirement(boolean ninthMinorRequirement) {
		this.ninthMinorRequirement = ninthMinorRequirement;
	}

	public Integer getNinthMinorCategory() {
		return ninthMinorCategory;
	}

	public void setNinthMinorCategory(Integer ninthMinorCategory) {
		this.ninthMinorCategory = ninthMinorCategory;
	}

	public boolean isTenthMinorRequirement() {
		return tenthMinorRequirement;
	}

	public void setTenthMinorRequirement(boolean tenthMinorRequirement) {
		this.tenthMinorRequirement = tenthMinorRequirement;
	}

	public Integer getTenthMinorCategory() {
		return tenthMinorCategory;
	}

	public void setTenthMinorCategory(Integer tenthMinorCategory) {
		this.tenthMinorCategory = tenthMinorCategory;
	}

	public boolean isFreeElective() {
		return freeElective;
	}

	public void setFreeElective(boolean freeElective) {
		this.freeElective = freeElective;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	public boolean isConsideringEnrollment() {
		return consideringEnrollment;
	}

	public void setConsideringEnrollment(boolean consideringEnrollment) {
		this.consideringEnrollment = consideringEnrollment;
	}

	public boolean isCurrentEnrollment() {
		return currentEnrollment;
	}

	public void setCurrentEnrollment(boolean currentEnrollment) {
		this.currentEnrollment = currentEnrollment;
	}

	public Double getCredits() {
		return credits;
	}

	public void setCredits(Double credits) {
		this.credits = credits;
	}

	public Double getGpaDesired() {
		return gpaDesired;
	}

	public void setGpaDesired(Double gpaDesired) {
		this.gpaDesired = gpaDesired;
	}

	public Double getGpaEarned() {
		return gpaEarned;
	}

	public void setGpaEarned(Double gpaEarned) {
		this.gpaEarned = gpaEarned;
	}

	public String getCourseStartDate() {
		return courseStartDate;
	}

	public void setCourseStartDate(String courseStartDate) {
		this.courseStartDate = courseStartDate;
	}

	public String getCourseEndDate() {
		return courseEndDate;
	}

	public void setCourseEndDate(String courseEndDate) {
		this.courseEndDate = courseEndDate;
	}

	public Integer getCoursePredictedDifficulty() {
		return coursePredictedDifficulty;
	}

	public void setCoursePredictedDifficulty(Integer coursePredictedDifficulty) {
		this.coursePredictedDifficulty = coursePredictedDifficulty;
	}

	public Integer getCoursePredictedWorkload() {
		return coursePredictedWorkload;
	}

	public void setCoursePredictedWorkload(Integer coursePredictedWorkload) {
		this.coursePredictedWorkload = coursePredictedWorkload;
	}

	public Integer getPredictedEnjoyability() {
		return predictedEnjoyability;
	}

	public void setPredictedEnjoyability(Integer predictedEnjoyability) {
		this.predictedEnjoyability = predictedEnjoyability;
	}

	public String getRecommendedByWho() {
		return recommendedByWho;
	}

	public void setRecommendedByWho(String recommendedByWho) {
		this.recommendedByWho = recommendedByWho;
	}

	public String getNotRecommendedByWho() {
		return notRecommendedByWho;
	}

	public void setNotRecommendedByWho(String notRecommendedByWho) {
		this.notRecommendedByWho = notRecommendedByWho;
	}

	public String getProfessionalSkills() {
		return professionalSkills;
	}

	public void setProfessionalSkills(String professionalSkills) {
		this.professionalSkills = professionalSkills;
	}

	public String getAcademicSkills() {
		return academicSkills;
	}

	public void setAcademicSkills(String academicSkills) {
		this.academicSkills = academicSkills;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((academicSkills == null) ? 0 : academicSkills.hashCode());
		result = prime * result + (completed ? 1231 : 1237);
		result = prime * result + (consideringEnrollment ? 1231 : 1237);
		result = prime * result + ((courseEndDate == null) ? 0 : courseEndDate.hashCode());
		result = prime * result + ((courseNumber == null) ? 0 : courseNumber.hashCode());
		result = prime * result + ((coursePredictedDifficulty == null) ? 0 : coursePredictedDifficulty.hashCode());
		result = prime * result + ((coursePredictedWorkload == null) ? 0 : coursePredictedWorkload.hashCode());
		result = prime * result + ((courseStartDate == null) ? 0 : courseStartDate.hashCode());
		result = prime * result + ((credits == null) ? 0 : credits.hashCode());
		result = prime * result + (currentEnrollment ? 1231 : 1237);
		result = prime * result + ((departmentCode == null) ? 0 : departmentCode.hashCode());
		result = prime * result + ((eighthMajorCategory == null) ? 0 : eighthMajorCategory.hashCode());
		result = prime * result + (eighthMajorRequirement ? 1231 : 1237);
		result = prime * result + ((eighthMinorCategory == null) ? 0 : eighthMinorCategory.hashCode());
		result = prime * result + (eighthMinorRequirement ? 1231 : 1237);
		result = prime * result + ((fifthMajorCategory == null) ? 0 : fifthMajorCategory.hashCode());
		result = prime * result + (fifthMajorRequirement ? 1231 : 1237);
		result = prime * result + ((fifthMinorCategory == null) ? 0 : fifthMinorCategory.hashCode());
		result = prime * result + (fifthMinorRequirement ? 1231 : 1237);
		result = prime * result + ((firstMajorCategory == null) ? 0 : firstMajorCategory.hashCode());
		result = prime * result + (firstMajorRequirement ? 1231 : 1237);
		result = prime * result + ((firstMinorCategory == null) ? 0 : firstMinorCategory.hashCode());
		result = prime * result + (firstMinorRequirement ? 1231 : 1237);
		result = prime * result + ((fourthMajorCategory == null) ? 0 : fourthMajorCategory.hashCode());
		result = prime * result + (fourthMajorRequirement ? 1231 : 1237);
		result = prime * result + ((fourthMinorCategory == null) ? 0 : fourthMinorCategory.hashCode());
		result = prime * result + (fourthMinorRequirement ? 1231 : 1237);
		result = prime * result + (freeElective ? 1231 : 1237);
		result = prime * result + ((generalCategory == null) ? 0 : generalCategory.hashCode());
		result = prime * result + (generalRequirement ? 1231 : 1237);
		result = prime * result + ((gpaDesired == null) ? 0 : gpaDesired.hashCode());
		result = prime * result + ((gpaEarned == null) ? 0 : gpaEarned.hashCode());
		result = prime * result + ((institution == null) ? 0 : institution.hashCode());
		result = prime * result + ((instructor == null) ? 0 : instructor.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((ninthMajorCategory == null) ? 0 : ninthMajorCategory.hashCode());
		result = prime * result + (ninthMajorRequirement ? 1231 : 1237);
		result = prime * result + ((ninthMinorCategory == null) ? 0 : ninthMinorCategory.hashCode());
		result = prime * result + (ninthMinorRequirement ? 1231 : 1237);
		result = prime * result + ((notRecommendedByWho == null) ? 0 : notRecommendedByWho.hashCode());
		result = prime * result + ((online == null) ? 0 : online.hashCode());
		result = prime * result + ((predictedEnjoyability == null) ? 0 : predictedEnjoyability.hashCode());
		result = prime * result + ((professionalSkills == null) ? 0 : professionalSkills.hashCode());
		result = prime * result + ((recommendedByWho == null) ? 0 : recommendedByWho.hashCode());
		result = prime * result + ((secondMajorCategory == null) ? 0 : secondMajorCategory.hashCode());
		result = prime * result + (secondMajorRequirement ? 1231 : 1237);
		result = prime * result + ((secondMinorCategory == null) ? 0 : secondMinorCategory.hashCode());
		result = prime * result + (secondMinorRequirement ? 1231 : 1237);
		result = prime * result + ((sectionNumber == null) ? 0 : sectionNumber.hashCode());
		result = prime * result + ((semester == null) ? 0 : semester.hashCode());
		result = prime * result + ((seventhMajorCategory == null) ? 0 : seventhMajorCategory.hashCode());
		result = prime * result + (seventhMajorRequirement ? 1231 : 1237);
		result = prime * result + ((seventhMinorCategory == null) ? 0 : seventhMinorCategory.hashCode());
		result = prime * result + (seventhMinorRequirement ? 1231 : 1237);
		result = prime * result + ((sixthMajorCategory == null) ? 0 : sixthMajorCategory.hashCode());
		result = prime * result + (sixthMajorRequirement ? 1231 : 1237);
		result = prime * result + ((sixthMinorCategory == null) ? 0 : sixthMinorCategory.hashCode());
		result = prime * result + (sixthMinorRequirement ? 1231 : 1237);
		result = prime * result + ((tenthMajorCategory == null) ? 0 : tenthMajorCategory.hashCode());
		result = prime * result + (tenthMajorRequirement ? 1231 : 1237);
		result = prime * result + ((tenthMinorCategory == null) ? 0 : tenthMinorCategory.hashCode());
		result = prime * result + (tenthMinorRequirement ? 1231 : 1237);
		result = prime * result + ((thirdMajorCategory == null) ? 0 : thirdMajorCategory.hashCode());
		result = prime * result + (thirdMajorRequirement ? 1231 : 1237);
		result = prime * result + ((thirdMinorCategory == null) ? 0 : thirdMinorCategory.hashCode());
		result = prime * result + (thirdMinorRequirement ? 1231 : 1237);
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((year == null) ? 0 : year.hashCode());
		return result;
	}

	// hash code

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CourseInfoGeneral other = (CourseInfoGeneral) obj;
		if (academicSkills == null) {
			if (other.academicSkills != null)
				return false;
		} else if (!academicSkills.equals(other.academicSkills))
			return false;
		if (completed != other.completed)
			return false;
		if (consideringEnrollment != other.consideringEnrollment)
			return false;
		if (courseEndDate == null) {
			if (other.courseEndDate != null)
				return false;
		} else if (!courseEndDate.equals(other.courseEndDate))
			return false;
		if (courseNumber == null) {
			if (other.courseNumber != null)
				return false;
		} else if (!courseNumber.equals(other.courseNumber))
			return false;
		if (coursePredictedDifficulty == null) {
			if (other.coursePredictedDifficulty != null)
				return false;
		} else if (!coursePredictedDifficulty.equals(other.coursePredictedDifficulty))
			return false;
		if (coursePredictedWorkload == null) {
			if (other.coursePredictedWorkload != null)
				return false;
		} else if (!coursePredictedWorkload.equals(other.coursePredictedWorkload))
			return false;
		if (courseStartDate == null) {
			if (other.courseStartDate != null)
				return false;
		} else if (!courseStartDate.equals(other.courseStartDate))
			return false;
		if (credits == null) {
			if (other.credits != null)
				return false;
		} else if (!credits.equals(other.credits))
			return false;
		if (currentEnrollment != other.currentEnrollment)
			return false;
		if (departmentCode == null) {
			if (other.departmentCode != null)
				return false;
		} else if (!departmentCode.equals(other.departmentCode))
			return false;
		if (eighthMajorCategory == null) {
			if (other.eighthMajorCategory != null)
				return false;
		} else if (!eighthMajorCategory.equals(other.eighthMajorCategory))
			return false;
		if (eighthMajorRequirement != other.eighthMajorRequirement)
			return false;
		if (eighthMinorCategory == null) {
			if (other.eighthMinorCategory != null)
				return false;
		} else if (!eighthMinorCategory.equals(other.eighthMinorCategory))
			return false;
		if (eighthMinorRequirement != other.eighthMinorRequirement)
			return false;
		if (fifthMajorCategory == null) {
			if (other.fifthMajorCategory != null)
				return false;
		} else if (!fifthMajorCategory.equals(other.fifthMajorCategory))
			return false;
		if (fifthMajorRequirement != other.fifthMajorRequirement)
			return false;
		if (fifthMinorCategory == null) {
			if (other.fifthMinorCategory != null)
				return false;
		} else if (!fifthMinorCategory.equals(other.fifthMinorCategory))
			return false;
		if (fifthMinorRequirement != other.fifthMinorRequirement)
			return false;
		if (firstMajorCategory == null) {
			if (other.firstMajorCategory != null)
				return false;
		} else if (!firstMajorCategory.equals(other.firstMajorCategory))
			return false;
		if (firstMajorRequirement != other.firstMajorRequirement)
			return false;
		if (firstMinorCategory == null) {
			if (other.firstMinorCategory != null)
				return false;
		} else if (!firstMinorCategory.equals(other.firstMinorCategory))
			return false;
		if (firstMinorRequirement != other.firstMinorRequirement)
			return false;
		if (fourthMajorCategory == null) {
			if (other.fourthMajorCategory != null)
				return false;
		} else if (!fourthMajorCategory.equals(other.fourthMajorCategory))
			return false;
		if (fourthMajorRequirement != other.fourthMajorRequirement)
			return false;
		if (fourthMinorCategory == null) {
			if (other.fourthMinorCategory != null)
				return false;
		} else if (!fourthMinorCategory.equals(other.fourthMinorCategory))
			return false;
		if (fourthMinorRequirement != other.fourthMinorRequirement)
			return false;
		if (freeElective != other.freeElective)
			return false;
		if (generalCategory == null) {
			if (other.generalCategory != null)
				return false;
		} else if (!generalCategory.equals(other.generalCategory))
			return false;
		if (generalRequirement != other.generalRequirement)
			return false;
		if (gpaDesired == null) {
			if (other.gpaDesired != null)
				return false;
		} else if (!gpaDesired.equals(other.gpaDesired))
			return false;
		if (gpaEarned == null) {
			if (other.gpaEarned != null)
				return false;
		} else if (!gpaEarned.equals(other.gpaEarned))
			return false;
		if (institution == null) {
			if (other.institution != null)
				return false;
		} else if (!institution.equals(other.institution))
			return false;
		if (instructor == null) {
			if (other.instructor != null)
				return false;
		} else if (!instructor.equals(other.instructor))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (ninthMajorCategory == null) {
			if (other.ninthMajorCategory != null)
				return false;
		} else if (!ninthMajorCategory.equals(other.ninthMajorCategory))
			return false;
		if (ninthMajorRequirement != other.ninthMajorRequirement)
			return false;
		if (ninthMinorCategory == null) {
			if (other.ninthMinorCategory != null)
				return false;
		} else if (!ninthMinorCategory.equals(other.ninthMinorCategory))
			return false;
		if (ninthMinorRequirement != other.ninthMinorRequirement)
			return false;
		if (notRecommendedByWho == null) {
			if (other.notRecommendedByWho != null)
				return false;
		} else if (!notRecommendedByWho.equals(other.notRecommendedByWho))
			return false;
		if (online == null) {
			if (other.online != null)
				return false;
		} else if (!online.equals(other.online))
			return false;
		if (predictedEnjoyability == null) {
			if (other.predictedEnjoyability != null)
				return false;
		} else if (!predictedEnjoyability.equals(other.predictedEnjoyability))
			return false;
		if (professionalSkills == null) {
			if (other.professionalSkills != null)
				return false;
		} else if (!professionalSkills.equals(other.professionalSkills))
			return false;
		if (recommendedByWho == null) {
			if (other.recommendedByWho != null)
				return false;
		} else if (!recommendedByWho.equals(other.recommendedByWho))
			return false;
		if (secondMajorCategory == null) {
			if (other.secondMajorCategory != null)
				return false;
		} else if (!secondMajorCategory.equals(other.secondMajorCategory))
			return false;
		if (secondMajorRequirement != other.secondMajorRequirement)
			return false;
		if (secondMinorCategory == null) {
			if (other.secondMinorCategory != null)
				return false;
		} else if (!secondMinorCategory.equals(other.secondMinorCategory))
			return false;
		if (secondMinorRequirement != other.secondMinorRequirement)
			return false;
		if (sectionNumber == null) {
			if (other.sectionNumber != null)
				return false;
		} else if (!sectionNumber.equals(other.sectionNumber))
			return false;
		if (semester == null) {
			if (other.semester != null)
				return false;
		} else if (!semester.equals(other.semester))
			return false;
		if (seventhMajorCategory == null) {
			if (other.seventhMajorCategory != null)
				return false;
		} else if (!seventhMajorCategory.equals(other.seventhMajorCategory))
			return false;
		if (seventhMajorRequirement != other.seventhMajorRequirement)
			return false;
		if (seventhMinorCategory == null) {
			if (other.seventhMinorCategory != null)
				return false;
		} else if (!seventhMinorCategory.equals(other.seventhMinorCategory))
			return false;
		if (seventhMinorRequirement != other.seventhMinorRequirement)
			return false;
		if (sixthMajorCategory == null) {
			if (other.sixthMajorCategory != null)
				return false;
		} else if (!sixthMajorCategory.equals(other.sixthMajorCategory))
			return false;
		if (sixthMajorRequirement != other.sixthMajorRequirement)
			return false;
		if (sixthMinorCategory == null) {
			if (other.sixthMinorCategory != null)
				return false;
		} else if (!sixthMinorCategory.equals(other.sixthMinorCategory))
			return false;
		if (sixthMinorRequirement != other.sixthMinorRequirement)
			return false;
		if (tenthMajorCategory == null) {
			if (other.tenthMajorCategory != null)
				return false;
		} else if (!tenthMajorCategory.equals(other.tenthMajorCategory))
			return false;
		if (tenthMajorRequirement != other.tenthMajorRequirement)
			return false;
		if (tenthMinorCategory == null) {
			if (other.tenthMinorCategory != null)
				return false;
		} else if (!tenthMinorCategory.equals(other.tenthMinorCategory))
			return false;
		if (tenthMinorRequirement != other.tenthMinorRequirement)
			return false;
		if (thirdMajorCategory == null) {
			if (other.thirdMajorCategory != null)
				return false;
		} else if (!thirdMajorCategory.equals(other.thirdMajorCategory))
			return false;
		if (thirdMajorRequirement != other.thirdMajorRequirement)
			return false;
		if (thirdMinorCategory == null) {
			if (other.thirdMinorCategory != null)
				return false;
		} else if (!thirdMinorCategory.equals(other.thirdMinorCategory))
			return false;
		if (thirdMinorRequirement != other.thirdMinorRequirement)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (year == null) {
			if (other.year != null)
				return false;
		} else if (!year.equals(other.year))
			return false;
		return true;
	}
	
}
	
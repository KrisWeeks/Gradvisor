package com.kristopherweeks.projects.gradvisor;

public class GradTemplateCreate {
	
	private int totalCreditsToGraduate;
	private int totalCreditsToMajor;
	private int totalCreditsToMinor;
	private String majorName;
	private boolean major;
	private int majorOrder;
	private int concentrationName;
	private int concentrationOrder;
	private boolean minor;
	private String minorName;
	private int minorOrder;
	private String categoryName;
	private boolean categoryGeneralRequirement;
	private String categoryGeneralRequirementName;
	private boolean categoryCore;
	private int categoryMinimumCredits;
	private int categoryMaximumCredits;
	private boolean categoryElective;
	private boolean categoryGroupCategoryChoice;
	private String categoryGroupCategoryChoiceName;
	private int categoryGroupMinimumCategories;
	private int categoryGroupMinimumCoursesPerCategory;
	private int minimumCourseLevelCourses;
	private int minimumCourseLevelCredits;
	private int minimumOfCourseLevelCourses;
	private int minimumOfCourseLevelCredits;
	private int maximumCourseLevelCourses;
	private int maximumCourseLevelCredits;
	private int maximumOfCourseLevelCourses;
	private int maximumOfCourseLevelCredits;
	private int maximumOfCoursesForNoGrade;
	
	// constructors
	public GradTemplateCreate(int totalCreditsToGraduate, int totalCreditsToMajor,
			int totalCreditsToMinor, String majorName, boolean major, int majorOrder,
			int concentrationName, int concentrationOrder, boolean minor,
			String minorName, int minorOrder, String categoryName,
			boolean categoryGeneralRequirement, String categoryGeneralRequirementName,
			boolean categoryCore, int categoryMinimumCredits, int categoryMaximumCredits,
			boolean categoryElective, boolean categoryGroupCategoryChoice,
			String categoryGroupCategoryChoiceName, int categoryGroupMinimumCategories,
			int categoryGroupMinimumCoursesPerCategory, int minimumCourseLevelCourses,
			int minimumCourseLevelCredits, int minimumOfCourseLevelCourses,
			int minimumOfCourseLevelCredits, int maximumCourseLevelCourses,
			int maximumCourseLevelCredits, int maximumOfCourseLevelCourses,
			int maximumOfCourseLevelCredits, int maximumOfCoursesForNoGrade) { 
		setTotalCreditsToGraduate(totalCreditsToGraduate);
		setTotalCreditsToMajor(totalCreditsToMajor);
		setTotalCreditsToMinor(totalCreditsToMinor);
		setMajorName(majorName);
		setMajor(major);
		setMajorOrder(majorOrder);
		setConcentrationName(concentrationName);
		setConcentrationOrder(concentrationOrder);
		setMinor(minor);
		setMinorName(minorName);
		setMinorOrder(minorOrder);
		setCategoryName(categoryName);
		setCategoryGeneralRequirement(categoryGeneralRequirement);
		setCategoryGeneralRequirementName(categoryGeneralRequirementName);
		setCategoryCore(categoryCore);
		setCategoryMinimumCredits(categoryMinimumCredits);
		setCategoryMaximumCredits(categoryMaximumCredits);
		setCategoryElective(categoryElective);
		setCategoryGroupCategoryChoice(categoryGroupCategoryChoice);
		setCategoryGroupCategoryChoiceName(categoryGroupCategoryChoiceName);
		setCategoryGroupMinimumCategories(categoryGroupMinimumCategories);
		setCategoryGroupMinimumCoursesPerCategory(categoryGroupMinimumCoursesPerCategory);
		setMinimumCourseLevelCourses(minimumCourseLevelCourses);
		setMinimumCourseLevelCredits(minimumCourseLevelCredits);
		setMinimumOfCourseLevelCourses(minimumOfCourseLevelCourses);
		setMinimumOfCourseLevelCredits(minimumOfCourseLevelCredits);
		setMaximumCourseLevelCourses(maximumCourseLevelCourses);
		setMaximumCourseLevelCredits(maximumCourseLevelCredits);
		setMaximumOfCourseLevelCourses(maximumOfCourseLevelCourses);
		setMaximumOfCourseLevelCredits(maximumOfCourseLevelCredits);
		setMaximumOfCoursesForNoGrade(maximumOfCoursesForNoGrade);
	
	}
	
	// no argument constructor
	
	public GradTemplateCreate() {
	
	}
	
	// getters and setters
	
	 {
		
	}

	public int getTotalCreditsToGraduate() {
		return totalCreditsToGraduate;
	}
	public void setTotalCreditsToGraduate(int totalCreditsToGraduate) {
		this.totalCreditsToGraduate = totalCreditsToGraduate;
	}
	public int getTotalCreditsToMajor() {
		return totalCreditsToMajor;
	}
	public void setTotalCreditsToMajor(int totalCreditsToMajor) {
		this.totalCreditsToMajor = totalCreditsToMajor;
	}
	public int getTotalCreditsToMinor() {
		return totalCreditsToMinor;
	}
	public void setTotalCreditsToMinor(int totalCreditsToMinor) {
		this.totalCreditsToMinor = totalCreditsToMinor;
	}
	public String getMajorName() {
		return majorName;
	}
	public void setMajorName(String majorName) {
		this.majorName = majorName;
	}
	public boolean isMajor() {
		return major;
	}
	public void setMajor(boolean major) {
		this.major = major;
	}
	public int getMajorOrder() {
		return majorOrder;
	}
	public void setMajorOrder(int majorOrder) {
		this.majorOrder = majorOrder;
	}
	public int getConcentrationName() {
		return concentrationName;
	}
	public void setConcentrationName(int concentrationName) {
		this.concentrationName = concentrationName;
	}
	public int getConcentrationOrder() {
		return concentrationOrder;
	}
	public void setConcentrationOrder(int concentrationOrder) {
		this.concentrationOrder = concentrationOrder;
	}
	public boolean isMinor() {
		return minor;
	}
	public void setMinor(boolean minor) {
		this.minor = minor;
	}
	public String getMinorName() {
		return minorName;
	}
	public void setMinorName(String minorName) {
		this.minorName = minorName;
	}
	public int getMinorOrder() {
		return minorOrder;
	}
	public void setMinorOrder(int minorOrder) {
		this.minorOrder = minorOrder;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public boolean isCategoryGeneralRequirement() {
		return categoryGeneralRequirement;
	}
	public void setCategoryGeneralRequirement(boolean categoryGeneralRequirement) {
		this.categoryGeneralRequirement = categoryGeneralRequirement;
	}
	public String getCategoryGeneralRequirementName() {
		return categoryGeneralRequirementName;
	}
	public void setCategoryGeneralRequirementName(String categoryGeneralRequirementName) {
		this.categoryGeneralRequirementName = categoryGeneralRequirementName;
	}
	public boolean isCategoryCore() {
		return categoryCore;
	}
	public void setCategoryCore(boolean categoryCore) {
		this.categoryCore = categoryCore;
	}
	public int getCategoryMinimumCredits() {
		return categoryMinimumCredits;
	}
	public void setCategoryMinimumCredits(int categoryMinimumCredits) {
		this.categoryMinimumCredits = categoryMinimumCredits;
	}
	public int getCategoryMaximumCredits() {
		return categoryMaximumCredits;
	}
	public void setCategoryMaximumCredits(int categoryMaximumCredits) {
		this.categoryMaximumCredits = categoryMaximumCredits;
	}
	public boolean isCategoryElective() {
		return categoryElective;
	}
	public void setCategoryElective(boolean categoryElective) {
		this.categoryElective = categoryElective;
	}
	public boolean isCategoryGroupCategoryChoice() {
		return categoryGroupCategoryChoice;
	}
	public void setCategoryGroupCategoryChoice(boolean categoryGroupCategoryChoice) {
		this.categoryGroupCategoryChoice = categoryGroupCategoryChoice;
	}
	public String getCategoryGroupCategoryChoiceName() {
		return categoryGroupCategoryChoiceName;
	}
	public void setCategoryGroupCategoryChoiceName(String categoryGroupCategoryChoiceName) {
		this.categoryGroupCategoryChoiceName = categoryGroupCategoryChoiceName;
	}
	public int getCategoryGroupMinimumCategories() {
		return categoryGroupMinimumCategories;
	}
	public void setCategoryGroupMinimumCategories(int categoryGroupMinimumCategories) {
		this.categoryGroupMinimumCategories = categoryGroupMinimumCategories;
	}
	public int getCategoryGroupMinimumCoursesPerCategory() {
		return categoryGroupMinimumCoursesPerCategory;
	}
	public void setCategoryGroupMinimumCoursesPerCategory(int categoryGroupMinimumCoursesPerCategory) {
		this.categoryGroupMinimumCoursesPerCategory = categoryGroupMinimumCoursesPerCategory;
	}
	public int getMinimumCourseLevelCourses() {
		return minimumCourseLevelCourses;
	}
	public void setMinimumCourseLevelCourses(int minimumCourseLevelCourses) {
		this.minimumCourseLevelCourses = minimumCourseLevelCourses;
	}
	public int getMinimumCourseLevelCredits() {
		return minimumCourseLevelCredits;
	}
	public void setMinimumCourseLevelCredits(int minimumCourseLevelCredits) {
		this.minimumCourseLevelCredits = minimumCourseLevelCredits;
	}
	public int getMinimumOfCourseLevelCourses() {
		return minimumOfCourseLevelCourses;
	}
	public void setMinimumOfCourseLevelCourses(int minimumOfCourseLevelCourses) {
		this.minimumOfCourseLevelCourses = minimumOfCourseLevelCourses;
	}
	public int getMinimumOfCourseLevelCredits() {
		return minimumOfCourseLevelCredits;
	}
	public void setMinimumOfCourseLevelCredits(int minimumOfCourseLevelCredits) {
		this.minimumOfCourseLevelCredits = minimumOfCourseLevelCredits;
	}
	public int getMaximumCourseLevelCourses() {
		return maximumCourseLevelCourses;
	}
	public void setMaximumCourseLevelCourses(int maximumCourseLevelCourses) {
		this.maximumCourseLevelCourses = maximumCourseLevelCourses;
	}
	public int getMaximumCourseLevelCredits() {
		return maximumCourseLevelCredits;
	}
	public void setMaximumCourseLevelCredits(int maximumCourseLevelCredits) {
		this.maximumCourseLevelCredits = maximumCourseLevelCredits;
	}
	public int getMaximumOfCourseLevelCourses() {
		return maximumOfCourseLevelCourses;
	}
	public void setMaximumOfCourseLevelCourses(int maximumOfCourseLevelCourses) {
		this.maximumOfCourseLevelCourses = maximumOfCourseLevelCourses;
	}
	public int getMaximumOfCourseLevelCredits() {
		return maximumOfCourseLevelCredits;
	}
	public void setMaximumOfCourseLevelCredits(int maximumOfCourseLevelCredits) {
		this.maximumOfCourseLevelCredits = maximumOfCourseLevelCredits;
	}
	
	public int getMaximumOfCoursesForNoGrade() {
		return maximumOfCoursesForNoGrade;
	}

	public void setMaximumOfCoursesForNoGrade(int maximumOfCoursesForNoGrade) {
		this.maximumOfCoursesForNoGrade = maximumOfCoursesForNoGrade;
	}
	
}

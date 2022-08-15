package za.ac.tut.course;

public class Course
{
	private String courseCode;
	private String description;
	//Default constructors
	public Course()
	{
	}
	//Overloaded constructor
	
	public Course(String courseCode, String description)
	{
		this.courseCode = courseCode;
		this.description = description;
	}
	
	//Setters and getters
	public void setCourseCode(String courseCode)
	{
		this.courseCode = courseCode;
	}
	public void setDescription(String description)
	{
		this.description = description;
	}

    public String getCourseCode()
	{
		return courseCode;
	}
	
	public String getDescription()
	{
		return description;
	}

}
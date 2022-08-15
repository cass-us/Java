package za.ac.tut.student;
import za.ac.tut.person.Person;
import za.ac.tut.address.Address;
public class Student extends Person
{
    private int studentNo;
    private String courseCode;
    private String subject;
	
	public Student()
	{
	}
	
	public Student(String name,String surname, int age, String gender, Address address, int studentNo, String courseCode, String subject )
	{
		//Initials the super attributes of a super class
		super(name,surname,age,gender,address);
		//Initials data members
		this.studentNo = studentNo;
		this.courseCode = courseCode;
		this.subject  = subject;
	
	}
	
	public void setStudentNo(int studentNo)
	{
	  this.studentNo = studentNo;
	}
	
	public void setCourseCode(String courseCode)
	{
	  this.courseCode = courseCode;
	}
	
	public void setSubject(String subject)
	{
	  this.subject = subject;
	}
	
	public int getStudentNo()
	{
	  return studentNo;
	}
	
	public String getCourseCode()
	{
	  return courseCode;
	}
	
	public String getSubject()
	{
	  return subject;
	}
}
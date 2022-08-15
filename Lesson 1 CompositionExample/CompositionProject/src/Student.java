package za.ac.tut.student;
import za.ac.tut.course.Course;
import java.util.ArrayList;
import za.ac.tut.subject.Subject;
public class Student
{
	private int studentNo;
	private String initials;
	private String surname;
	private Course objCourse;
	private ArrayList<Subject> listOfSubjects;
	
	public Student()
	{
		
	}
	
	public Student(int studentNo, String initials, String surname, Course objCourse, ArrayList<Subject> listOfSubjects)
	{
	   this.studentNo = studentNo;
       this.initials = initials;
       this.surname = surname;
       this.objCourse = objCourse;
	   this.listOfSubjects = listOfSubjects;
	}
	
	public void setStudentNo(int studentNo)
	{
	this.studentNo = studentNo;
	}
	public void setIntials(String initials)
	{
	this.initials = initials;
	}
	public void setSurname(String surname)
	{
	this.surname = surname;
	}
	public void setCourse(Course objCourse)
	{
	this.objCourse = objCourse;
	}
	public void setListOfSubjects(ArrayList<Subject> listOfSubjects)
	{
	this.listOfSubjects= listOfSubjects;
	}
	
	public int getStudentNo()
	{
	return studentNo;
	}
	public String getIntials()
	{
	return initials;
	}
	public String getSurname()
	{
	 return  surname;
	}
	public Course getCourse()
	{
	return objCourse;
	}
	public ArrayList<Subject> getListOfSubjects()
	{
	return listOfSubjects;
	}

}
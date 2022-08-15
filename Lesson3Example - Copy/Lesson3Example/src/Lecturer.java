package za.ac.tut.lecturer;
import za.ac.tut.employee.Employee;
import za.ac.tut.address.Address;
public class Lecturer extends Employee
{
	private String position;
	private String subject;
	
	public Lecturer()
	{}
	public Lecturer(String name, String surname, int age, String gender, Address address, int empID, double salary, String position, String subject)
	{
		//initials super attributes for Employee and Person
		super(name, surname,age,gender,address,empID,salary);
		//initials the local data members
		this.position = position;
		this.subject  = subject;
	}
	
	public void setPosition(String position)
	{
		this.position = position;
	}
	
	public void setSubject(String subject)
	{
		this.subject  = subject;
	}
    
	public String getPosition()
	{
		return position;
	}
	
	public String getSubject()
	{
		return subject;
	}

}
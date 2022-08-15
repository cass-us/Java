package za.ac.tut.employee;
import za.ac.tut.person.Person;
import za.ac.tut.address.Address;
public class Employee extends Person
{
	private int empID;
	private double salary;
	
	public Employee()
	{}
	
	public Employee(String name, String surname, int age, String gender, Address address, int empID, double salary)
	{
		//initials super attributes for super class Person
		super(name,surname,age,gender,address);
		//initials the data members
		
		this.empID = empID;
		this.salary = salary;
	}

    public void setEmpID(int empID)
	{
		this.empID = empID;
	}
	
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	
	public int getEmpID()
	{
		return empID;
	}
	
	public double getSalary()
	{
		return salary;
	}

}

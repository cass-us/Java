package za.ac.tut.cleaner;
import za.ac.tut.employee.Employee;
import za.ac.tut.address.Address;
public class Cleaner extends Employee
{
	private String jobCard;
	
	public Cleaner()
	{}
     public Cleaner(String name, String surname, int age,String gender, Address address,int empID,double salary, String jobCard)
	 {
		//Initials super attributes
		super(name,surname,age,gender,address,empID,salary);
		//Initial the sub data member
		this.jobCard = jobCard;
	 }
	 
	 public void setJobCard(String jobCard)
	{
		this.jobCard = jobCard;
	}
	
	public String getJobCard()
	{
		return jobCard;
	}
}
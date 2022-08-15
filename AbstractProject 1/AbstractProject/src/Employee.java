package za.ac.tut.employee;
public abstract class Employee
{
	private String name;
	private String surname;
	private int empNO;
	
	public Employee()
	{}
	public Employee(String name, String surname, int empNO)
	{
		this.name = name;
		this.surname = surname;
		this.empNO = empNO;
	}
	
	public void setName(String name)
	{
	this.name = name;
	}
	public void setSurname(String surname)
	{
	this.surname = surname;
	}
	public void setEmpNO(int empNO)
	{
	this.empNO = empNO;
	}	
	public String getName()
	{
	return name;
	}
	public String getSurname()
	{
		return surname;
	}
	public int getEmpNO()
	{
		return empNO;
	}
	//abstract method
	public abstract double calculatePay();	
	public abstract double payTax();
	
}
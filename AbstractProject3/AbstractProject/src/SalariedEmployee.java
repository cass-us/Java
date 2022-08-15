package za.ac.tut.salariedemployee;
import za.ac.tut.employee.Employee;
import za.ac.tut.tax.SalariedTax;
public class SalariedEmployee extends Employee implements SalariedTax
{
	private String rank;
	
	public SalariedEmployee()
	{}
	public SalariedEmployee(String name, String surname, int empNO,String rank)
	{
		super(name, surname, empNO);
		this.rank = rank;
	}
	
	public void setRank(String rank)
	{
		this.rank = rank;
	}
	public String getRank()
	{
		return rank;
	}
	//Overide the method and give a specific behaviour to calulate pay
	public double calculatePay()
	{
		double salary = 0.00;
		if (rank.equals("C1"))
		{
			salary = 15000;
		}
		else if (rank.equals("C2"))
		{
			salary = 20000;
		}
		else if (rank.equals("C3"))
		{
			salary = 25000;
		}
		return salary;
	}
	
	public double payTax()
	{
		double tax = 0.00;
		
		if (rank.equals("C1") || rank.equals("C2"))
		{
			tax = calculatePay() * TAXC1_C2;
		}
		else if (rank.equals("C3"))
		{
			tax = calculatePay() * TAXC3;
		}		
		return tax;
	}
}
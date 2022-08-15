package za.ac.tut.contractemployee;
import za.ac.tut.employee.Employee;
import za.ac.tut.tax.ContractTax;

public class ContractEmployee extends Employee implements ContractTax
{
	private double basicSalary;
	private int noOfitemsSold;
	
	public ContractEmployee()
	{}
	public ContractEmployee(String name, String surname, int empNO, double basicSalary, int noOfitemsSold)
	{
		super(name, surname, empNO);
		this.basicSalary = basicSalary;
		this.noOfitemsSold = noOfitemsSold;
	}
	
	public void setBasicSalary(double basicSalary)
	{
		this.basicSalary = basicSalary;
	}
	public void setNoOfitemsSold(int noOfitemsSold)
	{
	   this.noOfitemsSold = noOfitemsSold;
	}
	public double getBasicSalary()
	{
		return basicSalary;
	}
	public int getNoOfitemsSold()
	{
		return noOfitemsSold;
	}
	//Overide /implement the method and give a specific behaviour to calulate pay
     public double calculatePay()
	 {
		double commission = 0.0;
		if (noOfitemsSold >= 1000)
		{
			commission = noOfitemsSold * 15 / 100;
		}
		else
		{
			commission = noOfitemsSold * 5 /100;
		}
		return basicSalary + commission;
	 }
	 
	 public double payTax()
	 {
		 return calculatePay() * TAX;
	 }
}
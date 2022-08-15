import java.util.ArrayList;
import za.ac.tut.employee.*;
import za.ac.tut.contractemployee.ContractEmployee;
import za.ac.tut.weeklyemployee.WeeklyEmployee;
import za.ac.tut.salariedemployee.SalariedEmployee;
public class FrontEnd
{
	public static void main(String[]args)
	{
		//Arraylist of all employees
		ArrayList<Employee> listEmployees = new ArrayList<Employee>();
		WeeklyEmployee weekEmp = new WeeklyEmployee("John","Buthelezi", 555,45.6,5.00);
		WeeklyEmployee weekEmp2 = new WeeklyEmployee("Portia","Nkuna", 444,48.0,5.60);
		SalariedEmployee salEmp = new SalariedEmployee("Vusi", "Radebe", 645,"C1");
		SalariedEmployee salEmp2 = new SalariedEmployee("Kenny", "Nkosi", 658,"C4");
		ContractEmployee contEmp = new ContractEmployee("Connie", "Ntuli", 888, 5000.12, 1200);
		ContractEmployee contEmp2 = new ContractEmployee("Ouma", "Mahlangu", 485, 5000.12, 500);
		//Add the object to collection
		
		listEmployees.add(weekEmp);
		listEmployees.add(weekEmp2);
		listEmployees.add(salEmp);
		listEmployees.add(salEmp2);
		listEmployees.add(contEmp);
		listEmployees.add(contEmp2);
		//Display employees details
		System.out.println("Normal for loop output");
		for(int i=0; i < listEmployees.size(); i++)
		{
			System.out.println("Employee name is " + listEmployees.get(i).getName() + " " + listEmployees.get(i).getEmpNO() + " Salary is " + listEmployees.get(i).calculatePay() + "payable tax " +listEmployees.get(i).payTax()) ;
		}
		System.out.println("Advance loop output");
		//Advaced loop
		
		for(Employee empObj:listEmployees) //for each employee in a collect listEmployees*/
		{
			System.out.println("Name is " + empObj.getName() + " surname " + empObj.getSurname() + " " + empObj.calculatePay() + " " + empObj.payTax());
		}
		
	}
}
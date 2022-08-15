import za.ac.tut.person.Person;
import za.ac.tut.address.Address;
import za.ac.tut.cleaner.Cleaner;
import za.ac.tut.student.Student;
import javax.swing.JOptionPane;

public class FrontEnd
{
	public static void main(String[] args)
	{
	   Address address = new Address("Soshanguve","K Ntuli Street",25,152);
	   Person objPerson = new Person("Vusi","Bokaba",25,"Male",address);
	   Cleaner objCleaner = new Cleaner("Vincent","Nkuna", 28,"Male",address,2548,2898.25, "Clean building 20");
	   address = new Address("Soweto","Mandela Street",18,2001);
	   Student objStudent = new Student("Peter","Mahlangu",18, "Male",address, 201233, "NDI01", "TPG12bt");
	   
	   JOptionPane.showMessageDialog(null,"Student " + objStudent.getStudentNo() + " " + objStudent.getName() + " " + objStudent.getSurname());
	   JOptionPane.showMessageDialog(null,"Cleaner " + objCleaner.getEmpID() + " " + objCleaner.getAddress().getCity() + " " + objCleaner.getJobCard());
	
	}
}
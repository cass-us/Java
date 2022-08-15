import java.util.ArrayList;
import javax.swing.JOptionPane;

public class RunProgram
{
	public static void main(String[] args)
	{
		ArrayList<Person> personArray = new ArrayList<Person>();
		String name, surname, age, gender;
		int nextPerson;
		nextPerson = JOptionPane.showConfirmDialog(null, "Do you want to enter next person?","Continue",JOptionPane.YES_NO_OPTION);
		
		while(nextPerson == JOptionPane.YES_OPTION)
		{
			//Collect the values
			name = JOptionPane.showInputDialog(null, "Enter person name");
			surname = JOptionPane.showInputDialog(null, "Enter person surname");
			age = JOptionPane.showInputDialog(null, "Enter person age");
			gender = JOptionPane.showInputDialog(null, "Enter person gender");
			
			//Set values to the Person Object
			Person objPerson = new Person();
			objPerson.setName(name);
			objPerson.setSurname(surname);
			objPerson.setAge(Integer.parseInt(age));
			objPerson.setGender(gender);
			//Add each person to the array list
			personArray.add(objPerson);
		    nextPerson = JOptionPane.showConfirmDialog(null, "Do you want to enter next person?","Continue",JOptionPane.YES_NO_OPTION);
		}
		
		//Display all values in the list
		
		for(Person person : personArray) // for each person in personArray
		{
		   System.out.println(person.getName() + " " + person.getSurname() + " " + person.getGender());
		}
		
	}
}

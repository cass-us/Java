import javax.swing.JOptionPane;

public class FrontEnd
{
	public static void main(String[] args)
	{
		String name, surname,strTest1, strTest2, strTest3;
		int optionValue;
		int countPassed = 0, countFailed = 0, countStudents=0;
		double classAverage, totalYearmark = 0;
		Student objStudent = new Student();
		optionValue = JOptionPane.showConfirmDialog(null, "Do you want to enter student tests?","Continue",JOptionPane.YES_NO_OPTION);
		while(optionValue == JOptionPane.YES_OPTION)
		{
			//Accept values from the user
			name = JOptionPane.showInputDialog(null, "Please enter student name");
			surname = JOptionPane.showInputDialog(null, "Please enter student surname");
			strTest1 = JOptionPane.showInputDialog(null, "Please enter student test 1");
			strTest2 = JOptionPane.showInputDialog(null, "Please enter student test 2");
			strTest3 = JOptionPane.showInputDialog(null, "Please enter student test 3");
			//Set values
			objStudent.setName(name);
			objStudent.setSurname(surname);
			objStudent.setTest1(Integer.parseInt(strTest1));
			objStudent.setTest2(Integer.parseInt(strTest2));
			objStudent.setTest3(Integer.parseInt(strTest3));
			//Process input to information
			if (objStudent.result().equals("Passed"))
			 {
				countPassed++;
			 }
			 else
			 {
				countFailed++;
			 }			 
			 totalYearmark = totalYearmark + objStudent.yearMark();
			 countStudents++;
			//Continue accepting or terminate
			optionValue = JOptionPane.showConfirmDialog(null, "Do you want to enter student tests?","Continue",JOptionPane.YES_NO_OPTION);
		}
		//Calculate class average
		classAverage = totalYearmark / countStudents;
		JOptionPane.showMessageDialog(null, "The number passed " +countPassed + 
		                                    "\n Number of student failed " +countFailed + 
											"\n The class Average is " +  classAverage);
	}
}
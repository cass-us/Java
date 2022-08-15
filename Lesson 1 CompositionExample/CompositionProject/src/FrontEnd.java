import za.ac.tut.student.Student; 
import za.ac.tut.course.Course;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import za.ac.tut.subject.Subject;
public class FrontEnd
{
	public static void main(String[] args)
	{
		//Create an object of type Student
		Student student = new Student();
		//Create an object of type course
		Course objCourse = new Course("NDIT12","Information Technology");
		//Create the arraylist of subjects
	    ArrayList<Subject> subjectList = new ArrayList<Subject>();
		//Add student subjects
		Subject subject1 = new Subject("TPG12BT", 56, 68, 75);
		Subject subject2 = new Subject("ISY23AT", 70,66, 80);
		Subject subject3 = new Subject("SSY24AT", 65,55, 71);
		subjectList.add(subject1);
        subjectList.add(subject2);
		subjectList.add(subject3);
		//Instantiate the student object
		student = new Student(21223, "TB", "Baloyi",objCourse, subjectList);
		
		//Display all details of the student
		
		String strOut = "";
		strOut = strOut + student.getStudentNo() + " " + student.getIntials() + " " + student.getSurname();
		//Include the course details
		strOut = strOut + "\n" +student.getCourse().getCourseCode();
		
		//Include each subject from the collection
		
		for(Subject subject:student.getListOfSubjects())
		{
			strOut = strOut + 	subject.getSubjectCode() + " student results is " + subject.determine() + "\n";		
		}

		//Display the results
		JOptionPane.showMessageDialog(null, " Student Record \n " + strOut );		
	 
	}

}
package za.ac.tut.subject;

public class Subject
{
	private String subjectCode;
	private int test1;
	private int test2;
	private int test3;

	//Default constructor
	public Subject()
	{}
    
	public Subject(String subjectCode, int test1, int test2, int test3)
	{
		this.subjectCode = subjectCode;
		this.test1 = test1;
		this.test2 = test2;
		this.test3 = test3;
	}
	
	//Setters and getters
	
    public void setSubjectCode(String subjectCode)
	{
	this.subjectCode = subjectCode;
		
	}
	public void setTest1(int test1)
	{
		this.test1 = test1;
		
	}
	public void setTest2(int test2)
	{
		this.test2 = test2;
		
	}
	public void setTest3(int test3)
	{
		this.test3 = test3;
	}
	
	public String getSubjectCode()
	{
	  return subjectCode;
		
	}
	public int getTest1()
	{
		return  test1;
		
	}
	public int getTest2()
	{
		return test2;
		
	}
	public int getTest3()
	{
		return test3;
	}
	
	public String determine()
	{
		int finalMark = (test1 + test2 + test3) / 3;
		String results = "";
		if (finalMark > 50)
		{
			results = "pass";
		}
		else
		{
			results = "fails";
		}
		return results;
	}
}
import java.io.*;

public class FrontEnd {
	public static void main(String[] args)
	{
		String  outStr = "I am at home to minimise the pread of covid-19" ; // String to writeString path = "c:\\data\\output.txt";  // path where the file is stored
		String path = "c:\\data\\data.txt";
	    
		try
		{
			FileWriter write = new FileWriter(path, true);  // create the FileWriter object to append a file
			 for (int i=0; i < outStr.length();++i )  // test the  length of the string
			  {
				  write.write(outStr .charAt(i));   // write each character from string to the file
			  }
			  write.close();
		}
		catch(IOException er)   // throws exception if the file is not found
		{
			System.out.println(er.getMessage());
		}
		

	}

}

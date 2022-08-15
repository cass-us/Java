public class Student
{
    private String name;
    private String surname;
    private int test1;
    private int test2;
    private int test3;

    public Student() {
    }

    public Student(String name, String surname, int test1, int test2, int test3) {
        this.name = name;
        this.surname = surname;
        this.test1 = test1;
        this.test2 = test2;
        this.test3 = test3;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setTest1(int test1) {
        this.test1 = test1;
    }

    public void setTest2(int test2) {
        this.test2 = test2;
    }

    public void setTest3(int test3) {
        this.test3 = test3;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getTest1() {
        return test1;
    }

    public int getTest2() {
        return test2;
    }

    public int getTest3() {
        return test3;
    }
    
    public double yearMark()
    {
        return (test1 + test2 +test3)/3;        
    }
    
    public String result()
    {
        String result = "";
        if (yearMark() >= 50)
        {
            result = "Passed";
        }
        else
        {
            result = "Failed";
        }
        return result;
    }
}

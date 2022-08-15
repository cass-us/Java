package za.ac.tut.person;
import za.ac.tut.address.Address;
public class Person
{
	private String name;
	private String surname;
	private int age;
	private String gender;
	private Address address;
	
	public Person()
	{}
	public Person(String name, String surname, int age, String gender, Address address)
	{
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}
	
	public void setName(String name)
	{
	  this.name = name;
	}
	
	public void setSurame(String surname)
	{
	  this.surname = surname;
	}
	public void setAge(int age)
	{
	  this.age = age;
	}

	public void setGender(String gender)
	{
	  this.gender = gender;
	}
	
	public void setAddress(Address address)
	{
	  this.address = address;
	}

    public String getName()
	{
	  return this.name;
	}
	
	public String getSurname()
	{
	  return this.surname ;
	}
	public int getAge()
	{
	  return  age;
	}

	public String getGender()
	{
	  return gender;
	}
	
	public Address getAddress()
	{
	  return address;
	}

}
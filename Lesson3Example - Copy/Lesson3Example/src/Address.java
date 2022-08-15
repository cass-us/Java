package za.ac.tut.address;

public class Address
{
	private String city;
    private String streetName;
	private int houseNo;
	private int areaCode;

	public  Address()
	{
	}
    public  Address(String city, String streetName, int houseNo, int areaCode)
	{
		this.city = city;
		this.streetName = streetName;
		this.houseNo = houseNo;
		this.areaCode = areaCode;
	}
	//Getters
	public String getCity()
	{
		return city;
	}
	public String getStreetName()
	{
		return streetName;
	}
	public int getHouseNO()
	{
		return houseNo;
	}
	public int getAreaCode()
	{
		return areaCode;
	}
}
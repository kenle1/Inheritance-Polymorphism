
public class Doctor extends Human {
	private int years;
	private String Speciality;
	private int height;
	private float weight;
	
	Doctor(float weight, int age, int height, int years, String Speciality)
	{
		super(weight,age,height);
		this.years = years;
		this.Speciality = Speciality;
		this.height = height;
		this.weight = weight;
	}
	public String getYears()
	{
		return years+" years old.";
	}
	public String getSpeciality()
	{
		return Speciality;
	}
	public String getSalary()
	{
		return "$" +(40000 + (years -1)* 5000);
	
	}
	
	public void setYears(int years) {
		this.years = years;
	}
	public void setSpeciality(String speciality) {
		Speciality = speciality;
	}
	
	}
	
	



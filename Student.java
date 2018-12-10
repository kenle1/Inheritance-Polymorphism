
public class Student extends Human {
	private String major;
	private double gpa;
	private int creditHours;
	private int height;
	
	
	
	Student(float weight, int age, int height, String major, double gpa, int creditHours)
	{
		super(weight, age, height);
		this.major = major;
		this.creditHours = creditHours;
		this.height = height;
	}
	public String getMajor()
	{
		return major;
	}
	public double getGpa()
	{
		return gpa;
	}
	
	public String getYear()
	{
		if(this.creditHours<32)
		{
			return "Freshman.";
		}
		else if(this.creditHours >= 32 && this.creditHours < 64)
		{
			return "Sohphmore.";
		}
		else if(this.creditHours >= 64 && this.creditHours < 96)
		{
			return "Junior.";
		}
		else
		{
			return "Senior.";
		}
	}
	public int getCreditHours() {
		return creditHours;
	}
	public void setCreditHours(int creditHours) {
		this.creditHours = creditHours;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	

}

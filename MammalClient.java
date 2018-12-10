
public class MammalClient {
	public static void main(String args[])
	{
		Student Ken = new Student((float) 135.0,25,150,"CS",3.0,100);
		Doctor Brandon = new Doctor((float) 150.0, 26, 150, 4, "Computer Scientist");
		System.out.print("Ken: ");
		System.out.println(Ken.getMajor() + "," +Ken.getGpa() + "," +Ken.getYear() + "," + Ken.getAge());
		System.out.println();
		System.out.print("Brandon:" );
		System.out.println(Brandon.getSpeciality()+ "," +Brandon.getHeight()+ "," +Brandon.getWeight()+ "," +Brandon.getSalary());
	}

}

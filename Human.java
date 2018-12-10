
public class Human extends Mammal {
	private double height;
	Human(float weight, int age, double height)
	{
		super(weight, age);
		this.height = height;
	}
	public double getHeight()
	{
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}

}

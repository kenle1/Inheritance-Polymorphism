
public class Mammal {
	private int age;
	private float weight;
	
	public Mammal(){
	
	}
	
	Mammal(float weight, int age)
	{
		this.age=age;
		this.weight=weight;
	}
	public float getWeight()
	{
		return weight;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age) {
		this.age= age;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}

}

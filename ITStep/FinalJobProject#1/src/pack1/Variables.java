package pack1;

public class Variables {

	
	public static void example(int x,double d,String s,boolean b) {
		int x2;
		
		x2=(int)(x*3.5);
		d-=1;
		System.out.println("x/d = "+x/d);
		System.out.println("x2/d = "+x2/d);
		s+=s+"YesYesYes";
		b=!b;
		System.out.println("x = "+x+", x2 = "+x2+", d = "+d+", s = "+s+", b = "+b);
	}
	

}

class Person{
	private int age;
	private double weight;
	private String name;
	private boolean isMale;
	
	@Override
	public String toString() {
		return "Person [age=" + age + ", weight=" + weight + ", name=" + name + ", isMale=" + isMale + "]";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isMale() {
		return isMale;
	}

	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}

	public Person(int age, double weight, String name, boolean isMale) {
		super();
		this.age = age;
		this.weight = weight;
		this.name = name;
		this.isMale = isMale;
	}
	
	
	
	
}

class Car{
	private int price;
	private double weight;
	private String name;
	private boolean electrocar;
	
	@Override
	public String toString() {
		return "Car [price=" + price + ", weight=" + weight + ", name=" + name + ", electrocar=" + electrocar + "]";
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isElectrocar() {
		return electrocar;
	}

	public void setElectrocar(boolean electrocar) {
		this.electrocar = electrocar;
	}
	
	

	public Car(int price, double weight, String name, boolean electrocar) {
		super();
		this.price = price;
		this.weight = weight;
		this.name = name;
		this.electrocar = electrocar;
	}
}

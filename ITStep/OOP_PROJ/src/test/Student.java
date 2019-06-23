package test;

public class Student extends Person implements Cloneable{
	double avg;
	String groupNumber;
	int[] marks;
	boolean isBRSM;
	int course;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	public void drink() {
		System.out.println(name + " is drink.");
	}

	public void learn() {
		System.out.println("Student " + name + " -> learn()");
	}

	public void dance() {
		drink();
		System.out.println("Dance like Student!Yahoo!");
	}

	public void printInfo() {
		super.printInfo();
		System.out.println("AVG: " + avg);
		System.out.println("Grope number: " + groupNumber);
		System.out.println("Marks: ");
		Utils.printArray(marks, true);
		System.out.println("Take a part BRSM: " + isBRSM);
		System.out.println("Course: " + course);
	}

	public Student(int iq, int age, String name, String lastName,double avg, String groupNumber, int[] marks, boolean isBRSM, int course) {
		super(iq, age, name, lastName);
		this.avg = avg;
		this.groupNumber = groupNumber;
		this.marks = marks;
		this.isBRSM = isBRSM;
		this.course = course;
		// TODO Auto-generated constructor stub
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	
}

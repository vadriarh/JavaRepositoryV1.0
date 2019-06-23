package model;

public class Employee extends Client {
	private String position;
	private String depName;
	private double salary;

	public Employee(long uid, String name, String surname, Account account) {
		super(uid, name, surname, account);
	}

	public Employee(long uid, String name, String surname, Account account, String position, String depName,
			double salary) {
		this(uid, name, surname, account);
		this.position = position;
		this.depName = depName;
		this.salary = salary;
		//salary
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return super.toString() + "Employee [position=" + position + ", depName=" + depName + ", salary=" + salary
				+ ", toString()=" + "]";
	}

}

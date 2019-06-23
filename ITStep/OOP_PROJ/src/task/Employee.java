package task;

class Util {

	static String names[] = { "�����", "�������", "���������", "������", "���������", "�������", "�������", "�������",
			"��������", "������", "�����", "�������", "�����", "��������", "�������", "�������", "���� ", "�����",
			"������", "��������", "������", "�����", "������", "��������", "�������", "��������", "������",
			"���������� ", "�������", "��������", "�������� ", "�������� ", "������ ", "���������", "�������",
			"�������� ", "���������", "�������", "����", "��������", "��������", "�������", "���������", "�������",
			"��������", "�������", "�������", "������", "����", "������", "��������", "������ ", "����� ", "������",
			"�����", "�������", "�������", "�����", "�������", "�������", "������", "�������", "�����", "��������",
			"����", "�������", "������", "�������", "����", "����", "�������", "������", "����", "�������", "�����",
			"����", "����������", "������� ", "������", "������", "������", "��� ", "������ ", "�������", "������� ",
			"����������", "��������", "������", "�������", "���������", "��� ", "������", "�������", "���� ", "�����",
			"������", "����������", "�����", "������", "���� ", "������", "������", "��������", "�����", "�������� ",
			"��������", "������", "��������", "����� ", "������", "�������", "������", "�������", "�������", "�����",
			"����", "������", "�����", "�����������", "��������", "ϸ��", "������ ", "��������", "�����", "����",
			"��������", "��������", "������", "��������", "������", "����� ", "���������", "������", "�����", "�������",
			"������ ", "���������", "���������", "���������", "����", "������", "���������", "��������� ", "�����",
			"��������", "���������", "������", "�����", "�������", "�����", "�����", "����� ", "������", "������",
			"������", "Ը���", "�������", "�����", "������", "��������", "�����", "������", "����", "�������",
			"���������", "������", "�����", "����", "����", "�����", "����", "����", "�������" };
	static String lastNames[] = { "�������", "������", "��������", "�������", "�����", "�������", "������", "�������",
			"�������", "������", "������", "��������", "��������", "������", "������", "������", "�������",
			"����������", "��������", "��������", "Ը�����", "��������", "������", "�������", "�����", "�������",
			"�����", "������", "�������", "�������", "������", "�����", "�����", "�����", "�������", "���������",
			"�������", "�������", "��������", "��������", "�������", "�������", "�������", "�������", "�������",
			"�������", "������", "���������", "��������", "���������", "�������", "��������", "�����", "�������",
			"�������", "�����", "�������", "�������", "�������", "�����", "������", "�������", "��������", "������",
			"��������", "�������", "������", "��������", "�������", "��������", "������", "�������", "������",
			"��������", "�������", "��������", "�������", "�������", "��������", "���������", "�������", "��������",
			"������", "���������", "�������", "�������", "������", "�����������", "���������", "��������", "�������",
			"������", "�������", "������", "�����", "�������", "���������", "��������", "������", "����������",
			"������", "���������", "������", "������", "������", "�������", "������", "��������", "��������", "�����",
			"��������", "��������", "�����", "����", "���������", "��������", "�����", "�������", "�������", "�������",
			"�������", "�����", "�������", "��������", "��������", "���������", "�������", "������", "����������",
			"�������", "��������", "�������", "������", "������", "�������", "�������", "�����", "�������", "�������",
			"��������", "������", "������", "������", "�����", "��������", "�������", "�������", "��������", "�����",
			"�������", "�������", "��������", "��������", "�������", "�������", "�������", "������", "��������",
			"������", "�������", "�����", "���������", "����������", "�������", "������", "����", "�������", "�����",
			"��������", "��������", "���������", "��������", "��������", "��������", "��������", "�����", "�������",
			"�����", "�������", "�������", "������", "�����", "�������", "���������", "��������", "����������",
			"��������", "������", "��������", "������", "�������", "���������", "��������", "�������", "�����",
			"������", "����������", "��������", "�����", "������", "�����", "�������", "��������", "������",
			"����������", "������", "������������", "��������", "������", "�����", "�������", "�������", "�������",
			"�����", "�������", "�������", "�������", "������", "������������", "�������", "��������", "������",
			"��������", "������", "������", "������", "�������", "��������", "������", "��������", "��������",
			"�������", "�����", "������", "�������", "�������", "��������", "�����", "�������", "�������", "��������",
			"�����", "������", "�����������", "������", "����������", "�����", "��������", "������", "�����" };
	static String companyNames[] = { "Google", "Yahoo!", "IBM", "SAP" };
	static String jobPositions[] = { "Tester", "Developer", "Manager" };

	public static Employee[] generateEmployees(int num) {
		Employee employees[] = new Employee[num];
		for (int i = 0; i < employees.length; i++) {
			employees[i] = generateEmployee();
//			employees[i].setUid(i + 1);
		}
		return employees;
	}

	public static Employee[][] sortingToCompany(Employee arrInput[]) {
		Employee arrResult[][] = new Employee[arrInput.length][companyNames.length];
		for (int i = 0; i < companyNames.length; i++) {
			for (int k = 0; k < arrResult.length; k++) {
				if (arrInput[k].getCompanyName() == companyNames[i]) {
					arrResult[k][i] = arrInput[k];
				}
			}
		}
		return arrResult;
	}

	public static Employee generateEmployee() {
		Employee empl = new Employee();

		empl.setName(names[(int) (Math.random() * names.length)]);
		empl.setLastName(lastNames[(int) (Math.random() * lastNames.length)]);
		empl.setCompanyName(companyNames[(int) (Math.random() * companyNames.length)]);
		empl.setJobPosition(jobPositions[(int) (Math.random() * jobPositions.length)]);
		empl.setAge((int) (18 + Math.random() * (61 - 18)));
		empl.setSalary(1000 + Math.random() * 4000);
		return empl;
	}

	public static void printInfoForEmployee(Employee employee) {
		System.out.println(employee.getName() + " " + employee.getLastName());
		System.out.println("Age = " + employee.getAge());
		// System.out.println(employee.getCompanyName());
		System.out.println(employee.getJobPosition() + ": " + employee.getSalary());
		System.out.println();
	}

	public static void printEmployeeForCompanies(Employee arrInput[][], String companyNames[]) {
		int count = 1;
		for (int i = 0; i < companyNames.length; i++) {
			System.out.println(companyNames[i] + ": ");
			for (int k = 0; k < arrInput.length; k++) {
				if (arrInput[k][i] != null) {
					System.out.print(count + ". ");
					printInfoForEmployee(arrInput[k][i]);
					count++;
				}
			}
			System.out.println("====================");
			count = 1;

		}
	}
}

public class Employee {

	private int age;
	private String name;
	private String lastName;
	private String jobPosition;
	private String companyName;
	private double salary;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 0) {
			throw new IllegalArgumentException("Invalid AGE for Employee!" + age);
		}
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getJobPosition() {
		return jobPosition;
	}

	public void setJobPosition(String jobPosition) {
		this.jobPosition = jobPosition;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(int age, String name, String lastName, String jobPosition, String companyName, double salary) {
		this();
		this.age = age;
		this.name = name;
		this.lastName = lastName;
		this.jobPosition = jobPosition;
		this.companyName = companyName;
		this.salary = salary;

	}

	public Employee() {
	}

//	public long getUid() {
//		return uid;
//	}
//
//	public void setUid(long uid) {
//		this.uid = uid;
//	}

}

class Tester {
	public static void main(String[] args) {
		Employee em1 = new Employee();
		em1.setAge(30);
		em1.setName("Alex");
		em1.setJobPosition("Developer");
		em1.setCompanyName("EPAM");
		em1.setLastName("Ivanov");
		em1.setSalary(5000);

		em1.setJobPosition("Senior");

		Employee em2 = new Employee();
		em2.setAge(45);
		em2.setName("Glen");
		em2.setJobPosition("Vice-president");
		em2.setCompanyName("IBM");
		em2.setLastName("Sinder");
		em2.setSalary(23500);
		// Employee em3 = new Employee(25, "World", "of", "Warcraft", "Gamer", 4200);

		// Employee em4 = Util.generateEmployee();

		// Employee emplForCompanies[]=new Employee[]
		Util.printEmployeeForCompanies(Util.sortingToCompany(Util.generateEmployees(100)), Util.companyNames);

	}
}

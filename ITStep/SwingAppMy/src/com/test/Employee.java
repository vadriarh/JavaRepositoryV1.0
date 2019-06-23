package com.test;

import com.test.utils.Constants;

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
			employees[i].setUid(i + 1);

//			System.out.println(employees[i]);
		}
		return employees;
	}

	public static Employee[] searchEmployees(Employee[] e, String crit, String crit_val) {
		Employee search_empl[] = new Employee[e.length];
		int counter = 0;
		for (int i = 0; i < e.length; i++) {
			if (crit.equals("Name")) {
				if (e[i].getName().startsWith(crit_val)) {
					search_empl[i] = e[i];// [null, obj, null, null, obj]
					counter++;
				}

			}
			if (crit.equals("Last Name")) {
				if (e[i].getLastName().startsWith(crit_val)) {
					search_empl[i] = e[i];// [null, obj, null, null, obj]
					counter++;
				}

			}
			if (crit.equals("Job Position")) {
				if (e[i].getJobPosition().startsWith(crit_val)) {
					search_empl[i] = e[i];// [null, obj, null, null, obj]
					counter++;
				}

			}
			if (crit.equals("Company Name")) {
				if (e[i].getCompanyName().startsWith(crit_val)) {
					search_empl[i] = e[i];// [null, obj, null, null, obj]
					counter++;
				}

			}
		}
		Employee result[] = new Employee[counter];
		for (int i = 0, j = 0; i < search_empl.length; i++) {
			if (search_empl[i] == null)
				continue;
			result[j] = search_empl[i];
			j++;
		}

		return result;
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
		// int salaryInt=;
		empl.setSalary(1000 + (int) (100 * (Math.random() * 4000)) / 100.0);
		empl.setEmail(Constants.OUN_EMAIL_ID);
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

	public static int[] equalsEmployee(Employee empl1, Employee empl2) {
		int result[] = new int[6];
		for (int i = 0; i < result.length; i++) {
			result[i] = 0;
		}
		if (empl1.getAge() != empl2.getAge()) {
			result[0] = 1;
		}
		if (!empl1.getName().equals(empl2.getName())) {
			result[1] = 1;
		}
		if (!empl1.getLastName().equals(empl2.getLastName())) {
			result[2] = 1;
		}
		if (!empl1.getJobPosition().equals(empl2.getJobPosition())) {
			result[3] = 1;
		}
		if (!empl1.getCompanyName().equals(empl2.getCompanyName())) {
			result[4] = 1;
		}
		if (empl1.getSalary() != empl2.getSalary()) {
			result[5] = 1;
		}
		for (int i = 0; i < result.length; i++) {
			if (result[i] == 0) {
				if (i == result.length - 1) {
					return null;
				}
			} else {
				break;
			}
		}
		return result;
	}

}

public class Employee {
	private long uid = 0;
	private int age;
	private String name;
	private String lastName;
	private String jobPosition;
	private String companyName;
	private double salary;
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

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

	public long getUid() {
		return uid;
	}

	public void setUid(long uid) {
		this.uid = uid;
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

	@Override
	public String toString() {
		return "Employee [uid=" + uid + ", age=" + age + ", name=" + name + ", lastName=" + lastName + ", jobPosition="
				+ jobPosition + ", companyName=" + companyName + ", salary=" + salary + "]";
	}

}

class Tester {
	public static void main(String[] args) {
//		Employee em1 = new Employee();
//		em1.setAge(30);
//		em1.setName("Alex");
//		em1.setJobPosition("Developer");
//		em1.setCompanyName("EPAM");
//		em1.setLastName("Ivanov");
//		em1.setSalary(5000);
//
//		em1.setJobPosition("Senior");
//
//		Employee em2 = new Employee();
//		em2.setAge(45);
//		em2.setName("Glen");
//		em2.setJobPosition("Vice-president");
//		em2.setCompanyName("IBM");
//		em2.setLastName("Sinder");
//		em2.setSalary(23500);
//		// Employee em3 = new Employee(25, "World", "of", "Warcraft", "Gamer", 4200);
//
//		// Employee em4 = Util.generateEmployee();
//
//		// Employee emplForCompanies[]=new Employee[]
//		Util.printEmployeeForCompanies(Util.sortingToCompany(Util.generateEmployees(100)), Util.companyNames);
		Employee[] original = Util.generateEmployees(1000);
		Employee[] result = Util.searchEmployees(original, "Name", "�����");
		for (Employee employee : result) {
			System.out.println(employee);
		}
	}
}

package model;

import java.util.Set;

public class Employee {
	private long UID;
	private int age;
	private String name;
	private String lastName;
	private String jobPosition;
	private String companyName;
	private double salary;
	private Set<Contact> contacts;
	
	
	
	@Override
	public int hashCode() {
		System.out.println("EMPLOYEE->HASHCODE");
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (UID ^ (UID >>> 32));
		result = prime * result + age;
		result = prime * result + ((companyName == null) ? 0 : companyName.hashCode());
		result = prime * result + ((contacts == null) ? 0 : contacts.hashCode());
		result = prime * result + ((jobPosition == null) ? 0 : jobPosition.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return 1;
	}


	@Override
	public boolean equals(Object obj) {
		System.out.println("EMPLOYEE->EQUALS");
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Employee other = (Employee) obj;
		if (UID != other.UID) {
			return false;
		}
		if (age != other.age) {
			return false;
		}
		if (companyName == null) {
			if (other.companyName != null) {
				return false;
			}
		} else if (!companyName.equals(other.companyName)) {
			return false;
		}
		if (contacts == null) {
			if (other.contacts != null) {
				return false;
			}
		} else if (!contacts.equals(other.contacts)) {
			return false;
		}
		if (jobPosition == null) {
			if (other.jobPosition != null) {
				return false;
			}
		} else if (!jobPosition.equals(other.jobPosition)) {
			return false;
		}
		if (lastName == null) {
			if (other.lastName != null) {
				return false;
			}
		} else if (!lastName.equals(other.lastName)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary)) {
			return false;
		}
		return true;
	}


	public Employee(long uID, int age, String name, String lastName, String jobPosition, String companyName,
			double salary, Set<Contact> contacts) {
		super();
		UID = uID;
		this.age = age;
		this.name = name;
		this.lastName = lastName;
		this.jobPosition = jobPosition;
		this.companyName = companyName;
		this.salary = salary;
		this.contacts = contacts;
	}
	
	
	public long getUID() {
		return UID;
	}
	public void setUID(long uID) {
		UID = uID;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
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
	public Set<Contact> getContacts() {
		return contacts;
	}
	public void setContacts(Set<Contact> contacts) {
		this.contacts = contacts;
	}


	@Override
	public String toString() {
		return "Employee [UID=" + UID + ", age=" + age + ", name=" + name + ", lastName=" + lastName + ", jobPosition="
				+ jobPosition + ", companyName=" + companyName + ", salary=" + salary + ", contacts=" + contacts + "]";
	}
	
	
}

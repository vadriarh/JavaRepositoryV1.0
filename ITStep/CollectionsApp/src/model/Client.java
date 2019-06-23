package model;

public class Client {
	private long UID;
	private int age;
	private String name;
	private String lastName;
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
	public Client(long uID, int age, String name, String lastName) {
		super();
		UID = uID;
		this.age = age;
		this.name = name;
		this.lastName = lastName;
		
	}
	@Override
	public int hashCode() {
		System.out.println("Client->HASHCODE");
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (UID ^ (UID >>> 32));
		result = prime * result + age;
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("Client->HASHCODE");
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Client other = (Client) obj;
		if (UID != other.UID) {
			return false;
		}
		if (age != other.age) {
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
		return true;
	}
	@Override
	public String toString() {
		return "Client [UID=" + UID + ", age=" + age + ", name=" + name + ", lastName=" + lastName + "]";
	}
	
	
}

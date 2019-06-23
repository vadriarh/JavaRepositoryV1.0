package model;

import java.util.List;

public class Contact implements Comparable<Contact> {
	private int id;
	private String name;
	private String lastName;
	private String phoneNumber;
	private List<String> extraNumber;
	private String skype;
	private String city;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public List<String> getExtraNumber() {
		return extraNumber;
	}

	public void setExtraNumber(List<String> extraNumber) {
		this.extraNumber = extraNumber;
	}

	public String getSkype() {
		return skype;
	}

	public void setSkype(String skype) {
		this.skype = skype;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Contact [id=" + id + ", name=" + name + ", lastName=" + lastName + ", phoneNumber=" + phoneNumber
				+ ", extraNumber=" + extraNumber + ", skype=" + skype + ", city=" + city + "]";
	}

	@Override
	public int hashCode() {
		System.out.println("Contact->HASHCODE");
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((extraNumber == null) ? 0 : extraNumber.hashCode());
		result = prime * result + id;
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
		result = prime * result + ((skype == null) ? 0 : skype.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Contact->HASHCODE");
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Contact other = (Contact) obj;
		if (city == null) {
			if (other.city != null) {
				return false;
			}
		} else if (!city.equals(other.city)) {
			return false;
		}
		if (extraNumber == null) {
			if (other.extraNumber != null) {
				return false;
			}
		} else if (!extraNumber.equals(other.extraNumber)) {
			return false;
		}
		if (id != other.id) {
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
		if (phoneNumber == null) {
			if (other.phoneNumber != null) {
				return false;
			}
		} else if (!phoneNumber.equals(other.phoneNumber)) {
			return false;
		}
		if (skype == null) {
			if (other.skype != null) {
				return false;
			}
		} else if (!skype.equals(other.skype)) {
			return false;
		}
		return true;
	}

	@Override
	public int compareTo(Contact o) {
		Integer own = this.id;
		Integer in = o.id;
		return own.compareTo(in);
	}

	public Contact(int id, String name, String lastName, String phoneNumber, List<String> extraNumber, String skype,
			String city) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.extraNumber = extraNumber;
		this.skype = skype;
		this.city = city;
	}
	
	public Contact() {
		super();
	}
	
	

}

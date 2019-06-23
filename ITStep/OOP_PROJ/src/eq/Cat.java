package eq;

public class Cat {
	long uid;
	int age;
	String name;

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (int) (uid ^ (uid >>> 32));
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Cat other = (Cat) obj;
		if (age != other.age) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (uid != other.uid) {
			return false;
		}
		return true;
	}

}

class CatTester {
	public static void main(String[] args) {
		Cat c1 = new Cat();
		c1.uid = 150;
		c1.age = 3;
		c1.name = "Tom";

		Cat c2 = new Cat();
		c2.uid = 150;
		c2.age = 3;
		c2.name = "Tsm";

		System.out.println(c1.equals(c2));
		
		System.out.println("Cat#1 hashcode: "+c1.hashCode());
		System.out.println("Cat#2 hashcode: "+c2.hashCode());
	}
}
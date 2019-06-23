package test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTester {

	public static void main(String[] args) {
		Set<Person> set = new HashSet<>();
		set.add(new Person(100, "Jonson"));
		set.add(new Person(200, "Ivanov"));
		set.add(new Person(100, "JOnson"));
		set.add(new Person(100, "Jonson"));
		set.add(new Person(200, "Ivanov1"));
		set.add(new Person(200, "Ivanov2"));
		System.out.println(set.size());
		for (Person person : set) {
			System.out.println(person);
		}
		

		Set<String> setOfString = new HashSet<>();
		setOfString.add("A");
		setOfString.add("B");
		setOfString.add("C");
		setOfString.add("B");
		setOfString.add("B");
		for (String str : setOfString) {
			System.out.println(str);
		}
Iterator<String> it=setOfString.iterator();
while(it.hasNext()) {
	String s=it.next();
	System.out.println(s.toLowerCase());
}
for (Iterator<Person> iter=set.iterator();iter.hasNext(); ) {
	iter.next().getLastName();
}



	}

}

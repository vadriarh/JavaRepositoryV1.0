package test;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	static boolean isValid(List<Person> list) {
		return list!=null&&!list.isEmpty();
	}
	
	static void print(List<Person> list) {
		if(isValid(list)) {
			for (int i = 0; i < list.size(); i++) {
				System.out.println("["+i+"] = "+list.get(i));
			}
		}
	}
	
	static Person findById(List<Person> list, long id) {
		if (isValid(list)) {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i) != null) {
					if (id == (list.get(i).getId())) {
						return list.get(i);
					}
				}
			}
		}
		return null;
	}
	
	static boolean addPerson(List<Person> list, Person p) {
		if(list==null||p==null) return false;
		return !list.contains(p)?list.add(p):false;
	}
	
	static void shareContacts(Person p1, Person p2) {
		if(p1==null||p2==null) return;
		List<Person> personA=p1.getListOfContacts();
		List<Person> personB=p2.getListOfContacts();
		if(personA==null||personB==null) return;
		for (int i = 0; i < personB.size(); i++) {
			if(!personA.contains(personB.get(i))) {
				personA.add(personB.get(i));
			}			
		}
		p1.setListOfContacts(personA);
		p2.setListOfContacts(personA);
	}
	
	static void shareContacts2(Person p1, Person p2) {
		if(p1==null||p2==null) return;
		for (Person person : p1.getListOfContacts()) {
			addPerson(p2.getListOfContacts(), person);
		}
		p1.setListOfContacts(p2.getListOfContacts());
	}

	public static void main(String[] args) {
//		List<String> list = new ArrayList<>();
//		list.add("STR");
//		list.add("123");
//		list.add(null);
//		list.add(new Double(1.222).toString());
//		
//		List extraList = new ArrayList();
//		extraList.add("STR2");
//		extraList.add(1234);
//		extraList.add(null);
//		extraList.add(new Double(2.222));
//		
//		System.out.println(list);
//		System.out.println(list.get(list.size()-1));
//		
//		list.add("100");
//		list.add(new String("123"));
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println("["+i+"]="+list.get(i));
//		}
//		list.addAll(extraList);
//		System.out.println(list);
//		list.addAll(0,extraList);
//		System.out.println(list);

		List<Person> list = new ArrayList<>();
		list.add(new Person(100, "Tyson"));
		list.add(new Person(123, "Dyson"));
		
		
		List<Person> contacts1 = new ArrayList<>();
		contacts1.add(new Person(340, "Tyccon"));
		contacts1.add(new Person(102, "Tyseran"));
		list.get(0).setListOfContacts(contacts1);
		
		List<Person> contacts2 = new ArrayList<>();
		contacts2.add(new Person(102, "Tyseran"));
		contacts2.add(new Person(111, "Typuck"));
		contacts2.add(new Person(560, "Erton"));
		list.get(1).setListOfContacts(contacts2);
		
		//System.out.println(findById(list, 12));
		//addPerson(list, new Person(123, "Dyson"));
		print(list.get(0).getListOfContacts());
		System.out.println();
		print(list.get(1).getListOfContacts());
		System.out.println();
		
		shareContacts2(list.get(0), list.get(1));
		print(list.get(0).getListOfContacts());
		System.out.println();
		print(list.get(1).getListOfContacts());
		System.out.println();

	}

}

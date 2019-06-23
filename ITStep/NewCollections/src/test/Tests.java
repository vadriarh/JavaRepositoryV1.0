package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
//import java.util.Collections;
//import java.util.HashSet;
//import java.util.Date;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
//import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;
//import java.util.List;

public class Tests {
	public static void test1() {

		Person p1 = new Person(45, "Bob", "Bobson");
		Person p2 = new Person(45, "Alex", "Jackson");
		Person p3 = new Person(35, "Frank", "Stone");

		ArrayList<Person> list = new ArrayList<Person>();
		list.add(p1);
		list.add(p2);
		list.add(p3);

		LinkedList<Person> list2 = new LinkedList<Person>();
		list2.add(p1);
		list2.add(p2);
		list2.add(p3);

//		ArrayList<Integer> l1 = new ArrayList<Integer>();
//		for (int i = 0; i < 100000; i++) {
//			l1.add(i);
//		}
//		LinkedList<Integer> l2 = new LinkedList<Integer>();
//		for (int i = 0; i < 100000; i++) {
//			l2.add(i);
//		}
//		Date arrayDate1 = new Date();
//		for (int i = 0; i < 100000; i++) {
//			l1.add(0, i);
//		}
//		Date arrayDate2 = new Date();
//		System.out.println(arrayDate2.getTime() - arrayDate1.getTime());
//		Date linkedDate1 = new Date();
//		for (int i = 0; i < 100000; i++) {
//			l2.add(0, i);
//		}
//		Date linkedDate2 = new Date();
//		System.out.println(linkedDate2.getTime() - linkedDate1.getTime());
		
		//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		list.sort(new PersonComparator());
		//Collections.sort(list);
		System.out.println(list);
		
		//Collections.sort(list2);
		System.out.println(list2);
		//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		
	}
	public static void test2() {
		Person p1 = new Person(45, "Bob", "Bobson");
		Person p2 = new Person(45, "Alex", "Jackson");
		Person p3 = new Person(35, "Frank", "Stone");
		Person p4 = new Person(35, "Frank", "Stone");
		
		Set<Person> set=new TreeSet<Person>();
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		
		System.out.println(set);
		
	}
	
	public static void test3() {		
		Person p1 = new Person(45, "Bob", "Bobson");
//		Person p2 = new Person(45, "Alex", "Jackson");
//		Person p3 = new Person(35, "Frank", "Stone");
//		Person p4 = new Person(35, "Frank", "Stone");
//		Map<String,Person> map =new HashMap<String, Person>();
//		map.put("key1", p1);
//		map.put("key2", p2);
//		map.put("key3", p3);
//		map.put("key4", p4);
//		
//		Set<Entry<String,Person>> set=map.entrySet();
//		for (Entry<String, Person> entry : set) {
//			System.out.println(entry);
//		}
		
		String str="But I USER_NAME USER_LASTNAME must explain to you how all this mistaken idea of denouncing pleasure and praising pain was born and I will give you a complete"
				+" account of the system, and expound the actual teachings of the great explorer of the truth, the master-builder of human happiness. "
				+"No one rejects, dislikes, or avoids pleasure itself, because it is pleasure, but because those who do not know how to pursue pleasure"
				+" rationally encounter consequences that are extremely painful. Nor again is there anyone who loves or pursues or desires to obtain pain "
				+"of itself, because it is pain, but because occasionally circumstances occur in which toil and pain can procure him some great pleasure. To "
				+"take a trivial example, which of us ever undertakes laborious physical exercise, except to obtain some advantage from it? But who has any "
				+"right to find fault with a man who chooses to enjoy a pleasure that has no annoying consequences, or one who avoids a pain that produces no "
				+"resultant pleasure?";
		StringBuilder sb=new StringBuilder();
		
		Map<String,Integer> map =new HashMap<String, Integer>();
		String[] words=str.split(" ");
		for (String string : words) {
			System.out.println("["+string+"]");
			if(string.equals("USER_NAME")) {
				sb.append(p1.getName());
			}else if(string.equals("USER_LASTNAME")) {
				sb.append(p1.getLastName());
			}else {
				sb.append(string);
			}
			sb.append(" ");
			map.put(string, string.length());
		}
		System.out.println("++++++++++++++++++++++++++++++++++");
		Iterator<Entry<String,Integer>>iter=map.entrySet().iterator();
		while(iter.hasNext()) {
			Entry<String,Integer> entry=iter.next();
			System.out.println(entry);
		}
		System.out.println(sb);
	}
}


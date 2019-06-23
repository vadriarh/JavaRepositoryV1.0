package test;

import java.util.ArrayList;

import java.util.Collections;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import model.Contact;

public class ContactsTester {

	public static void main(String[] args) {
		Contact c1=new Contact();
		c1.setId(55);
		Contact c2=new Contact();
		c2.setId(2);
		Contact c3=new Contact();
		c3.setId(45);
		Contact c4=new Contact();
		c4.setId(5);
		Contact c5=new Contact();
		c5.setId(546);
		List<Contact>list=new ArrayList<>();
		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);
		list.add(c5);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		Set<Contact>set=new TreeSet<Contact>();
		set.add(c1);
		set.add(c2);
		set.add(c3);
		set.add(c4);
		set.add(c5);
		System.out.println(set);
	}

}

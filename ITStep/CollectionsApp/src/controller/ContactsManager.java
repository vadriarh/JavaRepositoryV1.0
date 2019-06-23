package controller;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import dao.ContactsDAO;
import model.Contact;

public class ContactsManager implements ContactsDAO{

	private Set<Contact> data;
	
	@Override
	public boolean update(Contact contact) {
		for (Contact c : data) {
			if(c.getId()==contact.getId()) {
				System.out.println("update->");
				
				
				
				System.out.println("update success");
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean delete(Contact contact) {
		System.out.println("->removing");
		return data.remove(contact);
	}

	@Override
	public boolean create(Contact contact) {
		System.out.println("->creating");
		return data.add(contact);
	}

	@Override
	public Contact select(Contact contact) {
		System.out.println("->selecting");
		Iterator<Contact> iter=data.iterator();
		while(iter.hasNext()) {
			Contact c=iter.next();
			if(c.equals(contact)) {
				return c;
			}
		}
		return null;
	}

	@Override
	public Set<Contact> findByCity(String sity) {
		System.out.println("->findByCity");
		Set<Contact> newSet=new HashSet<Contact>();
		for (Contact contact : data) {
			if(contact.getCity().startsWith(sity)) {
				newSet.add(contact);
			}
		}
		return newSet;
	}

	@Override
	public Set<Contact> findByLastName(String lastName) {
		System.out.println("->findByLastName");
		Set<Contact> newSet=new HashSet<Contact>();
		for (Contact contact : data) {
			if(contact.getLastName().startsWith(lastName)) {
				newSet.add(contact);
			}
		}
		return newSet;
	}

	@Override
	public Set<Contact> findByPhoneNumber(String phoneNumber) {
		System.out.println("->findByPhoneNumber");
		Set<Contact> newSet=new HashSet<Contact>();
		for (Contact contact : data) {
			if(contact.getPhoneNumber().startsWith(phoneNumber)) {
				newSet.add(contact);
			}else {
				for (String  extraNumbers : contact.getExtraNumber()) {
					if(extraNumbers.startsWith(phoneNumber)) {
						newSet.add(contact);
					}
				}
			}
		}
		return newSet;
	}

	@Override
	public boolean addExtraPhoneNumbers(Contact contact, Set<String> setOfExtraPhones) {
		List<String> list=contact.getExtraNumber();
		boolean result=list.addAll(setOfExtraPhones);
		contact.setExtraNumber(list);
		return result;
	}
	
	

}

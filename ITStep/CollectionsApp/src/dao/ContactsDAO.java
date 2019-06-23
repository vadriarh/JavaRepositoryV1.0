package dao;

import java.util.Set;

import model.Contact;

public interface ContactsDAO {
	public abstract boolean update(Contact contact);
	public abstract boolean delete(Contact contact);
	public abstract boolean create(Contact contact);
	public abstract Contact select(Contact contact);
	public abstract Set<Contact> findByCity(String city);
	public abstract Set<Contact> findByLastName(String lastName);
	public abstract Set<Contact> findByPhoneNumber(String phoneNumber);
	public abstract boolean addExtraPhoneNumbers(Contact contact,Set<String> setOfExtraPhones);
}

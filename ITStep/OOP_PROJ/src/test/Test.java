package test;

public class Test {
	public static void printPersonInfo(Person p) {
		if (p.name != null) {
			System.out.println();
			System.out.println("Name is " + p.name);
			System.out.println("Last name is " + p.lastName);
			System.out.println("Age is " + p.age);
			System.out.println("IQ is " + p.iq);
		} else {
			System.out.println("EMPTY.");
		}
	}

//	public static void main(String[] args) {
//		// 1. ��������� ���������� ���� Person ����� ��������� ���������� ���� Person
//		// variable of Person init
//		// TYPE<=> CLASS<=> TEMPLATE
//		// 2. �������� ���������� � ����(������) - ����� ������ ������ new Person () -
//		// 3.
//		Person p;
//		p= new Person(); // Instance(object) creation - �������� ����������(�������)
//		p.age = 31;
//		p.iq = 89;
//		p.lastName = "Dylan";
//		p.name = "Bob";//������������� ����� (������) ������� ���������� Person ����� ����������� <var_name><.><field_name>=<val_of_field_type>;
//		//FIELD<=>PROPERTIES<=>����<=>��������
//		//printPersonInfo(p);
//		Person p2= new Person();
//		p2.age = 55;
//		p2.iq = 30;
//		p2.lastName = "Tyson";
//		p2.name = "Mike";
//		
//		Person arr[]= {p,p2};
//		for (Person person : arr) {
//			printPersonInfo(person);
//			System.out.println("===============);
//		}
//		//printPersonInfo(p2);
//	}

}

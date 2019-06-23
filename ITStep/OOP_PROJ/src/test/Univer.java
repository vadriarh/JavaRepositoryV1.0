package test;

public class Univer {
	
	
	//DMI-dynamic method invocation
	//DMD-dynamic method despatch
	static void test(Person p) {
		System.out.println("====================");
		p.printInfo();
		p.sayHello();
		p.dance();
		
		if (p instanceof Student) {
			((Student) p).drink();
		}else if(p instanceof Teacher) {
			((Teacher) p).beLate();
		}
		System.out.println("via classes");
		if (p.getClass()== Student.class) {
			((Student) p).drink();
		}else if(p.getClass() == Teacher.class) {
			((Teacher) p).beLate();
		}
		
	}

	public static void clubEnter(Person p) {
		System.out.println("Person: " + p.lastName + " " + p.name + " go to club!");
		if (p.age >= 18) {

			p.printInfo();
			System.out.println("Person: " + p.lastName + " " + p.name + " in club!");
			p.sayHello();
			p.dance();
		} else {
			System.out.println("Go to home,kid.");
		}

	}

	public static void main(String[] args) {
//		Student st1 = new Student();
//		st1.age = 20;
//		st1.avg = 9;
//		st1.course = 2;
//		st1.groupNumber = "J1819";
//		st1.iq = 120;
//		st1.isBRSM = false;
//		st1.lastName = "Jordan";
//		st1.marks = new int[4];
//		st1.name = "Mike";
//		st1.marks[0] = 8;
//		st1.marks[1] = 9;
//		st1.marks[2] = 9;
//		st1.marks[3] = 7;
//		st1.gender = 'm';
//
//		Child ch1 = new Child();
//		ch1.lastName = "Elrick";
//		ch1.name = "Edvard";
//		ch1.age = 12;
//		ch1.childrenInFamily = 2;
//		ch1.iq = 89;
//		ch1.namesOfChildrenInFamily = new String[1];
//		ch1.namesOfChildrenInFamily[0] = "Pol";
//		ch1.school = "1 junior school";
//		ch1.toys = new String[2];
//		ch1.toys[0] = "Cars";
//		ch1.toys[1] = "Robots";
//		ch1.gender = 'm';
//
//		Teacher t1 = new Teacher();
//		t1.age = 43;
//		t1.exp = 10;
//		t1.iq = 122;
//		t1.groups = new String[4];
//		t1.groups[0] = "J1819";
//		t1.groups[1] = "X1819";
//		t1.groups[2] = "Y1819";
//		t1.groups[3] = "Z1819";
//		t1.lastName = "Ivanov";
//		t1.name = "Ivan";
//		t1.salary = 2000;
//		t1.tech = new String[2];
//		t1.tech[0] = "Math";
//		t1.tech[1] = "Programming";
//		t1.car.color = "Black";
//		t1.car.model = "BMW";
//		t1.car.cost = 50000;
//		t1.car.owner = t1;
//		t1.car.users = new Person[1];
//		t1.car.users[0] = t1;
//		t1.gender = 'm';
//		t1.relatives = new Person[2];
//		t1.relatives[0] = st1;
//		t1.relatives[1] = ch1;
//
//		clubEnter(ch1);
//		clubEnter(st1);
		
		String groups[]= {"J1819","J1919"};
		String tech[]= {"Math","Programming"};
		Car c=new Car();
		c.color="Black";
		c.model="BMW";
		c.cost=5000;
		
		Teacher t1=new Teacher(110,50,"John","Johnson",500,10,groups,tech,c);
		int marks[]= {9,9,9,10};
		Student st1=new Student	(77,22,"Mike","Tyson",9.52,"J1819",marks,true,3);
		Student st2=new Student	(77,22,"Mike","Tyson",9.52,"J1819",marks,true,3);
		Student st3 = null;
		try {
			st3 = (Student) st2.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		st2.lastName="Jordan";
		t1.printInfo();
		st1.printInfo();
		
		//upcasting-всегда безопасно, не меняет обьект
		Person p1=t1;
		Person p2=st1;//интерфейс будет сужен к интерфейсу суперкласса, может быть явным
					//Person p2=(Person) st1;
		
		test(p1);
		test(p2);
		
		//downcasting
		Teacher tt1=(Teacher)p1;//-не безопасная операция , может бросаться ClassCastException, требует явного приведения, после приведения обьект возвращает себе его интерфейс
		Student sst1=(Student)p2;// не меняет обьект
		
		test(tt1);
		test(sst1);
		
		System.out.println(t1);
		System.out.println(st1);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(tt1);
		System.out.println(sst1);
		
		System.out.println(st3.lastName);
	}

}

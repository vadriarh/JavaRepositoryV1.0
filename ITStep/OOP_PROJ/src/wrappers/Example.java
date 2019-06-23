package wrappers;

public class Example {
	final String DATA_ZANYATIYA = "17.04.2019";
	
	public static void main(String[] args) {

		int i = 7;
		int ii = 8;
//		Integer obj_i = new Integer(i);// since 1-5
		Integer obj_ii = ii;// since 6-young

//		Integer obj_from_str = new Integer("234");
		try {
			// Integer obj_from_str=new Integer("asf234");
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
		//int z = Integer.parseInt("123");
		//int zz = obj_from_str;
test1(obj_ii);
test2(i);

Object o=obj_ii;
test1((Integer)o);

//int array[]= {i,ii,obj_from_str,obj_i,obj_ii,(Integer)o};

Boolean b=new Boolean(false);
Boolean b2=new Boolean("TRUE");
Boolean b3=new Boolean("YES");
Boolean b4=new Boolean(!b2);
Boolean b5=new Boolean(!(!b4));
boolean bb=true;

boolean flags[]= {b,b2,b3,b4,b5,new Boolean(bb).booleanValue()};

for (Boolean c : flags) {
	System.out.println(c);
}

	}

	static void test1(int i) {
		System.out.println(i);
	}

	static void test2(Object o) {
		System.out.println(o);
	}

}

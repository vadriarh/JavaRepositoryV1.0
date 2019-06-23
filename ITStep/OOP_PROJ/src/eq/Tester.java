package eq;

import java.util.Date;

public class Tester {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
//		Object o = new Object();
//		Object o_copy=o;
//		boolean r1 = o.equals(o);
//		boolean r1_copy = o.equals(o_copy);
//		System.out.println(r1);
//		System.out.println(r1_copy);
//		
//		Object o2=new Object();
//		boolean r2 = o.equals(o2);
//		System.out.println(r2);
		Company c1=new Company();
		c1.setName("c1");
		c1.setSince(new Date(2085, 11, 25));
		c1.setUID(154);
		
		Company c2=new Company();
		c2.setName("c2");
		c2.setSince(null);
		c2.setUID(130);
		
		Company c3=c2;
		
		Company c4=new Company();
		c4.setName("c1");
		c4.setSince(new Date(2085, 11, 25));
		c4.setUID(154);


		
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c4));
		System.out.println(c3.equals(c2));
		System.out.println(c2.equals(c4));
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c3.hashCode());
		System.out.println(c4.hashCode());
		
	}

}

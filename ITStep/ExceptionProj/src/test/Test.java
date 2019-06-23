package test;

public class Test {

	public static void main(String[] args) {
		int a=10,b=0,result=0;
//		if(b!=0) {
//			result=a/b;
//		}

		try {
			//critical code will be here
			result=a/b;
		} catch (ArithmeticException e) {//
			//what we can do ?
			e.printStackTrace();
			//System.out.println();
			System.out.println("Cause: "+e.getMessage());
		}
		
		System.out.println("result "+result);
		

		Object o=null;
		try {
			o.getClass();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Object "+e.getMessage());
		}
		
		String str=((int)(Math.random()*2)==0?null:"");
		int s=(int)(Math.random()*2);
		
		try {
			int c=77/s;			
			str.length();
		} catch (Exception e) {
			System.out.println("OOPS! Something goes wrong!");
			e.printStackTrace();
		}
		doSome(-100);
		System.out.println("END");
	}

	/**
	 * 
	 * @param arg
	 * @throws IllegalArgumentException - if argument not positive
	 */
	static void doSome(int arg) throws IllegalArgumentException{
		if (arg<0) throw new IllegalArgumentException("Negative Argument");
		System.out.println(Math.pow(arg, 3));	
		
	}
}

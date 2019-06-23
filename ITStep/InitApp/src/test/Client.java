package test;

import model.ChildBB;

public class Client {

	public static void main(String[] args) {
		ChildBB ch = new ChildBB();
		System.out.println(ch.i);
//		System.out.println("---------STATIC TEST----------");
//	for (int i = 0; i < 50; i++) {
//		StaticTester inst=new StaticTester();
//		System.out.println(inst);
//	}
		ch.doSomething();
		System.out.println(ch.i);
	}

}

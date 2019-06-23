package com.test.single;

import java.io.ObjectInputStream.GetField;

public class Client {
	//lock constructor and don't led client 
	//create instances of this class
	public static void main(String[] args) {

//		Singleton s = Singleton.getInstance();
//		for (int i = 0; i < 10; i++) {
//			s = Singleton.getInstance();
//		}
//		
//		System.out.println(EagerSingleton.label);
//		EagerSingleton se;
//		for (int i = 0; i < 10; i++) {
//			se = EagerSingleton.getInstance();
//		}
//		
//		String keys[]= {"lang","version","size"};
//		String values[]= {"EN","v1.01","22"};
//		String keys2[]= {"lang","version","size"};
//		String values2[]= {"EN","v1.01","222"};
//		Settings settings=Settings.getInstance(keys, values);
//		Settings settings2=Settings.getInstance(keys2, values2);
//		settings.print();
//		settings2.print();
//		
//		settings.setValue("lang1", "RUS");
//		settings2.setValue("lang", "PL");
//		
//		settings.print();
//		settings2.print();
		for (int i = 0; i < 100; i++) {
			
			System.out.println(ClassA.getInstance().getX());;
		}
	}

}

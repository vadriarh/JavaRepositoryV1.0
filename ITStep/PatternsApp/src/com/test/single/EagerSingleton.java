package com.test.single;

import java.util.Date;

/**
 * 
 * EAGER initialization. - at the class loader time	  
 * @author st
 * 
 */

public class EagerSingleton {

	// field to hold single instance
	//Eager way
	private static EagerSingleton instance ;
	
	static {
		try {
			instance = new EagerSingleton();
		} catch (Exception e) {
			System.err.println("OOps!");
			
		}
	}
	public static String label="test";
	
	private EagerSingleton() {
		
		try {
			// make some job
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Eager Singleton instance was created ->" + new Date());
		// TODO Auto-generated constructor stub
	}

	// Other way to create instance
	public static EagerSingleton getInstance() {
		return instance;
	}

}

package com.test.single;

import java.util.Date;

public class Singleton {
	//field to hold single instance
	private static Singleton instance=null;
	
	/**
	 * 
	 * LAZY initialization.
	 * @author st
	 * 
	 */
	private Singleton() {
		try {
			//make some job
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Singleton instance was created ->"+new Date());
		// TODO Auto-generated constructor stub
	}
	
	//Other way to create instance
	public static Singleton getInstance() {
		if(instance==null) {
			instance=new Singleton();
		}
		return instance;
	}
}

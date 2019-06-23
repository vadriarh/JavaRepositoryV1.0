package com.test.single;

public class Settings {
	private static Settings instance=null;
	
	private String[] keys;
	private String[] values;
	
	private Settings(String[] keys, String[] values) {
		super();
		this.keys = keys;
		this.values = values;
	}
	
	public String getValue(String key) {
		int index=-1;
		for (int i = 0; i < keys.length; i++) {
			if(keys[i].equalsIgnoreCase(key)) {
				System.out.println("Key "+key+" found");
				index=i;
				break;
			}
		}
		if(index==-1) {
			System.out.println("Key is not found");
			return null;
		}else {
			return values[index];
		}
	}
	
	public void setValue(String key,String value) {
		boolean flag=false;
		for (int i = 0; i < keys.length; i++) {
			if(keys[i].equalsIgnoreCase(key)) {
				values[i]=value;
				System.out.println("Key "+key+" found");
				System.out.println("Value is entered");
				flag=true;
				break;
			}
		}
		if(!flag) {
			String[] newKeys=new String[keys.length+1];
			String[] newValue=new String[values.length+1];
			for (int i = 0; i < keys.length; i++) {
				newKeys[i]=keys[i];
				newValue[i]=values[i];
			}
			newKeys[keys.length]=key;
			newValue[values.length]=value;
			keys=newKeys;
			values=newValue;
			System.out.println("Key NOT found");
		}
		
	}
	
	public void print() {
		for (int i = 0; i < keys.length; i++) {
			System.out.println("Key["+keys[i]+":] -> "+values[i] );
		}
		System.out.println("============================");
	}
	
	public static Settings getInstance(String[] keys,String[] values) {
		if(instance==null) {
			instance=new Settings(keys, values);
		}
		return instance;		
	}


}

package com.test.factory.abs;



public class ElectronicStore {

	public static void build(ElectronicFactory factory) {
		Device d1 = factory.createLaptop();
		d1.info();
		Device d2 = factory.createTV();
		d2.info();
		Device d3 = factory.createMobilePhone();
		d3.info();
		Device d4 = factory.createSmartWatch();
		d4.info();
	}
	
	static ElectronicFactory getFactory(String key) {
		switch(key.toLowerCase()) {
		case "sony":
			return new SonyFactory();
		case "apple":
			return new AppleFactory();
			default:
				break;
		}
		return null;
	}
	
	public static void main(String[] args) {

		build(getFactory("SONY"));

	}

}

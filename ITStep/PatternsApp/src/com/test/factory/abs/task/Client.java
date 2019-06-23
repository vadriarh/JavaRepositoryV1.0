package com.test.factory.abs.task;


public class Client {
	static void build(GUIFactory factory) {
		Element el1=factory.createButton();
		el1.info();
		Element el2=factory.createCheckBox();
		el2.info();
		Element  el3= factory.createRadioButton();
		el3.info();
	}
 
	static GUIFactory getFactory(String key) {
		switch(key.toLowerCase()) {
		case "winosfactory":
			return new WinOSFactory();
		case "macosfactory":
			return new MacOSFactory();
		case "androidfactory":
			return new AndroidFactory();
			default:
				break;
		}
		return null;
	}
	public static void main(String[] args) {
		build(getFactory("RY"));
	}
}

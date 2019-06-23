package com.test.factory.abs.task;

public class WinOSFactory extends GUIFactory {

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new WinOSButton();
	}

	@Override
	public RadioButton createRadioButton() {
		// TODO Auto-generated method stub
		return new WinOSRadioButton();
	}

	@Override
	public CheckBox createCheckBox() {
		// TODO Auto-generated method stub
		return new WinOSCheckBox();
	}

}

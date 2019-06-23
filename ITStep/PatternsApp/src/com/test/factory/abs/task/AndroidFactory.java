package com.test.factory.abs.task;

public class AndroidFactory extends GUIFactory {

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new AndroidButton();
	}

	@Override
	public RadioButton createRadioButton() {
		// TODO Auto-generated method stub
		return new AndroidRadioButton();
	}

	@Override
	public CheckBox createCheckBox() {
		// TODO Auto-generated method stub
		return new AndroidCheckBox();
	}

}

package com.test.factory.abs.task;

public class MacOSFactory extends GUIFactory {

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new MacOSButton();
	}

	@Override
	public RadioButton createRadioButton() {
		// TODO Auto-generated method stub
		return new MacOSRadioButton();
	}

	@Override
	public CheckBox createCheckBox() {
		// TODO Auto-generated method stub
		return new MacOSCheckBox();
	}

}

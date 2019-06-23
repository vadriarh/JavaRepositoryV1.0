package com.pass;

import javax.swing.JComponent;

public class Utils {
	public static void showComponents(boolean flag, JComponent... c) {
		for (JComponent jComponent : c) {
			jComponent.setVisible(flag);
		}
	}
}

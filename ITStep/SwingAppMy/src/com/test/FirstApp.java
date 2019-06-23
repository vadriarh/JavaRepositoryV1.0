package com.test;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FirstApp {

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		frame.setTitle("Hello");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setBounds(200, 300, 400, 400);

		JLabel lable = new JLabel();
		lable.setText("Some text here!");
		lable.setBounds(50, 50, 100, 10);

		JButton button = new JButton();
		button.setText("Push me!");
		button.setBounds(100, 100, 140, 25);

		frame.add(lable);
		frame.add(button);

	}

}

package com.test;

import java.awt.LayoutManager;

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
		lable.setBounds(50, 50, 170, 20);
		frame.add(lable);

		JButton button = new JButton();
		button.setText("Push me!");

		button.setBounds(50, 150, 90, 20);
		frame.add(button);

	}

}

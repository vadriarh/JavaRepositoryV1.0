package com.test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField textFieldUserName;
	private JLabel lblNewLabel_1;
	private JLabel status;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		String use_name = "ADMIN";
		String use_passw = "12345678";
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 250, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("PASSWORD");
		lblNewLabel.setBounds(43, 94, 57, 14);
		contentPane.add(lblNewLabel);

		passwordField = new JPasswordField();
		passwordField.setBounds(111, 91, 86, 20);
		contentPane.add(passwordField);

		textFieldUserName = new JTextField();
		textFieldUserName.setBounds(111, 67, 86, 20);
		contentPane.add(textFieldUserName);
		textFieldUserName.setColumns(10);

		JLabel name = new JLabel("USERNAME");
		name.setBounds(43, 70, 57, 14);
		contentPane.add(name);

		JButton buttonLogin = new JButton("LOGIN");

		buttonLogin.setBounds(78, 136, 89, 23);
		contentPane.add(buttonLogin);

		lblNewLabel_1 = new JLabel("WELCOME IN CRAZY USERS APP!!!");
		lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 10));
		lblNewLabel_1.setBounds(27, 11, 196, 29);
		contentPane.add(lblNewLabel_1);

		status = new JLabel("");
		status.setFont(new Font("Tahoma", Font.BOLD, 11));
		status.setForeground(Color.RED);
		status.setBounds(37, 42, 191, 14);
		contentPane.add(status);

		buttonLogin.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				status.setForeground(Color.RED);
				if (textFieldUserName.getText().equalsIgnoreCase(use_name)
						&& passwordField.getText().equals(use_passw)) {
					status.setForeground(Color.GREEN);
					status.setText("Welcome back.");
					EmplManagerFrame frame = new EmplManagerFrame();
					frame.setVisible(true);
					setVisible(false);
				} else if (!textFieldUserName.getText().equalsIgnoreCase(use_name)
						&& !passwordField.getText().equals(use_passw)) {
					status.setText("Incorrect password and user");
				} else if (!textFieldUserName.getText().equalsIgnoreCase(use_name)
						&& passwordField.getText().equals(use_passw)) {
					status.setText("Incorrect user");
				} else if (textFieldUserName.getText().equalsIgnoreCase(use_name)
						&& !passwordField.getText().equals(use_passw)) {
					status.setText("Incorrect password");
				}
				contentPane.add(status);
			}
		});
	}
}

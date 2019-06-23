package com.test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField name;

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

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 250, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		passwordField = new JPasswordField();
		passwordField.setBounds(81, 111, 88, 20);
		contentPane.add(passwordField);

		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setBounds(20, 114, 68, 14);
		contentPane.add(lblPassword);

		name = new JTextField();
		name.setBounds(83, 80, 86, 20);
		contentPane.add(name);
		name.setColumns(10);

		JLabel lblLogin = new JLabel("NAME");
		lblLogin.setBounds(20, 83, 46, 14);
		contentPane.add(lblLogin);

		JButton btnLogin = new JButton("LOGIN");

		btnLogin.setBounds(82, 142, 89, 23);
		contentPane.add(btnLogin);

		JLabel lblWelcomeInCrazy = new JLabel("WELCOME IN CRAZY USERS APP!");
		lblWelcomeInCrazy.setFont(new Font("Myriad Hebrew", Font.BOLD, 14));
		lblWelcomeInCrazy.setBounds(10, 23, 214, 14);
		contentPane.add(lblWelcomeInCrazy);

		JLabel status = new JLabel("");
		status.setFont(new Font("Tahoma", Font.BOLD, 11));
		status.setForeground(Color.RED);
		status.setBounds(10, 48, 214, 14);
		contentPane.add(status);

		String user_name = "ADMIN";
		String user_pass = "12345678";

		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (name.getText().trim().equalsIgnoreCase(user_name)) {
					if (passwordField.getText().trim().equals(user_pass)) {
						status.setText("Welcome back, Dear " + user_name);
						EmplManagerFrame frame = new EmplManagerFrame();

						frame.setVisible(true);
						setVisible(false);
					} else {
						status.setText("Incorrect password!");
					}
				} else {
					status.setText("Incorrect login!");
				}
			}
		});
	}
}

package com.pass;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class PassStoreApp extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField name_1;
	private JTextField name_2;
	private JTextField name_3;
	private JTextField name_4;
	private JTextField name_5;
	private JTextField name_6;
	private JTextField name_7;
	private JTextField name_8;
	private JTextField name_9;
	private JTextField name_10;
	private JTextField login_1;
	private JTextField login_2;
	private JTextField login_3;
	private JTextField login_4;
	private JTextField login_5;

	private JTextField login_6;
	private JTextField login_7;
	private JTextField login_8;
	private JTextField login_9;
	private JTextField login_10;
	private JPasswordField passwordField_1;
	private JPasswordField passwordField_2;
	private JPasswordField passwordField_3;
	private JPasswordField passwordField_4;
	private JPasswordField passwordField_5;
	private JPasswordField passwordField_6;
	private JPasswordField passwordField_7;
	private JPasswordField passwordField_8;
	private JPasswordField passwordField_9;
	private JPasswordField passwordField_10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PassStoreApp frame = new PassStoreApp();
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
	public PassStoreApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 307);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblEnterPassword = new JLabel("ENTER PASSWORD");
		lblEnterPassword.setBounds(149, 111, 112, 28);
		lblEnterPassword.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblEnterPassword);

		JButton btnNewButton = new JButton("LOGIN");
		passwordField = new JPasswordField();
		passwordField.setBounds(149, 142, 109, 14);
		contentPane.add(passwordField);
		contentPane.add(btnNewButton);

		name_1 = new JTextField();
		name_1.setBounds(7, 11, 86, 20);
		contentPane.add(name_1);
		name_1.setColumns(10);

		name_2 = new JTextField();
		name_2.setBounds(6, 38, 86, 20);
		contentPane.add(name_2);
		name_2.setColumns(10);

		name_3 = new JTextField();
		name_3.setColumns(10);
		name_3.setBounds(7, 64, 86, 20);
		contentPane.add(name_3);

		name_4 = new JTextField();
		name_4.setColumns(10);
		name_4.setBounds(7, 91, 86, 20);
		contentPane.add(name_4);

		name_5 = new JTextField();
		name_5.setColumns(10);
		name_5.setBounds(7, 115, 86, 20);
		contentPane.add(name_5);

		name_6 = new JTextField();
		name_6.setColumns(10);
		name_6.setBounds(7, 142, 86, 20);
		contentPane.add(name_6);

		name_7 = new JTextField();
		name_7.setColumns(10);
		name_7.setBounds(7, 166, 86, 20);
		contentPane.add(name_7);

		name_8 = new JTextField();
		name_8.setColumns(10);
		name_8.setBounds(7, 194, 86, 20);
		contentPane.add(name_8);

		name_9 = new JTextField();
		name_9.setColumns(10);
		name_9.setBounds(7, 218, 86, 20);
		contentPane.add(name_9);

		name_10 = new JTextField();
		name_10.setColumns(10);
		name_10.setBounds(7, 244, 86, 20);
		contentPane.add(name_10);

		login_1 = new JTextField();
		login_1.setColumns(10);
		login_1.setBounds(98, 11, 86, 20);
		contentPane.add(login_1);

		login_2 = new JTextField();
		login_2.setColumns(10);
		login_2.setBounds(98, 38, 86, 20);
		contentPane.add(login_2);

		login_3 = new JTextField();
		login_3.setColumns(10);
		login_3.setBounds(98, 64, 86, 20);
		contentPane.add(login_3);

		login_4 = new JTextField();
		login_4.setColumns(10);
		login_4.setBounds(97, 91, 86, 20);
		contentPane.add(login_4);

		login_5 = new JTextField();
		login_5.setColumns(10);
		login_5.setBounds(98, 115, 86, 20);
		contentPane.add(login_5);

		login_6 = new JTextField();
		login_6.setColumns(10);
		login_6.setBounds(97, 142, 86, 20);
		contentPane.add(login_6);

		login_7 = new JTextField();
		login_7.setColumns(10);
		login_7.setBounds(96, 166, 86, 20);
		contentPane.add(login_7);

		login_8 = new JTextField();
		login_8.setColumns(10);
		login_8.setBounds(95, 193, 86, 20);
		contentPane.add(login_8);

		login_9 = new JTextField();
		login_9.setColumns(10);
		login_9.setBounds(96, 217, 86, 20);
		contentPane.add(login_9);

		login_10 = new JTextField();
		login_10.setColumns(10);
		login_10.setBounds(95, 244, 86, 20);
		contentPane.add(login_10);

		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(192, 10, 105, 20);
		contentPane.add(passwordField_1);

		passwordField_2 = new JPasswordField();
		passwordField_2.setBounds(190, 38, 105, 20);
		contentPane.add(passwordField_2);

		passwordField_3 = new JPasswordField();
		passwordField_3.setBounds(189, 64, 105, 20);
		contentPane.add(passwordField_3);

		passwordField_4 = new JPasswordField();
		passwordField_4.setBounds(190, 91, 105, 20);
		contentPane.add(passwordField_4);

		passwordField_5 = new JPasswordField();
		passwordField_5.setBounds(189, 117, 105, 20);
		contentPane.add(passwordField_5);

		passwordField_6 = new JPasswordField();
		passwordField_6.setBounds(189, 142, 105, 20);
		contentPane.add(passwordField_6);

		passwordField_7 = new JPasswordField();
		passwordField_7.setBounds(188, 168, 105, 20);
		contentPane.add(passwordField_7);

		passwordField_8 = new JPasswordField();
		passwordField_8.setBounds(188, 193, 105, 20);
		contentPane.add(passwordField_8);

		passwordField_9 = new JPasswordField();
		passwordField_9.setBounds(187, 219, 105, 20);
		contentPane.add(passwordField_9);

		passwordField_10 = new JPasswordField();
		passwordField_10.setBounds(186, 244, 105, 20);
		contentPane.add(passwordField_10);

		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.setBounds(326, 10, 89, 23);
		contentPane.add(btnUpdate);

		JButton btnRemove = new JButton("REMOVE");
		btnRemove.setForeground(Color.RED);
		btnRemove.setBounds(326, 37, 89, 23);
		contentPane.add(btnRemove);

		JButton btnAdd = new JButton("ADD");
		btnAdd.setBounds(326, 63, 89, 23);
		contentPane.add(btnAdd);

		// hide
		Utils.showComponents(false, name_1, name_2, name_3, name_4, name_5, name_6, name_7, name_8, name_9, name_10,
				login_1, login_2, login_3, login_4, login_5, login_6, login_7, login_8, login_9, login_10,
				passwordField_1, passwordField_2, passwordField_3, passwordField_4, passwordField_5, passwordField_6,
				passwordField_7, passwordField_8, passwordField_9, passwordField_10
		);

		btnNewButton.setBounds(149, 167, 101, 14);
		btnNewButton.addActionListener(new ActionListener() {
			//TODO
			@SuppressWarnings("deprecation")
		
			public void actionPerformed(ActionEvent e) {
				if (passwordField.getText().equals("123")) {

					// show
					Utils.showComponents(true, name_1, name_2, name_3, name_4, name_5, name_6, name_7, name_8, name_9,
							name_10, login_1, login_2, login_3, login_4, login_5, login_6, login_7, login_8, login_9,
							login_10, passwordField_1, passwordField_2, passwordField_3, passwordField_4,
							passwordField_5, passwordField_6, passwordField_7, passwordField_8, passwordField_9,
							passwordField_10);
					Utils.showComponents(false, lblEnterPassword, btnNewButton, passwordField);

				}
			}
		});
	}
}

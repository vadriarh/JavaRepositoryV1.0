package com.test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import java.awt.Choice;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EmplManagerFrame extends JFrame {

	private JPanel contentPane;
	private JTextField l_name_text;
	private JTextField name_text;
	private JTextField uid_text;
	private JTextField company_text;
	private JTextField job_pos_text;
	private JTextField age_text;
	private JTextField salary_text;
	private JTextField textField;

	private int current_index = 0;

	/**
	 * DATA
	 */
	private Employee[] data = Util.generateEmployees(10);

	private void loadEmpl(int index) {
		Employee empl = data[index];
		l_name_text.setText(empl.getLastName());
		name_text.setText(empl.getName());
		uid_text.setText(empl.getUid() + "");
		company_text.setText(empl.getCompanyName());
		job_pos_text.setText(empl.getJobPosition());
		age_text.setText(empl.getAge() + "");
		salary_text.setText(empl.getSalary() + "");
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmplManagerFrame frame = new EmplManagerFrame();
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
	public EmplManagerFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		l_name_text = new JTextField();
		l_name_text.setBounds(84, 78, 86, 20);
		contentPane.add(l_name_text);
		l_name_text.setColumns(10);
		JButton next = new JButton(">");
		next.setBounds(51, 190, 41, 23);
		contentPane.add(next);

		JButton previous = new JButton("<");

		previous.setBounds(10, 190, 41, 23);
		contentPane.add(previous);

		name_text = new JTextField();
		name_text.setBounds(84, 57, 86, 20);
		contentPane.add(name_text);
		name_text.setColumns(10);

		uid_text = new JTextField();
		uid_text.setEditable(false);
		uid_text.setBounds(84, 40, 86, 20);
		contentPane.add(uid_text);
		uid_text.setColumns(10);

		company_text = new JTextField();
		company_text.setBounds(84, 98, 86, 20);
		contentPane.add(company_text);
		company_text.setColumns(10);

		job_pos_text = new JTextField();
		job_pos_text.setBounds(84, 118, 86, 20);
		contentPane.add(job_pos_text);
		job_pos_text.setColumns(10);

		age_text = new JTextField();
		age_text.setBounds(84, 140, 86, 20);
		contentPane.add(age_text);
		age_text.setColumns(10);

		salary_text = new JTextField();
		salary_text.setBounds(84, 159, 86, 20);
		contentPane.add(salary_text);
		salary_text.setColumns(10);

		JLabel lblNewLabel = new JLabel("UID");
		lblNewLabel.setBounds(28, 43, 46, 14);
		contentPane.add(lblNewLabel);

		JLabel lblName = new JLabel("NAME");
		lblName.setBounds(28, 60, 46, 14);
		contentPane.add(lblName);

		JLabel lblLastName = new JLabel("LNAME");
		lblLastName.setBounds(28, 81, 46, 14);
		contentPane.add(lblLastName);

		JLabel lblCimpany = new JLabel("CNAME");
		lblCimpany.setBounds(25, 101, 63, 14);
		contentPane.add(lblCimpany);

		JLabel lblJp = new JLabel("JP");
		lblJp.setBounds(28, 121, 46, 14);
		contentPane.add(lblJp);

		JLabel lblAge = new JLabel("AGE");
		lblAge.setBounds(28, 143, 46, 14);
		contentPane.add(lblAge);

		JLabel lblSalary = new JLabel("SALARY");
		lblSalary.setBounds(28, 162, 46, 14);
		contentPane.add(lblSalary);

		JButton btnLogout = new JButton("LOGOUT");
		btnLogout.setBounds(177, 34, 89, 23);
		contentPane.add(btnLogout);

		JButton btnNewButton = new JButton("UPDATE");
		btnNewButton.setBounds(96, 190, 77, 23);
		contentPane.add(btnNewButton);

		JButton btnDelete = new JButton("DELETE");
		btnDelete.setBounds(177, 227, 89, 23);
		contentPane.add(btnDelete);

		JButton btnNewButton_1 = new JButton("ADD");
		btnNewButton_1.setBounds(177, 190, 89, 23);
		contentPane.add(btnNewButton_1);

		textField = new JTextField();
		textField.setBounds(44, 5, 63, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		JButton btnSearch = new JButton("SEARCH");
		btnSearch.setBounds(110, 4, 77, 23);
		contentPane.add(btnSearch);

		Choice choice = new Choice();
		choice.setBounds(10, 5, 28, 20);
		contentPane.add(choice);

		/// LOGIC
		// load first Empl
		loadEmpl(current_index);

		// NEXT button click
		next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (data.length - 1 != current_index) {
					current_index++;
					loadEmpl(current_index);

				}
			}
		});

		// previous button click
		previous.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (current_index != 0) {
					current_index--;
					loadEmpl(current_index);
				}
			}
		});

	}
}

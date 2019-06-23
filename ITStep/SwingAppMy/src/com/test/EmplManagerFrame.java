package com.test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.test.utils.Constants;
import com.test.utils.MailUtils;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Choice;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class EmplManagerFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField l_name;
	private JTextField name;
	private JTextField uid;
	private JTextField age;
	private JTextField companyName;
	private JTextField jobPosition;
	private JTextField salary;
	private JTextField textField_search_Val;
	private int current_index = 0;

	private Employee[] data = Util.generateEmployees(10);
	private Employee[] tempData;
	private JTextField email;
	private JTextField field_subject;
	private JTextField field_message;

	/**
	 * Launch the application.
	 */

	private void load_empl(int index) {
		Employee empl = data[index];
		l_name.setText(empl.getLastName());
		name.setText(empl.getName());
		age.setText(empl.getAge() + "");
		uid.setText(empl.getUid() + "");
		jobPosition.setText(empl.getJobPosition());
		companyName.setText(empl.getCompanyName());
		salary.setText(empl.getSalary() + "");
		email.setText(empl.getEmail());
	}

	private void save_empl(Employee empl) {
		empl.setAge(Integer.valueOf(age.getText()));
		empl.setCompanyName(companyName.getText());
		empl.setJobPosition(jobPosition.getText());
		empl.setLastName(l_name.getText());
		empl.setName(name.getText());
		empl.setSalary(Double.valueOf(salary.getText()));
		empl.setEmail(email.getText());
	}

	private void showMessageUpdate(boolean flag, JLabel message) {
		message.setVisible(true);
		if (flag) {
			message.setText("Employee UPDATE");
		} else {
			message.setText("NO CHANGE");
		}
	}

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
		setBounds(100, 100, 520, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		l_name = new JTextField();
		l_name.setBounds(97, 73, 120, 20);
		contentPane.add(l_name);
		l_name.setColumns(10);

		JButton buttonPrevious = new JButton("<");
		buttonPrevious.setBounds(30, 255, 89, 23);
		buttonPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(buttonPrevious);

		JButton buttonNext = new JButton(">");
		buttonNext.setBounds(129, 255, 89, 23);
		contentPane.add(buttonNext);

		JLabel lblNewLabel = new JLabel("Last name");
		lblNewLabel.setBounds(22, 73, 65, 15);
		contentPane.add(lblNewLabel);

		JButton buttonAddEmployee = new JButton("Add");
		buttonAddEmployee.setBounds(57, 285, 89, 23);
		contentPane.add(buttonAddEmployee);

		JButton buttonRemoveEmployee = new JButton("Remove");
		buttonRemoveEmployee.setBounds(156, 285, 89, 23);
		contentPane.add(buttonRemoveEmployee);

		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setBounds(22, 45, 65, 15);
		contentPane.add(lblNewLabel_1);

		name = new JTextField();
		name.setBounds(97, 45, 120, 20);
		contentPane.add(name);
		name.setColumns(10);

		JLabel lblUid = new JLabel("UID");
		lblUid.setBounds(22, 17, 65, 15);
		contentPane.add(lblUid);

		uid = new JTextField();
		uid.setBounds(97, 17, 120, 20);
		uid.setEditable(false);
		uid.setColumns(10);
		contentPane.add(uid);

		JLabel lblAge = new JLabel("Age");
		lblAge.setBounds(22, 101, 65, 15);
		contentPane.add(lblAge);

		age = new JTextField();
		age.setBounds(97, 101, 120, 20);
		age.setColumns(10);
		contentPane.add(age);

		JLabel lblCompany = new JLabel("Company");
		lblCompany.setBounds(22, 129, 65, 15);
		contentPane.add(lblCompany);

		companyName = new JTextField();
		companyName.setBounds(97, 129, 120, 20);
		companyName.setColumns(10);
		contentPane.add(companyName);

		JLabel lblJobPosition = new JLabel("Job Position");
		lblJobPosition.setBounds(22, 157, 65, 15);
		contentPane.add(lblJobPosition);

		jobPosition = new JTextField();
		jobPosition.setBounds(97, 157, 120, 20);
		jobPosition.setColumns(10);
		contentPane.add(jobPosition);

		JLabel lblSalary = new JLabel("Salary");
		lblSalary.setBounds(22, 185, 65, 15);
		contentPane.add(lblSalary);

		salary = new JTextField();
		salary.setBounds(97, 185, 120, 20);
		salary.setColumns(10);
		contentPane.add(salary);

		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(228, 255, 89, 23);
		contentPane.add(btnUpdate);

		textField_search_Val = new JTextField();
		textField_search_Val.setBounds(240, 45, 144, 20);
		contentPane.add(textField_search_Val);
		textField_search_Val.setColumns(10);

		Choice choice = new Choice();
		choice.setBounds(390, 45, 100, 20);
		choice.add("Name");
		choice.add("Last Name");
		choice.add("Age");
		choice.add("Company Name");
		choice.add("Job Position");
		choice.add("Salary");
		choice.add("Em@il");
		contentPane.add(choice);

		JLabel messageRemove = new JLabel("The last employye");
		messageRemove.setBounds(284, 283, 149, 23);
		messageRemove.setEnabled(false);
		messageRemove.setVisible(false);
		messageRemove.setBackground(Color.WHITE);
		messageRemove.setFont(new Font("Tahoma", Font.BOLD, 15));
		messageRemove.setForeground(Color.RED);
		contentPane.add(messageRemove);

		JLabel messageUpdate = new JLabel();
		messageUpdate.setBounds(228, 230, 105, 14);
		messageUpdate.setVisible(false);
		contentPane.add(messageUpdate);

		JButton send_email = new JButton("Send Email");
		send_email.setBounds(327, 255, 106, 23);
		contentPane.add(send_email);

		JLabel emailLabel = new JLabel("Email");
		emailLabel.setBounds(22, 219, 65, 15);
		contentPane.add(emailLabel);

		email = new JTextField();
		email.setBounds(97, 219, 120, 20);
		email.setText("1619.5");
		email.setColumns(10);
		contentPane.add(email);

		field_subject = new JTextField();
		field_subject.setBounds(240, 98, 235, 20);
		contentPane.add(field_subject);
		field_subject.setColumns(10);

		field_message = new JTextField();
		field_message.setBounds(240, 145, 235, 94);
		contentPane.add(field_message);
		field_message.setColumns(10);

		JLabel lblSubject = new JLabel("Subject");
		lblSubject.setBounds(240, 76, 46, 14);
		contentPane.add(lblSubject);

		JLabel lblMessage = new JLabel("Message");
		lblMessage.setBounds(240, 129, 46, 14);
		contentPane.add(lblMessage);

		JButton btn_logout = new JButton("LOGOUT");
		btn_logout.setBounds(401, 13, 89, 23);
		contentPane.add(btn_logout);

		JLabel lbl_msg_status = new JLabel("");
		lbl_msg_status.setBounds(370, 129, 105, 14);
		contentPane.add(lbl_msg_status);

		JButton btn_Search = new JButton("Search");

		btn_Search.setBounds(240, 16, 79, 23);
		contentPane.add(btn_Search);

		JButton btn_Clear = new JButton("Clear");

		btn_Clear.setBounds(326, 16, 65, 23);
		contentPane.add(btn_Clear);

		// logic

		load_empl(0);

		buttonNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				messageUpdate.setVisible(false);
				if (current_index < data.length - 1) {
					current_index++;
					load_empl(current_index);
				}

			}
		});

		buttonPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				messageUpdate.setVisible(false);
				if (current_index != 0) {
					current_index--;
					load_empl(current_index);
				}
			}
		});

		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				messageUpdate.setVisible(false);
				Employee emplTemp = new Employee();
				save_empl(emplTemp);
				int result[] = Util.equalsEmployee(emplTemp, data[current_index]);
				if (result != null) {
					if (result[0] == 1) {
						data[current_index].setAge(emplTemp.getAge());
					}
					if (result[1] == 1) {
						data[current_index].setName(emplTemp.getName());
					}
					if (result[2] == 1) {
						data[current_index].setLastName(emplTemp.getLastName());
					}
					if (result[3] == 1) {
						data[current_index].setJobPosition(emplTemp.getJobPosition());
					}
					if (result[4] == 1) {
						data[current_index].setCompanyName(emplTemp.getCompanyName());
					}
					if (result[5] == 1) {
						data[current_index].setSalary(emplTemp.getSalary());
					}
					showMessageUpdate(true, messageUpdate);
				} else {
					showMessageUpdate(false, messageUpdate);
				}

			}
		});

		buttonAddEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				messageUpdate.setVisible(false);
				messageRemove.setEnabled(false);
				messageRemove.setVisible(false);
//				Employee emplTemp=new Employee();
//				save_empl(emplTemp);
//				for (int i = 0; i < data.length; i++) {
//					int result[]=Util.equalsEmployee(emplTemp, data[i]);
//					if(result==null) {
//						
//						break;
//					}
//				}
				Employee[] newData = new Employee[data.length + 1];
				for (int i = 0; i < data.length; i++) {
					newData[i] = data[i];
				}
				newData[data.length] = new Employee();
				long maxUid = 0;
				for (int i = 0; i < data.length; i++) {
					if (maxUid < data[i].getUid()) {
						maxUid = data[i].getUid();
					}
				}
				newData[data.length].setUid(maxUid + 1);
				save_empl(newData[data.length]);
				data = newData;
				current_index = data.length - 1;
				load_empl(current_index);
			}
		});

		buttonRemoveEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (data.length != 1) {
					messageUpdate.setVisible(false);
					messageRemove.setEnabled(true);
					messageRemove.setVisible(false);
					Employee[] newData = new Employee[data.length - 1];
					for (int i = 0, j = 0; i < data.length; i++, j++) {
						if (i == current_index) {
							j--;
							continue;
						}
						newData[j] = data[i];
					}
					data = newData;
					if (current_index != 0) {
						load_empl(--current_index);
					} else {
						load_empl(current_index);
					}

				} else {
					messageRemove.setEnabled(true);
					messageRemove.setVisible(true);
				}
			}
		});

		send_email.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (MailUtils.isEmailValid(email.getText())) {
					try {
						MailUtils.send(Constants.GMAIL_ID, Constants.GMAIL_PAS, email.getText(),
								field_subject.getText(), field_message.getText());
						lbl_msg_status.setText(Constants.EMAIL_STATUS_OK);
					} catch (Exception e) {
						lbl_msg_status.setText(Constants.EMAIL_STATUS_ERROR);
					}
				} else {
					lbl_msg_status.setText(Constants.EMAIL_STATUS_ERROR);
				}
			}
		});

		btn_logout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login frame = new Login();
				frame.setVisible(true);
				setVisible(false);

			}
		});

		btn_Search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tempData = data;
				data = Util.searchEmployees(data, choice.getSelectedItem(), textField_search_Val.getText().trim());
				current_index = 0;
				load_empl(0);

			}
		});

		btn_Clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				data = tempData;
				load_empl(0);

			}
		});
	}
}

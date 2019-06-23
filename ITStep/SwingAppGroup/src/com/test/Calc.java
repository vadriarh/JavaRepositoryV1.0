package com.test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calc extends JFrame {

	private JPanel contentPane;
	private JTextField a;
	private JTextField b;
	private JTextField a2;
	private JTextField b2;
	private JTextField r1;
	private JTextField r2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc frame = new Calc();
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
	public Calc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		a = new JTextField();
		a.setText("0");
		a.setBounds(26, 39, 86, 20);
		contentPane.add(a);
		a.setColumns(10);

		b = new JTextField();
		b.setText("0");
		b.setBounds(134, 39, 86, 20);
		contentPane.add(b);
		b.setColumns(10);

		a2 = new JTextField();
		a2.setText("0");
		a2.setBounds(26, 81, 86, 20);
		contentPane.add(a2);
		a2.setColumns(10);

		b2 = new JTextField();
		b2.setText("0");
		b2.setBounds(134, 81, 86, 20);
		contentPane.add(b2);
		b2.setColumns(10);

		r1 = new JTextField();
		r1.setBounds(246, 39, 86, 20);
		contentPane.add(r1);
		r1.setColumns(10);

		r2 = new JTextField();
		r2.setBounds(246, 81, 86, 20);
		contentPane.add(r2);
		r2.setColumns(10);

		JButton calc = new JButton("CALCULATE");
		calc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("CALCULATING");
				double a_val = Double.parseDouble(a.getText());
				double b_val = Double.parseDouble(b.getText());

				double a2_val = Double.parseDouble(a2.getText());
				double b2_val = Double.parseDouble(b2.getText());

				r1.setText((a_val + b_val) + "");
				r2.setText((a2_val - b2_val) + "");
			}
		});
		calc.setBounds(26, 127, 89, 23);
		contentPane.add(calc);

		JButton clear = new JButton("CLEAR");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				a.setText("0.0");
				b.setText("0.0");
				a2.setText("0.0");
				b2.setText("0.0");
				r1.setText("0.0");
				r2.setText("0.0");
			}
		});
		clear.setBounds(335, 11, 89, 23);
		contentPane.add(clear);

		JLabel lblNewLabel = new JLabel("+");
		lblNewLabel.setBounds(118, 42, 15, 14);
		contentPane.add(lblNewLabel);

		JLabel label = new JLabel("-");
		label.setBounds(122, 84, 11, 14);
		contentPane.add(label);

		JLabel label_1 = new JLabel("=");
		label_1.setBounds(226, 42, 15, 14);
		contentPane.add(label_1);

		JLabel label_2 = new JLabel("=");
		label_2.setBounds(226, 84, 15, 14);
		contentPane.add(label_2);
	}
}

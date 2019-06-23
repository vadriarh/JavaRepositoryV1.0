package com.test;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calc extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField a1;
	private JTextField b1;
	private JTextField a2;
	private JTextField b2;
	private JButton clear;
	private JLabel label_2;
	private JLabel label_3;

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

		a1 = new JTextField();
		a1.setText("0");
		a1.setBounds(10, 19, 86, 20);
		contentPane.add(a1);
		a1.setColumns(10);

		b1 = new JTextField();
		b1.setText("0");
		b1.setBounds(123, 19, 86, 20);
		contentPane.add(b1);
		b1.setColumns(10);

		JLabel c1 = new JLabel("0");
		c1.setBounds(240, 22, 46, 14);
		contentPane.add(c1);

		a2 = new JTextField();
		a2.setText("0");
		a2.setColumns(10);
		a2.setBounds(10, 67, 86, 20);
		contentPane.add(a2);

		b2 = new JTextField();
		b2.setText("0");
		b2.setColumns(10);
		b2.setBounds(122, 67, 86, 20);
		contentPane.add(b2);

		JLabel c2 = new JLabel("0");
		c2.setBounds(240, 67, 46, 14);
		contentPane.add(c2);

		JButton calc = new JButton("Calculate");
		calc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Calculating");
				c1.setText((Double.parseDouble(a1.getText()) + Double.parseDouble(b1.getText())) + "");
				c2.setText((Double.parseDouble(a2.getText()) - Double.parseDouble(b2.getText())) + "");
			}
		});
		calc.setBounds(61, 123, 89, 23);
		contentPane.add(calc);

		clear = new JButton("Clear");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				a1.setText("0");
				a2.setText("0");
				b1.setText("0");
				b2.setText("0");
				c1.setText("0.0");
				c2.setText("0.0");

			}
		});
		clear.setBounds(317, 18, 89, 23);
		contentPane.add(clear);

		JLabel label = new JLabel("+");
		label.setBounds(104, 22, 14, 14);
		contentPane.add(label);

		JLabel label_1 = new JLabel("-");
		label_1.setBounds(106, 71, 14, 12);
		contentPane.add(label_1);

		label_2 = new JLabel("=");
		label_2.setBounds(219, 22, 14, 14);
		contentPane.add(label_2);

		label_3 = new JLabel("=");
		label_3.setBounds(220, 68, 14, 14);
		contentPane.add(label_3);
	}
}

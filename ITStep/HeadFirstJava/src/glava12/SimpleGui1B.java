package glava12;

import java.awt.event.*;

import javax.swing.*;

public class SimpleGui1B implements ActionListener {

	JButton button;

	public static void main(String[] args) {
		SimpleGui1B gui = new SimpleGui1B();
		gui.go();

	}

	public void go() {
		JFrame frame = new JFrame();
		button = new JButton("click me");

		button.addActionListener(this);

		frame.getContentPane().add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		button.setText("I've been clicked");
	}
}

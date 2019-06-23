package glava12;

import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class SimpleGui3c implements ActionListener{
	JFrame frame;
	public static void main(String[] args) {
		SimpleGui3c gui=new SimpleGui3c();
		gui.go();
		
	}

	public void go() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton button=new JButton("Change colors");
		button.addActionListener(this);
		
		MyDrawPanel drawPanel=new MyDrawPanel();
		
		frame.getContentPane().add(BorderLayout.SOUTH,button);
		frame.getContentPane().add(BorderLayout.CENTER,drawPanel);
		frame.setSize(300,300);
		frame.setVisible(true);
		

	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		frame.repaint();
	}
}
class MyDrawPanel extends JPanel{
	public void paintComponent(Graphics g) {
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		int red=(int)(Math.random()*255);
		int green=(int)(Math.random()*255);
		int blue=(int)(Math.random()*255);
		
		Color randomColor=new Color(red,green,blue);
		g.setColor(randomColor);
		g.fillOval((int)(Math.random()*this.getWidth()), (int)(Math.random()*this.getHeight()), (int)(Math.random()*100), (int)(Math.random()*100));
	}
}

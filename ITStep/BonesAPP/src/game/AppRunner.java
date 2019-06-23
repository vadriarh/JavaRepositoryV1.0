package game;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppRunner extends JFrame {
	private static final long serialVersionUID = 1L;
	static int countPlayer1 = 0, countPlayer2 = 0, circle = 1;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppRunner frame = new AppRunner();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public AppRunner() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnShake = new JButton("Shake");

		btnShake.setBounds(70, 471, 90, 40);
		contentPane.add(btnShake);

		JLabel lbl1_1 = new JLabel("");
		lbl1_1.setBounds(70, 62, 140, 140);
		contentPane.add(lbl1_1);

		JLabel lbl1_2 = new JLabel("");
		lbl1_2.setBounds(70, 239, 140, 140);
		contentPane.add(lbl1_2);

		JLabel lbl2_1 = new JLabel("");
		lbl2_1.setBounds(400, 62, 140, 140);
		contentPane.add(lbl2_1);

		JLabel lbl2_2 = new JLabel("");
		lbl2_2.setBounds(400, 239, 140, 140);
		contentPane.add(lbl2_2);

		JLabel lblTotalCostPlayer1 = new JLabel("");
		lblTotalCostPlayer1.setBounds(42, 416, 168, 14);
		contentPane.add(lblTotalCostPlayer1);

		JLabel lblTotalCostPlayer2 = new JLabel("");
		lblTotalCostPlayer2.setBounds(417, 416, 168, 14);
		contentPane.add(lblTotalCostPlayer2);

		JLabel lblCircle = new JLabel("");
		lblCircle.setBounds(264, 416, 104, 14);
		contentPane.add(lblCircle);

		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(252, 480, 89, 23);
		btnReset.setVisible(false);
		contentPane.add(btnReset);

		JLabel lblWinner = new JLabel("");
		lblWinner.setBounds(237, 221, 131, 14);
		contentPane.add(lblWinner);

		btnShake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				countPlayer1 += countAndSet(countPlayer1, lbl1_1);
				countPlayer1 += countAndSet(countPlayer1, lbl1_2);
				countPlayer2 += countAndSet(countPlayer2, lbl2_1);
				countPlayer2 += countAndSet(countPlayer2, lbl2_2);
				lblTotalCostPlayer1.setText("Result of Player#1: " + countPlayer1);
				lblTotalCostPlayer2.setText("Result of Player#2: " + countPlayer2);
				lblCircle.setText("Circle: " + circle);
				circle++;
				if (circle == 6) {
					lblWinner.setVisible(true);
					btnReset.setVisible(true);
					btnShake.setVisible(false);
					lblTotalCostPlayer1.setText("Final result of Player#1: " + countPlayer1);
					lblTotalCostPlayer2.setText("Final result of Player#2: " + countPlayer2);
					if (countPlayer1 > countPlayer2) {
						lblWinner.setText("Player#1 winner");
					} else if (countPlayer1 < countPlayer2) {
						lblWinner.setText("Player#2 winner");
					} else {
						lblWinner.setText("DRAW");
					}
				}
			}
		});

		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				countPlayer1 = 0;
				countPlayer2 = 0;
				circle = 1;
				lblWinner.setVisible(false);
				btnReset.setVisible(false);
				btnShake.setVisible(true);
				btnShake.doClick();
			}
		});
	}

	static int countAndSet(int numberPlayer, JLabel lbl) {
		int count = 1 + (int) (Math.random() * 6);
		lbl.setIcon((new ImageIcon("E:/Sabodakho/Eclipse-IDE/BonesAPP/img/" + count + ".jpg")));
		return count;
	}
}
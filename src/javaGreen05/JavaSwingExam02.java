package javaGreen05;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JavaSwingExam02 implements ActionListener {
	JFrame jf = new JFrame();
	JPanel jp = new JPanel(); // �г� ��ü�� ����� ** �гο� ���̾ƿ��� ���� �� �� �ִ�.
	JButton numMaker = new JButton("���ڻ���");
	JButton[] jbtn = new JButton[6];
	int ran[] = new int[6];

	JTextField txt = new JTextField();

	JavaSwingExam02() {

		txt.setBackground(Color.YELLOW);

		jf.setLayout(new BorderLayout());
		jp.setLayout(new GridLayout(2, 3));

		jf.add(txt, BorderLayout.CENTER);
		jf.add(jp, BorderLayout.NORTH);
		jf.add(numMaker, BorderLayout.EAST);

		int k = 0;
		for (int i = 0; i < 6; i++) {
			ran[i] = (int) (Math.random() * 40) + 1;
			while (k < i) {
				ran[i] = (int) (Math.random() * 40) + 1;
				for (k = 0; k < ran.length; k++) {
					if (ran[i] == ran[k]) {
						break;
					}
				}
			}
		}

		for (int i = 0; i < ran.length; i++) {
			String rannum = Integer.toString(ran[i]);
			jp.add(jbtn[i] = new JButton(rannum));
		}

		numMaker.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				int k = 0;
				for (int i = 0; i < 6; i++) {
					ran[i] = (int) (Math.random() * 40) + 1;
					while (k < i) {
						ran[i] = (int) (Math.random() * 40) + 1;
						for (k = 0; k < ran.length; k++) {
							if (ran[i] == ran[k]) {
								break;
							}
						}
					}
				}

				for (int i = 0; i < ran.length; i++) {
					String rannum = Integer.toString(ran[i]);
					jp.add(jbtn[i] = new JButton(rannum));
				}
			}
		});

		// ** ���� ����

		//

		jf.setSize(400, 300); // size ����
		jf.setVisible(true); // ȭ�鿡 ���̱�

		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE); // container�� �����ư ����

	}

	void random() {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new JavaSwingExam02();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}

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

class Random implements ActionListener {
	String rannum[] = new String[6];
	int ran[] = new int[6];
	JButton jbtn[] = new JButton[6];
	JPanel jp = new JPanel();

	@Override
	public void actionPerformed(ActionEvent e) {
		// �ߺ����� ��������
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
		//
		for (int i = 0; i < ran.length; i++) {
			rannum[i] = Integer.toString(ran[i]);
		}
		
	}
}

public class JavaSwingExam02 implements ActionListener {
	JFrame jf;
	JPanel jp; // �г� ��ü�� ����� ** �гο� ���̾ƿ��� ���� �� �� �ִ�.
	JButton numMaker;
	JButton jbtn[] = new JButton[6];
	JTextField txt;

	// ��ü ����

	JavaSwingExam02() {

		jf = new JFrame();
		jp = new JPanel(); // �г� ��ü�� ����� ** �гο� ���̾ƿ��� ���� �� �� �ִ�.
		numMaker = new JButton("���ڻ���");
		txt = new JTextField();

		// jp�� �� ��ư��
//		jbtn = new JButton[6]; // ()�� ��ü�� ���� �� �ִ�.
//		jbtn[0] = new JButton(rannum[0]); // �����ϰ� ���� �ϳ��� �� ��. �ߺ�x
//		jbtn[1] = new JButton(rannum[1]);
//		jbtn[2] = new JButton(rannum[2]);
//		jbtn[3] = new JButton(rannum[3]);
//		jbtn[4] = new JButton(rannum[4]);
//		jbtn[5] = new JButton(rannum[5]);
		// jbtn �� ������ ����

//		for (int i = 0; i < 6; i++) {
//			jp.add(jbtn[i]);
//		}
	//	Random random = new Random(); // ��ü���� �� ������ ȣ��

		numMaker.addActionListener(new Random());

			for (int i = 0; i < 6; i++) {
				jp.add(jbtn[i]);
			}

			jf.setLayout(new BorderLayout());
			jp.setLayout(new GridLayout(2, 3)); // ��ȣ�� �Է¹޴� ��

			jf.add(txt, BorderLayout.CENTER);
			jf.add(jp, BorderLayout.NORTH);
			jf.add(numMaker, BorderLayout.EAST);

			jf.setSize(400, 300); // size ����
			jf.setVisible(true); // ȭ�鿡 ���̱�

			jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE); // container�� �����ư ����

		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new JavaSwingExam02();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

//	@Override
//	public void actionPerformed(ActionEvent e) {
//		random();
//	}

}

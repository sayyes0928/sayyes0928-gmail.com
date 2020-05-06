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
		// 중복없는 난수생성
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
	JPanel jp; // 패널 객체를 만든다 ** 패널에 레이아웃을 세팅 할 수 있다.
	JButton numMaker;
	JButton jbtn[] = new JButton[6];
	JTextField txt;

	// 객체 생성

	JavaSwingExam02() {

		jf = new JFrame();
		jp = new JPanel(); // 패널 객체를 만든다 ** 패널에 레이아웃을 세팅 할 수 있다.
		numMaker = new JButton("숫자생성");
		txt = new JTextField();

		// jp에 들어갈 버튼들
//		jbtn = new JButton[6]; // ()에 객체를 넣을 수 있다.
//		jbtn[0] = new JButton(rannum[0]); // 랜덤하게 값이 하나씩 들어갈 것. 중복x
//		jbtn[1] = new JButton(rannum[1]);
//		jbtn[2] = new JButton(rannum[2]);
//		jbtn[3] = new JButton(rannum[3]);
//		jbtn[4] = new JButton(rannum[4]);
//		jbtn[5] = new JButton(rannum[5]);
		// jbtn 에 랜덤값 지정

//		for (int i = 0; i < 6; i++) {
//			jp.add(jbtn[i]);
//		}
	//	Random random = new Random(); // 객체생성 및 생성자 호출

		numMaker.addActionListener(new Random());

			for (int i = 0; i < 6; i++) {
				jp.add(jbtn[i]);
			}

			jf.setLayout(new BorderLayout());
			jp.setLayout(new GridLayout(2, 3)); // 번호를 입력받는 곳

			jf.add(txt, BorderLayout.CENTER);
			jf.add(jp, BorderLayout.NORTH);
			jf.add(numMaker, BorderLayout.EAST);

			jf.setSize(400, 300); // size 설정
			jf.setVisible(true); // 화면에 보이기

			jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE); // container에 종료버튼 설정

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

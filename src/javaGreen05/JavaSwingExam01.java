package javaGreen05;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JavaSwingExam01 {
	JavaSwingExam01(){
		JFrame jf = new JFrame();
		JPanel jp = new JPanel(); //패널 객체를 만든다 ** 패널에 레이아웃을 세팅 할 수 있다.
		JPanel jp2 = new JPanel();
		JButton jb = new JButton("0.0");
		JTextField jt = new JTextField();
		
		jf.setLayout(new BorderLayout());
		jp.setLayout(new GridLayout(2, 5));
		jp.setBackground(Color.WHITE);
		

		//jp2.setLayout(new FlowLayout());
		jb.setHorizontalAlignment(jb.LEFT);
		
		JButton jb0 = new JButton("0");
		
		jp.add(jb0);
		jp.add(new JButton("1"));
		jp.add(new JButton("2"));
		jp.add(new JButton("3"));
		jp.add(new JButton("4"));
		jp.add(new JButton("5"));
		jp.add(new JButton("6"));
		jp.add(new JButton("7"));
		jp.add(new JButton("8"));
		jp.add(new JButton("9"));
		
		jb.setBackground(Color.green);
		
	//	jp2.add(new JButton("0.0"), FlowLayout.LEFT);
		
		jf.add(jb, BorderLayout.NORTH);
		jf.add(jp, BorderLayout.CENTER);
		
		jf.setSize(600, 300); // size 설정
		jf.setVisible(true); // 화면에 보이기
		
		
		
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE); // container에 종료버튼 설정
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JavaSwingExam01();
	}

}

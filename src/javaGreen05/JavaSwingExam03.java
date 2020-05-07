package javaGreen05;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JavaSwingExam03 implements ActionListener{ // 이벤트를 사용할때에는 인터페이스를 상속하는게 좋다
	
	JavaSwingExam03(){
		JFrame a = new JFrame();
		JPanel a1 = new JPanel();
		JButton b = new JButton("B");
		JButton c = new JButton("C");
		
		a.setLayout(new FlowLayout());
		a.add(b);
		a.add(c);

		a.setVisible(true); // 화면에 보이기
		a.setSize(600, 300); // size 설정
		a.setVisible(true); 
		
		b.addActionListener(this);
		c.addActionListener(this);
//		b.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("집에갈래");
//				
//			}
//		}); //event 주체자가 인터페이스를 구현한 클래스이기 때문에 this 사용
//		
//		c.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("집에 보내달라요");
//			}
//		});
	}
	
	
	public static void main(String[] args) {

		new JavaSwingExam03();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	String result = e.getActionCommand();
	if (result.equals("B")) {
		System.out.println("집에가자");
	}else if(result.equals("C")) {
		System.out.println("언제가지");
	}

	}
	}


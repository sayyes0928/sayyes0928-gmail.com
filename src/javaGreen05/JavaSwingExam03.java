package javaGreen05;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JavaSwingExam03 implements ActionListener{ // �̺�Ʈ�� ����Ҷ����� �������̽��� ����ϴ°� ����
	
	JavaSwingExam03(){
		JFrame a = new JFrame();
		JPanel a1 = new JPanel();
		JButton b = new JButton("B");
		JButton c = new JButton("C");
		
		a.setLayout(new FlowLayout());
		a.add(b);
		a.add(c);

		a.setVisible(true); // ȭ�鿡 ���̱�
		a.setSize(600, 300); // size ����
		a.setVisible(true); 
		
		b.addActionListener(this);
		c.addActionListener(this);
//		b.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("��������");
//				
//			}
//		}); //event ��ü�ڰ� �������̽��� ������ Ŭ�����̱� ������ this ���
//		
//		c.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("���� �����޶��");
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
		System.out.println("��������");
	}else if(result.equals("C")) {
		System.out.println("��������");
	}

	}
	}


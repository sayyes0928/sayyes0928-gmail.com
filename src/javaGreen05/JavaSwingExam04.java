package javaGreen05;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JavaSwingExam04 implements WindowListener{ // �̺�Ʈ�� ����Ҷ����� �������̽��� ����ϴ°� ����

	JavaSwingExam04() {
		Frame a = new Frame();
		JPanel a1 = new JPanel();
		JButton b = new JButton("B");
		JButton c = new JButton("C");

		a.setLayout(new FlowLayout());
		a.add(b);
		a.add(c);

		a.setVisible(true); // ȭ�鿡 ���̱�
		a.setSize(600, 300); // size ����
		a.addWindowListener(this); //windows �޴����� ���� �̺�Ʋ�� �� �� �ִ�.

	}

	public static void main(String[] args) {

		new JavaSwingExam04();
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
}

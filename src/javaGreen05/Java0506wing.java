package javaGreen05;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Java0506wing {

	Java0506wing() {
		String text = null;
		FlowLayout fLayout = new FlowLayout();//class�� ����ϱ� ���� ��üȭ
		JFrame jf = new JFrame(); // ��ü
		JPanel jpanel = new JPanel(); //�г� ��ü�� ����� ** �гο� ���̾ƿ��� ���� �� �� �ִ�.
		JButton jb = new JButton("Hello World"); // Component, ������ ���� 4���� Ȯ��
		JButton jb2 = new JButton("Hi"); // Component, ������ ���� 4���� Ȯ��
		JButton jb3 = new JButton("korea");
		JButton jb4 = new JButton("91919");
		
	//	jf.setLayout(fLayout); // FlowLayout Manager�� ����ϱ� ���ؼ� ��üȭ ���Ѽ� ����Ѵ�.

		
		jf.setLayout(new BorderLayout()); // ** �����̳� �ϳ��� �ϳ��� ���̾ƿ��� ���� �� �ִ�. **
		jpanel.setLayout(new FlowLayout()); // �гο� ���̾ƿ��� �����Ѵ�.
		
		jpanel.add(jb3);
		jpanel.add(jb4);
		
		jf.add(jb, BorderLayout.CENTER); // ���� ��ġ�� �ߺ� �Ұ�
		jf.add(jb2, BorderLayout.WEST); // 
		jf.add(jpanel, BorderLayout.NORTH); //** �г��� ����� ���� ���̾ƿ��� �г��� �߰��Ѵ�
//		jf.add(jb4, BorderLayout.EAST);
		
		
//		
//		jf.setLayout(new GridLayout(1,7)); //���� �� ���� �ʴ´�?
//		jf.add(jb);
//		jf.add(jb2);
//		jf.add(jb3);
//		jf.add(jb4);
		
		
		
		
		
		// Layout�� ������ �������� ���δ�
		
		jf.setSize(400, 600); // size ����
		jf.setVisible(true); // ȭ�鿡 ���̱�
		
		
		
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE); // container�� �����ư ����
	}

	public static void main(String[] args) {

		Java0506wing jswing = new Java0506wing(); // swing ȣ��
	}
}

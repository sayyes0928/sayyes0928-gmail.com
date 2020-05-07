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
import javax.swing.JPanel;
import javax.swing.JTextField;

class RandomNum { // ������ ������ Ŭ���� ****
	ArrayList<String> list = new ArrayList<String>(); // �ߺ����� �ʴ� ���� ���� arrlist ����

	void random() {

		int cnt = 0;
		while (cnt < 6) { // while������ �ؾ� �������� �������� �ʴ´�. for ������ ������� �ʵ��� ����
			int ran = (int) (Math.random() * 40 + 1);
			String rantxt = Integer.toString(ran);
			if (!list.contains(rantxt)) {
				list.add(rantxt);
				cnt++;
			}
		}
	}
}

public class JavaSwingExam02 implements ActionListener {
	JFrame jf = new JFrame(); // �г��� �ø� �����̳� ����
	JPanel jp = new JPanel(); // �׸��� ���̾ƿ��� �ø� �г��� �����
	JPanel jp2 = new JPanel(); // �ؽ�Ʈ�ʵ�� ��¹�ư�� �ø� �г��� �����
	JButton numMaker = new JButton("���ڻ���");
	JTextField txt = new JTextField();
	JButton jbtn[] = new JButton[6];

	JavaSwingExam02() {

		// �ʱ� ��ư ȭ�� ����
		String[] num = { "1", "2", "3", "4", "5", "6" };
		for (int i = 0; i < num.length; i++) {
			jp.add(jbtn[i] = new JButton(num[i])); // �Ű������� StringŸ�� �Ű������� �ִ´�.
			// jp�г��� �׸��� ���̾ƿ����� �÷�����.
		}

		jf.setLayout(new BorderLayout()); // �����̳ʿ� �гε��� ���� ���̾ƿ����� ����

		// ** �гο��� ���̾ƿ��� ���� �� �ִ�. ���� ���̾ƿ��� �������� �г��� �����ӿ� �ø� �� �ִ�.
		jp.setLayout(new GridLayout(2, 3)); // ��ȣ�� �Է¹޴� ��
		jp2.setLayout(new BorderLayout()); // jp2�гο��� ���̾ƿ��� ����

		jp2.add(numMaker, BorderLayout.EAST);
		jp2.add(txt, BorderLayout.CENTER);

		jf.add(jp, BorderLayout.CENTER); // �����̳ʿ� �г��� �÷� ��ġ�Ѵ�.
		jf.add(jp2, BorderLayout.SOUTH);

		jf.setSize(400, 300); // size ����
		jf.setVisible(true); // ȭ�鿡 ���̱�

		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE); // container�� �����ư ����

		numMaker.addActionListener(this); // ��ư�� ������ �׼��� �޼ҵ� ���� actionPerformed���� �����Ѵ�.

	}

	public static void main(String[] args) {
		new JavaSwingExam02();
	}

	@Override
	public void actionPerformed(ActionEvent e) { // numMaker���� �׼��� �������� ������ ����
		txt.setText(""); // �ٽ� ��ư�׼��� ��������� ��, �ؽ�Ʈ �ʵ带 �ʱ�ȭ���ϱ� ���� ������ �ִ´�.
		RandomNum newran = new RandomNum(); // ������ �߻���ų Ŭ������ ��üȭ, ������ ����
		newran.random(); // �޼ҵ带 ȣ���� �������� �����. ���� ��ư���� ���� ��������

		for (int i = 0; i < 6; i++) { // ��ư�� ���� random�޼ҵ忡�� �Ѱܹ��� ������ ����
			jbtn[i].setText(newran.list.get(i)); // setText�޼ҵ� ���, ***ArrayList���� ���� �����ö��� get()***
			txt.setText(txt.getText() + "[" + jbtn[i].getText() + "]"); // txt.getText();�� ������ ���� �����´�.������ ������ �������� ���δ�.
			// (1) {} , (2) {31} , (3) {2,31} , (4) {21,2,31} ... ���� ���� �����ȴ�.
		}
	}
}

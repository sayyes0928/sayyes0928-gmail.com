package javaGreen05;

import java.util.ArrayList;
import java.util.Collections;

class MakeRan extends ArrayList<Integer> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MakeRan() {
		super(6); //6���� �� ������ �ִ� �θ�����ڸ� �����Ѵ�
	}

	public void randomAdd() {
		int cnt = 0;
		while (cnt < 6) {
			int ran = (int)(Math.random() * 40 + 1);
			if (!contains(ran)) {
				add(ran); // �ߺ����� �ƴϸ� ArrayList �߰�
				cnt++; // �ߺ����� ������ ����
			}
		}
	}

	void lottoSortAsc() {
		Collections.sort(this); // �������� ���� �÷���
	}

	void lottoPrint() {
		System.out.print("��÷��ȣ�� :\t");
		for (Integer ran : /* �迭�̸� */this) {
			System.out.print(ran + "\t");
		}
		System.out.println();
	}

}
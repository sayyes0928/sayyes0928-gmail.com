package javaGreen05;

import java.util.ArrayList;
import java.util.Collections;

class MakeRan extends ArrayList<Integer> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MakeRan() {
		super(6); //6개의 빈 공간이 있는 부모생성자를 생성한다
	}

	public void randomAdd() {
		int cnt = 0;
		while (cnt < 6) {
			int ran = (int)(Math.random() * 40 + 1);
			if (!contains(ran)) {
				add(ran); // 중복값이 아니면 ArrayList 추가
				cnt++; // 중복값이 없으면 증가
			}
		}
	}

	void lottoSortAsc() {
		Collections.sort(this); // 오름차순 정렬 컬렉션
	}

	void lottoPrint() {
		System.out.print("당첨번호는 :\t");
		for (Integer ran : /* 배열이름 */this) {
			System.out.print(ran + "\t");
		}
		System.out.println();
	}

}
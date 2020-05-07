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
<<<<<<< HEAD
import javax.swing.JPanel;
import javax.swing.JTextField;

class RandomNum { // 난수를 생성할 클래스 ****
	ArrayList<String> list = new ArrayList<String>(); // 중복되지 않는 값을 담을 arrlist 생성

	void random() {

		int cnt = 0;
		while (cnt < 6) { // while문으로 해야 증가값이 한정되지 않는다. for 문으로 사용하지 않도록 주의
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
	JFrame jf = new JFrame(); // 패널을 올릴 컨테이너 생성
	JPanel jp = new JPanel(); // 그리드 레이아웃을 올릴 패널을 만든다
	JPanel jp2 = new JPanel(); // 텍스트필드와 출력버튼을 올릴 패널을 만든다
	JButton numMaker = new JButton("숫자생성");
	JTextField txt = new JTextField();
	JButton jbtn[] = new JButton[6];

	JavaSwingExam02() {

		// 초기 버튼 화면 설정
		String[] num = { "1", "2", "3", "4", "5", "6" };
		for (int i = 0; i < num.length; i++) {
			jp.add(jbtn[i] = new JButton(num[i])); // 매개변수에 String타입 매개변수를 넣는다.
			// jp패널은 그리드 레이아웃으로 올려진다.
		}

		jf.setLayout(new BorderLayout()); // 컨테이너에 패널들을 보더 레이아웃으로 설정

		// ** 패널에도 레이아웃을 넣을 수 있다. 또한 레이아웃된 여러개의 패널을 프레임에 올릴 수 있다.
		jp.setLayout(new GridLayout(2, 3)); // 번호를 입력받는 곳
		jp2.setLayout(new BorderLayout()); // jp2패널에도 레이아웃을 설정

		jp2.add(numMaker, BorderLayout.EAST);
		jp2.add(txt, BorderLayout.CENTER);

		jf.add(jp, BorderLayout.CENTER); // 컨테이너에 패널을 올려 배치한다.
		jf.add(jp2, BorderLayout.SOUTH);

		jf.setSize(400, 300); // size 설정
		jf.setVisible(true); // 화면에 보이기

		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE); // container에 종료버튼 설정

		numMaker.addActionListener(this); // 버튼을 누르면 액션할 메소드 실행 actionPerformed에서 실행한다.

	}

	public static void main(String[] args) {
		new JavaSwingExam02();
	}

	@Override
	public void actionPerformed(ActionEvent e) { // numMaker에서 액션이 들어왔을때 동작할 구문
		txt.setText(""); // 다시 버튼액션을 실행시켰을 때, 텍스트 필드를 초기화기하기 위해 공란을 넣는다.
		RandomNum newran = new RandomNum(); // 난수를 발생시킬 클래스를 객체화, 생성자 없음
		newran.random(); // 메소드를 호출해 변수들을 만든다. 아직 버튼값에 넣지 않은상태

		for (int i = 0; i < 6; i++) { // 버튼의 값을 random메소드에서 넘겨받은 값으로 변경
			jbtn[i].setText(newran.list.get(i)); // setText메소드 사용, ***ArrayList에서 값을 가져올때는 get()***
			txt.setText(txt.getText() + "[" + jbtn[i].getText() + "]"); // txt.getText();로 이전의 값을 가져온다.가져온 값들은 차곡차곡 쌓인다.
			// (1) {} , (2) {31} , (3) {2,31} , (4) {21,2,31} ... 앞의 값이 누적된다.
		}
	}
=======
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

>>>>>>> branch 'master' of https://github.com/sayyes0928/sayyes0928-gmail.com.git
}

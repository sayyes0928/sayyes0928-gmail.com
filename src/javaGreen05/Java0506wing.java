package javaGreen05;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Java0506wing {

	Java0506wing() {
		String text = null;
		FlowLayout fLayout = new FlowLayout();//class를 사용하기 위해 객체화
		JFrame jf = new JFrame(); // 주체
		JPanel jpanel = new JPanel(); //패널 객체를 만든다 ** 패널에 레이아웃을 세팅 할 수 있다.
		JButton jb = new JButton("Hello World"); // Component, 생성자 종류 4가지 확인
		JButton jb2 = new JButton("Hi"); // Component, 생성자 종류 4가지 확인
		JButton jb3 = new JButton("korea");
		JButton jb4 = new JButton("91919");
		
	//	jf.setLayout(fLayout); // FlowLayout Manager를 사용하기 위해서 객체화 시켜서 사용한다.

		
		jf.setLayout(new BorderLayout()); // ** 컨테이너 하나는 하나의 레이아웃만 가질 수 있다. **
		jpanel.setLayout(new FlowLayout()); // 패널에 레이아웃을 세팅한다.
		
		jpanel.add(jb3);
		jpanel.add(jb4);
		
		jf.add(jb, BorderLayout.CENTER); // 같은 위치에 중복 불가
		jf.add(jb2, BorderLayout.WEST); // 
		jf.add(jpanel, BorderLayout.NORTH); //** 패널을 사용해 메인 레이아웃에 패널을 추가한다
//		jf.add(jb4, BorderLayout.EAST);
		
		
//		
//		jf.setLayout(new GridLayout(1,7)); //행은 비어도 늘지 않는다?
//		jf.add(jb);
//		jf.add(jb2);
//		jf.add(jb3);
//		jf.add(jb4);
		
		
		
		
		
		// Layout이 없으면 겹쳐져서 보인다
		
		jf.setSize(400, 600); // size 설정
		jf.setVisible(true); // 화면에 보이기
		
		
		
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE); // container에 종료버튼 설정
	}

	public static void main(String[] args) {

		Java0506wing jswing = new Java0506wing(); // swing 호출
	}
}

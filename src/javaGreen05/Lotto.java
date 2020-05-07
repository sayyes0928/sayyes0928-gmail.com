package javaGreen05;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Lotto extends JFrame implements ActionListener {
    JPanel center = new JPanel(new GridLayout(2, 3)); //번호를 얹을 패널
    JPanel south = new JPanel(new BorderLayout()); // 텍스트와 출력버튼이 얹혀질 패널
    JTextField tf = new JTextField(); // 결과값이 표시될 텍스트 필드
    JButton btn_generate = new JButton("숫자생성"); // 액션버튼
    JButton btn[] = new JButton[6]; //숫자가 적혀질 버튼

    public Lotto() { //생성자
        super("로또생성");
        center.setSize(50, 50);
        String num[] = { "1", "2", "3", "4", "5", "6" }; //초기화면에 번호 보여주기, String 타입으로 설정
        for (int i = 0; i < num.length; i++) {
            btn[i] = new JButton(num[i]);
            center.add(btn[i]);
            btn[i].setFont(new Font("돋움체", Font.BOLD, 30));
        }

        add(center, "Center"); //JFrame 을 상속받았기 때문에 프레임 객체 생성필요 없음
        south.add(tf, "Center"); //[패널에] 텍스트 필드를 올린다
        south.add(btn_generate, "East"); // 패널에 버튼을 올린다
        add(south, "South"); // 텍스트와 버튼이 올려진 [패널]을 얹는다

        setSize(300, 250);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btn_generate.addActionListener(this);
    }

    public static void main(String[] args) {
        new Lotto();

    }

    @Override
    public void actionPerformed(ActionEvent e) { //버튼을 누르면 동작할 내용을 넣는공간
        if (e.getSource() == btn_generate) {
            tf.setText("");
            MakeRan lotto = new MakeRan();
            lotto.randomAdd(); // 난수
            lotto.lottoSortAsc(); // 정렬
            for (int i = 0; i < 6; i++) {
                btn[i].setText((Integer.toString(lotto.get(i))));
                tf.setText(tf.getText() + " " + btn[i].getText() + " ");
            }

        }
    }
}

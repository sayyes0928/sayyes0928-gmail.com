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
    JPanel center = new JPanel(new GridLayout(2, 3));
    JPanel south = new JPanel(new BorderLayout());
    JTextField tf = new JTextField();
    JButton btn_generate = new JButton("숫자생성");
    JButton btn[] = new JButton[6];

    public Lotto() {
        super("로또생성");
        center.setSize(50, 50);
        String num[] = { "1", "2", "3", "4", "5", "6" };
        for (int i = 0; i < num.length; i++) {
            btn[i] = new JButton(num[i]);
            center.add(btn[i]);
            btn[i].setFont(new Font("돋움체", Font.BOLD, 30));
        }

        add(center, "Center");
        south.add(tf, "Center");
        south.add(btn_generate, "East");
        add(south, "South");

        setSize(300, 250);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btn_generate.addActionListener(this);
    }

    public static void main(String[] args) {
        new Lotto();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
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

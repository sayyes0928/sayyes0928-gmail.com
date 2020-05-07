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
    JPanel center = new JPanel(new GridLayout(2, 3)); //��ȣ�� ���� �г�
    JPanel south = new JPanel(new BorderLayout()); // �ؽ�Ʈ�� ��¹�ư�� ������ �г�
    JTextField tf = new JTextField(); // ������� ǥ�õ� �ؽ�Ʈ �ʵ�
    JButton btn_generate = new JButton("���ڻ���"); // �׼ǹ�ư
    JButton btn[] = new JButton[6]; //���ڰ� ������ ��ư

    public Lotto() { //������
        super("�ζǻ���");
        center.setSize(50, 50);
        String num[] = { "1", "2", "3", "4", "5", "6" }; //�ʱ�ȭ�鿡 ��ȣ �����ֱ�, String Ÿ������ ����
        for (int i = 0; i < num.length; i++) {
            btn[i] = new JButton(num[i]);
            center.add(btn[i]);
            btn[i].setFont(new Font("����ü", Font.BOLD, 30));
        }

        add(center, "Center"); //JFrame �� ��ӹ޾ұ� ������ ������ ��ü �����ʿ� ����
        south.add(tf, "Center"); //[�гο�] �ؽ�Ʈ �ʵ带 �ø���
        south.add(btn_generate, "East"); // �гο� ��ư�� �ø���
        add(south, "South"); // �ؽ�Ʈ�� ��ư�� �÷��� [�г�]�� ��´�

        setSize(300, 250);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btn_generate.addActionListener(this);
    }

    public static void main(String[] args) {
        new Lotto();

    }

    @Override
    public void actionPerformed(ActionEvent e) { //��ư�� ������ ������ ������ �ִ°���
        if (e.getSource() == btn_generate) {
            tf.setText("");
            MakeRan lotto = new MakeRan();
            lotto.randomAdd(); // ����
            lotto.lottoSortAsc(); // ����
            for (int i = 0; i < 6; i++) {
                btn[i].setText((Integer.toString(lotto.get(i))));
                tf.setText(tf.getText() + " " + btn[i].getText() + " ");
            }

        }
    }
}

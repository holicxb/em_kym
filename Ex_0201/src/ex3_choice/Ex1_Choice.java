package ex3_choice;

import java.awt.Choice;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex1_Choice {

	//������ ��������� ������ ��� ����
	//main�� static�̱� ������...
	static String ss = "���� A��";
	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setBounds(500,300,500,250);
		f.setLayout(null);
		
		//���û���(Choice)��ü ����
		Choice bt = new Choice();
		bt.add("A");
		bt.add("B");
		bt.add("O");
		bt.add("AB");
		
		//���̸� ������ �ʿ䰡 ����
		//(�ȿ� �ִ� ���)��Ʈ�� ����� ũ��� �ڵ� �����ǹǷ�
		//0���� �ξ ����
		bt.setBounds(10, 35, 100, 0);
		
		//����� ������ Label
		Label resultLabel = new Label(ss);
		Font font = new Font("", Font.BOLD, 30);
		resultLabel.setFont(font);
		resultLabel.setBounds(160,100,200,50);
		
		//�������� �����ϴ� Choice��ü���� �̺�Ʈ ������ �߰�
		bt.addItemListener(new ItemListener() {
			//�� �����̸鼭 �������� �����̱� ������
			//�ٱ��� ������ ������ �� �� ����
			//����ϰ��� �ϸ� �ٱ��� ������ static���� ����
			@Override
			public void itemStateChanged(ItemEvent e) {
				ss = bt.getSelectedItem();
				//���� ������ �׸��� Label�� �������� ����
				resultLabel.setText("���� " + ss + "��");
			}
		});
		
		
		//������Ʈ�� �����ӿ� �߰�
		f.add(bt);
		f.add(resultLabel);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});
		
		f.setVisible(true);
	}//main
}

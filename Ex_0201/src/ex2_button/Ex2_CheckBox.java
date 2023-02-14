package ex2_button;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex2_CheckBox {

	public static void main(String[] args) {
		
		Frame f = new Frame("����");
		f.setBounds(500,200,800,400);
		f.setLayout(null);
		
		//��Ʈ�� ���õ� Ŭ����
		Font font = new Font("�ü�ü", Font.BOLD, 30);
		
		//������ �ؽ�Ʈ�� �����ֱ� ���� Ŭ����
		Label question1 = new Label("1. ����� ��̴� �����Դϱ�?");
		question1.setFont(font);
		question1.setBounds(10,30,415,50);
		question1.setBackground(Color.CYAN);
		
		//üũ�ڽ��� ������ �����ϴ� ������
		
		ItemListener check_click = new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				String str = e.getItem().toString();
				String res = "";
//				System.out.println(str);
				switch (str) {
				case "��ȭ":
					res = e.getStateChange() == 1 ? "��ȭ ����" : "��ȭ ������";
					break;
				case "����":
					res = e.getStateChange() == 1 ? "���� ����" : "���� ������";
					break;
				case "�":
					res = e.getStateChange() == 1 ? "� ����" : "� ������";
					break;
				case "���ǰ���":
					res = e.getStateChange() == 1 ? "���ǰ��� ����" : "���ǰ��� ������";
					break;
				}
				System.out.println(res);
			}
		};

		//üũ�ڽ� ����
		Checkbox movie = new Checkbox("��ȭ");
		movie.setBounds(10,80,100,30);
		Checkbox book = new Checkbox("����");
		book.setBounds(120,80,100,30);
		Checkbox sports = new Checkbox("�");
		sports.setBounds(230,80,100,30);
		Checkbox music = new Checkbox("���ǰ���");
		music.setBounds(340,80,100,30);
		
		//üũ�ڽ��鿡�� �̺�Ʈ ������ ���
		movie.addItemListener(check_click);
		book.addItemListener(check_click);
		sports.addItemListener(check_click);
		music.addItemListener(check_click);
		
		//������ ���� label ����
		Label question2 = new Label("2. ����� ������ �����Դϱ�?");
		question2.setFont(font);
		question2.setBounds(10,140,415,50);
		question2.setBackground(Color.LIGHT_GRAY);
		
		//������ư�� �̺�Ʈ ������
		ItemListener radio_click = new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				String str = e.getItem().toString();
				System.out.println(str);
//				switch (str) {
//				case "����":
//					System.out.println("���� ����");
//					break;
//				case "����":
//					System.out.println("���� ����");
//					break;
//				}
			}
		};
		
		//���߼����� �Ұ����� RadioButton�� ����
		CheckboxGroup group = new CheckboxGroup();
		Checkbox male = new Checkbox("����", group, true);//�̸� ���� : true
		male.setBounds(10,200,100,30);
		
		Checkbox female = new Checkbox("����", group, false);//�̸� ���� X: false
		female.setBounds(10,230,100,30);
		
		//���� ��ư�� �̺�Ʈ ������ ���
		female.addItemListener(radio_click);
		male.addItemListener(radio_click);
		
		//���� ������Ʈ���� �����ӿ� �߰�
		f.add(question1);
		f.add(movie);
		f.add(book);
		f.add(sports);
		f.add(music);
		
		f.add(question2);
		f.add(male);
		f.add(female);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});
		
		f.setVisible(true);
		
	}//main
}
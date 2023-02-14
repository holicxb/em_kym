package ex2_button;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex1_Button {

	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setBounds(500,300,1000,500);
		f.setLayout(null);//�ڵ���ġ ����
		
		Button btn1 = new Button("��ư 1");
		btn1.setBounds(190,200,200,100);
		
		Button btn2 = new Button("��ư 2");
		btn2.setBounds(400,200,200,100);
		
		Button btn3 = new Button("��ư 3");
		btn3.setBounds(610,200,200,100);
		
		//��ư�鿡�� �߰��� ������ ����
		ActionListener click = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String str = e.getActionCommand();
				
				switch(str) {
				case "��ư 1":
					System.out.println("��ư 1���� Ŭ���߾��");
					break;
				case "��ư 2":
					System.out.println("�ȳ��ϼ���");
					break;
				case "��ư 3":
					System.out.println("�ݰ����ϴ�");
					break;
				}
				
			}
		};
		
		//��ư 3���� �ϳ��� �����ڸ� ���ÿ� ����
		btn1.addActionListener(click);
		btn2.addActionListener(click);
		btn3.addActionListener(click);
		
		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});
		
		f.setVisible(true);
		
	}//main
	
}

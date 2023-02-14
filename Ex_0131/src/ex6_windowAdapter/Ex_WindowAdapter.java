package ex6_windowAdapter;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex_WindowAdapter {

	public static void main(String[] args) {
		
		Frame f = new Frame();
		
		f.setBounds(500,300,400,300);
		//x��ư Ŭ�� ������ ���� adapter Ŭ����
		f.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);//�����ִ� ��� �������� ����
			}
			
		});
		
		f.setVisible(true);
		
		Frame f2 = new Frame("�ι�°");
		f2.setBounds(300,300,500,250);
		
		f2.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				f2.dispose();//f2��ü�� ����
				
				//System.exit(0);//�����ִ� ��� �������� ����
			}
			
		});
		f2.setVisible(true);
		
	}
	
}

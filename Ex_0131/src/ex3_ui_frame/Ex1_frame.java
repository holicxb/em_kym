package ex3_ui_frame;

import java.awt.Color;
import java.awt.Frame;

public class Ex1_frame {

	public static void main(String[] args) {
		
		Frame frame = new Frame("���� ù ������");
		frame.setSize(400, 300);//������ �������� �ʺ�� ����
		frame.setLocation(500, 200);//������ �������� ��ǥ��
		
		frame.setBackground(Color.cyan);//���� ����
		
		//ȭ�鿡 �������� �����ִ� �ڵ�
		frame.setVisible(true);
		
		
	}//main
}

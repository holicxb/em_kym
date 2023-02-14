package ex1_package;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class ImageTest {

	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setBounds(500, 200, 500, 500);
		f.setLayout(null);
		
		//�̹��� �غ�
		ImageIcon img1 = new ImageIcon("f.png");
		ImageIcon img2 = new ImageIcon("r.jpg");
		
		//ImageIcon�� �߰��� �� �ִ� ��ü�� JLabel, JButton ���̴�
		JLabel jl = new JLabel(img1);
		jl.setBounds(0,0,500,500);
		
		//��ư ����
		JButton btn = new JButton();
		btn.setIcon(img1);
		btn.setBounds(10,50,50,50);
		
		//��ư Ŭ�� ����
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jl.setIcon(img2);
				f.repaint();//�������� ��ü������ ����
			}
		});
		
		//f�� �̹����� ���� JLabel ��ü�� �߰�
		f.add(btn);
		f.add(jl);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});
		
		f.setVisible(true);
		
	}//main
	
}

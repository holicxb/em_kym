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
		
		//이미지 준비
		ImageIcon img1 = new ImageIcon("f.png");
		ImageIcon img2 = new ImageIcon("r.jpg");
		
		//ImageIcon을 추가할 수 있는 객체는 JLabel, JButton 뿐이다
		JLabel jl = new JLabel(img1);
		jl.setBounds(0,0,500,500);
		
		//버튼 생성
		JButton btn = new JButton();
		btn.setIcon(img1);
		btn.setBounds(10,50,50,50);
		
		//버튼 클릭 감지
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jl.setIcon(img2);
				f.repaint();//프레임을 전체적으로 갱신
			}
		});
		
		//f에 이미지를 가진 JLabel 객체를 추가
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

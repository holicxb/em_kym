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
		f.setLayout(null);//자동배치 끄기
		
		Button btn1 = new Button("버튼 1");
		btn1.setBounds(190,200,200,100);
		
		Button btn2 = new Button("버튼 2");
		btn2.setBounds(400,200,200,100);
		
		Button btn3 = new Button("버튼 3");
		btn3.setBounds(610,200,200,100);
		
		//버튼들에게 추가할 감지자 생성
		ActionListener click = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String str = e.getActionCommand();
				
				switch(str) {
				case "버튼 1":
					System.out.println("버튼 1번을 클릭했어요");
					break;
				case "버튼 2":
					System.out.println("안녕하세요");
					break;
				case "버튼 3":
					System.out.println("반갑습니다");
					break;
				}
				
			}
		};
		
		//버튼 3개가 하나의 감지자를 동시에 참조
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

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

	//완전한 멤버변수로 만들어야 사용 가능
	//main이 static이기 때문에...
	static String ss = "나는 A형";
	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setBounds(500,300,500,250);
		f.setLayout(null);
		
		//선택상자(Choice)객체 생성
		Choice bt = new Choice();
		bt.add("A");
		bt.add("B");
		bt.add("O");
		bt.add("AB");
		
		//높이를 지정할 필요가 없음
		//(안에 있는 요소)폰트의 사이즈나 크기로 자동 결정되므로
		//0으로 두어도 무관
		bt.setBounds(10, 35, 100, 0);
		
		//결과를 보여줄 Label
		Label resultLabel = new Label(ss);
		Font font = new Font("", Font.BOLD, 30);
		resultLabel.setFont(font);
		resultLabel.setBounds(160,100,200,50);
		
		//혈액형을 선택하는 Choice객체에게 이벤트 감지자 추가
		bt.addItemListener(new ItemListener() {
			//새 영역이면서 개별적인 영역이기 때문에
			//바깥의 변수를 가져다 쓸 수 없다
			//사용하고자 하면 바깥의 변수를 static으로 만듦
			@Override
			public void itemStateChanged(ItemEvent e) {
				ss = bt.getSelectedItem();
				//내가 선택한 항목을 Label의 내용으로 갱신
				resultLabel.setText("나는 " + ss + "형");
			}
		});
		
		
		//컴포넌트를 프레임에 추가
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

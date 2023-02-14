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
		
		Frame f = new Frame("질문");
		f.setBounds(500,200,800,400);
		f.setLayout(null);
		
		//폰트와 관련된 클래스
		Font font = new Font("궁서체", Font.BOLD, 30);
		
		//고정된 텍스트를 보여주기 위한 클래스
		Label question1 = new Label("1. 당신의 취미는 무엇입니까?");
		question1.setFont(font);
		question1.setBounds(10,30,415,50);
		question1.setBackground(Color.CYAN);
		
		//체크박스의 선택을 감지하는 감지자
		
		ItemListener check_click = new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				String str = e.getItem().toString();
				String res = "";
//				System.out.println(str);
				switch (str) {
				case "영화":
					res = e.getStateChange() == 1 ? "영화 선택" : "영화 해제됨";
					break;
				case "독서":
					res = e.getStateChange() == 1 ? "독서 선택" : "독서 해제됨";
					break;
				case "운동":
					res = e.getStateChange() == 1 ? "운동 선택" : "운동 해제됨";
					break;
				case "음악감상":
					res = e.getStateChange() == 1 ? "음악감상 선택" : "음악감상 해제됨";
					break;
				}
				System.out.println(res);
			}
		};

		//체크박스 생성
		Checkbox movie = new Checkbox("영화");
		movie.setBounds(10,80,100,30);
		Checkbox book = new Checkbox("독서");
		book.setBounds(120,80,100,30);
		Checkbox sports = new Checkbox("운동");
		sports.setBounds(230,80,100,30);
		Checkbox music = new Checkbox("음악감상");
		music.setBounds(340,80,100,30);
		
		//체크박스들에게 이벤트 감지자 등록
		movie.addItemListener(check_click);
		book.addItemListener(check_click);
		sports.addItemListener(check_click);
		music.addItemListener(check_click);
		
		//성별을 묻는 label 생성
		Label question2 = new Label("2. 당신의 성별은 무엇입니까?");
		question2.setFont(font);
		question2.setBounds(10,140,415,50);
		question2.setBackground(Color.LIGHT_GRAY);
		
		//라디오버튼의 이벤트 감지자
		ItemListener radio_click = new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				String str = e.getItem().toString();
				System.out.println(str);
//				switch (str) {
//				case "남자":
//					System.out.println("남자 선택");
//					break;
//				case "여자":
//					System.out.println("여자 선택");
//					break;
//				}
			}
		};
		
		//다중선택이 불가능한 RadioButton을 생성
		CheckboxGroup group = new CheckboxGroup();
		Checkbox male = new Checkbox("남자", group, true);//미리 선택 : true
		male.setBounds(10,200,100,30);
		
		Checkbox female = new Checkbox("여자", group, false);//미리 선택 X: false
		female.setBounds(10,230,100,30);
		
		//라디오 버튼에 이벤트 감지자 등록
		female.addItemListener(radio_click);
		male.addItemListener(radio_click);
		
		//각종 컴포넌트들을 프레임에 추가
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

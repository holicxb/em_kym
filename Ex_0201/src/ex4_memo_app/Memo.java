package ex4_memo_app;

import java.awt.Button;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;

import javax.swing.JOptionPane;

public class Memo {

	public static void main(String[] args) {
		Frame frame = new Frame("메모장");
		frame.setBounds(500, 200, 250, 400);
		frame.setLayout(null);// 자동배치 끄기
		frame.setBackground(Color.YELLOW);
		Font font = new Font("", Font.PLAIN, 20);

		// ------------상단에 자리잡을 컴포넌트들----------------

		TextField tf = new TextField();// 한줄입력상자
		tf.setBounds(10, 35, 180, 20);

		Button btn = new Button("ok");
		btn.setBounds(195, 35, 45, 20);
		btn.setEnabled(false);// ok버튼을 비활성화 상태로 시작
		// -----------------------------------------------

		// ------------중앙에 자리잡을 컴포넌트들----------------

		TextArea ta = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		ta.setBounds(10, 60, 230, 280);
		ta.setFont(font);
		ta.setEditable(false);// ta에 직접적으로 값을 입력하는 것을 방지

		// ta.setText("값");
		// ta.getText(); -> ta에 쓰여있는 내용을 가져온다

		// -----------------------------------------------

		// ------------하단에 자리잡을 컴포넌트들----------------

		Button btnSave = new Button("저장");
		btnSave.setBounds(20, 345, 100, 40);

		Button btnClose = new Button("닫기");
		btnClose.setBounds(130, 345, 100, 40);

		// 닫기버튼에 프레임을 종료하는 감지자 등록
		btnClose.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});

		// -----------------------------------------------

		// TextField(tf)에값이 있는 경우에만 ok버튼 활성화
		tf.addTextListener(new TextListener() {
			@Override
			public void textValueChanged(TextEvent e) {
				if (tf.getText().trim().length() == 0) {
					btn.setEnabled(false);// 버튼 비활성화
				} else {
					btn.setEnabled(true);// ok버튼 활성화
				}
			}
		});

		// 상단 입력 후 ok버튼 클릭시 하단에 목록 출력
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ta.append(tf.getText() + "\n");

				// 입력이 완료되면 tf를 비워준다
				tf.setText("");
				// tf로 커서를 옮김
				tf.requestFocus();
			}
		});

		// 엔터값으로 tf의 값을 ta에 추가
		tf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				// 엔터값이 감지되었다면
				if (e.getKeyChar() == KeyEvent.VK_ENTER) {
					ta.append(tf.getText() + "\n");

					// 입력이 완료되면 tf를 비워준다
					tf.setText("");
					// tf로 커서를 옮김
					tf.requestFocus();
				}
			}
		});

		// 저장 버튼 클릭시 이벤트 감지자
		btnSave.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String message = ta.getText();

				FileWriter fw = null;
				BufferedWriter bw = null;

				try {
					// frame위로 팝업을 띄우겠다, 팝업의 제목을 "저장", 저장버튼을 활성화
					FileDialog fd = new FileDialog(frame, "저장", FileDialog.SAVE);
					fd.setVisible(true);// 팝업창 활성화
					// 저장버튼을 눌렀을 때 경로(폴더)와 파일이름을 불러와야한다
					// System.out.println(fd.getDirectory() + fd.getFile());
					String path = fd.getDirectory() + fd.getFile();

					fw = new FileWriter(path);
					bw = new BufferedWriter(fw);
					
					bw.write(message);//파일 생성
					
					bw.flush();
					
					if(fd.getFile() != null) {
						JOptionPane.showMessageDialog(frame, "저장완료");//팝업
					}
				} catch (Exception e2) {
					// TODO: handle exception
				} finally {
					try {
						bw.close();
						fw.close();
					} catch (Exception e3) {
						// TODO: handle exception
					}
				}
			}
		});

		// frame에 컴포넌트들 추가
		frame.add(tf);
		frame.add(btn);
		frame.add(ta);
		frame.add(btnSave);
		frame.add(btnClose);

		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				frame.dispose();
			}
		});

		frame.setResizable(false);// 크기 조절을 고정함
		frame.setVisible(true);
	}
}

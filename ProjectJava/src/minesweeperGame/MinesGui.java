package minesweeperGame;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.MenuItem;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.management.openmbean.OpenDataException;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MinesGui implements ActionListener {

	// 초급 : 가로 9, 세로 9, 지뢰 10개
	// 중급 : 가로 16, 세로 16, 지뢰 40개
	// 고급 : 가로 22, 세로 22, 지뢰 99개

	JComboBox dropbox;
	String[] level = { "메뉴", "초급", "중급", "고급", "사용자 지정" };

	JFrame frame;
	JPanel textPanel;
	JPanel buttenPanel;
	JButton[][] buttons;
	JButton[][] flags;
	JLabel txtField;
	JButton endBtn;
	Choice ch;

	JMenuBar mb = new JMenuBar();
	JMenu levelmenu = new JMenu("레벨");
	JMenuItem[] levelList = new JMenuItem[5];
	JMenu rankmenu = new JMenu("랭킹");
	JMenuItem showRank = new JMenuItem("랭킹 보기");
	
	Random random;
	int[][] next;
	boolean[][] ispass;
	int[][] solution;
	int size; // 그리드 사이즈 6을 입력시 6x6
	int mines; // 지뢰 갯수
	int position;
	int bomb;// 지뢰
	int[][] count;
	int mfSame = 0;
	int flagCnt = 0;

	int userCusMines, userCusSize = 0;

	// 지뢰의 위치 x축 y축
	ArrayList<Integer> xp;
	ArrayList<Integer> yp;

	MakeGrid mg = new MakeGrid();

	public MinesGui(int optionLevel, int mineNumber, int index) {

		// MakeGrid설정
		mg.start();
		mg.setRow(optionLevel);
		mg.setCol(optionLevel);
		mg.setMine(mineNumber);
		mg.sMine();

//		mg.printMine();// 정상 출력되는지 확인

		position = optionLevel;
		size = optionLevel;

		xp = new ArrayList<Integer>();
		yp = new ArrayList<Integer>();

		random = new Random();
		for (int i = 0; i < mines; i++) {
			xp.add(random.nextInt(size));
			// 사이즈가 9x9일때 랜덤으로 0~9 사이의 x좌표를 생성
			yp.add(random.nextInt(size));
			// y축
		} // for

		for (int i = 0; i < mines; i++) {
			int randomX = random.nextInt(size);
			int randomY = random.nextInt(size);

			xp.add(randomX);
			yp.add(randomY);
		} // for

		// 지뢰가 더 큰 그리드에서 중복이 될 수도 있으니 방지 << 난이도를 늘리면 그리드가 늘어나니까
		for (int i = 0; i < mines; i++) {

			for (int j = i + 1; j < mines; j++) {

				if (xp.get(i) == xp.get(j) && yp.get(i) == yp.get(j)) {// 폭탄i = 1일때 x랑 y축이 폭탄3(j)일때 와 동일

					xp.set(j, random.nextInt(size));
					yp.set(j, random.nextInt(size));

					i = 0;
					j = 0; // ArrayList를 통해 카운트를 리셋
				}
			} // inner
		} // outer

		// 지뢰 콘솔출력
		for (int i = 0; i < mines; i++) {
			System.out.println("x축" + i + "은" + xp.get(i));
			System.out.println("y축" + i + "은" + yp.get(i));
		} // 지뢰의 갯수 기본사이즈는 9x9에 폭탄10개

		// main frame
		frame = new JFrame("지뢰찾기 vr.0");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 닫기버튼 인식
		frame.setVisible(true);
		frame.setLayout(new BorderLayout());// BorderLayout을 사용하면 동서남북으로 필드 위치를 손쉽게 지정 가능
		frame.setSize(600, 600);

		////////////////////////////////////////////////////////////////

		// 메뉴바

		mb.add(levelmenu);
		mb.add(rankmenu);
		for (int i = 0; i < levelList.length; i++) {
			levelList[i] = new JMenuItem(level[i]);
			levelList[i].addActionListener(this);
			levelmenu.add(levelList[i]);
		}
		rankmenu.add(showRank);
		showRank.addActionListener(this);

		frame.add(mb, BorderLayout.NORTH);

		// 종료 버튼
		endBtn = new JButton();
		endBtn.setForeground(Color.RED);
		endBtn.setText("<HTML><body style = 'text-alighn:center;'>종<br><br>료</body></HTML>");
		endBtn.setBackground(Color.WHITE);
		endBtn.setFocusable(false);
		endBtn.addActionListener(this);
		endBtn.setVisible(true);

		////////////////////////////////////////////////////////////////

		// 지뢰 갯수를 보여줄 판넬 백그라운드
		textPanel = new JPanel();
		textPanel.setVisible(true);
		textPanel.setBackground(Color.lightGray);

		// 전체 그리드 버튼표기
		buttenPanel = new JPanel();
		buttenPanel.setVisible(true);
		buttenPanel.setLayout(new GridLayout(size, size)); // 전달받은 size로 JPanel 그리드를 만들어줌

//------------------------------------------------------------------------------------------------------		

		String lvl;
		if (optionLevel == 9) {
			lvl = "초급";
		} else if (optionLevel == 16) {
			lvl = "중급";
		} else if (optionLevel == 25) {
			lvl = "고급";
		} else {
			lvl = "커스텀 모드";
		}

		// 지뢰 갯수를 표기해주는 텍스트필드
		txtField = new JLabel();
		txtField.setHorizontalAlignment(JLabel.CENTER); // textPanel 안에서의 중앙정렬
		txtField.setFont(new Font("", Font.BOLD, 20));
		txtField.setForeground(Color.BLUE);
		txtField.setText(lvl + " (" + optionLevel + "x" + optionLevel + ")" + "  지뢰 : " + mineNumber + "개");

//------------------------------------------------------------------------------------------------------		

		buttons = new JButton[size][size];
		flags = new JButton[size][size];
		count = new int[size][size];
		solution = new int[size][size];
		ispass = new boolean[size][size];

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				count[i][j] = 0;
			}
		}
		for (int i = 0; i < buttons.length; i++) {
			for (int j = 0; j < buttons[0].length; j++) {// 2차원 배열의 모든 버튼을 통과
				flags[i][j] = new JButton();
				buttons[i][j] = new JButton();
				buttons[i][j].setFocusable(false); // 키 이벤트는 포커스가 위치해 있어야 키 이벤트가 발생하므로 강제로 포커스를 설정
				// true로 했을시 이 컴포넌트로 부터 먼저 키 입력이 가능
				buttons[i][j].setFont(new Font("", Font.BOLD, 16));

//				if (mg.getGrid()[i][j].equals("*")) {// 지뢰위치 표시용
//					buttons[i][j].setBackground(Color.yellow);
//				}
//				buttons[i][j].addActionListener(this);

				buttons[i][j].addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {

						if (e.getButton() == MouseEvent.BUTTON1) {// 좌클릭
							out: for (int i = 0; i < buttons.length; i++) {
								for (int j = 0; j < buttons[0].length; j++) {
									if (e.getSource() == buttons[i][j]) {
										if (buttons[i][j].getText().equals(String.valueOf("V"))) {
											flagCnt--;
										}
										if (!canClick(buttons[i][j], i, j)) {
											break out;
										}
										buttons[i][j].setEnabled(false);
										buttons[i][j].setText(String.valueOf(mg.getGrid()[i][j]));

										clickBomb(i, j);// 지뢰를 누른 경우
										makeArea(i, j);// 0주변칸을 다 여는 것

									}
								} // inner
							} // outer

							// 종료버튼
							if (e.getSource() == endBtn) {
								mg.setPlaying(false);
								frame.dispose();
							}
						} else if (e.getButton() == MouseEvent.BUTTON3) {// 우클릭

							for (int i = 0; i < size; i++) {
								for (int j = 0; j < size; j++) {
									if (e.getSource() == buttons[i][j] && canClick(buttons[i][j], i, j)) {
										if (count[i][j] == 0) {
											buttons[i][j].setText(String.valueOf("V"));
											if (mg.getGrid()[i][j] == "*") {
												mfSame++;
											}
											flagCnt++;
											count[i][j]++;
										} else if (count[i][j] == 1) {
											buttons[i][j].setText(String.valueOf("?"));
											if(mg.getGrid()[i][j] == "*") {
												mfSame--;
											}
											flagCnt--;
											count[i][j]++;
										} else {
											buttons[i][j].setText("");
											count[i][j] = 0;
										}
									}
								}
							}
						}
						win();
					}
				});

				buttons[i][j].setText(""); // 빈 String
				buttenPanel.add(buttons[i][j]);
				// actionListener

				ispass[i][j] = false;
			} // inner
		} // outer

		///////////////////////////////////////////////

		// add
		textPanel.add(txtField);
		frame.add(textPanel, BorderLayout.SOUTH);// 메인 프레임의 아랫쪽에 위치하도록 함(남쪽)
		frame.add(buttenPanel);
		frame.add(endBtn, BorderLayout.EAST);

		// getSolution();

		frame.revalidate();// 프레임에게 자식 컴포넌트를 다시 배치하도록 하는 메소드
		// JPanel과 같은 컨테이너에 다른 컨트롤들을 동적 생성하여 올려두었다가 지우고 재생성 할 때 모두 변경할때 필요요 함
		// 이것이 없다면 이벤트 실행시 보여할 버튼이 바로 안나옴, 수동으로 창크기를 줄이거나 늘렸을때 바뀜
		// 지연 자동 레이아웃
		// 프레임 자동 갱신과 같은 뜻이라고 보면됨
		frame.setLocationRelativeTo(null); // 프레임을 만들때 컴퓨터 화면의 정중앙에 위치한다

		String selectedItem = "";
		// 초급 : 가로 9, 세로 9, 지뢰 10개
		// 중급 : 가로 16, 세로 16, 지뢰 40개
		// 고급 : 가로 30, 세로 16, 지뢰 99개
		if (optionLevel == 9 && mineNumber == 10 || optionLevel == 16 && mineNumber == 40
				|| optionLevel == 25 && mineNumber == 99) {

			selectedItem = String.valueOf(optionLevel + "x" + optionLevel);
			// 오브젝트 값을 가져올때 toString을 쓰면 값이 null일때 NullPointerException이 뜸

		} else {
			selectedItem = "<HTML><body style = 'text-alighn:center;'>사용자<br>&nbsp;&nbsp;지정</body></HTML>";
			// 사용자 지정을 만들어봄 =없앨까=
		}

		// 난이도 선택 드롭박스 (JcomboBox 이용)
//		dropbox = new JComboBox(level);
//		dropbox.setSelectedIndex(index);
//		dropbox.addActionListener(this);
		// 드롭박스
//		dropbox.setSelectedItem(selectedItem);
//		dropbox.setFont(new Font("", Font.BOLD, 20));
//		dropbox.setBackground(Color.PINK);
//		dropbox.setBorder(null);
//		dropbox.setEditable(false);

//		frame.add(dropbox, BorderLayout.NORTH);
		frame.setLocationRelativeTo(null);
		frame.revalidate();// 프레임 자동 새로고침

		if (position == 9 && mines == 10)
			frame.setSize(570, 570);
		else if (position == 16 && mines == 40)
			frame.setSize(900, 650);
		else if (position == 25 && mines == 99)
			frame.setSize(1250, 700);
		else {
			Dimension size = Toolkit.getDefaultToolkit().getScreenSize(); // 본인의 화면사이즈
			int height = (int) size.getHeight();
			int width = (int) size.getWidth();

			if (position <= 9) {
				frame.setSize(570, 570);
				frame.setLocationRelativeTo(null);
			} else if (position > 9 && position <= 16) {
				frame.setSize(900, 650);
				frame.setLocationRelativeTo(null);
			} else if (position > 16 && position <= 25) {
				frame.setSize(1250, 700);
				frame.setLocationRelativeTo(null);
			} else {
				frame.setSize(width, height);
				JOptionPane.showConfirmDialog(null, "스크린이 작아 전체화면으로 전환합니다.", "사용자 지정", JOptionPane.PLAIN_MESSAGE);
				frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
			}
		}

	}// MinesGui

	// 사용자지정 사이즈 정하기
	private int getUserCus() {
		boolean build = false;

		String size = JOptionPane.showInputDialog(null, "그리드 크기를 입력해주세요!\n크기 : 1~30", "User Custom",
				JOptionPane.PLAIN_MESSAGE);

		try {
			userCusSize = Integer.parseInt(size);
			if (userCusSize <= 30 && userCusSize > 0) { // 커스텀 그리드는 사이즈를 1 이상 30 이하
				build = true;
			} else {
				if (userCusSize > 30) { // 30이 넘어갔을때
					JOptionPane.showMessageDialog(null, "크기가 너무 큽니다!\n크기는 1~30 내로 입력해주세요", "User Custom",
							JOptionPane.WARNING_MESSAGE);
				} else if (userCusSize <= 0) {// 사이즈가 0이거나 0 미만일때
					JOptionPane.showMessageDialog(null, "크기가 0이 될 수 없습니다!\n크기는 1~30 내로 입력해주세요 ", "User Custom",
							JOptionPane.WARNING_MESSAGE);
					build = false;
				}
			}
		} catch (Exception e) {// 숫자가 아니거나 1~30 값이 아닐때 예외처리
			JOptionPane.showMessageDialog(null, "잘못된 값 입니다\n다시 입력해주세요", "User Custom", JOptionPane.PLAIN_MESSAGE);
			build = false;
		} // tryCatch
		if (build) {// true일때
			String mines = JOptionPane.showInputDialog(null, "지뢰의 갯수를 입력하세요!", "User Custom",
					JOptionPane.PLAIN_MESSAGE);
			try {
				userCusMines = Integer.parseInt(mines);
				if (userCusMines <= (Math.pow(userCusSize, 2)) && userCusMines >= 0) {// Math.pow : 거듭제곱 함수 ... 입력한 그리드
					build = true;
				} else {
					if (userCusMines > (Math.pow(userCusSize, 2))) {// 그리드 사이즈의 2제곱 보다 지뢰수가 많을때
						JOptionPane.showMessageDialog(null, "그리드 크기 보다 지뢰가 많을 수 없습니다!", "User Custom",
								JOptionPane.WARNING_MESSAGE);
						build = false;
					}
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "잘못된 값 입니다", "User Custom", JOptionPane.WARNING_MESSAGE);
				build = false;
			} // tryCatch
		} // if(build == true)
		if (build) {
			return 1;
		} else {
			return 0;
		}
	}// getUserCus()

	// 0이면 동시에 열리는? 재귀함수?
	public void makeArea(int y, int x) {

		if (y < 0 || x < 0 || y == mg.getGrid().length || x == mg.getGrid().length) {
			return;
		}

		if (ispass[y][x] == false) {
			if (buttons[y][x].getText().equals(String.valueOf("V"))) {
				flagCnt--;
			}
			ispass[y][x] = true;
			if (mg.getGrid()[y][x] == "0") {
				buttons[y][x].setEnabled(false);// 버튼 비활성화
				buttons[y][x].setText(mg.getGrid()[y][x]);

				makeArea(y, x - 1);
				makeArea(y - 1, x);
				makeArea(y + 1, x);
				makeArea(y, x + 1);
				makeArea(y - 1, x - 1);
				makeArea(y + 1, x - 1);
				makeArea(y - 1, x + 1);
				makeArea(y + 1, x + 1);

			} else if (mg.getGrid()[y][x].equals("*")) {
				return;
			} else {// 0 이 아닌 숫자인 경우
				buttons[y][x].setEnabled(false);
				buttons[y][x].setText(mg.getGrid()[y][x]);
			}
		}

	}// makeArea

	// 패배조건
	public void clickBomb(int y, int x) {

		if (mg.getGrid()[y][x].equals("*")) {
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					buttons[i][j].setEnabled(false);
					buttons[i][j].setText(mg.getGrid()[i][j]);
				}
			}
			buttons[y][x].setBackground(Color.RED);
			mg.setPlaying(false);
			int endQ = JOptionPane.showConfirmDialog(frame, "실패하였습니다!\n게임종료 y/n", "게임종료", JOptionPane.YES_NO_OPTION,
					JOptionPane.INFORMATION_MESSAGE);
			if (endQ == 0) {
				frame.dispose();
			} else if (endQ == 1) {
				frame.dispose();
				new MinesGui(mg.getRow(), mg.getMine(), levelmenu.getMenuComponentCount());
			}
		}
	}

	public boolean canClick(JButton b, int i, int j) {
		if (b.getText().equals(mg.getGrid()[i][j])) {
			return false;
		} else {
			return true;
		}
	}

	// 승리조건
	User user = new User();
	String path = "rank/";
	RecordUser ru = new RecordUser();

	public void win() {
//		System.out.println("깃발과 지뢰가 같다"+mfSame);
//		System.out.println("깃발 갯수"+flagCnt);

		if (mg.getMine() == mfSame && flagCnt == mg.getMine()) {
			mg.setPlaying(false);
			int saveQ = JOptionPane.showConfirmDialog(frame, "클리어 타임 " + mg.getTimer() + "초\n기록을 저장하시겠습니까?  y/n",
					"게임종료", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
			if (saveQ == 0) {
				String saveId = JOptionPane.showInputDialog("동일닉네임의 경우 최신기록이 출력됩니다\n아이디 입력");

				user.setName(saveId);
				user.setTimer(mg.getTimer());
				
				try {
					ru.writeFile(path, saveId, user);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				int endQ = JOptionPane.showConfirmDialog(frame, "종료하시겠습니까?  y/n", "게임종료", JOptionPane.YES_NO_OPTION,
						JOptionPane.INFORMATION_MESSAGE);
				if (endQ == 0) {
					frame.dispose();
				} else if (endQ == 1) {
					frame.dispose();
					new MinesGui(mg.getRow(), mg.getMine(), levelmenu.getMenuComponentCount());
				}
			} else if (saveQ == 1) {
				int endQ = JOptionPane.showConfirmDialog(frame, "종료하시겠습니까?  y/n", "게임종료", JOptionPane.YES_NO_OPTION,
						JOptionPane.INFORMATION_MESSAGE);
				if (endQ == 0) {
					frame.dispose();
				} else if (endQ == 1) {
					frame.dispose();
					new MinesGui(mg.getRow(), mg.getMine(), levelmenu.getMenuComponentCount());
				}
			}

		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 버튼이 눌렸을때 발생되는 액션을 테스트겸 출력

		for (int i = 0; i < buttons.length; i++) {
			for (int j = 0; j < buttons[0].length; j++) {
				if (e.getSource() == buttons[i][j]) {
					buttons[i][j].setEnabled(false);
					buttons[i][j].setText(mg.getGrid()[i][j]);

					clickBomb(i, j);// 지뢰를 누른 경우
					makeArea(i, j);// 0주변칸을 다 여는 것

				}
			} // inner
		} // outer

		// 종료버튼
		if (e.getSource() == endBtn) {
			mg.setPlaying(false);
			frame.dispose();
		}

		if (e.getActionCommand().equals("랭킹 보기")) {
			int ranking = JOptionPane.showConfirmDialog(frame, "랭킹 불러오기 y/n", "게임종료", JOptionPane.YES_NO_OPTION,
					JOptionPane.INFORMATION_MESSAGE);
			if (ranking == 0) {
				ArrayList<User> u = ru.loadFile(path);
				String[] res = new String[u.size()];
				String printRes = "";
				for(int i = 0;	i < u.size();	i++) {
					res[i] = "";
					res[i] += (u.get(i).getName() + " : " + u.get(i).getTimer() + "초\n");
					printRes += res[i];
				}
				
//				System.out.println(printRes);
				
				JOptionPane.showMessageDialog(frame, printRes ,"ranking", JOptionPane.INFORMATION_MESSAGE);
			} else if (ranking == 1) {
				
			}
		}

		/////////////////////////////////////

		///////////////////////////////////

		// 초급 : 가로 9, 세로 9, 지뢰 10개
		// 중급 : 가로 16, 세로 16, 지뢰 40개
		// 고급 : 가로 30, 세로 16, 지뢰 99개
		// 그리드 난이도에 따라 크기 변환

		String cmd = e.getActionCommand();
		switch (cmd) {
		case "초급":
			frame.dispose();
			new MinesGui(9, 10, 1);
			break;
		case "중급":
			frame.dispose();
			new MinesGui(16, 40, 2);
			break;
		case "고급":
			frame.dispose();
			new MinesGui(25, 99, 3);
			break;
		case "사용자 지정":
			frame.dispose();
			int success = getUserCus();
			if (success == 1) {
				new MinesGui(userCusSize, userCusMines, levelmenu.getMenuComponentCount());
			}
			break;
		}
	}// actionPerformed
}
// class
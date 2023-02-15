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

	// �ʱ� : ���� 9, ���� 9, ���� 10��
	// �߱� : ���� 16, ���� 16, ���� 40��
	// ��� : ���� 22, ���� 22, ���� 99��

	JComboBox dropbox;
	String[] level = { "�޴�", "�ʱ�", "�߱�", "���", "����� ����" };

	JFrame frame;
	JPanel textPanel;
	JPanel buttenPanel;
	JButton[][] buttons;
	JButton[][] flags;
	JLabel txtField;
	JButton endBtn;
	Choice ch;

	JMenuBar mb = new JMenuBar();
	JMenu levelmenu = new JMenu("����");
	JMenuItem[] levelList = new JMenuItem[5];
	JMenu rankmenu = new JMenu("��ŷ");
	JMenuItem showRank = new JMenuItem("��ŷ ����");
	
	Random random;
	int[][] next;
	boolean[][] ispass;
	int[][] solution;
	int size; // �׸��� ������ 6�� �Է½� 6x6
	int mines; // ���� ����
	int position;
	int bomb;// ����
	int[][] count;
	int mfSame = 0;
	int flagCnt = 0;

	int userCusMines, userCusSize = 0;

	// ������ ��ġ x�� y��
	ArrayList<Integer> xp;
	ArrayList<Integer> yp;

	MakeGrid mg = new MakeGrid();

	public MinesGui(int optionLevel, int mineNumber, int index) {

		// MakeGrid����
		mg.start();
		mg.setRow(optionLevel);
		mg.setCol(optionLevel);
		mg.setMine(mineNumber);
		mg.sMine();

//		mg.printMine();// ���� ��µǴ��� Ȯ��

		position = optionLevel;
		size = optionLevel;

		xp = new ArrayList<Integer>();
		yp = new ArrayList<Integer>();

		random = new Random();
		for (int i = 0; i < mines; i++) {
			xp.add(random.nextInt(size));
			// ����� 9x9�϶� �������� 0~9 ������ x��ǥ�� ����
			yp.add(random.nextInt(size));
			// y��
		} // for

		for (int i = 0; i < mines; i++) {
			int randomX = random.nextInt(size);
			int randomY = random.nextInt(size);

			xp.add(randomX);
			yp.add(randomY);
		} // for

		// ���ڰ� �� ū �׸��忡�� �ߺ��� �� ���� ������ ���� << ���̵��� �ø��� �׸��尡 �þ�ϱ�
		for (int i = 0; i < mines; i++) {

			for (int j = i + 1; j < mines; j++) {

				if (xp.get(i) == xp.get(j) && yp.get(i) == yp.get(j)) {// ��źi = 1�϶� x�� y���� ��ź3(j)�϶� �� ����

					xp.set(j, random.nextInt(size));
					yp.set(j, random.nextInt(size));

					i = 0;
					j = 0; // ArrayList�� ���� ī��Ʈ�� ����
				}
			} // inner
		} // outer

		// ���� �ܼ����
		for (int i = 0; i < mines; i++) {
			System.out.println("x��" + i + "��" + xp.get(i));
			System.out.println("y��" + i + "��" + yp.get(i));
		} // ������ ���� �⺻������� 9x9�� ��ź10��

		// main frame
		frame = new JFrame("����ã�� vr.0");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// �ݱ��ư �ν�
		frame.setVisible(true);
		frame.setLayout(new BorderLayout());// BorderLayout�� ����ϸ� ������������ �ʵ� ��ġ�� �ս��� ���� ����
		frame.setSize(600, 600);

		////////////////////////////////////////////////////////////////

		// �޴���

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

		// ���� ��ư
		endBtn = new JButton();
		endBtn.setForeground(Color.RED);
		endBtn.setText("<HTML><body style = 'text-alighn:center;'>��<br><br>��</body></HTML>");
		endBtn.setBackground(Color.WHITE);
		endBtn.setFocusable(false);
		endBtn.addActionListener(this);
		endBtn.setVisible(true);

		////////////////////////////////////////////////////////////////

		// ���� ������ ������ �ǳ� ��׶���
		textPanel = new JPanel();
		textPanel.setVisible(true);
		textPanel.setBackground(Color.lightGray);

		// ��ü �׸��� ��ưǥ��
		buttenPanel = new JPanel();
		buttenPanel.setVisible(true);
		buttenPanel.setLayout(new GridLayout(size, size)); // ���޹��� size�� JPanel �׸��带 �������

//------------------------------------------------------------------------------------------------------		

		String lvl;
		if (optionLevel == 9) {
			lvl = "�ʱ�";
		} else if (optionLevel == 16) {
			lvl = "�߱�";
		} else if (optionLevel == 25) {
			lvl = "���";
		} else {
			lvl = "Ŀ���� ���";
		}

		// ���� ������ ǥ�����ִ� �ؽ�Ʈ�ʵ�
		txtField = new JLabel();
		txtField.setHorizontalAlignment(JLabel.CENTER); // textPanel �ȿ����� �߾�����
		txtField.setFont(new Font("", Font.BOLD, 20));
		txtField.setForeground(Color.BLUE);
		txtField.setText(lvl + " (" + optionLevel + "x" + optionLevel + ")" + "  ���� : " + mineNumber + "��");

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
			for (int j = 0; j < buttons[0].length; j++) {// 2���� �迭�� ��� ��ư�� ���
				flags[i][j] = new JButton();
				buttons[i][j] = new JButton();
				buttons[i][j].setFocusable(false); // Ű �̺�Ʈ�� ��Ŀ���� ��ġ�� �־�� Ű �̺�Ʈ�� �߻��ϹǷ� ������ ��Ŀ���� ����
				// true�� ������ �� ������Ʈ�� ���� ���� Ű �Է��� ����
				buttons[i][j].setFont(new Font("", Font.BOLD, 16));

//				if (mg.getGrid()[i][j].equals("*")) {// ������ġ ǥ�ÿ�
//					buttons[i][j].setBackground(Color.yellow);
//				}
//				buttons[i][j].addActionListener(this);

				buttons[i][j].addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {

						if (e.getButton() == MouseEvent.BUTTON1) {// ��Ŭ��
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

										clickBomb(i, j);// ���ڸ� ���� ���
										makeArea(i, j);// 0�ֺ�ĭ�� �� ���� ��

									}
								} // inner
							} // outer

							// �����ư
							if (e.getSource() == endBtn) {
								mg.setPlaying(false);
								frame.dispose();
							}
						} else if (e.getButton() == MouseEvent.BUTTON3) {// ��Ŭ��

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

				buttons[i][j].setText(""); // �� String
				buttenPanel.add(buttons[i][j]);
				// actionListener

				ispass[i][j] = false;
			} // inner
		} // outer

		///////////////////////////////////////////////

		// add
		textPanel.add(txtField);
		frame.add(textPanel, BorderLayout.SOUTH);// ���� �������� �Ʒ��ʿ� ��ġ�ϵ��� ��(����)
		frame.add(buttenPanel);
		frame.add(endBtn, BorderLayout.EAST);

		// getSolution();

		frame.revalidate();// �����ӿ��� �ڽ� ������Ʈ�� �ٽ� ��ġ�ϵ��� �ϴ� �޼ҵ�
		// JPanel�� ���� �����̳ʿ� �ٸ� ��Ʈ�ѵ��� ���� �����Ͽ� �÷��ξ��ٰ� ����� ����� �� �� ��� �����Ҷ� �ʿ�� ��
		// �̰��� ���ٸ� �̺�Ʈ ����� ������ ��ư�� �ٷ� �ȳ���, �������� âũ�⸦ ���̰ų� �÷����� �ٲ�
		// ���� �ڵ� ���̾ƿ�
		// ������ �ڵ� ���Ű� ���� ���̶�� �����
		frame.setLocationRelativeTo(null); // �������� ���鶧 ��ǻ�� ȭ���� ���߾ӿ� ��ġ�Ѵ�

		String selectedItem = "";
		// �ʱ� : ���� 9, ���� 9, ���� 10��
		// �߱� : ���� 16, ���� 16, ���� 40��
		// ��� : ���� 30, ���� 16, ���� 99��
		if (optionLevel == 9 && mineNumber == 10 || optionLevel == 16 && mineNumber == 40
				|| optionLevel == 25 && mineNumber == 99) {

			selectedItem = String.valueOf(optionLevel + "x" + optionLevel);
			// ������Ʈ ���� �����ö� toString�� ���� ���� null�϶� NullPointerException�� ��

		} else {
			selectedItem = "<HTML><body style = 'text-alighn:center;'>�����<br>&nbsp;&nbsp;����</body></HTML>";
			// ����� ������ ���� =���ٱ�=
		}

		// ���̵� ���� ��ӹڽ� (JcomboBox �̿�)
//		dropbox = new JComboBox(level);
//		dropbox.setSelectedIndex(index);
//		dropbox.addActionListener(this);
		// ��ӹڽ�
//		dropbox.setSelectedItem(selectedItem);
//		dropbox.setFont(new Font("", Font.BOLD, 20));
//		dropbox.setBackground(Color.PINK);
//		dropbox.setBorder(null);
//		dropbox.setEditable(false);

//		frame.add(dropbox, BorderLayout.NORTH);
		frame.setLocationRelativeTo(null);
		frame.revalidate();// ������ �ڵ� ���ΰ�ħ

		if (position == 9 && mines == 10)
			frame.setSize(570, 570);
		else if (position == 16 && mines == 40)
			frame.setSize(900, 650);
		else if (position == 25 && mines == 99)
			frame.setSize(1250, 700);
		else {
			Dimension size = Toolkit.getDefaultToolkit().getScreenSize(); // ������ ȭ�������
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
				JOptionPane.showConfirmDialog(null, "��ũ���� �۾� ��üȭ������ ��ȯ�մϴ�.", "����� ����", JOptionPane.PLAIN_MESSAGE);
				frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
			}
		}

	}// MinesGui

	// ��������� ������ ���ϱ�
	private int getUserCus() {
		boolean build = false;

		String size = JOptionPane.showInputDialog(null, "�׸��� ũ�⸦ �Է����ּ���!\nũ�� : 1~30", "User Custom",
				JOptionPane.PLAIN_MESSAGE);

		try {
			userCusSize = Integer.parseInt(size);
			if (userCusSize <= 30 && userCusSize > 0) { // Ŀ���� �׸���� ����� 1 �̻� 30 ����
				build = true;
			} else {
				if (userCusSize > 30) { // 30�� �Ѿ����
					JOptionPane.showMessageDialog(null, "ũ�Ⱑ �ʹ� Ů�ϴ�!\nũ��� 1~30 ���� �Է����ּ���", "User Custom",
							JOptionPane.WARNING_MESSAGE);
				} else if (userCusSize <= 0) {// ����� 0�̰ų� 0 �̸��϶�
					JOptionPane.showMessageDialog(null, "ũ�Ⱑ 0�� �� �� �����ϴ�!\nũ��� 1~30 ���� �Է����ּ��� ", "User Custom",
							JOptionPane.WARNING_MESSAGE);
					build = false;
				}
			}
		} catch (Exception e) {// ���ڰ� �ƴϰų� 1~30 ���� �ƴҶ� ����ó��
			JOptionPane.showMessageDialog(null, "�߸��� �� �Դϴ�\n�ٽ� �Է����ּ���", "User Custom", JOptionPane.PLAIN_MESSAGE);
			build = false;
		} // tryCatch
		if (build) {// true�϶�
			String mines = JOptionPane.showInputDialog(null, "������ ������ �Է��ϼ���!", "User Custom",
					JOptionPane.PLAIN_MESSAGE);
			try {
				userCusMines = Integer.parseInt(mines);
				if (userCusMines <= (Math.pow(userCusSize, 2)) && userCusMines >= 0) {// Math.pow : �ŵ����� �Լ� ... �Է��� �׸���
					build = true;
				} else {
					if (userCusMines > (Math.pow(userCusSize, 2))) {// �׸��� �������� 2���� ���� ���ڼ��� ������
						JOptionPane.showMessageDialog(null, "�׸��� ũ�� ���� ���ڰ� ���� �� �����ϴ�!", "User Custom",
								JOptionPane.WARNING_MESSAGE);
						build = false;
					}
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "�߸��� �� �Դϴ�", "User Custom", JOptionPane.WARNING_MESSAGE);
				build = false;
			} // tryCatch
		} // if(build == true)
		if (build) {
			return 1;
		} else {
			return 0;
		}
	}// getUserCus()

	// 0�̸� ���ÿ� ������? ����Լ�?
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
				buttons[y][x].setEnabled(false);// ��ư ��Ȱ��ȭ
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
			} else {// 0 �� �ƴ� ������ ���
				buttons[y][x].setEnabled(false);
				buttons[y][x].setText(mg.getGrid()[y][x]);
			}
		}

	}// makeArea

	// �й�����
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
			int endQ = JOptionPane.showConfirmDialog(frame, "�����Ͽ����ϴ�!\n�������� y/n", "��������", JOptionPane.YES_NO_OPTION,
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

	// �¸�����
	User user = new User();
	String path = "rank/";
	RecordUser ru = new RecordUser();

	public void win() {
//		System.out.println("��߰� ���ڰ� ����"+mfSame);
//		System.out.println("��� ����"+flagCnt);

		if (mg.getMine() == mfSame && flagCnt == mg.getMine()) {
			mg.setPlaying(false);
			int saveQ = JOptionPane.showConfirmDialog(frame, "Ŭ���� Ÿ�� " + mg.getTimer() + "��\n����� �����Ͻðڽ��ϱ�?  y/n",
					"��������", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
			if (saveQ == 0) {
				String saveId = JOptionPane.showInputDialog("���ϴг����� ��� �ֽű���� ��µ˴ϴ�\n���̵� �Է�");

				user.setName(saveId);
				user.setTimer(mg.getTimer());
				
				try {
					ru.writeFile(path, saveId, user);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				int endQ = JOptionPane.showConfirmDialog(frame, "�����Ͻðڽ��ϱ�?  y/n", "��������", JOptionPane.YES_NO_OPTION,
						JOptionPane.INFORMATION_MESSAGE);
				if (endQ == 0) {
					frame.dispose();
				} else if (endQ == 1) {
					frame.dispose();
					new MinesGui(mg.getRow(), mg.getMine(), levelmenu.getMenuComponentCount());
				}
			} else if (saveQ == 1) {
				int endQ = JOptionPane.showConfirmDialog(frame, "�����Ͻðڽ��ϱ�?  y/n", "��������", JOptionPane.YES_NO_OPTION,
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
		// ��ư�� �������� �߻��Ǵ� �׼��� �׽�Ʈ�� ���

		for (int i = 0; i < buttons.length; i++) {
			for (int j = 0; j < buttons[0].length; j++) {
				if (e.getSource() == buttons[i][j]) {
					buttons[i][j].setEnabled(false);
					buttons[i][j].setText(mg.getGrid()[i][j]);

					clickBomb(i, j);// ���ڸ� ���� ���
					makeArea(i, j);// 0�ֺ�ĭ�� �� ���� ��

				}
			} // inner
		} // outer

		// �����ư
		if (e.getSource() == endBtn) {
			mg.setPlaying(false);
			frame.dispose();
		}

		if (e.getActionCommand().equals("��ŷ ����")) {
			int ranking = JOptionPane.showConfirmDialog(frame, "��ŷ �ҷ����� y/n", "��������", JOptionPane.YES_NO_OPTION,
					JOptionPane.INFORMATION_MESSAGE);
			if (ranking == 0) {
				ArrayList<User> u = ru.loadFile(path);
				String[] res = new String[u.size()];
				String printRes = "";
				for(int i = 0;	i < u.size();	i++) {
					res[i] = "";
					res[i] += (u.get(i).getName() + " : " + u.get(i).getTimer() + "��\n");
					printRes += res[i];
				}
				
//				System.out.println(printRes);
				
				JOptionPane.showMessageDialog(frame, printRes ,"ranking", JOptionPane.INFORMATION_MESSAGE);
			} else if (ranking == 1) {
				
			}
		}

		/////////////////////////////////////

		///////////////////////////////////

		// �ʱ� : ���� 9, ���� 9, ���� 10��
		// �߱� : ���� 16, ���� 16, ���� 40��
		// ��� : ���� 30, ���� 16, ���� 99��
		// �׸��� ���̵��� ���� ũ�� ��ȯ

		String cmd = e.getActionCommand();
		switch (cmd) {
		case "�ʱ�":
			frame.dispose();
			new MinesGui(9, 10, 1);
			break;
		case "�߱�":
			frame.dispose();
			new MinesGui(16, 40, 2);
			break;
		case "���":
			frame.dispose();
			new MinesGui(25, 99, 3);
			break;
		case "����� ����":
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
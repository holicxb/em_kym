package teamProject;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import defense_game.DefenseGame_Frame;
import minesweeperGame.MinesGui;
import snakegame.GameFrame;

public class MainFrame extends JFrame {

	public MainFrame() {
		setSize(640, 380);
		setLayout(null);
		setLocationRelativeTo(null);
		setTitle("4�� �̴ϰ��� õ��");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �ݱ��ư �ν�

		Font font = new Font("", Font.BOLD, 12);
		JButton btn1 = new JButton("����ã��");
		btn1.setBounds(100, 270, 100, 40);
		btn1.setFont(font);
		JButton btn2 = new JButton("Ÿ�����潺");
		btn2.setBounds(200, 270, 100, 40);
		btn2.setFont(font);
		JButton btn3 = new JButton("��Ű���");
		btn3.setBounds(300, 270, 100, 40);
		btn3.setFont(font);

		JLabel bg = new JLabel(new ImageIcon("imgSet/main/Main.png"));
		bg.setBounds(0, 0, 640, 380);

		btn1.addActionListener(click);
		btn2.addActionListener(click);
		btn3.addActionListener(click);

		add(btn1, new Integer(1));
		add(btn2, new Integer(1));
		add(btn3, new Integer(1));
		add(bg, new Integer(0));

		setVisible(true);
	}

	ActionListener click = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			dispose();
			String str = e.getActionCommand();
			switch (str) {
			case "����ã��":
				new MinesGui(9, 10, 0);
				break;
			case "Ÿ�����潺":
				DefenseGame_Frame defense_g = new DefenseGame_Frame();
				defense_g.runningGame.start();
				break;
			case "��Ű���":
				new GameFrame();
				break;
			}
		}
	};

}

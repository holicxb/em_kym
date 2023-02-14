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
		Frame frame = new Frame("�޸���");
		frame.setBounds(500, 200, 250, 400);
		frame.setLayout(null);// �ڵ���ġ ����
		frame.setBackground(Color.YELLOW);
		Font font = new Font("", Font.PLAIN, 20);

		// ------------��ܿ� �ڸ����� ������Ʈ��----------------

		TextField tf = new TextField();// �����Է»���
		tf.setBounds(10, 35, 180, 20);

		Button btn = new Button("ok");
		btn.setBounds(195, 35, 45, 20);
		btn.setEnabled(false);// ok��ư�� ��Ȱ��ȭ ���·� ����
		// -----------------------------------------------

		// ------------�߾ӿ� �ڸ����� ������Ʈ��----------------

		TextArea ta = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		ta.setBounds(10, 60, 230, 280);
		ta.setFont(font);
		ta.setEditable(false);// ta�� ���������� ���� �Է��ϴ� ���� ����

		// ta.setText("��");
		// ta.getText(); -> ta�� �����ִ� ������ �����´�

		// -----------------------------------------------

		// ------------�ϴܿ� �ڸ����� ������Ʈ��----------------

		Button btnSave = new Button("����");
		btnSave.setBounds(20, 345, 100, 40);

		Button btnClose = new Button("�ݱ�");
		btnClose.setBounds(130, 345, 100, 40);

		// �ݱ��ư�� �������� �����ϴ� ������ ���
		btnClose.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});

		// -----------------------------------------------

		// TextField(tf)������ �ִ� ��쿡�� ok��ư Ȱ��ȭ
		tf.addTextListener(new TextListener() {
			@Override
			public void textValueChanged(TextEvent e) {
				if (tf.getText().trim().length() == 0) {
					btn.setEnabled(false);// ��ư ��Ȱ��ȭ
				} else {
					btn.setEnabled(true);// ok��ư Ȱ��ȭ
				}
			}
		});

		// ��� �Է� �� ok��ư Ŭ���� �ϴܿ� ��� ���
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ta.append(tf.getText() + "\n");

				// �Է��� �Ϸ�Ǹ� tf�� ����ش�
				tf.setText("");
				// tf�� Ŀ���� �ű�
				tf.requestFocus();
			}
		});

		// ���Ͱ����� tf�� ���� ta�� �߰�
		tf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				// ���Ͱ��� �����Ǿ��ٸ�
				if (e.getKeyChar() == KeyEvent.VK_ENTER) {
					ta.append(tf.getText() + "\n");

					// �Է��� �Ϸ�Ǹ� tf�� ����ش�
					tf.setText("");
					// tf�� Ŀ���� �ű�
					tf.requestFocus();
				}
			}
		});

		// ���� ��ư Ŭ���� �̺�Ʈ ������
		btnSave.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String message = ta.getText();

				FileWriter fw = null;
				BufferedWriter bw = null;

				try {
					// frame���� �˾��� ���ڴ�, �˾��� ������ "����", �����ư�� Ȱ��ȭ
					FileDialog fd = new FileDialog(frame, "����", FileDialog.SAVE);
					fd.setVisible(true);// �˾�â Ȱ��ȭ
					// �����ư�� ������ �� ���(����)�� �����̸��� �ҷ��;��Ѵ�
					// System.out.println(fd.getDirectory() + fd.getFile());
					String path = fd.getDirectory() + fd.getFile();

					fw = new FileWriter(path);
					bw = new BufferedWriter(fw);
					
					bw.write(message);//���� ����
					
					bw.flush();
					
					if(fd.getFile() != null) {
						JOptionPane.showMessageDialog(frame, "����Ϸ�");//�˾�
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

		// frame�� ������Ʈ�� �߰�
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

		frame.setResizable(false);// ũ�� ������ ������
		frame.setVisible(true);
	}
}

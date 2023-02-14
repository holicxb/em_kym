package ex1_server_socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer extends Thread {

	ServerSocket ss;

	public MyServer() {
		try {
			// ������ ������ Ŭ���̾�Ʈ���� ���� ��Ʈ�� ����д�
			ss = new ServerSocket(3000);
			System.out.println("���� �غ� �Ϸ�");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		while (true) {
			try {
				// ������ Ŭ���̾�Ʈ�� ������ ������ accept()�޼���� �޾Ƽ�
				// s��ü���� �Ѱ��ش�
				// accept() : �����ڰ� �� ������ ���
				Socket s = ss.accept();
				
				//������ ����� ip�ּ�
				String ip = s.getInetAddress().getHostAddress();
				System.out.println(ip + "�� ������ ȯ���մϴ�");
				
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}

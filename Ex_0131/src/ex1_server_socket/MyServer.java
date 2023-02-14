package ex1_server_socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer extends Thread {

	ServerSocket ss;

	public MyServer() {
		try {
			// 서버로 접근할 클라이언트들을 위해 포트를 열어둔다
			ss = new ServerSocket(3000);
			System.out.println("서버 준비 완료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		while (true) {
			try {
				// 접속한 클라이언트의 정보를 서버가 accept()메서드로 받아서
				// s객체에게 넘겨준다
				// accept() : 접속자가 올 때까지 대기
				Socket s = ss.accept();
				
				//접속한 사람의 ip주소
				String ip = s.getInetAddress().getHostAddress();
				System.out.println(ip + "님 접속을 환영합니다");
				
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}

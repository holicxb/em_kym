package ex1_server_socket;

import java.net.Socket;

public class MyClient {

	public static void main(String[] args) {
		
		//클라이언트를 의미하는 소켓 객체를 생성한 뒤
		//접속할 서버의 ip 주소와 포트번호를 통해 서버에 접속한다
		try {
			Socket s = new Socket("192.168.3.10", 3000);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}//main
}

package ex1_server_socket;

import java.net.Socket;

public class MyClient {

	public static void main(String[] args) {
		
		//Ŭ���̾�Ʈ�� �ǹ��ϴ� ���� ��ü�� ������ ��
		//������ ������ ip �ּҿ� ��Ʈ��ȣ�� ���� ������ �����Ѵ�
		try {
			Socket s = new Socket("192.168.3.10", 3000);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}//main
}

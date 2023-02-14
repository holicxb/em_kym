package ex2_multi_chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class CopyClient extends Thread{

	//생성자를 통해 원본 클라이언트의 소켓 정보 및 서버 정보를 받는다
	
	Socket s;
	BufferedReader in;
	PrintWriter out;
	ChatServer server;
	String ip;
	
	public CopyClient(Socket s, ChatServer cs) {
		this.s = s;
		this.server = cs;
		
		try {
			out = new PrintWriter(s.getOutputStream(), true);//true : 자동 flush
			in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			ip = s.getInetAddress().getHostAddress();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}//생성자
	
	@Override
	public void run() {
		try {
			while(true){
				
				String msg = in.readLine();
				if(msg.equals("xx:~!X")) {
					out.println("xx:~!X");
					
					server.removeClient(this);
					break;
				}
				
				server.sendMessage(ip + " : " + msg);
				
			}//while
		} catch (Exception e) {
			// TODO: handle exception
		}
	}//run
}

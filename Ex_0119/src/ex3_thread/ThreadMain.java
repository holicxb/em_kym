package ex3_thread;

public class ThreadMain {

	public static void main(String[] args) {
		
		ThreadEx te = new ThreadEx();
		te.start();//run()을 독립적으로 실행
		System.out.println("main 스레드 종료");
		 
	}//main
	
}

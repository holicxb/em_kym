package ex4_multi_thread;

public class TMain {

	public static void main(String[] args) {
		
		T1 t1 = new T1();
		T2 t2 = new T2();
		
		t1.start();
		t2.start();
		
		try {
			Thread.sleep(500);//0.5초간 대기
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("main 스레드 끝");
		
	}//main
	
}

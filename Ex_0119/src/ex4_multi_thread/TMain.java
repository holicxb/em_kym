package ex4_multi_thread;

public class TMain {

	public static void main(String[] args) {
		
		T1 t1 = new T1();
		T2 t2 = new T2();
		
		t1.start();
		t2.start();
		
		try {
			Thread.sleep(500);//0.5�ʰ� ���
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("main ������ ��");
		
	}//main
	
}
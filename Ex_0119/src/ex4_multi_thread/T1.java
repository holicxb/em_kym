package ex4_multi_thread;

public class T1 extends Thread{

	@Override
	public void run() {
		for(int i = 0;	i < 100;	i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print("1");
		}
	}
}

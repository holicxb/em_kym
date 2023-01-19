package ex5_thread;

public class T1 extends Thread{

	private int num;
	public T1(int num) {
		this.num = num;
	}
	@Override
	public void run() {
		for(int i = 0;	i < num;	i++) {
			try {
				System.out.println(num - i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

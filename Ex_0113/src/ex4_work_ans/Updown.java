package ex4_work_ans;

import java.util.Random;

public class Updown {

	private int random = new Random().nextInt(50) + 1;
	private int count = 0;
	private boolean isEnd = false;
	
	//Up, Down, ���� �Ǵ�
	public boolean checkResult(int n) {
		count++;
		
		if(n < random) {
			System.out.println("UP");
		}else if(n > random) {
			System.out.println("Down");
		}else {
			System.out.println(count + "ȸ ���� ����!");
			isEnd = true;
		}
		
		return isEnd;
		
		
	}
	
	
}

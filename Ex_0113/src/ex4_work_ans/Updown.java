package ex4_work_ans;

import java.util.Random;

public class Updown {

	private int random = new Random().nextInt(50) + 1;
	private int count = 0;
	private boolean isEnd = false;
	
	//Up, Down, 정답 판단
	public boolean checkResult(int n) {
		count++;
		
		if(n < random) {
			System.out.println("UP");
		}else if(n > random) {
			System.out.println("Down");
		}else {
			System.out.println(count + "회 만에 정답!");
			isEnd = true;
		}
		
		return isEnd;
		
		
	}
	
	
}

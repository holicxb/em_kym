package ex7_thread_work_ans;

import java.util.Random;
import java.util.Scanner;

@SuppressWarnings("resource")
public class Work extends Thread{

	int su1, su2;
	int timer = 0;//시간계산 변수
	int playCount = 0;
	boolean isCheck = true;
	final int FINISH = 5;
	
	public void gameStart() {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		
		while(isCheck) {
			su1 = rnd.nextInt(100) + 1;
			su2 = rnd.nextInt(100) + 1;
			//문제 출제
			System.out.printf("%d + %d = ", su1, su2);
			int result = sc.nextInt();
			if(result == (su1 + su2)) {
				System.out.println("정답!!");
				playCount++;
			}else {
				System.out.println("오답...");
			}
			//게임 종료 시점 판단
			if(playCount == FINISH) {
				System.out.println("정답까지 " + timer + "초 걸림");
				isCheck = false;
			}
		}
	}
	
	
	@Override
	public void run() {
		
		while(isCheck) {
			try {
				Thread.sleep(1000);
				timer++;
			} catch (Exception e) {
				
			}
		}
		
	}
}

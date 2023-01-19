package ex7_thread_work;

import java.util.Random;
import java.util.Scanner;

public class MakingP extends Thread {

	int num1 = 0;
	int num2 = 0;
	int sec = 0;
	boolean end = true;
	int count = 0;// 5문제가 될때까지 셀거임

	@SuppressWarnings("resource")
	public void problem() {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		while (count < 5) {
			num1 = rnd.nextInt(100) + 1;
			num2 = rnd.nextInt(100) + 1;
			int answer = num1 + num2;
			System.out.print(num1 + " + " + num2 + " = ");
			int input = sc.nextInt();

			if (answer == input) {
				System.out.println("정답!!");
				count++;
			} else {
				System.out.println("오답...");
			}
		}
		end = false;
	}

	@Override
	public void run() {
		try {
			while (end) {
				sec++;
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("5문제 푸는데 " + sec + "초가 걸렸습니다");
	}

}

package work;

import java.util.*;
@SuppressWarnings("resource")

public class WordGame extends Thread {

	ArrayList<String> list = new ArrayList<String>();
	private String[] fruit = { "apple", "pineapple", "grape", "banana", "pear" };
	boolean isCheck = true;
	int timer = 0;

	public void playGame() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println(list);
			System.out.print(">> ");
			String str = sc.next();
			String lStr = str.toLowerCase();
			list.remove(lStr);
			
			if(list.size() == 0) {
				isCheck = false;
				System.out.println(timer + "초 만에 클리어!!");
				break;
			}
		}
	}

	@Override
	public void run() {
		while (isCheck) {
			try {
				Random rnd = new Random();
				if (timer % 3 == 0) {
					list.add(fruit[rnd.nextInt(fruit.length)]);
				}
				Thread.sleep(1000);
				timer++;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

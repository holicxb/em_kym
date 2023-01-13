package ex4_work;

import java.util.*;

public class UpdownMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//1~50 사이의 난수를 발생
		//메인에서 정수값을 입력 받음
		//입력받은 값이 UP, DOWN, 정답인지 판단
		//정답일 경우 main 클래스의 while문을 빠져나가도록 처리
		
		//숫자 : 30
		//Down
		//숫자 : 15
		//Up
		//숫자 : 25
		//3회 만에 정답!!
		Random rnd = new Random();
		UpDown updown = new UpDown();
		Scanner scan = new Scanner(System.in);
		int com = rnd.nextInt(49) + 1;
		int count = 0;
		boolean decide = true;
		while(true) {
			//up, down 및 정답처리
			//정답인 경우 while문을 빠져나간다
			System.out.println(com);
			System.out.print("숫자 : ");
			int user = scan.nextInt();
			decide = updown.decideNum(com, user);
			count++;
			if(decide == false) {
				break;
			}
		}
		System.out.println(count + "회 만에 정답!");
	}
}

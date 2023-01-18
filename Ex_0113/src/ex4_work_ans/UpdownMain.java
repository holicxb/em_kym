package ex4_work_ans;

import java.util.Scanner;

public class UpdownMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// 1~50 사이의 난수를 발생
		// 메인에서 정수값을 입력 받음
		// 입력받은 값이 UP, DOWN, 정답인지 판단
		// 정답일 경우 main 클래스의 while문을 빠져나가도록 처리

		// 숫자 : 30
		// Down
		// 숫자 : 15
		// Up
		// 숫자 : 25
		// 3회 만에 정답!!
		Scanner scan = new Scanner(System.in);
		Updown ud = new Updown();
		
		while(true) {
			
			System.out.print("숫자 : ");
			int n = scan.nextInt();
			
			boolean res = ud.checkResult(n);
			if(res) {//res == true
				//정답을 맞춘 경우 
				break;//while문을 빠져나간다.
			}
			
		}
		
		
	}// main
}

package ex1_baseball;

import java.util.*;

public class Ex1_baseball {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random rnd = new Random();
		int com1, com2, com3;//컴퓨터 생성 숫자
		int u1, u2, u3;//유저 입력 숫자
		int t = 0;//시도 횟수
		
		do {//중복되지 않는 세 개의 난수 만들기
			com1 = rnd.nextInt(9) + 1;
			com2 = rnd.nextInt(9) + 1;
			com3 = rnd.nextInt(9) + 1;
		}while(com1 == com2 || com1 == com3 || com2 == com3);
		
		System.out.println("정답 : " + com1 + com2 + com3);
		
		while(true) {
		//정답이라 생각하는 세자리의 수 입력 받기
			t++;
			System.out.print("수 1 : ");
			u1 = scan.nextInt();
			System.out.print("수 2 : ");
			u2 = scan.nextInt();
			System.out.print("수 3 : ");
			u3 = scan.nextInt();
			
			//경우의 수는 9가지
			//스트라이크와 볼 갯수를 저장할 변수
			int strike = 0;
			int ball = 0;
			
			//정답처리를 위한 경우의 수
			if(u1 == com1) {
				strike++;
			}else if(u1 == com2 || u1 == com3) {
				ball++;
			}

			if(u2 == com2) {
				strike++;
			}else if(u2 == com1 || u2 == com3) {
				ball++;
			}
			
			if(u3 == com3) {
				strike++;
			}else if(u3 == com2 || u3 == com1) {
				ball++;
			}
			
			if(strike == 3) {
				System.out.println(t + "번 째 정답!");
				break;//정답을 맞춘 경우 while문을 빠져나간다
			}else {
				if(strike == 0	&&	ball == 0) {
					//out을 판단하는 코드
					System.out.println("out!");
				}else {
					//아웃이 아닌 경우 strike와 ball의 수를 보여준다.
					System.out.printf("strike : %d	ball : %d\n", strike, ball);
					System.out.printf("%d Strike	%d Ball\n", strike, ball);
				}
			}
			System.out.println("---------------");
			
		}//while
		
		
	}//main
}

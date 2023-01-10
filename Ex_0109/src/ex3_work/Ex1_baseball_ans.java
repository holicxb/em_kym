package ex3_work;

import java.util.Random;
import java.util.Scanner;

public class Ex1_baseball_ans {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		int[] com = new int[3]; //컴퓨터 난수
		int[] user = new int[3];//사용자 값
		do {
			for(int i = 0;	i < com.length;	i++) {
				com[i] = rnd.nextInt(9) + 1;
			}
		}while(com[0] == com[1] || com[0] == com[2] || com[1] == com[2]);
		
		//언제 끝날지 모를 게임을 위해 무한 반복하는 while문 작성
		while(true) {
			System.out.print("입력(예:123) - ");
			int number = sc.nextInt();
			
			//사용자가 입력한 세 자리 수를 백, 십, 일의 자리로 끊어서 user 배열에 저장
			user[0] = number / 100;//백의 자리
			user[1] = number % 100 /10;//십의 자리
			user[2] = number % 100 % 10;//일의 자리
			
			int strike = 0;
			int ball = 0;
			
			//경우의 수 //핵심
			for(int i = 0;	i < com.length;	i++) {
				for(int j = 0;	j < com.length;	j++) {
					
					if(i == j) {
						if(com[i] == user[j]) {
							strike++;
						}
					}else {
						if(com[i] == user[j]) {
							ball++;
						}
					}
					
				}//inner
			}//outer
			
			if(strike == 3) {
				System.out.println("정답");
				break;
			}
			else {
				if(strike > 0 || ball > 0)
				{
					System.out.printf("%d Strike %d Ball\n", strike, ball);
				}else {
					System.out.println("OUT");
				}
			}
			System.out.println("---------------------------");
		}//while
		
	}//main
}

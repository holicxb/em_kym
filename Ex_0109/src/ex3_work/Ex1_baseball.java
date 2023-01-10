package ex3_work;

import java.util.*;

public class Ex1_baseball {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// 이전에 제작한 숫자 야구 게임을
		// 배열을 사용하여 코드를 줄여보세요(라인 수)

		Scanner scan = new Scanner(System.in);
		Random rnd = new Random();

		int place = 5;
		int[] com = new int[place];
		int[] user = new int[place];
		int count = 0;

		for (int i = 0; i < place; i++) {
			com[i] = rnd.nextInt(9) + 1;

			for (int j = 0; j < i; j++) {
				if (com[i] == com[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(com));

		while (true) {
			int strike = 0;
			int ball = 0;
			count++;
			for(int i = 0; i < place;	i++) {
				System.out.print(i+1 + "번째 수 : ");
				user[i] = scan.nextInt();
			}
			for(int i = 0; i < place;	i++) {
				for(int j = 0;	j < place;	j++) {
					if(user[i] == com[j]) {
						if(i != j) {
							ball++;
						}else{
							strike++;							
						}
					}
				}
			}
			
			if (strike == place) {
				System.out.println(count + "번 째 정답!");
				break;// 정답을 맞춘 경우 while문을 빠져나간다
			} else {
				if (strike == 0 && ball == 0) {
					// out을 판단하는 코드
					System.out.println("out!");
				} else {
					// 아웃이 아닌 경우 strike와 ball의 수를 보여준다.
					System.out.printf("strike : %d	ball : %d\n", strike, ball);
				}
			}
			System.out.println("---------------");

		} // while

	}// main
}

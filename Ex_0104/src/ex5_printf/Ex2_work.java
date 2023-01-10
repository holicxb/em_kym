package ex5_printf;

import java.util.*;
public class Ex2_work {

	public static void main(String[] args) {
		
		//구구단
		//for문
		//단을 집어넣으면 해당 구구단이 출력
		//구구단을 넘어가는 단을 입력 받으면 2~9사이 값만 입력해주세요 출력
		int dan = 0;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("단을 입력하시오 : ");
		dan = scan.nextInt();
		
		if(dan > 1 && dan < 10) {
			for(int i = 1;	i < 10;	i++) {	
				System.out.printf("%d * %d = %d\n", dan, i, dan * i);
			}//for
		}else {
			System.out.println("2 ~ 9 사이의 값만 입력해주세요");
		}
		
		
	}//main
	
}

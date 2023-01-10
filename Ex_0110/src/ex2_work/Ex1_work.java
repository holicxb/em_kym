package ex2_work;

import java.util.*;
public class Ex1_work {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//키보드에서 입력 받은 값 만큼 피보나치 수열 출력하기
		
		//입력 : 5
		// 1 1 2 3 5 /- 8 13 21 ... 규칙
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하시오 : ");
		int n = scan.nextInt();
		
		int a = 1;//n-1번재
		int b = 0;//n-2번째
		int fibo = a;//n번째
		
		for(int i = 0;	i < n;	i++) {
			fibo = a + b;
			System.out.print(fibo + " ");
			a = b;
			b = fibo;
		}
		System.out.println();
		System.out.println("--------------------");
		int[] fb = new int[n];
		fb[0] = 1;
		fb[1] = 1;
		System.out.printf("%d %d ", fb[0], fb[1]);
		for(int i = 2;	i < fb.length;	i++) {	
			fb[i] = fb[i-2] + fb[i-1];
			System.out.print(fb[i] + " ");
		}
		
	}//main
	
}

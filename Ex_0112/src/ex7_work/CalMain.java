package ex7_work;

import java.util.Scanner;

public class CalMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//수1, 수2, 연산자를 Calculator의 getResult()메서드로 전달하여
		//결과를 출력하시오
		
		//수1 : n
		//수2 : m
		//연산자 : +
		//n + m = 결과(Calculator에서 출력까지)
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("수1 : ");
		int n = scan.nextInt();
		System.out.print("수2 : ");
		int m = scan.nextInt();
		System.out.print("연산자 : ");
		String op = scan.next();
		
		Calculator c = new Calculator();
		c.getResult(n, m, op);
		
		
	}//main
}

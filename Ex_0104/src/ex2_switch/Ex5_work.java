package ex2_switch;

import java.util.*;

public class Ex5_work {

	public static void main(String[] args) {
		
		//su에 아무 값이나 넣기
		//switch 문을 사용하여 su1 op su2 = 결과 출력
		int su1 = 10;
		int su2 = 5;
		char op = '+'; //+,-,*,/,% 중 하나 원하는 연산자 넣기
		int result = 0;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자1을 입력하시오 : ");
		su1 = scan.nextInt();
		System.out.print("숫자2를 입력하시오 : ");
		su2 = scan.nextInt();
		System.out.print("연산자를 입력하시오 : ");
		op = scan.next().charAt(0);
		
		switch (op) {
		case '+':
			result = su1 + su2;
			System.out.println("결과 : " + su1 + op + su2 +"=" + result);
			//System.out.println(su1 + " + " + su2 + " = " + (su1 + su2));
			break;
		case '-':
			result = su1 - su2;
			System.out.println("결과 : " + su1 + op + su2 +"=" + result);
			break;
		case '*':
			result = su1 * su2;
			System.out.println("결과 : " + su1 + op + su2 +"=" + result);
			break;
		case '/':
			result = su1 / su2;
			System.out.println("결과 : " + su1 + op + su2 +"=" + result);
			break;
		case '%':
			result = su1 % su2;
			System.out.println("결과 : " + su1 + op + su2 +"=" + result);
			break;
			
		default:
			System.out.println("연산자가 올바르지 않습니다");
			break;
		}
		
		
	}//main
}

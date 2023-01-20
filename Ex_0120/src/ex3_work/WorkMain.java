package ex3_work;

import java.util.Scanner;

public class WorkMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// 아래와 같은 결과를 출력하되,
		// try-catch구문을 사용하지 않고 코드를 작성하시오

		// 정수 : 123 입력 받기
		// 123은 정수입니다

		// 정수 : ab91
		// ab91은 정수가 아님

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		String str = sc.next();
		boolean isNum = true;
		char[] cStr = str.toCharArray();
		for (int i = 0; i < cStr.length; i++) {
			if (Character.isDigit(cStr[i])) {
				isNum = true;
			} else {
				isNum = false;
				break;
			}
		}
		if (isNum) {
			System.out.println(str + "은(는) 정수입니다");
		} else {
			System.out.println(str + "은(는) 정수가 아닙니다");
		}
		
		System.out.println("-------------------");
		
		isNum = str.matches("-?\\d+");
		if (isNum) {
			System.out.println(str + "은(는) 정수입니다");
		} else {
			System.out.println(str + "은(는) 정수가 아닙니다");
		}
		System.out.println("---------------------");
		
		for (int i = 0; i < cStr.length; i++) {
			if (cStr[i] < '0' || cStr[i] > '9') {
				isNum = false;
				break;
			} else {
				isNum = true;
			}
		}
		if (isNum) {
			System.out.println(str + "은(는) 정수입니다");
		} else {
			System.out.println(str + "은(는) 정수가 아닙니다");
		}
		
	}// main

}

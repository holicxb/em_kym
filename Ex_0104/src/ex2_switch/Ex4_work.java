package ex2_switch;

import java.util.*;

public class Ex4_work {

	public static void main(String[] args) {
		
		//넣은 결과가 몇일까지 있는지 나오도록.
		//1)올바른 입력 : 4 -> 30일까지 있습니다. 2월은 28일까지
		//2)올바르지 않은 입력 : 13월은 없습니다. 
		int month = 0;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하시오 : ");
		month = scan.nextInt();
		switch(month) {
		case 2:
			System.out.println(month + "월은 28일까지 있습니다");
			break;
		//31까지 있는 달
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(month + "월은 31일까지 있습니다");
			break;
		//30까지 있는 달
		case 4:	case 6:
		case 9:	case 11:
			System.out.println(month + "월은 30일까지 있습니다");
			break;
		default:
			System.out.println(month + "월은 없습니다");
			break;
		}
		//case는 12개가 있어야함. 그러나 break 까지 12개가 있을 필요는 없다. 
		
		
	}//main
}

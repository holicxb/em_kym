package ex1_work;

import java.util.Scanner;

@SuppressWarnings("resource")
public class WorkMain {

	public static void main(String[] args) {
	
		//영문과 숫자에 대한 암호표를 배열로 준비
		char[] alphaCode = {'`', '~', '!', '@', '#',
				'$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=', 
				'|', '[', ']', '{', '}', ';', ':', ',', '.', '/'
		};
		char[] numCode = {'q', 'w', 'e', 'r', 't',
				'y', 'u', 'i', 'o', 'p'				
		};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("값 : ");
		String str = sc.next();
		//암호화 완료된 결과를 저장할 변수
		String result = "";
		
		//암호와 작업을 위한 클래스 호출
		Work work = new Work();
		result = work.setEnc(str, alphaCode, numCode);
		
		System.out.println("원본 : " + str);
		System.out.println("암호화 : " + result);
	}	
	
}

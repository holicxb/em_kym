package ex3_work;

import java.util.*;

public class Ex2_work {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//회문수 판단하기
		//회문수란 앞으로 읽어도 뒤에서 읽어도 똑같이 읽히는 숫자
		//회문 : 소주만병만주소....기러기 우영우 토마토.. 12321...
		
		//값 : a1221a
		//a1221a 은(는) 회문수입니다.
		//값 : abc
		//abc 은(는) 회문수가 아닙니다. 
		
		Scanner scan = new Scanner(System.in);
		System.out.print("값 : ");
		String input = scan.next();//판단하고자 입력받음
		boolean p = true;
		int length = input.length();
		for(int i = 0;	i < length/2;	i++) {
			if(input.charAt(i) != input.charAt(length-i-1)) {
				p = false;
			}else {
				p = true;
			}
		}
		if(p == true) {
			System.out.printf("%s는(은) 회문입니다\n", input);
		}else {
			System.out.printf("%s는(은) 회문이 아닙니다\n", input);
		}
		
		System.out.println("-------------------------------");
		
		//원본을 통째로 뒤집어서 원본과 비교하는 방법
		String rev = "";//뒤집힌 원본을 저장
		//만약 null로 초기화하면 이어붙일 때 null을 문장화 시켜버림
		
		for(int i = input.length()-1;	i >= 0;	i--){
			rev += input.charAt(i);//핵심코드 
			//String은 +=의 경우 이어붙이기
		}
		if(!input.equals(rev)) {//같지 않으면
			System.out.printf("%s는(은) 회문이 아닙니다\n", input);						
		}else {
			System.out.printf("%s는(은) 회문입니다\n", input);			
		}
		
		
		
	}//main
	
}

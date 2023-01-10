package ex6_random;

import java.util.*;//ctrl + shift + o import 단축키

public class Ex1_random {

	public static void main(String[] args) {

		//난수를 만들어주는 클래스 Random
		Random rnd = new Random();//Ran + ctrl + space 자동완성으로 만들어도 import 생김
		//rnd.nextInt(난수의 범위) + 시작 수(0부터 시작인 경우는 생략 가능);
		//rnd.nextInt(끝 수 - 시작수 + 1) + 시작 수(0부터 시작인 경우는 생략 가능);
		
		//12345 ~ 34567 사이의 난수 생성		
		int num = rnd.nextInt(34567-12345+1) + 12345;
		System.out.println(num);
		
		System.out.println("-------------------------------");
		
		//문자 : A ~ Z 사이의 알파벳이 랜덤으로 출력되도록 하세요
		
		int alpha = rnd.nextInt('Z' - 'A' + 1) + 'A';
		System.out.println("문자 : " + (char)alpha);
		
		
	}//main
	
}

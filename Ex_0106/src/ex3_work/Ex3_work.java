package ex3_work;

import java.util.*;
public class Ex3_work {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//for문 사용 문제
		//break도 사용
		//키보드에서 정수값을 입력받고 입력받은 숫자가 소수(1과 본인으로만 나눠지는 수)인지 판단하시오
		//단, 키보드에서 1을 받았다면 '1은 소수가 아님'
		
		//값 : 5
		//5은(는) 소수입니다.
		
		//값 : 6
		//6은(는) 소수가 아닙니다. 
		
		Scanner scan = new Scanner(System.in);
		System.out.print("0보다 큰 값을 입력하시오 : ");
		int n = scan.nextInt();
		int count = 0;
		
		for(int i = 1;	i < n + 1;	i++) {
			if(n % i == 0) {
				count++;
			}
			if(count > 2)
				break;
		}
		if(count > 2) {
			System.out.println(n + "은(는) 소수가 아닙니다. ");
		}else if(n == 1) {
			System.out.println(n + "은 소수가 아님");
		}else {
			System.out.println(n + "은(는) 소수입니다. ");
		}
		
		System.out.println("--------------------------");
		
		count = 0;
		if(n==1)
			System.out.println(n + "은 소수가 아님");
		else {
			for(int i = 1;	i < n + 1;	i++) {
				if(n % i == 0) {
					count++;
				}
				if(count > 2)
					break;
			}
			if(count > 2) {
				System.out.println(n + "은(는) 소수가 아닙니다. ");
			}else {
				System.out.println(n + "은(는) 소수입니다. ");
			}
			
		}
		
		System.out.println("------------------------");
		int i = 0;
		
		for(i = 2;	i <= n;	i++) {
			if(n % i == 0) {
				break;
			}
		}
		
		if(i == n) {
			System.out.println(n + "은(는) 소수");
		}else {
			System.out.println(n + "은(는) 소수 아님");
		}
		
		
		
		
		
	}//main
	
}

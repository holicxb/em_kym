package ex1_scanner;

import java.util.Scanner;

public class Ex2_work {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//키보드에서 n1과 n2 변수에 각각 정수 값을 입력 받는다
		//n1 ~ n2까지 합을 출력하시오
		//수 1 : 2
		//수 2 : 5
		//결과 : 14
		//조건 : 수1 받으세요 5, 수2 받으세요 2
		//큰 수를 먼저 받아도 똑같은 결과가 출력되도록
		
		Scanner scan = new Scanner(System.in);
		int n1 = 0;
		int n2 = 0;
		int total = 0;
		
		System.out.print("수 1 : ");
		n1 = scan.nextInt();
		System.out.print("수 2 : ");
		n2 = scan.nextInt();
		
		if(n1 < n2) {
			for(int i = n1;	i <= n2;	i++) {
				total += i;
			}
		}else if(n2 < n1){
			for(int i = n2;	i <= n1;	i++) {
				total += i;;
			}
		}else {
			total = n1;
		}
		System.out.println("결과 : " + total);
		
		
		//변수 간의 값 교환
		
		System.out.println("------------");
		if(n2<n1) {
			int temp = 0;
			temp = n1;
			n1 = n2;
			n2 = temp;
		}
		total = 0;
		for(int i = n1;	i <= n2;	i++) {
			total += i;
		}
		System.out.println("결과는 : "+total);
		
		System.out.println("---------------");
		
		
	}//main
	
}

package ex8_work;
import java.util.*;
public class Money {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//사용자가 가지고 있는 돈을 입력 받고
		//크림빵, 새우깡, 콜라를 잔돈을 남기지 않고 
		//구입하는 경우의 수 출력하기
		//크림빵 500, 새우깡 700, 콜라 400
		
		//결과 : 
		//당신이 소유한 금액 :4000(입력)
		//크림빵 : 1개, 새우깡 : 1봉지, 콜라 : 7캔
		//크림빵 : 2개, 새우깡 : 2봉지, 콜라 : 4캔
		//크림빵 : 3개, 새우깡 : 3봉지, 콜라 : 1캔
		//크림빵 : 5개, 새우깡 : 1봉지, 콜라 : 2캔
		
		int cream = 500;
		int shrimp = 700;
		int coke = 400;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("당신이 소유한 금액 : ");
		int money = scan.nextInt();
		
		for(int i = 1;	money - cream * i > 0;	i++) {//크림빵 수
			for(int j = 1; money - shrimp * j > 0;	j++) {//새우깡 수
				for(int k = 1;	money - coke * k > 0;	k++) {//콜라 수
					if(money == (cream * i + shrimp * j + coke * k)) {
						System.out.printf("크림빵 : %d개,	새우깡 : %d봉지,	콜라 : %d캔\n",i,j,k);
					}
				}
			}
		}
		
		
		
	}//main
	
}

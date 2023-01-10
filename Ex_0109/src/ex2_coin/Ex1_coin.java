package ex2_coin;

import java.util.*;

public class Ex1_coin {

	public static void main(String[] args) {
		
		//변수  money 에 10~5000까지의 난수를 만들어 넣는다
		//단, 1의 자리 숫자는 반드시 0으로 만들어지도록 한다.
		//발생된 난수 money를 동전으로 바꿨을 때, 
		//500, 100, 50, 10원짜리 동전이 각각 몇개 거슬러지는지 판단하는 코드 구현
		//단, 가능한 적은 수의 동전으로 거슬러준다.
		
		//금액 : 2590원
		//500원 : 5
		//50원 : 1
		//10원 : 4
		
		Random rnd = new Random();
		int[] coin = {5000, 1000, 500, 100, 50, 10};
		//int money = rnd.nextInt(1000) + 1;
		//money *= 10;
		int money = rnd.nextInt(1000) * 10;
		
		System.out.println("금액 : " + money);
		
		for(int i = 0;	i < coin.length;	i++) {
			int count = money / coin[i];
			if(count > 0) {
				System.out.println(coin[i] + "원 : " + count);
				money %= coin[i];
			}
		}
		
		System.out.println("===============");
		
		money = rnd.nextInt(1000) + 1;
		money *= 10;
		System.out.println("금액 : " + money);

		for(int i = 0;	i < coin.length;	i++) {
			int res = money/coin[i];
			if(res > 0) {
				System.out.printf("%d원 : %d\n", coin[i], res);
				money %= coin[i];
			}
		}
		
	}//main
}

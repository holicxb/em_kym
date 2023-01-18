package ex7_work;

import java.util.Scanner;

public class VendingMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// 자판기
		// 내가 입력한 금액으로 살 수 있는 음료 목록만 출력
		// 음료를 선택하면 제공 및 잔액 반환

		// insert coin : 1000
		// fanta - 1000
		// coke - 900
		// sider - 900
		// >> coke
		// coke (을)를 선택하셨습니다
		// 잔액 : 100원
		
		Scanner sc = new Scanner(System.in);
		Vending ven = new Vending();
		
		ven.canInit();//음료 초기화
		System.out.print("insert coin : ");
		int money = sc.nextInt();
		
		ven.showCans(money);
		
		System.out.print(">> ");
		String select = sc.next();//음료수 이름 입력
		
		//음료 제공 및 잔돈 반환
		ven.outCan(select);
		
	}// main
}

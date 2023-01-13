package ex3_account;

import java.util.Scanner;

public class User {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Atm atm = new Atm();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("1.입	금 : ");
			System.out.println("2.출	금 : ");
			System.out.println("3.잔액	확인 : ");
			System.out.println("etc. 종	료 : ");
			System.out.print(">> ");
			int select = sc.nextInt();
			int money = 0;
			
			if(select == 1) {
				System.out.print("--- 입금 ---\n입금액 : ");
				money = sc.nextInt();
				atm.pMoney(money);
			}else if(select == 2) {
				System.out.print("--- 출금 ---\n출금액 : ");
				money = sc.nextInt();
				atm.dMoney(money);
			}else if(select == 3) {
				atm.getMoney();
			}else {
				System.out.println("atm 종료");
				break;
			}
			System.out.println("-----------");
		}//while
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		out : while(true) {
			System.out.println("1.입	금 : ");
			System.out.println("2.출	금 : ");
			System.out.println("3.잔액	확인 : ");
			System.out.println("etc. 종	료 : ");
			System.out.print(">> ");
			int select = sc.nextInt();
			int money = 0;
			switch (select) {
			case 1:
				System.out.print("--- 입금 ---\n입금액 : ");
				money = sc.nextInt();
				atm.pMoney(money);
				break;
			case 2:
				System.out.print("--- 출금 ---\n출금액 : ");
				money = sc.nextInt();
				atm.dMoney(money);
				break;
			case 3:
				System.out.println("--- 잔액 ---");
				atm.getMoney();
				break;

			default:
				System.out.println("atm 종료");
				break out;
			}
			System.out.println("---------------------------");
		}
		
	}//main
	
}

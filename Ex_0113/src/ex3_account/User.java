package ex3_account;

import java.util.Scanner;

public class User {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Atm atm = new Atm();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("1.��	�� : ");
			System.out.println("2.��	�� : ");
			System.out.println("3.�ܾ�	Ȯ�� : ");
			System.out.println("etc. ��	�� : ");
			System.out.print(">> ");
			int select = sc.nextInt();
			int money = 0;
			
			if(select == 1) {
				System.out.print("--- �Ա� ---\n�Աݾ� : ");
				money = sc.nextInt();
				atm.pMoney(money);
			}else if(select == 2) {
				System.out.print("--- ��� ---\n��ݾ� : ");
				money = sc.nextInt();
				atm.dMoney(money);
			}else if(select == 3) {
				atm.getMoney();
			}else {
				System.out.println("atm ����");
				break;
			}
			System.out.println("-----------");
		}//while
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		out : while(true) {
			System.out.println("1.��	�� : ");
			System.out.println("2.��	�� : ");
			System.out.println("3.�ܾ�	Ȯ�� : ");
			System.out.println("etc. ��	�� : ");
			System.out.print(">> ");
			int select = sc.nextInt();
			int money = 0;
			switch (select) {
			case 1:
				System.out.print("--- �Ա� ---\n�Աݾ� : ");
				money = sc.nextInt();
				atm.pMoney(money);
				break;
			case 2:
				System.out.print("--- ��� ---\n��ݾ� : ");
				money = sc.nextInt();
				atm.dMoney(money);
				break;
			case 3:
				System.out.println("--- �ܾ� ---");
				atm.getMoney();
				break;

			default:
				System.out.println("atm ����");
				break out;
			}
			System.out.println("---------------------------");
		}
		
	}//main
	
}

package ex1_vending;

import java.util.Scanner;

public class VendingMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// ���Ǳ�
		// ���� �Է��� �ݾ����� �� �� �ִ� ���� ��ϸ� ���
		// ���Ḧ �����ϸ� ���� �� �ܾ� ��ȯ

		// insert coin : 1000
		// fanta - 1000
		// coke - 900
		// sider - 900
		// >> coke
		// coke (��)�� �����ϼ̽��ϴ�
		// �ܾ� : 100��
		
		Scanner sc = new Scanner(System.in);
		Vending ven = new Vending();
		
		System.out.print("insert coin : ");
		int money = sc.nextInt();
		
		ven.showCans(money);
		
		System.out.print(">> ");
		String select = sc.next();//����� �̸� �Է�
		
		//���� ���� �� �ܵ� ��ȯ
		ven.outCan(select);
		
	}// main
}

package ex7_work;

import java.util.Scanner;

public class CalMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//��1, ��2, �����ڸ� Calculator�� getResult()�޼���� �����Ͽ�
		//����� ����Ͻÿ�
		
		//��1 : n
		//��2 : m
		//������ : +
		//n + m = ���(Calculator���� ��±���)
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("��1 : ");
		int n = scan.nextInt();
		System.out.print("��2 : ");
		int m = scan.nextInt();
		System.out.print("������ : ");
		String op = scan.next();
		
		Calculator c = new Calculator();
		c.getResult(n, m, op);
		
		
	}//main
}

package ex1_scanner;

import java.util.Scanner;

public class Ex1_scanner {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//Ű���忡�� ���� �Է� ���� �� �ֵ��� ���ִ� Ŭ����
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		System.out.println("�Է¹��� �� : " + num);
		
		System.out.print("���� : ");
		String str = sc.next();
		
		System.out.println("��� : " + str);
		
	}//main
}

package ex3_work;

import java.util.Scanner;

public class WorkMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// �Ʒ��� ���� ����� ����ϵ�,
		// try-catch������ ������� �ʰ� �ڵ带 �ۼ��Ͻÿ�

		// ���� : 123 �Է� �ޱ�
		// 123�� �����Դϴ�

		// ���� : ab91
		// ab91�� ������ �ƴ�

		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		String str = sc.next();
		boolean isNum = true;
		char[] cStr = str.toCharArray();
		for (int i = 0; i < cStr.length; i++) {
			if (Character.isDigit(cStr[i])) {
				isNum = true;
			} else {
				isNum = false;
				break;
			}
		}
		if (isNum) {
			System.out.println(str + "��(��) �����Դϴ�");
		} else {
			System.out.println(str + "��(��) ������ �ƴմϴ�");
		}
		
		System.out.println("-------------------");
		
		isNum = str.matches("-?\\d+");
		if (isNum) {
			System.out.println(str + "��(��) �����Դϴ�");
		} else {
			System.out.println(str + "��(��) ������ �ƴմϴ�");
		}
		System.out.println("---------------------");
		
		for (int i = 0; i < cStr.length; i++) {
			if (cStr[i] < '0' || cStr[i] > '9') {
				isNum = false;
				break;
			} else {
				isNum = true;
			}
		}
		if (isNum) {
			System.out.println(str + "��(��) �����Դϴ�");
		} else {
			System.out.println(str + "��(��) ������ �ƴմϴ�");
		}
		
	}// main

}

package ex2_switch;

import java.util.*;

public class Ex5_work {

	public static void main(String[] args) {
		
		//su�� �ƹ� ���̳� �ֱ�
		//switch ���� ����Ͽ� su1 op su2 = ��� ���
		int su1 = 10;
		int su2 = 5;
		char op = '+'; //+,-,*,/,% �� �ϳ� ���ϴ� ������ �ֱ�
		int result = 0;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("����1�� �Է��Ͻÿ� : ");
		su1 = scan.nextInt();
		System.out.print("����2�� �Է��Ͻÿ� : ");
		su2 = scan.nextInt();
		System.out.print("�����ڸ� �Է��Ͻÿ� : ");
		op = scan.next().charAt(0);
		
		switch (op) {
		case '+':
			result = su1 + su2;
			System.out.println("��� : " + su1 + op + su2 +"=" + result);
			//System.out.println(su1 + " + " + su2 + " = " + (su1 + su2));
			break;
		case '-':
			result = su1 - su2;
			System.out.println("��� : " + su1 + op + su2 +"=" + result);
			break;
		case '*':
			result = su1 * su2;
			System.out.println("��� : " + su1 + op + su2 +"=" + result);
			break;
		case '/':
			result = su1 / su2;
			System.out.println("��� : " + su1 + op + su2 +"=" + result);
			break;
		case '%':
			result = su1 % su2;
			System.out.println("��� : " + su1 + op + su2 +"=" + result);
			break;
			
		default:
			System.out.println("�����ڰ� �ùٸ��� �ʽ��ϴ�");
			break;
		}
		
		
	}//main
}

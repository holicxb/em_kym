package ex2_switch;

import java.util.*;

public class Ex4_work {

	public static void main(String[] args) {
		
		//���� ����� ���ϱ��� �ִ��� ��������.
		//1)�ùٸ� �Է� : 4 -> 30�ϱ��� �ֽ��ϴ�. 2���� 28�ϱ���
		//2)�ùٸ��� ���� �Է� : 13���� �����ϴ�. 
		int month = 0;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("���ڸ� �Է��Ͻÿ� : ");
		month = scan.nextInt();
		switch(month) {
		case 2:
			System.out.println(month + "���� 28�ϱ��� �ֽ��ϴ�");
			break;
		//31���� �ִ� ��
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(month + "���� 31�ϱ��� �ֽ��ϴ�");
			break;
		//30���� �ִ� ��
		case 4:	case 6:
		case 9:	case 11:
			System.out.println(month + "���� 30�ϱ��� �ֽ��ϴ�");
			break;
		default:
			System.out.println(month + "���� �����ϴ�");
			break;
		}
		//case�� 12���� �־����. �׷��� break ���� 12���� ���� �ʿ�� ����. 
		
		
	}//main
}

package ex4_work_ans;

import java.util.Scanner;

public class UpdownMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// 1~50 ������ ������ �߻�
		// ���ο��� �������� �Է� ����
		// �Է¹��� ���� UP, DOWN, �������� �Ǵ�
		// ������ ��� main Ŭ������ while���� ������������ ó��

		// ���� : 30
		// Down
		// ���� : 15
		// Up
		// ���� : 25
		// 3ȸ ���� ����!!
		Scanner scan = new Scanner(System.in);
		Updown ud = new Updown();
		
		while(true) {
			
			System.out.print("���� : ");
			int n = scan.nextInt();
			
			boolean res = ud.checkResult(n);
			if(res) {//res == true
				//������ ���� ��� 
				break;//while���� ����������.
			}
			
		}
		
		
	}// main
}

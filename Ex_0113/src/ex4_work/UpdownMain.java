package ex4_work;

import java.util.*;

public class UpdownMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//1~50 ������ ������ �߻�
		//���ο��� �������� �Է� ����
		//�Է¹��� ���� UP, DOWN, �������� �Ǵ�
		//������ ��� main Ŭ������ while���� ������������ ó��
		
		//���� : 30
		//Down
		//���� : 15
		//Up
		//���� : 25
		//3ȸ ���� ����!!
		Random rnd = new Random();
		UpDown updown = new UpDown();
		Scanner scan = new Scanner(System.in);
		int com = rnd.nextInt(49) + 1;
		int count = 0;
		boolean decide = true;
		while(true) {
			//up, down �� ����ó��
			//������ ��� while���� ����������
			System.out.println(com);
			System.out.print("���� : ");
			int user = scan.nextInt();
			decide = updown.decideNum(com, user);
			count++;
			if(decide == false) {
				break;
			}
		}
		System.out.println(count + "ȸ ���� ����!");
	}
}

package ex1_baseball;

import java.util.*;

public class Ex1_baseball {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random rnd = new Random();
		int com1, com2, com3;//��ǻ�� ���� ����
		int u1, u2, u3;//���� �Է� ����
		int t = 0;//�õ� Ƚ��
		
		do {//�ߺ����� �ʴ� �� ���� ���� �����
			com1 = rnd.nextInt(9) + 1;
			com2 = rnd.nextInt(9) + 1;
			com3 = rnd.nextInt(9) + 1;
		}while(com1 == com2 || com1 == com3 || com2 == com3);
		
		System.out.println("���� : " + com1 + com2 + com3);
		
		while(true) {
		//�����̶� �����ϴ� ���ڸ��� �� �Է� �ޱ�
			t++;
			System.out.print("�� 1 : ");
			u1 = scan.nextInt();
			System.out.print("�� 2 : ");
			u2 = scan.nextInt();
			System.out.print("�� 3 : ");
			u3 = scan.nextInt();
			
			//����� ���� 9����
			//��Ʈ����ũ�� �� ������ ������ ����
			int strike = 0;
			int ball = 0;
			
			//����ó���� ���� ����� ��
			if(u1 == com1) {
				strike++;
			}else if(u1 == com2 || u1 == com3) {
				ball++;
			}

			if(u2 == com2) {
				strike++;
			}else if(u2 == com1 || u2 == com3) {
				ball++;
			}
			
			if(u3 == com3) {
				strike++;
			}else if(u3 == com2 || u3 == com1) {
				ball++;
			}
			
			if(strike == 3) {
				System.out.println(t + "�� ° ����!");
				break;//������ ���� ��� while���� ����������
			}else {
				if(strike == 0	&&	ball == 0) {
					//out�� �Ǵ��ϴ� �ڵ�
					System.out.println("out!");
				}else {
					//�ƿ��� �ƴ� ��� strike�� ball�� ���� �����ش�.
					System.out.printf("strike : %d	ball : %d\n", strike, ball);
					System.out.printf("%d Strike	%d Ball\n", strike, ball);
				}
			}
			System.out.println("---------------");
			
		}//while
		
		
	}//main
}

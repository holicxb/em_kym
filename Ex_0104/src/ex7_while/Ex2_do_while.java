package ex7_while;

import java.util.Random;

public class Ex2_do_while {

	public static void main(String[] args) {
		
		//do-while : �� ó��, �� ��
		//����� �� �����ϰ� ;���� ���ξ�� �Ѵ�
		//do {
		//	���ǽ��� ���� �� ����Ǵ� ����
		//}while(���ǽ�);
		
		int i = 11;
		do {
			System.out.println(i);
			//i++;
		}while(i <= 10);
		
		System.out.println("--------------------");
		
		//���� java, jsp, android�� ��������
		//0 ~ 130 ������ ���� ��´�
		//do-while�� ���� �� ������ ������ ��� 0 ~ 100 ������ ����
		//while�� �������� �� ���� ���� ������ ���
		
		//���
		//�ڹ� : nn
		//jsp : mm
		//�ȵ� : oo
		
		int java = 0;
		int jsp = 0;
		int and = 0;
		Random rnd = new Random();
		do {
			
			java = rnd.nextInt(131);
			jsp = rnd.nextInt(131);
			and = rnd.nextInt(131);
			
		}while(java > 100 || jsp > 100 || and > 100);//or�� ����� 
		
		System.out.printf("�ڹ� : %d\njsp : %d\n�ȵ� : %d\n", java, jsp, and);
		
	}//main
	
}

package ex5_printf;

import java.util.*;
public class Ex2_work {

	public static void main(String[] args) {
		
		//������
		//for��
		//���� ��������� �ش� �������� ���
		//�������� �Ѿ�� ���� �Է� ������ 2~9���� ���� �Է����ּ��� ���
		int dan = 0;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է��Ͻÿ� : ");
		dan = scan.nextInt();
		
		if(dan > 1 && dan < 10) {
			for(int i = 1;	i < 10;	i++) {	
				System.out.printf("%d * %d = %d\n", dan, i, dan * i);
			}//for
		}else {
			System.out.println("2 ~ 9 ������ ���� �Է����ּ���");
		}
		
		
	}//main
	
}

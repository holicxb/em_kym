package ex6_random;

import java.util.*;//ctrl + shift + o import ����Ű

public class Ex1_random {

	public static void main(String[] args) {

		//������ ������ִ� Ŭ���� Random
		Random rnd = new Random();//Ran + ctrl + space �ڵ��ϼ����� ���� import ����
		//rnd.nextInt(������ ����) + ���� ��(0���� ������ ���� ���� ����);
		//rnd.nextInt(�� �� - ���ۼ� + 1) + ���� ��(0���� ������ ���� ���� ����);
		
		//12345 ~ 34567 ������ ���� ����		
		int num = rnd.nextInt(34567-12345+1) + 12345;
		System.out.println(num);
		
		System.out.println("-------------------------------");
		
		//���� : A ~ Z ������ ���ĺ��� �������� ��µǵ��� �ϼ���
		
		int alpha = rnd.nextInt('Z' - 'A' + 1) + 'A';
		System.out.println("���� : " + (char)alpha);
		
		
	}//main
	
}

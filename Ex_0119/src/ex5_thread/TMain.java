package ex5_thread;

import java.util.Scanner;

public class TMain {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//Ű���忡�� ���� �ް�
		//1�ʿ� 1�� ���ҵǴ� ���� ����ϴٰ� 
		//0�� �Ǿ��� �� ������ ����
		
		//�� : 5
		//5
		//4
		//3
		//2
		//1
		//0
		
		//Ű���忡 ���� �޴� �κ��� ���ο��� ����
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� : ");
		
		int num = sc.nextInt();
		T1 t1 = new T1(num);
		
		t1.start();
		
	}//main
}

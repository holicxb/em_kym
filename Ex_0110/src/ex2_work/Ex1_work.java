package ex2_work;

import java.util.*;
public class Ex1_work {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//Ű���忡�� �Է� ���� �� ��ŭ �Ǻ���ġ ���� ����ϱ�
		
		//�Է� : 5
		// 1 1 2 3 5 /- 8 13 21 ... ��Ģ
		
		Scanner scan = new Scanner(System.in);
		System.out.print("���ڸ� �Է��Ͻÿ� : ");
		int n = scan.nextInt();
		
		int a = 1;//n-1����
		int b = 0;//n-2��°
		int fibo = a;//n��°
		
		for(int i = 0;	i < n;	i++) {
			fibo = a + b;
			System.out.print(fibo + " ");
			a = b;
			b = fibo;
		}
		System.out.println();
		System.out.println("--------------------");
		int[] fb = new int[n];
		fb[0] = 1;
		fb[1] = 1;
		System.out.printf("%d %d ", fb[0], fb[1]);
		for(int i = 2;	i < fb.length;	i++) {	
			fb[i] = fb[i-2] + fb[i-1];
			System.out.print(fb[i] + " ");
		}
		System.out.println();
		System.out.println("--------------------");
		int num1 = 1;
		int num2 = 0;
		int num3 = 0;
		
		for(int i = 0;	i < n;	i++) {
			num2 = num3;
			num3 = num1;
			num1 = num2 + num3;
			
			System.out.printf("%d ", num3);
		}
		
	}//main
	
}

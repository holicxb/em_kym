package ex3_work;

import java.util.*;
public class Ex3_work {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//for�� ��� ����
		//break�� ���
		//Ű���忡�� �������� �Է¹ް� �Է¹��� ���ڰ� �Ҽ�(1�� �������θ� �������� ��)���� �Ǵ��Ͻÿ�
		//��, Ű���忡�� 1�� �޾Ҵٸ� '1�� �Ҽ��� �ƴ�'
		
		//�� : 5
		//5��(��) �Ҽ��Դϴ�.
		
		//�� : 6
		//6��(��) �Ҽ��� �ƴմϴ�. 
		
		Scanner scan = new Scanner(System.in);
		System.out.print("0���� ū ���� �Է��Ͻÿ� : ");
		int n = scan.nextInt();
		int count = 0;
		
		for(int i = 1;	i < n + 1;	i++) {
			if(n % i == 0) {
				count++;
			}
			if(count > 2)
				break;
		}
		if(count > 2) {
			System.out.println(n + "��(��) �Ҽ��� �ƴմϴ�. ");
		}else if(n == 1) {
			System.out.println(n + "�� �Ҽ��� �ƴ�");
		}else {
			System.out.println(n + "��(��) �Ҽ��Դϴ�. ");
		}
		
		System.out.println("--------------------------");
		
		count = 0;
		if(n==1)
			System.out.println(n + "�� �Ҽ��� �ƴ�");
		else {
			for(int i = 1;	i < n + 1;	i++) {
				if(n % i == 0) {
					count++;
				}
				if(count > 2)
					break;
			}
			if(count > 2) {
				System.out.println(n + "��(��) �Ҽ��� �ƴմϴ�. ");
			}else {
				System.out.println(n + "��(��) �Ҽ��Դϴ�. ");
			}
			
		}
		
		System.out.println("------------------------");
		int i = 0;
		
		for(i = 2;	i <= n;	i++) {
			if(n % i == 0) {
				break;
			}
		}
		
		if(i == n) {
			System.out.println(n + "��(��) �Ҽ�");
		}else {
			System.out.println(n + "��(��) �Ҽ� �ƴ�");
		}
		
		
		
		
		
	}//main
	
}

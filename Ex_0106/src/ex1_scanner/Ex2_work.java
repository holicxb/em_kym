package ex1_scanner;

import java.util.Scanner;

public class Ex2_work {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//Ű���忡�� n1�� n2 ������ ���� ���� ���� �Է� �޴´�
		//n1 ~ n2���� ���� ����Ͻÿ�
		//�� 1 : 2
		//�� 2 : 5
		//��� : 14
		//���� : ��1 �������� 5, ��2 �������� 2
		//ū ���� ���� �޾Ƶ� �Ȱ��� ����� ��µǵ���
		
		Scanner scan = new Scanner(System.in);
		int n1 = 0;
		int n2 = 0;
		int total = 0;
		
		System.out.print("�� 1 : ");
		n1 = scan.nextInt();
		System.out.print("�� 2 : ");
		n2 = scan.nextInt();
		
		if(n1 < n2) {
			for(int i = n1;	i <= n2;	i++) {
				total += i;
			}
		}else if(n2 < n1){
			for(int i = n2;	i <= n1;	i++) {
				total += i;;
			}
		}else {
			total = n1;
		}
		System.out.println("��� : " + total);
		
		
		//���� ���� �� ��ȯ
		
		System.out.println("------------");
		if(n2<n1) {
			int temp = 0;
			temp = n1;
			n1 = n2;
			n2 = temp;
		}
		total = 0;
		for(int i = n1;	i <= n2;	i++) {
			total += i;
		}
		System.out.println("����� : "+total);
		
		System.out.println("---------------");
		
		
	}//main
	
}

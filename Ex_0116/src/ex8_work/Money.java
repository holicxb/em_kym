package ex8_work;
import java.util.*;
public class Money {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//����ڰ� ������ �ִ� ���� �Է� �ް�
		//ũ����, �����, �ݶ� �ܵ��� ������ �ʰ� 
		//�����ϴ� ����� �� ����ϱ�
		//ũ���� 500, ����� 700, �ݶ� 400
		
		//��� : 
		//����� ������ �ݾ� :4000(�Է�)
		//ũ���� : 1��, ����� : 1����, �ݶ� : 7ĵ
		//ũ���� : 2��, ����� : 2����, �ݶ� : 4ĵ
		//ũ���� : 3��, ����� : 3����, �ݶ� : 1ĵ
		//ũ���� : 5��, ����� : 1����, �ݶ� : 2ĵ
		
		int cream = 500;
		int shrimp = 700;
		int coke = 400;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("����� ������ �ݾ� : ");
		int money = scan.nextInt();
		
		for(int i = 1;	money - cream * i > 0;	i++) {//ũ���� ��
			for(int j = 1; money - shrimp * j > 0;	j++) {//����� ��
				for(int k = 1;	money - coke * k > 0;	k++) {//�ݶ� ��
					if(money == (cream * i + shrimp * j + coke * k)) {
						System.out.printf("ũ���� : %d��,	����� : %d����,	�ݶ� : %dĵ\n",i,j,k);
					}
				}
			}
		}
		
		
		
	}//main
	
}

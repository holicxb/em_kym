package ex3_work;

import java.util.Random;
import java.util.Scanner;

public class Ex1_baseball_ans {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		int[] com = new int[3]; //��ǻ�� ����
		int[] user = new int[3];//����� ��
		do {
			for(int i = 0;	i < com.length;	i++) {
				com[i] = rnd.nextInt(9) + 1;
			}
		}while(com[0] == com[1] || com[0] == com[2] || com[1] == com[2]);
		
		//���� ������ �� ������ ���� ���� �ݺ��ϴ� while�� �ۼ�
		while(true) {
			System.out.print("�Է�(��:123) - ");
			int number = sc.nextInt();
			
			//����ڰ� �Է��� �� �ڸ� ���� ��, ��, ���� �ڸ��� ��� user �迭�� ����
			user[0] = number / 100;//���� �ڸ�
			user[1] = number % 100 /10;//���� �ڸ�
			user[2] = number % 100 % 10;//���� �ڸ�
			
			int strike = 0;
			int ball = 0;
			
			//����� �� //�ٽ�
			for(int i = 0;	i < com.length;	i++) {
				for(int j = 0;	j < com.length;	j++) {
					
					if(i == j) {
						if(com[i] == user[j]) {
							strike++;
						}
					}else {
						if(com[i] == user[j]) {
							ball++;
						}
					}
					
				}//inner
			}//outer
			
			if(strike == 3) {
				System.out.println("����");
				break;
			}
			else {
				if(strike > 0 || ball > 0)
				{
					System.out.printf("%d Strike %d Ball\n", strike, ball);
				}else {
					System.out.println("OUT");
				}
			}
			System.out.println("---------------------------");
		}//while
		
	}//main
}
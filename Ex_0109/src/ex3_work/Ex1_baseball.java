package ex3_work;

import java.util.*;

public class Ex1_baseball {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// ������ ������ ���� �߱� ������
		// �迭�� ����Ͽ� �ڵ带 �ٿ�������(���� ��)

		Scanner scan = new Scanner(System.in);
		Random rnd = new Random();

		int place = 5;
		int[] com = new int[place];
		int[] user = new int[place];
		int count = 0;

		for (int i = 0; i < place; i++) {
			com[i] = rnd.nextInt(9) + 1;

			for (int j = 0; j < i; j++) {
				if (com[i] == com[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(com));

		while (true) {
			int strike = 0;
			int ball = 0;
			count++;
			for(int i = 0; i < place;	i++) {
				System.out.print(i+1 + "��° �� : ");
				user[i] = scan.nextInt();
			}
			for(int i = 0; i < place;	i++) {
				for(int j = 0;	j < place;	j++) {
					if(user[i] == com[j]) {
						if(i != j) {
							ball++;
						}else{
							strike++;							
						}
					}
				}
			}
			
			if (strike == place) {
				System.out.println(count + "�� ° ����!");
				break;// ������ ���� ��� while���� ����������
			} else {
				if (strike == 0 && ball == 0) {
					// out�� �Ǵ��ϴ� �ڵ�
					System.out.println("out!");
				} else {
					// �ƿ��� �ƴ� ��� strike�� ball�� ���� �����ش�.
					System.out.printf("strike : %d	ball : %d\n", strike, ball);
				}
			}
			System.out.println("---------------");

		} // while

	}// main
}

package ex2_coin;

import java.util.*;

public class Ex1_coin {

	public static void main(String[] args) {
		
		//����  money �� 10~5000������ ������ ����� �ִ´�
		//��, 1�� �ڸ� ���ڴ� �ݵ�� 0���� ����������� �Ѵ�.
		//�߻��� ���� money�� �������� �ٲ��� ��, 
		//500, 100, 50, 10��¥�� ������ ���� � �Ž��������� �Ǵ��ϴ� �ڵ� ����
		//��, ������ ���� ���� �������� �Ž����ش�.
		
		//�ݾ� : 2590��
		//500�� : 5
		//50�� : 1
		//10�� : 4
		
		Random rnd = new Random();
		int[] coin = {5000, 1000, 500, 100, 50, 10};
		//int money = rnd.nextInt(1000) + 1;
		//money *= 10;
		int money = rnd.nextInt(1000) * 10;
		
		System.out.println("�ݾ� : " + money);
		
		for(int i = 0;	i < coin.length;	i++) {
			int count = money / coin[i];
			if(count > 0) {
				System.out.println(coin[i] + "�� : " + count);
				money %= coin[i];
			}
		}
		
		System.out.println("===============");
		
		money = rnd.nextInt(1000) + 1;
		money *= 10;
		System.out.println("�ݾ� : " + money);

		for(int i = 0;	i < coin.length;	i++) {
			int res = money/coin[i];
			if(res > 0) {
				System.out.printf("%d�� : %d\n", coin[i], res);
				money %= coin[i];
			}
		}
		
	}//main
}

package ex8_work;

public class Ex2_work {

	public static void main(String[] args) {

		// 2�� for���� ����Ͽ� �Ʒ��� ����� �����Ͻÿ�

		// 1 2 3 4 5 6 7 8 9 10
		// 2 3 4 5 6 7 8 9 10 1 
		// 3 4 5 6 7 8 9 10 1 2
		// ....
		// 10 1 2 3 4 5 6 7 8 9
		int n = 5;
		int i = 0;
		int j = 0;

		for (i = 0; i < n; i++) {
			for (j = 0; j < n - i; j++) {
				System.out.print(i + j + 1 + " ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print(k + 1 + " ");
			}
			System.out.println();
		}

		System.out.println("-----------------------");

		//���̰� 10�� ��
		for (i = 1; i < n + 1; i++) {
			for (j = 0; j < n; j++) {
				int k = i + j; // i�� �ִ� 10, j�� �ִ� 9
				if (k > 10) {
					k -= 10;
				}
				System.out.print(k + " ");
			}
			System.out.println();
		}
		System.out.println("------------------------");
		for (i = 1; i < n + 1; i++) {
			for (j = 0; j < n; j++) {
				int k = i + j; // i�� �ִ� n, j�� �ִ� n-1
				if (k > n) {
					k -= n;
				}
				System.out.print(k + " ");
			}
			System.out.println();
		}
		
		System.out.println("-----------------------");
		
		System.out.println("����� �ڵ� = 2�� �ڵ�");
		
		System.out.println("-----------------------");
		
		//1~n���� �� ���� ���
		//��� : 6
		int num = 5;
		int k = 0;
		
		for(i = 1;	i <= num;	i++) {
			k+=i;
		}
		System.out.println("��� : " + k);
		
		
		
	}// main

}

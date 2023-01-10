package ex8_work;

public class Ex2_work {

	public static void main(String[] args) {

		// 2중 for문을 사용하여 아래의 결과를 도출하시오

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

		//높이가 10일 때
		for (i = 1; i < n + 1; i++) {
			for (j = 0; j < n; j++) {
				int k = i + j; // i는 최대 10, j는 최대 9
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
				int k = i + j; // i는 최대 n, j는 최대 n-1
				if (k > n) {
					k -= n;
				}
				System.out.print(k + " ");
			}
			System.out.println();
		}
		
		System.out.println("-----------------------");
		
		System.out.println("강사님 코드 = 2번 코드");
		
		System.out.println("-----------------------");
		
		//1~n까지 총 합을 출력
		//결과 : 6
		int num = 5;
		int k = 0;
		
		for(i = 1;	i <= num;	i++) {
			k+=i;
		}
		System.out.println("결과 : " + k);
		
		
		
	}// main

}

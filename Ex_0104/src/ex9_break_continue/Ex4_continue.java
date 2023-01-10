package ex9_break_continue;

public class Ex4_continue {

	public static void main(String[] args) {

		int n = 0;
		while (n < 5) {
			n++;

			if (n % 2 == 0) {
				continue;
				// while문 안의 continue는 가장 가까운 while문의 조건식으로 바로 올라감
			}

			System.out.println(n);

		}
		int num = 0;
		for (num = 0; num < 3; num++) {
			switch (num) {
			case 0:
				System.out.println("0이야");
				continue;

			case 1:
				System.out.println("1이야");
				continue;
			}
		}
	}// main
}

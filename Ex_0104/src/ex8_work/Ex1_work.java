package ex8_work;

public class Ex1_work {

	public static void main(String[] args) {

		// 2중 for문을 사용하여 아래 결과를 출력하시오
		// *
		// * *
		// * * *
		// * * * *
		// * * * * *
		int h = 5;
		char star = '*';

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print(star + " ");
			}
			System.out.println();
		}
		System.out.println("------------------");

		System.out.println("강사님 code 1");

		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println("------------------");

		// 2중 for문 사용

		//         * (1개)
		//       * * * (3개)
		//     * * * * * (5개)
		//   * * * * * * * (7개)
		// * * * * * * * * * (9개)

		for (int i = 0; i < h; i++) {
			for (int j = 1; j < h - i; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print(star + " ");
			}
			System.out.println();
		}

		System.out.println("------------------");
		System.out.println("강사님 code");

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5 + i; j++) {

				if (i + j > 3) {
					System.out.print("* ");

				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println("------------------");

		for (int i = 0; i < h; i++) {
			for (int j = h; j > i; j--) {
				System.out.print(star + " ");
			}
			System.out.println();
		}

		System.out.println("-------------------");

		// 마름모 도전
		System.out.println("마름모 도전");
		for (int i = 0; i < h; i++) {
			for (int j = 1; j < h - i; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print(star + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < h; i++) {
			for (int j = h; j > h - i - 1; j--) {
				System.out.print("  ");
			}
			for (int j = 2 * h; j > 2 * i + 3; j--) {
				System.out.print(star + " ");
			}
			System.out.println();
		}

		// 마름모 도전2
		System.out.println("마름모 도전 2");
		for (int i = 0; i < h; i++) {
			for (int j = 1; j < h - i; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print(star + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("  ");
			}
			for (int j = i + 1; j < 2 * h - i - 2; j++) {
				System.out.print(star + " ");
			}
			System.out.println();
		}

		System.out.println("강사님 역삼각형");

		for (int i = 3; i >= 0; i--) {
			for (int j = 0; j < 5 + i; j++) {
				if (i + j > 3)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}// main

}

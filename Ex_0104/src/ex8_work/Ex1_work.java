package ex8_work;

public class Ex1_work {

	public static void main(String[] args) {

		// 2�� for���� ����Ͽ� �Ʒ� ����� ����Ͻÿ�
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

		System.out.println("����� code 1");

		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println("------------------");

		// 2�� for�� ���

		//         * (1��)
		//       * * * (3��)
		//     * * * * * (5��)
		//   * * * * * * * (7��)
		// * * * * * * * * * (9��)

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
		System.out.println("����� code");

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

		// ������ ����
		System.out.println("������ ����");
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

		// ������ ����2
		System.out.println("������ ���� 2");
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

		System.out.println("����� ���ﰢ��");

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

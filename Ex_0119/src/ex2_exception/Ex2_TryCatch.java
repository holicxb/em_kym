package ex2_exception;

public class Ex2_TryCatch {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30 };

		//�߸� § �ڵ带 ������� �ִ� ������ �ƴ� 
		try {
			for (int i = 0; i <=  arr.length; i++) {
				System.out.printf("%d ", arr[i]);
			} // for
		} catch (Exception e) {

		}
		System.out.println("\n���α׷� ����");

	}// main

}
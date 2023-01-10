package ex3_work;

public class Ex4_work {

	public static void main(String[] args) {
		
		int num = 1;
		for(int i = 1;	i <= 3;	i++) {
			for(int j = 1;	j <= 10;	j++) {
				System.out.print(num++ + "\t");
			}//inner
			System.out.println();
		}//outer
		
		System.out.println("-----------------------");
		//2~9까지 구구단 출력
		// 2 * 1 = 2	3 * 1 = 3 ...
		// 2 * 2 = 4	3 * 2 = 6 ...
		
		for(int i = 1;	i < 10;	i++) {
			for(int j = 2;	j < 10;	j++) {
				System.out.printf("%d * %d = %d\t", j, i, j*i);
			}
			System.out.println();
		}
		
	}//main
}

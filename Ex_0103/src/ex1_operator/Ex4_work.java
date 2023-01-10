package ex1_operator;

public class Ex4_work {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 12;
		
		int res = ++a >= b || 2 + 7 <= b && 13 - b >= 0 && (a += b) - (a % b) >10 ? 1 : 0;
		/* 
		a - 11 b - 12 F
		9 < 12 T
		T
		23-11 T

		F || T && T && T ? 1 : 0 
		-> F || T ? 1 : 0
		*/
		System.out.println(res);
		
	}//main
}

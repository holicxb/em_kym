package ex7_work;

public class Calculator {

	public void getResult(int n, int m, String o){
		
		int result = 0;
		
		switch (o) {
		case "+":
			result = n + m;
			break;
		case "-":
			result = n - m;
			break;
		case "*":
			result = n * m;
			break;
		case "/":
			result = n / m;
			break;
		case "%":
			result = n % m;
			break;
		}
		
		System.out.printf("%d %s %d = %d\n", n, o, m, result);
	}
}
//클래스 2개로 계산기 만들기

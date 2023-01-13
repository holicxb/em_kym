package ex7_work;

public class Calculator {

	public void getResult(int n, int m, String o){
		//public void getResult(int ...n, String o) 오류발생
		//public void getResult(String o, int ...n) 오류발생안함
		
		int result = 0;
		
		switch (o) {
		case "+":
			result = n + m;
			//String result = String.format("%d + %d = %d", n[0], n[1], n[0] + n[1]);
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

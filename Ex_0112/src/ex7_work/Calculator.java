package ex7_work;

public class Calculator {

	public void getResult(int n, int m, String o){
		//public void getResult(int ...n, String o) �����߻�
		//public void getResult(String o, int ...n) �����߻�����
		
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
//Ŭ���� 2���� ���� �����

package ex3_casting;

public class Ex2_demotion {
	public static void main(String[] args) {
	
		//2.디모션
		// - 작은 자료형에 큰 자료형이 대입되는 것(자동X)
		
		char c = 'C';//2byte
		int n = c + 1;//4byte -> 68
		c = (char)n; // 대응되는 아스키코드 출력
		System.out.println(c);
		
		float ff = 5.5F;//4.xx byte
		n = 0;//4byte
		n = (int)ff;
		System.out.println(n);
		
	}//main
}

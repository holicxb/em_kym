package ex3_single_for;

public class Ex1_for {

	public static void main(String[] args) {
		//반복문 : 특정 수행문을 여러번 반복할 수 있도록 해주는 제어문
		//for(초기식;	조건식;	증감식){
		//	조건식이 참인 경우 실행되는 영역
		//}
		
		for(int i = 0;/*지역변수:for문에서 만들어진 지역변수 i는 for문의 소속이므로 영역을 벗어나면 사용 불가*/
				i < 3;	i++) {
			System.out.println(i);
		}
		int n = 0;//전역변수
		
		for (n = 1; n <= 3; n++) {
			System.out.println("n : " + n);
		}
		System.out.println(n);
		System.out.println("------------------------");
		for(int i = 10;	i > 0;	i--) {
			System.out.println(i);
		}
		
		System.out.println("------------------------");
		//1~100까지 100회전을 하는 for문을 만들되,
		//3의 배수만 출력 해보자
		for(int i = 1;	i < 101; i++) {
			if(i % 3 == 0) {
				System.out.println(i);
			}
		}
		
		System.out.println("------------------------");
		
		for(int i = 3;i <= 100;	i += 3) {
			System.out.println(i);
		}
		
		
		
		
	}//main
}

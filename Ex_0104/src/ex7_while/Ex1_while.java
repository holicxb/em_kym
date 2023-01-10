package ex7_while;

public class Ex1_while {

	public static void main(String[] args) {
		
		//while문 : 간단한 구성을 가진 반복문(선 비교, 후 처리)
		//while(조건식) {
		//	조건식이 참일 때 실행되는 영역
		//}
		
		int num = 1;
		
		while(num < 5) {
			
			System.out.println(num);
			num++;
			
		}//while
		
		System.out.println("while 문 밖 num 값 : " + num);
		
	}//main
	
}

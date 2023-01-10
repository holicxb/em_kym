package ex3_work;

public class Ex1_work {

	
	public static void main(String[] args) {
		
		//배열 arr에 담겨있는 모든 값의 합을 출력하시오
		//결과 : 67
		
		//선언과 생성과 초기화까지 한 줄로 가능
		//int[] arr = {10, 24, 7, 16, 10};
		
		//선언과 생성을 한줄로 표기할 수 있다.
		int[] arr = new int[5];
		
		arr[0] = 10;
		arr[1] = 24;
		arr[2] = 7;
		arr[3] = 16;
		arr[4] = 10;
		
		int total = 0;
		for(int i = 0;	i < arr.length;	i++) {
			total += arr[i];
		}
		System.out.println("결과 : " + total);
		
		System.out.println("------------------");
		char[] cArr = {'J', 'A', 'V', 'A', '!'};
		//char[] cArr = new char[4];
		//cArr[0] = J;
		//...
		//for(int i = 0;	i < cArr.length;	i++) {
		//	System.out.println(cArr[i]);
		//}
		
		//개선된 roof(향상된 for 문)
		//배열에 담긴 모든 내용에 접근하고자 하는 목적으로 만들어진 for문
		for(char c : cArr) {
			System.out.println(c);
		}
		
	}//main
}

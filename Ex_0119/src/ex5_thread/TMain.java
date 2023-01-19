package ex5_thread;

import java.util.Scanner;

public class TMain {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//키보드에서 값을 받고
		//1초에 1씩 감소되는 값을 출력하다가 
		//0이 되었을 때 스레드 종료
		
		//값 : 5
		//5
		//4
		//3
		//2
		//1
		//0
		
		//키보드에 값을 받는 부분은 메인에서 실행
		
		Scanner sc = new Scanner(System.in);
		System.out.print("값 : ");
		
		int num = sc.nextInt();
		T1 t1 = new T1(num);
		
		t1.start();
		
	}//main
}

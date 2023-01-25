package ex3_work;

import java.util.Scanner;

public class WorkMainAns {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		String str = sc.next();//원본 데이터
		
		WorkAns work = new WorkAns();
		String ss = work.isNumber(str);
		
		System.out.println(ss);
		
	}//main
	
}

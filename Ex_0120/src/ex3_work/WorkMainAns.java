package ex3_work;

import java.util.Scanner;

public class WorkMainAns {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		String str = sc.next();//���� ������
		
		WorkAns work = new WorkAns();
		String ss = work.isNumber(str);
		
		System.out.println(ss);
		
	}//main
	
}

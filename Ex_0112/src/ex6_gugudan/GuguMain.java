package ex6_gugudan;

import java.util.Scanner;
@SuppressWarnings("resource")
public class GuguMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("´Ü : ");
		int dan = scan.nextInt();
		
		Gugu gugu = new Gugu();
		gugu.getGugudan(dan);
		
	}//main
}

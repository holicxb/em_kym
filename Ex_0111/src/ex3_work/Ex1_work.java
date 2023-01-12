package ex3_work;
import java.util.*;
public class Ex1_work {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//키보드에서 아무값이나 입력받고 소문자 a의 갯수를 출력
		//입력 : alsdijfJISEDFG...&^(*&%^asjdl
		//a의 갯수 : n개
		
		Scanner scan = new Scanner(System.in);
		System.out.print("입력 : ");
		String input = scan.next();
		int i;
		
		int count = 0;
		String[] cut = input.split("a");
		for(i = 0;	i < cut.length;	i++) {
			count++;
		}
		System.out.printf("a의 갯수 : %d\n", count-1);
		
		System.out.println("-----------------");
		count = 0;
		//입력받은 문자열의 길이만큼 for문 반복
		for(i = 0;	i < input.length();	i++) {
			//a를 찾아낼 때마다 카운트 증가
			if(input.charAt(i) == 'a') {
				count++;
			}
		}
		System.out.printf("a의 갯수 : %d\n", count);
		System.out.println("-----------------");
		
		
		
	}//main
	
}

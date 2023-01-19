package ex1_work;

import java.util.Scanner;

@SuppressWarnings("resource")
public class WordGameMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		WordScramble ws = new WordScramble();
		String answer = ws.getAnswer();//정답
		String question = null;
		//ws에서 가져온 정답을 섞어준다
		do {
			question = ws.getScrambleWord(answer);			
		}while(question.equalsIgnoreCase(answer));
		System.out.println("문제 : " + question);
		
		while(true) {
			System.out.print("정답입력 : ");
			String str = sc.next();
			//사용자가 입력받은 문자열인  str과 정답인 answer를 비교한다
			if(str.equalsIgnoreCase(answer)) {
				System.out.println(answer + "정답!!");
				break;
			}
			else {
				System.out.println(str + "오답..");
			}
		}
		
	}//main
	
}

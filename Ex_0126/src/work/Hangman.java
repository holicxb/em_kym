package work;

import java.util.Scanner;

@SuppressWarnings("resource")
public class Hangman {
	String ans = "";
	char[] hidden;
	boolean isAns = true;
	boolean exist = false;
	int count = 0;
	
	public void setAns(String ans) {
		this.ans = ans;
	}
	
	public void Check() {
		Scanner sc = new Scanner(System.in);
		hidden = new char[ans.length()];
		for(int i = 0;	i < ans.length();	i++) {
			hidden[i] = '☆';
		}
		while(isAns) {
			String inputAns = "";
			String findAns = "";
			if(count == 10) {
				System.out.printf("게임에 실패하셨습니다\n정답은 %s입니다", ans);
				break;
			}
			count++;
			System.out.printf("%d회 남았습니다\n", (11 - count));
			
			System.out.println(hidden);
			System.out.print(">> ");
			inputAns = sc.next();
			char[] chString = inputAns.toCharArray();
			char input;
			
			if(chString.length == 1 && chString[0] >= 'a' && chString[0] <= 'z') {
				input = chString[0];
			}else {
				System.out.println("한 글자의 영 소문자만 입력 가능합니다");
				continue;
			}
			
			for(int i = 0;	i < hidden.length;	i++) {
				if(hidden[i] == input) {
					System.out.println("이미 입력한 문자입니다");
				}
			}
			
			for(int i = 0; i < ans.length();	i++) {
				if(inputAns.charAt(0) == ans.charAt(i)){
					hidden[i] = input;
					exist = true;
				}
			}
			if(!exist) {
				System.out.println(input + "은(는) 포함되지 않음");
				continue;
			}
			for(int i = 0;	i < ans.length();	i++) {
				findAns += hidden[i];
			}
			if(findAns.equals(ans)) {
				System.out.println(ans + "정답!");
				isAns = false;
			}
		}
	}
}

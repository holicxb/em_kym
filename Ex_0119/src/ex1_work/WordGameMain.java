package ex1_work;

import java.util.Scanner;

@SuppressWarnings("resource")
public class WordGameMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		WordScramble ws = new WordScramble();
		String answer = ws.getAnswer();//����
		String question = null;
		//ws���� ������ ������ �����ش�
		do {
			question = ws.getScrambleWord(answer);			
		}while(question.equalsIgnoreCase(answer));
		System.out.println("���� : " + question);
		
		while(true) {
			System.out.print("�����Է� : ");
			String str = sc.next();
			//����ڰ� �Է¹��� ���ڿ���  str�� ������ answer�� ���Ѵ�
			if(str.equalsIgnoreCase(answer)) {
				System.out.println(answer + "����!!");
				break;
			}
			else {
				System.out.println(str + "����..");
			}
		}
		
	}//main
	
}

package work;

import java.util.Random;

public class HangmanMain {
	public static void main(String[] args) {
		
		Hangman h = new Hangman();
		String[] list = {"apple", "doctor", "view", "orange", "cat", "bingo"};
		
		Random rnd = new Random();
		String str = list[rnd.nextInt(list.length)];
		h.setAns(str);
		
		System.out.println("***HANGMAN***");
		System.out.println("기회는 10번입니다");
		h.Check();
		
	}//main
}

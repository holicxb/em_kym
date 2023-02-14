package ex4_work_h;

public class HangManMain {
	public static void main(String[] args) {
		String[] words = {"apple", "doctor", "view"};
		
		HangMan hm = new HangMan(words);
		hm.game();
	}
}

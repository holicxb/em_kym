package work;

public class WordGameMain {

	public static void main(String[] args) {
	//시작 시 랜덤 단어 출력
	//arraylist에 3초 간격으로 랜덤으로 단어가 추가됨.
	//출력된 단어를 입력 시 입력된 단어 지워짐 그 동안 3초가 지나면 단어가 추가 됨
	//다 지워지면 클리어 출력하며 종료
	
	//arraylist, scanner, thread 필요
		
		WordGame game = new WordGame();
		
		game.start();
		game.playGame();
	}
}

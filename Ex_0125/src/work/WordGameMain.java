package work;

public class WordGameMain {

	public static void main(String[] args) {
	//���� �� ���� �ܾ� ���
	//arraylist�� 3�� �������� �������� �ܾ �߰���.
	//��µ� �ܾ �Է� �� �Էµ� �ܾ� ������ �� ���� 3�ʰ� ������ �ܾ �߰� ��
	//�� �������� Ŭ���� ����ϸ� ����
	
	//arraylist, scanner, thread �ʿ�
		
		WordGame game = new WordGame();
		
		game.start();
		game.playGame();
	}
}

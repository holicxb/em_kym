package ex6_work;

import java.util.Random;
import java.util.Scanner;

public class AnagramMain2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		String[] strArr = { "HOPE", "APPLE", "JAVA", "BANANA" };
		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		int num = rnd.nextInt(strArr.length);
		
		// ��Ͽ��� �ܾ �ϳ� ����
		String com = strArr[num];
		// � �ܾ ���� ���� Ȯ�ο�
		System.out.println(com);

		Anagram ana = new Anagram();
		ana.makeAna(com);
		
		int count = 1;
		while (true) {
			// ����ã��
			System.out.print("���� : ");
			String user = sc.next();

			if (user.length() != com.length()) {
				count++;
				System.out.println("������ ���� �ʽ��ϴ�. �ٽ� �Է��ϼ���!");
				continue;
			}
			if (user.equalsIgnoreCase(com)) {
				System.out.println(count + "ȸ ���� ����!");
				break;
			} else {
				count++;
				System.out.println("����");
			}
		}
		
	}
	
}

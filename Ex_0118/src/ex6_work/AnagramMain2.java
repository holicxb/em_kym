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
		
		// 목록에서 단어를 하나 뽑음
		String com = strArr[num];
		// 어떤 단어가 뽑힌 건지 확인용
		System.out.println(com);

		Anagram ana = new Anagram();
		ana.makeAna(com);
		
		int count = 1;
		while (true) {
			// 정답찾기
			System.out.print("정답 : ");
			String user = sc.next();

			if (user.length() != com.length()) {
				count++;
				System.out.println("개수가 맞지 않습니다. 다시 입력하세요!");
				continue;
			}
			if (user.equalsIgnoreCase(com)) {
				System.out.println(count + "회 만에 정답!");
				break;
			} else {
				count++;
				System.out.println("실패");
			}
		}
		
	}
	
}

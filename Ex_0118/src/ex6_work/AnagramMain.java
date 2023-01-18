package ex6_work;

import java.util.*;

public class AnagramMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
//		... 새로운 단어가 추가되거나 삭제되어도 실행되도록 만들 것
//		strArr에 담긴 문장 하나를 골라서
//
//		랜덤으로 재정렬한다
//		재정렬된 문장을 문제로 출제하고
//		원래의 단어를 맞히는 코드를 작성
//
//		결과
//
//		문제 : AAJV
//		정답 : JAAV
//		JAAV 오답
//		정답 : JAVA
//		JAVA 정답 ! 

		String[] strArr = { "HOPE", "APPLE", "JAVA" };
		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		int num = rnd.nextInt(strArr.length);

		// 목록에서 단어를 하나 뽑음
		String com = strArr[num];
		// 어떤 단어가 뽑힌 건지 확인용
		System.out.println(com);

		//com을 쪼개서 저장
		char[] reCom = com.toCharArray();
		
		// 뽑은 단어를 섞는다
		for(int i = 0;	i < com.length();	i++) {
			int saveNum = (int)Math.random()%com.length();
			char temp;
			temp = reCom[i];
			reCom[i] = reCom[saveNum];
			reCom[saveNum] = temp;
		}

		System.out.print("문제 : " );
		for(int i = 0;	i < com.length();	i++) {
			System.out.print(reCom[i]);
		}
		System.out.println();
		// 몇번째에 정답을 맞췄는가
		int count = 1;
		while (true) {
			// 정답찾기
			System.out.print("정답 : ");
			String user = sc.next();

			if (user.length() != com.length()) {
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

		System.out.println("----------------------");
		System.out.println(com);
		char[] str = new char[com.length()];
		int[] temp = new int[com.length()];
		for(int i = 0;	i < com.length();	i++) {
			temp[i] = rnd.nextInt(com.length());
			for(int j = 0;	j < i;	j++) {
				if(temp[i] == temp[j]) {
					i--;
					break;
				}
			}
			str[temp[i]] = com.charAt(i);
		}
		for(int i = 0;	i < com.length();	i++) {
			System.out.print(str[i]);
		}
	}// main

}

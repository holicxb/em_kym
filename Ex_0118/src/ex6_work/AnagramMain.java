package ex6_work;

import java.util.*;

public class AnagramMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
//		... ���ο� �ܾ �߰��ǰų� �����Ǿ ����ǵ��� ���� ��
//		strArr�� ��� ���� �ϳ��� ���
//
//		�������� �������Ѵ�
//		�����ĵ� ������ ������ �����ϰ�
//		������ �ܾ ������ �ڵ带 �ۼ�
//
//		���
//
//		���� : AAJV
//		���� : JAAV
//		JAAV ����
//		���� : JAVA
//		JAVA ���� ! 

		String[] strArr = { "HOPE", "APPLE", "JAVA" };
		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		int num = rnd.nextInt(strArr.length);

		// ��Ͽ��� �ܾ �ϳ� ����
		String com = strArr[num];
		// � �ܾ ���� ���� Ȯ�ο�
		System.out.println(com);

		//com�� �ɰ��� ����
		char[] reCom = com.toCharArray();
		
		// ���� �ܾ ���´�
		for(int i = 0;	i < com.length();	i++) {
			int saveNum = (int)Math.random()%com.length();
			char temp;
			temp = reCom[i];
			reCom[i] = reCom[saveNum];
			reCom[saveNum] = temp;
		}

		System.out.print("���� : " );
		for(int i = 0;	i < com.length();	i++) {
			System.out.print(reCom[i]);
		}
		System.out.println();
		// ���°�� ������ ����°�
		int count = 1;
		while (true) {
			// ����ã��
			System.out.print("���� : ");
			String user = sc.next();

			if (user.length() != com.length()) {
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

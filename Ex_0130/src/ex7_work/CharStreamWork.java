package ex7_work;

import java.io.BufferedReader;
import java.io.FileReader;

public class CharStreamWork {

	public static void main(String[] args) {

		// char기반 Stream사용
		// 특정 경로에 char.txt 파일을 만들고 아무 내용이나 넣는다
		// char.txt를 읽어서 내용에 알파벳 대문자와 소문자 갯수를 각각 출력

		// 대문자 : 5
		// 소문자 : 2

		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader("C:/embedded_kym/makingtxt/char.txt");
			br = new BufferedReader(fr);

			String msg = null;
			int upper = 0;// 대문자 갯수
			int lower = 0;// 소문자 갯수
			while ((msg = br.readLine()) != null) {
				System.out.println(msg);
				for (int i = 0; i < msg.length(); i++) {
					if (msg.charAt(i) >= 'A' && msg.charAt(i) <= 'Z') {
						upper++;
					} else if (msg.charAt(i) >= 'a' && msg.charAt(i) <= 'z') {
						lower++;
					}
				}
			}
			System.out.printf("대문자 : %d\n소문자 : %d", upper, lower);

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				br.close();
				fr.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}// main

}

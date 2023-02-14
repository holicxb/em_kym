package ex7_work;

import java.io.BufferedReader;
import java.io.FileReader;

public class CharStreamWork {

	public static void main(String[] args) {

		// char��� Stream���
		// Ư�� ��ο� char.txt ������ ����� �ƹ� �����̳� �ִ´�
		// char.txt�� �о ���뿡 ���ĺ� �빮�ڿ� �ҹ��� ������ ���� ���

		// �빮�� : 5
		// �ҹ��� : 2

		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader("C:/embedded_kym/makingtxt/char.txt");
			br = new BufferedReader(fr);

			String msg = null;
			int upper = 0;// �빮�� ����
			int lower = 0;// �ҹ��� ����
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
			System.out.printf("�빮�� : %d\n�ҹ��� : %d", upper, lower);

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

package ex8_work;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Random;
import java.util.Scanner;

public class RspGame {

	private RspUser rsp = null;
	private String path = "C:/embedded_kym/makingtxt/rsp.sav";
	private char[] com = { 's', 'r', 'p' };

	public void game() {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();

		while (true) {

			char comPick = com[rnd.nextInt(com.length)];
			System.out.print("id : ");
			String id = sc.next();

			callOutputStream();
			
			if (checkId(id)) {
				callInputStream();
				System.out.printf("%d승 %d무 %d패\n", rsp.getWin(), rsp.getSamsam(), rsp.getLose());
			}
			
			System.out.print("가위(s) | 바위(r) | 보(p) : ");
			char input = sc.next().charAt(0);

			if (input == 's' || input == 'r' || input == 'p') {
				if (comPick == input) {
					rsp.setSamsam(rsp.getSamsam() + 1);
				} else if ((comPick == 's' && input == 'r') || (comPick == 'r' && input == 'p')
						|| (comPick == 'p' && input == 's')) {
					rsp.setWin(rsp.getWin() + 1);
				} else {
					rsp.setLose(rsp.getLose() + 1);
				}
			}

			callOutputStream();

			System.out.print("한 판 더? y | n : ");
			char play = sc.next().charAt(0);

			if (play == 'n') {
				break;
			}
		}

	}

	public void callInputStream() {// 파일 불러오기
		ObjectInputStream ois = null;
		FileInputStream fis = null;

		try {
			fis = new FileInputStream(path);
			ois = new ObjectInputStream(fis);

			rsp = (RspUser) ois.readObject();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				ois.close();
				fis.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

	public void callOutputStream() {// 파일로 기록
		ObjectOutputStream oos = null;
		FileOutputStream fos = null;

		try {
			fos = new FileOutputStream(path);
			oos = new ObjectOutputStream(fos);

			oos.writeObject(rsp);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
				fos.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	public boolean checkId(String id) {
		if (rsp.getId().contains(id)) {
			return true;
		} else {
			rsp.setId(id);
			rsp.setWin(0);
			rsp.setSamsam(0);
			rsp.setLose(0);
			return false;
		}
	}
}
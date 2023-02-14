package ex8_work_ans;

import java.util.Random;
import java.util.Scanner;

public class RspMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Rsp rsp = new Rsp();
		int win = 0;
		int lose = 0;
		int draw = 0;
		
		System.out.print("id : ");
		String id = sc.next();
		rsp.setId(id);
		
		//���ӱ�� �ε�
		GameLoad gl = new GameLoad();
		rsp = gl.scoreLoader(id);
		if(rsp == null) {
			rsp = new Rsp();
			rsp.setId(id);
		}else {
			win = rsp.getWin();
			draw = rsp.getDraw();
			lose = rsp.getLose();
		}
		System.out.printf("%d�� %d�� %d��\n", win, draw, lose);
		
		while(true) {
			//��ǻ�� ���� ����
			//0 : ���� 1 : ���� 2: ���ڱ� ���� ����
			//���� �̱�� ��Ȳ �� ���� - ��ǻ�� ���� = -2, 1
			int random = new Random().nextInt(3);
			
			System.out.print("���� s | ���� r | �� p : ");
			String user = sc.next();
			int userCnt = 0;
			//�������·� ���� �ٲ���
			if(user.equalsIgnoreCase("s")) {
				userCnt = 0;
			}else if(user.equalsIgnoreCase("r")) {
				userCnt = 1;
			}else if(user.equalsIgnoreCase("p")){
				userCnt = 2;
			}else {
				System.out.println("����� �Է��Ͻÿ�");
				continue;
			}
			
			//����� ��
			if(userCnt - random == -2 || userCnt - random == 1) {
				System.out.println("����� �̰���ϴ�");
				rsp.setWin(++win);
			}else if(userCnt - random == 0) {
				System.out.println("�����ϴ�");
				rsp.setDraw(++draw);
			}else {
				System.out.println("�����ϴ�");
				rsp.setLose(++lose);
			}

			System.out.printf("%d�� %d�� %d��\n", win, draw, lose);
			System.out.print("�� �� ��? y | n : ");
			String select = sc.next();
			
			if(!select.equalsIgnoreCase("y")) {
				System.out.println("���� ����");
				break;
			}
		}//while
		
		//���� ���� �� rsp ��ü�� ����
		GameSave gs = new GameSave();
		gs.scoreWriter(rsp);
		
	}//main
}	

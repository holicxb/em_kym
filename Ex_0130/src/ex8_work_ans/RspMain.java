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
		
		//게임기록 로드
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
		System.out.printf("%d승 %d무 %d패\n", win, draw, lose);
		
		while(true) {
			//컴퓨터 랜덤 생성
			//0 : 가위 1 : 바위 2: 보자기 임의 지정
			//내가 이기는 상황 내 숫자 - 컴퓨터 숫자 = -2, 1
			int random = new Random().nextInt(3);
			
			System.out.print("가위 s | 바위 r | 보 p : ");
			String user = sc.next();
			int userCnt = 0;
			//정수형태로 값을 바꿔줌
			if(user.equalsIgnoreCase("s")) {
				userCnt = 0;
			}else if(user.equalsIgnoreCase("r")) {
				userCnt = 1;
			}else if(user.equalsIgnoreCase("p")){
				userCnt = 2;
			}else {
				System.out.println("제대로 입력하시오");
				continue;
			}
			
			//경우의 수
			if(userCnt - random == -2 || userCnt - random == 1) {
				System.out.println("당신이 이겼습니다");
				rsp.setWin(++win);
			}else if(userCnt - random == 0) {
				System.out.println("비겼습니다");
				rsp.setDraw(++draw);
			}else {
				System.out.println("졌습니다");
				rsp.setLose(++lose);
			}

			System.out.printf("%d승 %d무 %d패\n", win, draw, lose);
			System.out.print("한 판 더? y | n : ");
			String select = sc.next();
			
			if(!select.equalsIgnoreCase("y")) {
				System.out.println("게임 종료");
				break;
			}
		}//while
		
		//게임 종료 후 rsp 객체를 저장
		GameSave gs = new GameSave();
		gs.scoreWriter(rsp);
		
	}//main
}	

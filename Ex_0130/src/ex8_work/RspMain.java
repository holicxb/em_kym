package ex8_work;

public class RspMain {

	public static void main(String[] args) {

		RspGame rsp = new RspGame();
		
		rsp.game();
		
	}// main
}

// 가위바위보
// 경우의 수 9개
// object 스트림 사용

// id : aaa(아이디 입력)
// 0승 0무 0패
// 가위(s) | 바위 (r) | 보(p) : r 스캐너 입력
// 당신이 이겼습니다
// 1승 0무 0패
// 한 판 더? y | n : n
// 게임 종료

// id : aaa(똑같은 아이디 입력)
// 1승 0무 0패
// 가위(s) | 바위 (r) | 보(p) : s 스캐너 입력
// 비겼습니다
// 1승 1무 0패
// 한 판 더? y | n : n
// 게임 종료

//게임을 종료하는 시점에 유저의 승률을 기록
//직렬화된 클래스 필요
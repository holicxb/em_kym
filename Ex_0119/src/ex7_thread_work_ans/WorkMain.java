package ex7_thread_work_ans;

public class WorkMain {

	public static void main(String[] args) {
		
		/*
		 1 ~ 100 사이의 난수 2개를 더하는 문제를 출제
		 키보드에서 답을 입력하여 다섯 문제가 정답처리 될 때까지 코드가 반복
		 최종적으로 다섯 문제를 모두 맞히는데 몇 초가 걸렸는지 화면에 출력하며 코드를 종료
		 
		20 + 15 = //정답 입력
		정답!!
		100 + 66 = //오답 입력
		오답...
		61 + 51 = //정답 입력
		정답!!
		...
		53 + 28 = //정답 입력
		정답!!(5번째로 정답을 맞춘 상황)
		5문제를 처리하는데 24초가 걸렸습니다 출력(thread.sleep사용)
		*/
		
		Work work = new Work();
		work.start();//run() - 시간을 카운팅
		work.gameStart();
		
	}//main
}

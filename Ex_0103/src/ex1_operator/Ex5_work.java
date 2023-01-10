package ex1_operator;

public class Ex5_work {

	public static void main(String[] args) {
		
		/*
		 결과) 
		 하루 생산량 : 17개
		 시간당 평균 : 0.7xxxxxx 개
		 과수원이 있다.
		 배, 사과, 오렌지를 키우고 있는데, 하루 생산량은 각각
		 5,7,5개다.
		 
		 1) 과수원에서 하루에 생산되는 과일의 총 갯수를 출력
		 2) 한시간에 몇개의 과일이 생산되는지 출력
		 
		 #단, 과일의 갯수와 하루 생산량을 저장할 변수는 int 타입,
		 시간당 생산 수를 출력할 변수는 float 타입으로 만들 것. 
		 ##같은 결과이지만 최소 2개 이상의 코드를 짜볼 것
		 */
		
		//code #1
		//배, 사과, 오렌지 개수
		int pear = 5;
		int apple = 7;
		int orange = 5;
		//하루 총합, 시간당 생산량 변수
		int total = 0;
		float hour = 0;
		
		total = pear + apple + orange;
		hour = (float)total / 24; //hour = total/24F
		System.out.println("code 1");
		System.out.println("하루 총 생산량 : " + total);
		System.out.println("시간 당 생산량 : " + hour);
		
		//code #2
		int p = 5;
		int a = 7;
		int o = 5;
		
		int t = p + a + o;
		float h = t / 24f;
		System.out.println("code 2");
		System.out.println("하루에 생산되는 과일의 총 갯수 : " + t + "\n시간당 생산하는 과일 수 : " + h);
		
		//code #3
		System.out.println("code 3");
		System.out.println("하루에 생산되는 과일의 총 갯수 : " + (p+a+o) + "\n시간당 생산하는 과일 수 : " + (p+a+o)/24f);
		
	}//main
}

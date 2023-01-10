package ex9_break_continue;

public class Ex1_break {

	public static void main(String[] args) {
		
		//break문 : >반복문 내<에서 강제적으로 >가장 가까운 반복문<을 빠져나갈 때 사용하는 키워드 
		
		for(int i = 1;	i <= 2;	i++) {
			for(int j = 1;	j <= 10;	j++) {
				if(j % 2 == 0) {
					//가장 가까운 반복문을 탈출
					break;
					//break 아래는 그 어떠한 코드도 추가 될 수 없음
				}
				System.out.printf("%d ", j);
			}//inner
			System.out.println();
		}//outer
		
	}//main
}

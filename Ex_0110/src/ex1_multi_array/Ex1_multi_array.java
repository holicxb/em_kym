package ex1_multi_array;

public class Ex1_multi_array {

	public static void main(String[] args) {
		
		//다차원 배열
		//1차원 배열이 2개 모이면 2차원 배열
		//1차원 배열이 3개 모이면 3차원 배열
		
		int[][] test = new int[2][3]; //2행 3열 \ 큰 방 2개, 각 큰 방에 작은 방 3개
		
		test[0][0] = 10;
		test[0][1] = 20;
		test[0][2] = 30;
		
		test[1][0] = 40;
		test[1][1] = 50;
		test[1][2] = 60;
		
		System.out.println(test[0][1]);
		System.out.println("-------------------");
		//2차원의 경우 2중 포문, 3차원은 3중 포문
		//test.length - 큰 방의 갯수
		//** test[i].length - 각 큰 방에 포함되어있는 작은 방의 갯수
		for(int i = 0;	i < test.length;	i++) {
			for(int j = 0;	j < test[i].length;	j++) {
				System.out.print(test[i][j] + "	");
			}
			System.out.println();
		}
		
	}//main
	
}

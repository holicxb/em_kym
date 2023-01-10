package ex1_multi_array;

public class Ex4_multi_array {

	public static void main(String[] args) {
		
		//2차원 배열 arr에 담긴 모든 값의 합과 평균을 출력
		//평균은 소수점 한자리까지 출력
		
		int[][] arr = {{2,4,5,13}, {3,6,14}, {7,1}, {8,15,19}};
		int total = 0;
		float avg = 0;
		int count = 0;
		
		for(int i = 0;	i < arr.length;	i++) {
			for(int j = 0;	j < arr[i].length;	j++) {
				total += arr[i][j];
				count++;
			}
		}
		avg = (float)total/count;
		System.out.printf("총합 : %d 평균 : %.1f", total, avg);
		
	}//main
	
}

package ex1_multi_array;

public class Ex4_multi_array {

	public static void main(String[] args) {
		
		//2���� �迭 arr�� ��� ��� ���� �հ� ����� ���
		//����� �Ҽ��� ���ڸ����� ���
		
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
		System.out.printf("���� : %d ��� : %.1f", total, avg);
		
	}//main
	
}

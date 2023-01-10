package ex3_work;

public class Ex2_work {

	public static void main(String[] args) {
		
		//배열 arr에 담긴 값 중 가장 큰 값을 출력하시오. 
		//결과 : 19
		
//		int[] arr = new int[6];
//		arr[0] = 4;
//		arr[1] = 13;
//		arr[2] = 7;
//		arr[3] = 19;
//		arr[4] = 1;
//		arr[5] = 15;
		
		int[] arr = {4, 13, 7, 19, 1, 15};
		
		int max = arr[0];
		
		for(int i = 0;	i < arr.length;	i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		
		System.out.println("결과 : " + max);
		System.out.println("---------------");
		//arr이 가진 값을 오름차순으로 정렬
		
		for(int i = 0;	i < arr.length;	i++) {
			for(int j  = i;	j< arr.length;	j++) {
				if(arr[j] < arr[i]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
			
		}
		
		for(int i = 0;	i<arr.length;	i++)
			System.out.print(arr[i] + " ");
		
	}//main
	
}

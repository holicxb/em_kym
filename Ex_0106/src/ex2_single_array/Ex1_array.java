package ex2_single_array;

public class Ex1_array {

	public static void main(String[] args) {
		
		//배열 : '같은 자료형'끼리 모아둔 하나의 묶음
		//효율적인 자료 관리를 위해 반드시 알고 있어야 하는 개념
		
		int su1 = 100;
		int su2 = 200;
		int su3 = 300;
		int su4 = 400;
		
		System.out.println(su1);
		System.out.println(su2);
		System.out.println(su3);
		System.out.println(su4);
		
		//1) 배열 선언
		
		int[] arr;
		//2) 배열 생성

		arr = new int[5];
		
		//		stack 		|	 heap
		//데이터가 들어오면 저장	|	집을 지음, 방에 0~번호가 붙음(index)
		//						값을 집어넣는 것이 초기화
		//						arr[0] = 10;
		
		//int array[] = new int[4];
		
		//3) 초기화(값 대입)
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		//배열에 존재하지 않는 index에는 값을 추가하거나 가져다 쓸 수 없다.
		//arr[4] = 50;
		
		System.out.println("20 필요해 : " + arr[0]);
		
		System.out.println("------------------------");
		//배열 이름.length : 배열의 방 갯수
		for(int i = 0;	i < arr.length;	i++) {
			arr[i] = (i+1)*100;
			System.out.println(i + "번째 방 필요해 : " + arr[i]);
			
		}
		
		
		
	}//main
	
}

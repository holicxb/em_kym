package ex1_multi_array;

public class Ex2_multi_array {

	public static void main(String[] args) {
		
		//2차원 배열의 선언 및 생성, 초기화 한번에 하기
		
		char[][] chArr = {{'J','A','V','A'},
						  {'S','P','R','I','N','G'}};
		
		//chArr이 가진 모든 값을 출력
		
		for(int i = 0;	i < chArr.length;	i++) {
			for(int j = 0;	j < chArr[i].length;	j++) {
				System.out.print(chArr[i][j]);
//				System.out.printf("%c", chArr[i][j]);
			}
			System.out.println();
		}
		
	}//main
}

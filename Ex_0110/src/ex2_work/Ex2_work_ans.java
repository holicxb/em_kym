package ex2_work;
import java.util.*;
public class Ex2_work_ans {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] arr;
		int num = 1;
		int y = 0; //행
		int x = 0; //열
		
		System.out.print("사이즈 : ");
		int size = sc.nextInt();//3 가정
		
		x = size / 2;
		//배열의 크기
		arr = new int[size][size];
		
		//마방진을 그릴 while문
		while(num <= size * size) {
			
			arr[y][x] = num;
			if(num % size == 0) {
				y++;
			}else {
				y--;
				x++;
			}
			if(y < 0) {
				y = size - 1;
			}
			if(x >= size) {
				x = 0;
			}	
			num++;
		}
		
		//arr배열에 담긴 모든 값을 화면에 출력
		
		for(int i = 0; i < size;	i++) {
			for(int j = 0;	j < size;	j++)
				System.out.printf("%02d ", arr[i][j]);
			System.out.println();
		}
		
		
		
		
		
	}//main
}

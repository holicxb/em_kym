package ex2_work;
import java.util.*;
public class Ex2_work {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//키보드에서 입력 받은 값 만큼 행과 열을 가지는 마방진 만들기
		//홀수 마방진 = 가로 세로 대각선 각 합이 모두 같은 숫자
		//1은 언제나 가장 위의 가운데 찍힘 -> n/2+1위치 = 1
		//한칸 위의 오른쪽에 다음 숫자를 찍음 
		//-> 올라갈 곳이 없으면 젤 아래로 내려감/오른쪽이 없으면 왼쪽 젤 끝으로 튀어나옴
		//n의 배수를 만나면 오른쪽 위에 찍을 곳이 없음
		//마지막으로 찍은 값의 한 칸 아래에 다음 숫자를 찍음
		
		//사이즈 : 3 - 입력받기
		//08(0,0) 01(0,1) 06(0,2)	
		//03(1,0) 05(1,1) 07(1,2)
		//04(2,0) 09(2,1) 02(2,2)
		
		//2차원 배열 필수
		
		//01 -> 한 칸 오른쪽 위 02 -> 한 칸 오른쪽 젤 아래 02로 변경
		//m[i-1][j+1] = m[i][j]+1
		//n의 배수 -> m[i][j] % n == 0 -> m[i+1][j]= m[i][j] + 1
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("홀수를 입력하시오 : ");
		int n = scan.nextInt();
		int x = 0;
		int y = n/2; //시작 위치. 1값의 위치
		
		int[][] m = new int[n][n];
//		int num = 1;
		
		for(int i = 1;	i <= n*n;	i++) {
//			System.out.printf("%d %d", x,y);
			m[x][y] = i; 
			
			if(i % n == 0) {
				x++;
				
			}else {
				x--;
				y++;
				
			
				if(y == n) {
			
					y = 0;
				}
				if(x < 0) {
					x = n - 1;
				}
			
			}		
		}
		System.out.println();
		
//		for(int i = 0;	i < n;	i++) {
//			for(int j = 0;	j < n;	j++) {
//				num++;
//				if(m[x][y] % n == 0) {
//					x++;
//					m[x][y] = num;
//				}else {
//					x--;
//					y++;
//					if(x < 0) {
//						x = n - 1;
//						m[x][y] = num;
//					}
//					else if(y > n) {
//						y = 0;
//						m[x][y] = num;
//					}
//				}				
//			}
//			System.out.println();
//		}
		for(int i = 0; i < m.length;	i++) {
			for(int j = 0;	j < m[i].length;	j++)
				System.out.printf("%02d ", m[i][j]);
			System.out.println();
		}
		
		
	}//main
	
}

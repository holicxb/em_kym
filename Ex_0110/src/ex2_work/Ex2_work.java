package ex2_work;
import java.util.*;
public class Ex2_work {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//Ű���忡�� �Է� ���� �� ��ŭ ��� ���� ������ ������ �����
		//Ȧ�� ������ = ���� ���� �밢�� �� ���� ��� ���� ����
		//1�� ������ ���� ���� ��� ���� -> n/2+1��ġ = 1
		//��ĭ ���� �����ʿ� ���� ���ڸ� ���� 
		//-> �ö� ���� ������ �� �Ʒ��� ������/�������� ������ ���� �� ������ Ƣ���
		//n�� ����� ������ ������ ���� ���� ���� ����
		//���������� ���� ���� �� ĭ �Ʒ��� ���� ���ڸ� ����
		
		//������ : 3 - �Է¹ޱ�
		//08(0,0) 01(0,1) 06(0,2)	
		//03(1,0) 05(1,1) 07(1,2)
		//04(2,0) 09(2,1) 02(2,2)
		
		//2���� �迭 �ʼ�
		
		//01 -> �� ĭ ������ �� 02 -> �� ĭ ������ �� �Ʒ� 02�� ����
		//m[i-1][j+1] = m[i][j]+1
		//n�� ��� -> m[i][j] % n == 0 -> m[i+1][j]= m[i][j] + 1
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Ȧ���� �Է��Ͻÿ� : ");
		int n = scan.nextInt();
		int x = 0;
		int y = n/2; //���� ��ġ. 1���� ��ġ
		
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

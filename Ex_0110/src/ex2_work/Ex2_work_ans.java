package ex2_work;
import java.util.*;
public class Ex2_work_ans {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] arr;
		int num = 1;
		int y = 0; //��
		int x = 0; //��
		
		System.out.print("������ : ");
		int size = sc.nextInt();//3 ����
		
		x = size / 2;
		//�迭�� ũ��
		arr = new int[size][size];
		
		//�������� �׸� while��
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
		
		//arr�迭�� ��� ��� ���� ȭ�鿡 ���
		
		for(int i = 0; i < size;	i++) {
			for(int j = 0;	j < size;	j++)
				System.out.printf("%02d ", arr[i][j]);
			System.out.println();
		}
		
		
		
		
		
	}//main
}

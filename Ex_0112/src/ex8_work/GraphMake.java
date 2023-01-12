package ex8_work;
import java.util.*;
public class GraphMake {

	//n���� ���� 0~m������ ���� ���� ����
	public int[] makeRandom(int[] a, int n, int m) {
		Random rnd = new Random();
		a = new int[n];
		for(int i = 0;	i < n;	i++) {
			a[i] = rnd.nextInt(m);
			System.out.print(a[i]);
		}
		System.out.println();
		return a;
	}
	
	//�� ���ڸ� �� ������ ����
	public int countNum(int[] a, int num) {//������  0~9�� ���ؼ� ���� ����
		int count = 0;
		for(int i = 0; i < a.length;	i++) {
			if(a[i] == num)
				count++;
		}
		return count;
	}

	//#�� �׷���
	public String printShap(int a) {
		String shap = "";
		for(int i = 0;	i < a;	i++) {
			shap += "#";
		}
		return shap;
	}
	
	//��� ���
	public void resultPrint(int i, String s, int c) {
		System.out.printf("%d�� ���� : %s %d\n", i, s, c);
	}
	
	//--------------------------------------------------
	
	public void graphM(int[] a) {
		
		for(int i = 0;	i < 10;	i++) {
			System.out.print(i + "�� ���� : ");
			int count = 0;
			for(int j = 0;	j < a.length;	j++) {
				if(i == a[j]) {
					count++;
					System.out.print("#");
				}
			}
			
			System.out.println(" " + count);
		}
		
	}
	
	
	
	
	
	
	
	
	
}

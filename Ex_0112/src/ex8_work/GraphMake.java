package ex8_work;
import java.util.*;
public class GraphMake {

	//n개의 범위 0~m까지의 랜덤 숫자 생성
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
	
	//각 숫자를 몇 개인지 세라
	public int countNum(int[] a, int num) {//난수와  0~9를 비교해서 갯수 세기
		int count = 0;
		for(int i = 0; i < a.length;	i++) {
			if(a[i] == num)
				count++;
		}
		return count;
	}

	//#을 그려라
	public String printShap(int a) {
		String shap = "";
		for(int i = 0;	i < a;	i++) {
			shap += "#";
		}
		return shap;
	}
	
	//결과 출력
	public void resultPrint(int i, String s, int c) {
		System.out.printf("%d의 갯수 : %s %d\n", i, s, c);
	}
	
	//--------------------------------------------------
	
	public void graphM(int[] a) {
		
		for(int i = 0;	i < 10;	i++) {
			System.out.print(i + "의 갯수 : ");
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

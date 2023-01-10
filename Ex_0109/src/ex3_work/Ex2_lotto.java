package ex3_work;
import java.util.*;
public class Ex2_lotto {

	public static void main(String[] args) {
		
		//1~45 ������ �ߺ����� �ʴ� ���� 6���� ����� �ζ� �迭�� ���
		//���������� �ζ� �迭�� ��� ������ ����Ͻÿ�
		
		//��� : 15 2 41 17 6 9 
		//**����� �ߺ� XX 
		//**���� ���� �� ���ظ� ���� ���� �ʴ� �������
		
		int count = 6;
		int[] lotto = new int[count];
		Random rnd = new Random();
		
		for(int i = 0;	i < count;	i++) {
			lotto[i] = rnd.nextInt(45)+1;
			for(int j = 0;	j < i;	j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(lotto));
		System.out.println("-----------------");
		outer : for(int i = 0;	i < lotto.length;) {
			lotto[i] = rnd.nextInt(45) + 1;
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					continue outer;
				}
			}
			
			System.out.printf("%d ", lotto[i]);
			i++;
		}
		
	}//main
}

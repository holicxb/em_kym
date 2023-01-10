package ex3_work;
import java.util.*;
public class Ex2_lotto {

	public static void main(String[] args) {
		
		//1~45 사이의 중복되지 않는 난수 6개를 만들어 로또 배열에 담고
		//최종적으로 로또 배열에 담긴 값들을 출력하시오
		
		//결과 : 15 2 41 17 6 9 
		//**절대로 중복 XX 
		//**유지 보수 시 손해를 많이 보지 않는 방법으로
		
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

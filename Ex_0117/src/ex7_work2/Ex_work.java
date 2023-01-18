package ex7_work2;
import java.util.Scanner;
public class Ex_work {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//키보드에서 입력받은 값을 암호표대로 암호화하시오
		//값 : abc123
		//결과 : `~!wer
		
		Ex_class making = new Ex_class();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("값 : ");
		char[] code = scan.next().toCharArray();
		
		System.out.print("결과 : ");
		String res = "";
		for(int i = 0;	i < code.length;	i++) {
			res = making.makeCode(res, code[i]);
		}
		System.out.println(res);
		
		
	}//main
}

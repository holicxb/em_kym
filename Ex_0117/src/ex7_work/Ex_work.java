package ex7_work;
import java.util.*;
public class Ex_work {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//키보드에서 입력받은 값을 암호표대로 암호화하시오
		//값 : abc123
		//결과 : `~!wer
		
		char[] abcCode = {'`', '~', '!', '@', '#',
				'$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=', 
				'|', '[', ']', '{', '}', ';', ':', ',', '.', '/'
		};
		char[] numCode = {'q', 'w', 'e', 'r', 't',
				'y', 'u', 'i', 'o', 'p'				
		};
		
		Scanner scan = new Scanner(System.in);
		System.out.print("값 : ");
		String str = scan.next();
		
		System.out.print("결과 : ");
		String res = "";
		for(int i = 0;	i < str.length();	i++) {
			if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				res += abcCode[str.charAt(i) - 'a'];//배열번호가 0~
			}
			else if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
				res += numCode[str.charAt(i)-'0'];
			}else {
				System.out.print(str.charAt(i));
			}
		}
		System.out.println(res);
	}//main
}

package ex2_switch;

public class Ex3_switch {

	public static void main(String[] args) {
		
		//switch문은 비교값으로 딱 세가지 타입만 사용이 가능
		//정수(byte,int,short), 문자열(String), 문자(char)
		
		char ch = '이';
		switch(ch) {
		case '김' : 
			System.out.println("21%");
			//break;
		case '이' :
			System.out.println("14%");
			//break;
		case '박' : 
			System.out.println("8%");
			//break;
		}//switch
		//break를 만날 때 까지 수직 하락함
	}//main
}

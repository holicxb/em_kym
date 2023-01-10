package ex2_switch;

public class Ex1_switch {

	public static void main(String[] args) {
		
		//switch-case문 : 비교값과 조건값을 통해 결과를 처리하는 제어문
		//switch(비교값){
		//	case 조건값 : 
		//		비교값과 조건값이 일치하는 경우 실행되는 영역
		//	break;//case-break가 하나의 영역
		//}
		
		int n = 4;
		switch(n) {//비교값(딱 하나의 값)
		case 1://조건값(조건값의 타입은 비교값과 반드시 일치해야 한다, 중복되면 안 됨)
			System.out.println("1. 게임시작");
			break;//switch 문을 완전히 빠져나가는 키워드
		case 2:
			System.out.println("2. 게임소개");
			break;
		case 3:
			System.out.println("3. 옵션");
			break;	
		default:
			//비교값과 조건값이 모두 일치하지 않을 경우
			//반드시 실행되는 영역
			System.out.println("1,2,3중에 입력하시오");
			break;
		}//switch
		
	}//main
}

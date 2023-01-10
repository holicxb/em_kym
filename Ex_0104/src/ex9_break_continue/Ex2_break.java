package ex9_break_continue;

public class Ex2_break {

	public static void main(String[] args) {
		
		for(int i = 0;	i < 3;	i++) {
			
			switch (i) {
			case 0:
				System.out.println("0입니다");
				break;
			case 1: 
				System.out.println("1입니다");
				break;
			case 2:
				System.out.println("2입니다");
			}//switch
			//switch문과 인접한 break는 반복문이 아닌 스위치문만 빠져나옴
		}
		
	}//main
	
}

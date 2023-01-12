package ex3_method;

public class Method1 {

	//메서드의 구성 및 정의
	public void test1() {
		System.out.println("안녕하세요");
	}
	
	public int test2(int n) {
		//반환형이 void가 아닌 경우, 마지막에 반드시
		//return 값이 포함되어 있어야 한다
		n+=100;
		System.out.println("n : " + n);
		
		//return 값은 반드시 반환형 타입과 맞춰준다
		return n;
	}
	
	public String test3(String s, int n) {
		String str = "저는 " + s +"이고, " + n + "세 입니다";
		return str;
	}
}

package ex6_static;

public class Ex1_StaticTest {

	String str1 = "일반 멤버변수";
	static String str2 = "스테틱 변수";

	public void test1() {
		// 일반 메서드에서는 static 변수와 일반변수를 모두 사용할 수 있다
		str1 = "hi";
		str2 = "hello";

		// 일반 메서드에서는 static 키워드를 가진 변수를 만들 수 없다
		// static String str3 = "반갑";
		
	}
	
	public static void test2() {
		
		//static 메서드에서 일반 멤버변수의 사용이 불가
		//str1 = "hi";
		
		str2 = "hello";
		//지역변수로 일반 변수를 사용하는 것은 가능
		int num = 100;
		
		//static 메서드에서는 static 변수를 지역변수로 생성하는 것은 불가
		//static int num2 = 300;
	}
	
}

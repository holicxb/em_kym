package ex1_string;

//import java.util.Scanner;

public class Ex1_string {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		//String은 두 가지 특징을 가지고 있다. 
		//1)** 객체 생성 방법이 2 가지다(암시적, 명시적)
		//2) 한 번 생성된 문자열의 내용은 변하지 않는다(불변의 특징)
		//앞글자가 대문자인 클래스로 만들어진 것을 객체/기본 자료형으로 생성은 변수
		//객체는 반드시 heap 메모리에 만들어짐
		
		//객체를 만드는데 new라는 키워드 없이 만들었다 = 암시적
		String s1 = "abc";
		String s2 = "abc";
		//값이 같으면 주소를 공유
		//s1과 s2가 참조하는 주소가 같음 주소를 공유. 이런 경우를 암시적 객체 생성. 
		
		String s3 = "bbb";//새로 만듬.
		
		//new는 무조건 명시적 객체 생성
		//기존에 같은 값을 가진 집이 있어도 반드시 새 집을 지음
		String s4 = new String("abc");//heap에 새로 abc 집을 지음.
		String s5 = new String("abc");
		
		// == 은 기본 자료형끼리 비교하는 경우 값을 비교함
		//객체 간의 == 는 주소값을 비교
		if(s4 == s5) {
			System.out.println("주소가 같습니다");
		}else {
			System.out.println("주소가 다릅니다");
		}
		//String 클래스는 객체 간 주소 비교보다, 값을 비교하는 경우가 훨씬 많다
		//객체들은 .을 찍어 값을 호출
		if(s1.equals(s4)) {
			System.out.println("값이 같습니다");
		}
		
		System.out.println("-------------------");
		
//		Scanner sc = new Scanner(System.in);//String이 아니기 때문에 암시적으로 생성 불가
//		s4 = sc.next();
//		
//		if(s1 == s4) {
//			System.out.println("같습니다");
//		}else{
//			System.out.println("다릅니다");
//		}//같은 값을 입력해도 주소가 다르기 때문에 다릅니다 출력
//		if(s1.equals(s4)) {
//			System.out.println("같습니다");
//		}
		
		String greet = "안녕";
		greet += "하세요";
		
		System.out.println(greet);
		
		//String은 불변. 
		//안녕하세요라는 집이 새로 만들어짐. 
		//greet은 안녕이 들어있는 주소를 버리고
		//안녕하세요에 연결
		//빈 집이 쌓이고 쌓이면 메모리가 부족해짐.
		//가비지컬랙터 gc
		//heap이라는 동네를 계속 순환하며 아무것도 참조하지 않는 필요 없어진 메모리 영역을 지워줌
		
		//불변적 특징이 적용되야만 하는 이유
		s1 = "bbb";
		s2 = "bbb";
		s2 = "ccc";
		//만약 heap안에서 값이 bbb가 ccc로 바뀌면 s1의 값이 바뀌어버리는 상황이 발생
		//따라서 이런 일이 발생하지 않도록 다른 주소에 ccc를 생성
		
	}//main
	
}

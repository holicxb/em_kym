package ex3_constructor;

public class Ex_Con {

	//생성자 : 객체 생성 시 메모리 할당 및 멤버 변수의 초기화를 목적으로 사용하는 것
	//객체가 생성될 때 처음 **딱 한번만 호출되며, 이후 추가로 호출이 불가
	//기본적으로는 숨겨져 있어서 보이지 않음
	public Ex_Con() {
		//생성자는 반환형이 없음
		//반드시 클래스의 이름과 대소문자까지 동일
		
		System.out.println("생성자 호출");
	}
}

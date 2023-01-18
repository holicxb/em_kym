package ex5_super;

public class Child extends Parent{

	public Child() {
		//super : 부모클래스
		super(10);//부모의 생성자 - 가장 위에 위치하지 않으면 문법상 오류
		
		super.name = "홍길동";//부모클래스의 변수로 접근
		System.out.println("child의 생성자 " + name);
	}
	
	@Override
	public void getMsg() {
		//Parent의 getMsg()메서드를 가져다 쓰시오
		//super.getMsg();
		
		System.out.println("나는 자식");
	}
}

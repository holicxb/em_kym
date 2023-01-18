package ex5_super;

public class Parent {

	String name;
	
	public Parent(int n) {
		System.out.println("Parent의 생성자");
		System.out.println(n);
	}
	
	public void getMsg() {
		System.out.println("나는 부모");
	}
}

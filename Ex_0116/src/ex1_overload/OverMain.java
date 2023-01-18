package ex1_overload;

public class OverMain {

	public static void main(String[] args) {
		
		Ex1_overload ov = new Ex1_overload();
		
		ov.result();
		ov.result(10);
		ov.result('A');
		ov.result("hello");
		ov.result("hi", 100);
		ov.result(1000, "world");
	}//main
	
}

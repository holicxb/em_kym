package ex4_interface;

public class InterMain {

	public static void main(String[] args) {
		
		//추상과 마찬가지로 완성이 덜 된 메서드가 포함되어 있으므로
		//직접적인 메모리 할당은 불가
		//InterTest it = new InterTest();
		
		//그러므로 인터페이스를 구현한 자식클래스도
		//생성 될 때 부모인 인터페이스와 함께 메모리 할당을 받는다
		InterChild ic = new InterChild();
		System.out.println(ic.getVALUE());
		
		
	}//main
	
}

package ex2_abstract;

public abstract class AbsEx {

	//추상클래스
	//추상 메서드를 한 개 이상 가지고 있는 클래스
	//abstract 키워드를 통해 추상 클래스임을 명시해줘야 한다
	//반드시 자식이 필요
	
	int value = 100;
	int num = 20;
	
	public int getNum() {
		return num;
	}
	
	//추상 메서드
	//메서드의 몸체(body)가 없다
	//abstract 키워드를 통해 반드시 추상 메서드임을 명시해줘야 한다
	
	//추상 메서드는 몸체가 없기 때문에 '미완성의 개념'이라고 한다
	//미완성된 메서드를 자식클래스가 물려받아서 완성시키는 것이 조건이 된다
	abstract public void setValue(int n);
	
} 

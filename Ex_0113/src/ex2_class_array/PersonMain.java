package ex2_class_array;

public class PersonMain {
	
	public static void main(String[] args) {
		
		Person[] person = new Person[3];
		
		//String을 제외한 나머지 모든 클래스는 
		//배열화 처리 되었을 때 각 인덱스 마다
		//제대로 된 메모리 할당을 해줘야함((명시적 객체생성))
		
//		person[0] = new Person();
//		person[1] = new Person();
//		person[2] = new Person();
		
		for(int i = 0;	i < person.length;	i++) {
			person[i] = new Person();
		}
		
		person[0].setName("김말똥");
		person[0].setAge(20);
		person[1].setName("박소똥");
		person[1].setAge(30);
		person[2].setName("김쥐똥");
		person[2].setAge(40);
		
		//김말똥 / 20
		//박소똥 / 30
		//김쥐똥 / 40
		
		for(int i = 0;	i < person.length;	i++) {
			System.out.println(person[i].getName() + " / " + person[i].getAge());
		}
		
	}//main
}

package ex2_class_array;

public class PersonMain {
	
	public static void main(String[] args) {
		
		Person[] person = new Person[3];
		
		//String�� ������ ������ ��� Ŭ������ 
		//�迭ȭ ó�� �Ǿ��� �� �� �ε��� ����
		//����� �� �޸� �Ҵ��� �������((����� ��ü����))
		
//		person[0] = new Person();
//		person[1] = new Person();
//		person[2] = new Person();
		
		for(int i = 0;	i < person.length;	i++) {
			person[i] = new Person();
		}
		
		person[0].setName("�踻��");
		person[0].setAge(20);
		person[1].setName("�ڼҶ�");
		person[1].setAge(30);
		person[2].setName("�����");
		person[2].setAge(40);
		
		//�踻�� / 20
		//�ڼҶ� / 30
		//����� / 40
		
		for(int i = 0;	i < person.length;	i++) {
			System.out.println(person[i].getName() + " / " + person[i].getAge());
		}
		
	}//main
}

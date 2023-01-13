package ex1_setter_getter;

public class PersonMain {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.setName("ȫ�浿");
		p1.setPhone("010-111-1111");
		p1.setAge(30);
		
		String name = p1.getName();
		
		System.out.println(name);
		System.out.println(p1.getPhone());
		System.out.println(p1.getAge());
		
	}//main
}

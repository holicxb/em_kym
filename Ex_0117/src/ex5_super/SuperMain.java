package ex5_super;

public class SuperMain {

	public static void main(String[] args) {
		
		Child c = new Child();
		Parent p = new Parent(20);
		
		c.getMsg();
		p.getMsg();
	}//main
	
}

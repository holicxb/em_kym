package ex1_class;

public class ComMain {

	public static void main(String[] args) {
		
		Computer c1 = new Computer();
		System.out.println("ssd : " + c1.ssd);
		System.out.println("ram : " + c1.ram);
		System.out.println("cpu : " + c1.cpu);
		
		System.out.println("-----------------");
		
		Computer c2 = new Computer();
		c2.getInfo();
		
		Computer c3 = new Computer();
		c3.ssd = 512;
//		c3.brand = "samsung";
		c3.getInfo();
		
	}//main
	
}

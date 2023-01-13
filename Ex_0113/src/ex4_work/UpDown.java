package ex4_work;

public class UpDown {

	boolean decide = true;

	public boolean decideNum(int com, int user) {
		
		if(com < user) {
			System.out.println("Down");
			return decide = true;
		}else if(com > user) {
			System.out.println("Up");
			return decide = true;
		}else {
			return decide = false;
		}
	}
	


}

package ex3_work;
import java.util.*;
public class Ex3_work {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		//검색할 배우 : song
		//[song]
		//박쥐
		//괴물
		//관상
		//---------검색이 올바르게 된 경우
		
		//검색할 배우 : park
		//해당 배우가 없습니다
		//---------검색 결과가 없는 경우
		
		String[][] actor = { 
				{"[song]", "박쥐", "괴물", "관상"},
				{"[lee]", "백두산", "내부자들", "광해"},
				{"[ryu]", "올빼미", "럭키", "타짜"}
		};
		
		Scanner scan = new Scanner(System.in);
		System.out.print("검색할 배우 : ");
		String input = scan.next();
		String name;
		boolean t = false;
		int listn = -1;
		for(int i = 0;	i < actor.length;	i++) {
			name = actor[i][0].substring(1, actor[i][0].length()-1);
			listn++;
			if(name.equalsIgnoreCase(input)) {
				t = true;
				break;
			}
		}
		if(t == false) {
			System.out.println("해당 배우가 없습니다");
		}else {
			for(int i = 0;	i < actor[listn].length;	i++)
				System.out.println(actor[listn][i]);
		}
		System.out.println("-------------------------");
		int count = 0;
		for(int i = 0;	i < actor.length;	i++) {
			if(actor[i][0].equalsIgnoreCase("[" + input + "]")) {
				for(int j = 0;	j < actor[i].length;	j++) {
					System.out.println(actor[i][j]);
				}
			}else {
				count++;
				if(count == actor.length) {
					System.out.println("해당 배우 없음");
				}
			}
		}//outer
	}//main
}

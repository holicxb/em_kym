package ex3_work;
import java.util.*;
public class Ex3_work {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		//�˻��� ��� : song
		//[song]
		//����
		//����
		//����
		//---------�˻��� �ùٸ��� �� ���
		
		//�˻��� ��� : park
		//�ش� ��찡 �����ϴ�
		//---------�˻� ����� ���� ���
		
		String[][] actor = { 
				{"[song]", "����", "����", "����"},
				{"[lee]", "��λ�", "�����ڵ�", "����"},
				{"[ryu]", "�û���", "��Ű", "Ÿ¥"}
		};
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�˻��� ��� : ");
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
			System.out.println("�ش� ��찡 �����ϴ�");
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
					System.out.println("�ش� ��� ����");
				}
			}
		}//outer
	}//main
}

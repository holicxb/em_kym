package ex1_list;

import java.util.ArrayList;

public class Ex2_ArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> sList = new ArrayList<>();
		sList.add("���");
		sList.add("����");
		sList.add("Ȳ��");
		sList.add("�浿");
		sList.add("����");
		
		System.out.println(sList);
		
		sList.add(0, "����");
		sList.add(0, "����");
		sList.remove(3);
		sList.remove(3);
		sList.remove(3);
		sList.add("����");
		
		System.out.println(sList);
	}//main
	
}
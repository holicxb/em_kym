package ex6_work;
import java.util.*;
public class Anagram {

	public void makeAna(String com) {
		Random rnd = new Random();

		char[] str = new char[com.length()];
		int[] temp = new int[com.length()];
		for(int i = 0;	i < com.length();	i++) {
			temp[i] = rnd.nextInt(com.length());
			for(int j = 0;	j < i;	j++) {
				if(temp[i] == temp[j]) {
					i--;
					break;
				}
			}
			str[temp[i]] = com.charAt(i);
		}
		for(int i = 0;	i < com.length();	i++) {
			System.out.print(str[i]);
		}
		System.out.println();
	}
	
}

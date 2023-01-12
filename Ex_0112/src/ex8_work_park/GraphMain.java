package ex8_work_park;

import java.util.Random;

public class GraphMain {

	public static void main(String[] args) {
		
		int[] bob = new int[10];
		
		for(int i = 0;	i < 100;	i++) {
			int r = new Random().nextInt(10);
			System.out.print(r);
			bob[r]++;
		}
		System.out.println();
		Graph gg = new Graph();
		gg.getGraph(bob);
		
	}
}

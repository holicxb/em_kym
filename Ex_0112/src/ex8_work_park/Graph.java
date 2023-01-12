package ex8_work_park;

public class Graph {

	public void getGraph(int[] arr){
		for(int i = 0;	i < arr.length;	i++) {
			System.out.print(i + "ÀÇ °³¼ö : ");
			for(int j = 0;	j < arr[i];	j++) {
				System.out.print("#");
			}
			System.out.println(" " + arr[i]);
		}
	}
}

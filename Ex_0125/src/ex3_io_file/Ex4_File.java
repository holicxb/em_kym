package ex3_io_file;

import java.io.File;

public class Ex4_File {
	public static void main(String[] args) {
		String path = "C:/embedded_kym";
		
		File f1 = new File(path);
		
		if(f1.isDirectory()) {
			//path 경로의 하위 목록들을 File 클래스 구조로 받을 것
			File[] f2 = f1.listFiles();
			
			//하위 목록들을 출력하되, 폴더 구조만 보여주기
			for(int i = 0;	i < f2.length;	i++) {
				if(f2[i].isDirectory()) {
					System.out.println(f2[i].getName());
				}
			}
		}
		
	}//main
}

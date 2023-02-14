package ex3_char_output;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Ex2_BufferedWriter {

	public static void main(String[] args) {
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter("C:/embedded_kym/bufferedWriter의 예제.txt");
			bw = new BufferedWriter(fw);
			
			bw.write("첫 번째 line입니다");
			bw.newLine();//\n과 같은 엔터값에 해당하는 메서드
			bw.write("두 번째 줄");
			
			bw.flush();//물리적으로 내용을 기록
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				//역순으로 스트림을 닫는다
				bw.close();
				fw.close();
			} catch (Exception e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		}
		
	}//main
}

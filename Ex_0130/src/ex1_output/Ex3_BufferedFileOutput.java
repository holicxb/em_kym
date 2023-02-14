package ex1_output;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Ex3_BufferedFileOutput {

	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fos = new FileOutputStream("C:/embedded_kym/bos의 예제.txt");
			bos = new BufferedOutputStream(fos);
			String str = "Buffered 스트림의 예제.";
			bos.write(str.getBytes());
			
			//내용을 물리적으로 기록하기 위한 메서드
			bos.flush();
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				//원래는 클로즈 하면서 기록함
				//output스트림 역시, 생성된 역순으로 닫아주는 것이 좋다
				bos.close();
				fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}//main
	
}

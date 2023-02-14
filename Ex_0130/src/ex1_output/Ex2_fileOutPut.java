package ex1_output;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex2_fileOutPut {

	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		String path = "C:/embedded_kym/fileOutput예제.txt";
		File f = new File(path);
		
		try {
			
			fos = new FileOutputStream(f, true);//기본 false속성은 덮어쓰기
			String msg = "new라인을 입력해\n";
			String msg2 = "반가워요\n";
			
			//msg.getBytes() : String 타입의 문장을 byte[]로 변경해주는 메서드
			fos.write(msg.getBytes());
			fos.write(msg2.getBytes());
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}//main
}

package ex1_file_input;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import util.MyPath;

public class Ex1_FileInput {
	public static void main(String[] args) {
		
		String path = MyPath.PATH + "/test.txt";
		//C:\embedded_kym/test.txt
		
		File f = new File(path);
		
		//접근 경로상에 문제가 없다면 안으로 들어감
		if(f.exists()) {
			//파일 클래스와 연결된 InputStream을 생성
			try {
				FileInputStream fis = new FileInputStream(f);
				
				int code = -1;
				
				//fis은 1byte단위로 값을 가져온다
				//fis스트림은 더 이상 읽어 올 내용이 없다면 -1을 반환한다
				//byte단위로 데이터를 읽다가 EOF(End Of File)을 만났다는 것을 의미한다
				while((code = fis.read()) != -1) {
					System.out.print((char)code);
				}//while
				fis.close();//Stream들은 사용 후 사용을 완료했다고 닫아주는 것이 중요
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}//main
}

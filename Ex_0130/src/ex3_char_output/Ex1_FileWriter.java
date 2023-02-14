package ex3_char_output;

import java.io.FileWriter;
import java.io.IOException;

public class Ex1_FileWriter {

	public static void main(String[] args) {
		
		FileWriter fr = null;
		
		try {
			fr = new FileWriter("C:/embedded_kym/fileWriter����.txt", true);
			String str = "first line\n";
			String str2 = "�� ��° ��\n";
			
			//fr�� �⺻������ 2byte�� �����ϱ� ������ getBytes()�� ����
			//byte[] ������ �ɰ��� �ʾƵ� ��� ����
			fr.write(str);
			fr.write(str2);
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}//main
	
}

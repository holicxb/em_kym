package ex1_output;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex2_fileOutPut {

	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		String path = "C:/embedded_kym/fileOutput����.txt";
		File f = new File(path);
		
		try {
			
			fos = new FileOutputStream(f, true);//�⺻ false�Ӽ��� �����
			String msg = "new������ �Է���\n";
			String msg2 = "�ݰ�����\n";
			
			//msg.getBytes() : String Ÿ���� ������ byte[]�� �������ִ� �޼���
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

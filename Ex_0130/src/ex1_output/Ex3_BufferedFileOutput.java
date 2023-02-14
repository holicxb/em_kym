package ex1_output;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Ex3_BufferedFileOutput {

	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fos = new FileOutputStream("C:/embedded_kym/bos�� ����.txt");
			bos = new BufferedOutputStream(fos);
			String str = "Buffered ��Ʈ���� ����.";
			bos.write(str.getBytes());
			
			//������ ���������� ����ϱ� ���� �޼���
			bos.flush();
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				//������ Ŭ���� �ϸ鼭 �����
				//output��Ʈ�� ����, ������ �������� �ݾ��ִ� ���� ����
				bos.close();
				fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}//main
	
}

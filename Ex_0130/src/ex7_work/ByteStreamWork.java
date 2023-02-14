package ex7_work;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamWork {

	public static void main(String[] args) {
		
		//byte ����� ��Ʈ���� ����� ��
		//�ƹ� ��ο� file.txt�� ����� ������ �־� ����
		//����� file.txt�� �о ȸ�������� �ƴ��� �Ǵ��Ͻÿ�
		
		String path = "C:/embedded_kym/makingtxt/file.txt";
		File f = new File(path);
		byte[] b_read = new byte[(int)f.length()];
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		try {
			fis = new FileInputStream(f);
			bis = new BufferedInputStream(fis);
			bis.read(b_read);
			String str = new String(b_read);
			String rev = "";
			for(int i = str.length() - 1;	i >= 0;	i--) {
				rev += str.charAt(i);
			}
			if(!str.equals(rev)) {
				System.out.printf("%s�� ȸ���� �ƴմϴ�\n", str);
			}
			else {
				System.out.printf("%s�� ȸ���Դϴ�\n", str);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				bis.close();
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}//main
}

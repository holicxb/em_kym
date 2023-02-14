package ex8_work_ans;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class GameSave {

	public void scoreWriter(Rsp rsp) {
		
		//C:/embedded_kym/makingtxt/�����̸�.sav
		String path = "C:/embedded_kym/RspGame/" + rsp.getId() + ".sav";
		
		File f = new File("C:/embedded_kym/RspGame/");
		
		if(!f.exists()) {
			f.mkdirs();
		}
		
		FileOutputStream fos  = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(path);
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(rsp);//����Ϸ�
			
			System.out.println("����Ϸ�");
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				oos.close();
				fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
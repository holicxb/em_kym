package snakegame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

import teamProject.MainFrame;

public class GameFrame extends JFrame{

	
	public GameFrame(){
		
		GamePanel penel = new GamePanel();
		
		this.add(new GamePanel());
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				dispose();
				new MainFrame();
			}
		});
		 
	}
	
	
}

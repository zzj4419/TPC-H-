package mysql2;

import java.awt.*;
import javax.swing.*;;
public class mainframe extends JFrame {
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); //��ȡ��Ļ�ĳߴ� 
	public int screenWidth = screenSize.width; //��ȡ��Ļ�Ŀ�  
	public int screenHeight = screenSize.height; //��ȡ��Ļ�ĸ�
	public int default_WIDTH = 540;
	public int default_HEIGHT = 380;
	public mainframe()
	{
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(default_WIDTH+200, default_HEIGHT+300);
		this.setResizable(false);
		this.setLocation((screenWidth - default_WIDTH) / 2, screenHeight / 4-190);
		this.setTitle("���ݿ�");
		
	}
	
}

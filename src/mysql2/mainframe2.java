package mysql2;

import java.awt.*;
import javax.swing.*;;
public class mainframe2 extends JFrame {
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); //获取屏幕的尺寸 
	public int screenWidth = screenSize.width; //获取屏幕的宽  
	public int screenHeight = screenSize.height; //获取屏幕的高
	public int default_WIDTH = 540;
	public int default_HEIGHT = 380;
	public mainframe2()
	{
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(default_WIDTH, default_HEIGHT);
		this.setResizable(false);
		this.setLocation((screenWidth - default_WIDTH) / 2, screenHeight / 4);
		this.setTitle("数据库");
		
	}
	
}

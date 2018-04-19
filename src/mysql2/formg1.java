package mysql2;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import basicValue.Button;
import basicValue.Label;
import basicValue.Screen;
import basicValue.TextField;

public class formg1 extends JPanel implements ActionListener {
	private int lX = (int) (Label.WIDTH * 0.2);
	private int l1Y = (int) (Label.HEIGHT);
	private int l2Y = (int) (Label.HEIGHT * 3);
	private int fX = (int) (Screen.little_WIDTH/2 - TextField.WIDTH * 0.2);
	private int btn1X = (int) (Screen.little_WIDTH/2 - Button.WIDTH * 2);
	private int btn2X = (int) (Screen.little_WIDTH/2 - Button.WIDTH * 0.5);
	private int btn3X = (int) (Screen.little_WIDTH/2 + Button.WIDTH);
	private int btnY = (int) (Screen.little_HEIGHT - Button.HEIGHT * 3);
//**************************************************************************
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); //获取屏幕的尺寸 
	public int screenWidth = screenSize.width; //获取屏幕的宽  
	public int screenHeight = screenSize.height; //获取屏幕的高
	JTextField jtf1;
	JButton jb1;
	public formg1(){
		JButton jb1 = new JButton("确认");
		add(jb1);
		jb1.setBounds(100,40,100,40);
		jtf1=new JTextField(48);
		add(jtf1);
		jtf1.setBounds(fX, l1Y, TextField.WIDTH, TextField.HEIGHT);
		jb1.addActionListener(this);
	}
	
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// TODO Auto-generated method stub
							try{

								if("确认".equals(e.getActionCommand()))
								{
									java.sql.Connection con;
							        //驱动程序名
							        String driver = "com.mysql.jdbc.Driver";
							        //URL指向要访问的数据库名mydata
							        String url = "jdbc:mysql://localhost:3306/project";
							        //MySQL配置时的用户名
							        String user = "root";
							        //MySQL配置时的密码
							        String password = "zzjzzj1234";
							        //遍历查询结果集 
									String[] shuxing=jtf1.getText().split("//");
									int n=0;
									String sql = null;
									try {
							            //加载驱动程序
							            Class.forName(driver);
							            //1.getConnection()方法，连接MySQL数据库！！
							            con = DriverManager.getConnection(url,user,password);
							            if(!con.isClosed())
							                System.out.println("Succeeded connecting to the Database!");
							            //2.创建statement类对象，用来执行SQL语句！！
							            Statement statement = con.createStatement();
							            //要执行的SQL语句
							           
							           
							             sql = "insert into lineitem values("+shuxing[n].toString()+","+shuxing[n+1].toString()+","+shuxing[n+2].toString()+","+shuxing[n+3].toString()+","+shuxing[n+4].toString()+","+shuxing[n+5].toString()+","+shuxing[n+6].toString()+","+shuxing[n+7].toString()+","+shuxing[n+8].toString()+","+shuxing[n+9].toString()+","+shuxing[n+10].toString()+","+shuxing[n+11].toString()+","+shuxing[n+12].toString()+","+shuxing[n+13].toString()+","+shuxing[n+14].toString()+","+shuxing[n+15].toString()+");";	
							            
							            
							            statement.execute(sql);
							            //3.ResultSet类，用来存放获取的结果集！！
							        } catch(ClassNotFoundException e1) {   
							            //数据库驱动类异常处理
							            System.out.println("Sorry,can`t find the Driver!");   
							            e1.printStackTrace();   
							            } catch(SQLException e1) {
							            //数据库连接失败异常处理
							            e1.printStackTrace();  
							            }catch (Exception e1) {
							            // TODO: handle exception
							            e1.printStackTrace();
							        }finally{
							            System.out.println("数据库数据成功获取！！");
							        }
							    }
								
							}catch(Exception ex){}
						}
			}



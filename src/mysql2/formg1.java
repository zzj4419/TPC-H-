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
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); //��ȡ��Ļ�ĳߴ� 
	public int screenWidth = screenSize.width; //��ȡ��Ļ�Ŀ�  
	public int screenHeight = screenSize.height; //��ȡ��Ļ�ĸ�
	JTextField jtf1;
	JButton jb1;
	public formg1(){
		JButton jb1 = new JButton("ȷ��");
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

								if("ȷ��".equals(e.getActionCommand()))
								{
									java.sql.Connection con;
							        //����������
							        String driver = "com.mysql.jdbc.Driver";
							        //URLָ��Ҫ���ʵ����ݿ���mydata
							        String url = "jdbc:mysql://localhost:3306/project";
							        //MySQL����ʱ���û���
							        String user = "root";
							        //MySQL����ʱ������
							        String password = "zzjzzj1234";
							        //������ѯ����� 
									String[] shuxing=jtf1.getText().split("//");
									int n=0;
									String sql = null;
									try {
							            //������������
							            Class.forName(driver);
							            //1.getConnection()����������MySQL���ݿ⣡��
							            con = DriverManager.getConnection(url,user,password);
							            if(!con.isClosed())
							                System.out.println("Succeeded connecting to the Database!");
							            //2.����statement���������ִ��SQL��䣡��
							            Statement statement = con.createStatement();
							            //Ҫִ�е�SQL���
							           
							           
							             sql = "insert into lineitem values("+shuxing[n].toString()+","+shuxing[n+1].toString()+","+shuxing[n+2].toString()+","+shuxing[n+3].toString()+","+shuxing[n+4].toString()+","+shuxing[n+5].toString()+","+shuxing[n+6].toString()+","+shuxing[n+7].toString()+","+shuxing[n+8].toString()+","+shuxing[n+9].toString()+","+shuxing[n+10].toString()+","+shuxing[n+11].toString()+","+shuxing[n+12].toString()+","+shuxing[n+13].toString()+","+shuxing[n+14].toString()+","+shuxing[n+15].toString()+");";	
							            
							            
							            statement.execute(sql);
							            //3.ResultSet�࣬������Ż�ȡ�Ľ��������
							        } catch(ClassNotFoundException e1) {   
							            //���ݿ��������쳣����
							            System.out.println("Sorry,can`t find the Driver!");   
							            e1.printStackTrace();   
							            } catch(SQLException e1) {
							            //���ݿ�����ʧ���쳣����
							            e1.printStackTrace();  
							            }catch (Exception e1) {
							            // TODO: handle exception
							            e1.printStackTrace();
							        }finally{
							            System.out.println("���ݿ����ݳɹ���ȡ����");
							        }
							    }
								
							}catch(Exception ex){}
						}
			}



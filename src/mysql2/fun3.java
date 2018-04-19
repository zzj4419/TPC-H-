package mysql2;
import java.sql.ResultSet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.mysql.jdbc.ResultSetMetaData;


import basicValue.Button;
import basicValue.Label;
import basicValue.Screen;
import basicValue.TextField;


public class fun3 extends JPanel implements ActionListener{
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
	JTable jt1;
	JScrollPane scrollPane; 
	public fun3(){
		JButton jb1 = new JButton("确认");
		add(jb1);
		jb1.setBounds(100,40,100,40);
		jtf1=new JTextField(15);
		add(jtf1);
		jtf1.setBounds(fX, l1Y, TextField.WIDTH, TextField.HEIGHT);
		jb1.addActionListener(this);
		String col[] = { "CustomerName","Address","Nation","Account","Comment","RevenueLost"};
		String sn[][]=null; 
		DefaultTableModel model = new DefaultTableModel(sn, col);
		jt1 = new JTable(model);
		scrollPane = new JScrollPane(jt1);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		jt1.setPreferredScrollableViewportSize(this.getSize());
		jt1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		scrollPane.setBounds(0, 0, 500, 200);
		add(scrollPane);
		setVisible(true);
		jt1.setRowHeight(20);
		jt1.setGridColor(Color.BLACK);
		jt1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		jt1.setPreferredScrollableViewportSize(new Dimension(500, 500));
		

	}
	@Override
	public void actionPerformed(ActionEvent e) {
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
				int n=0;
				String [][] sn = null;    
				int row = 0; 
				int i = 0;     
				String sql = null;
				ResultSet rs = null;
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
		           
		            	sql="SELECT C_NAME AS CustomerName, C_ADDRESS AS Address, (SELECT N_NAME FROM nation WHERE N_NATIONKEY = C_NATIONKEY) AS Nation, C_ACCTBAL AS Account, C_COMMENT AS Comment, (SELECT COALESCE(SUM((L_EXTENDEDPRICE*(1-L_DISCOUNT))),0) FROM orders,lineitem WHERE O_ORDERKEY = L_ORDERKEY AND O_CUSTKEY = C_CUSTKEY  AND (L_RECEIPTDATE > '"+jtf1.getText()+"' AND L_RECEIPTDATE < DATE_ADD('"+jtf1.getText()+"',INTERVAL 3 MONTH) ) AND L_RETURNFLAG = 'R') AS RevenueLost FROM customer ORDER BY RevenueLost DESC LIMIT 20;";
                       
		                rs =statement.executeQuery(sql);
		            String col[] =  { "CustomerName","Address","Nation","Account","Comment","RevenueLost"};
		           if(rs.last())
					{
						row = rs.getRow();     
						}      
					if(row == 0){
						sn = null;
						}     
					else{   
						sn  = new String[row][6];      
						rs.first();      
						rs.previous();      
						while(rs.next())       
						{ 
							sn[i][0] = rs.getString("CustomerName");       
							sn[i][1] = rs.getString("Address");       
							sn[i][2] = rs.getString("Nation");  
							sn[i][3] = rs.getString("Account");  
							sn[i][4] = rs.getString("Comment");  
							sn[i][5] = rs.getString("RevenueLost");  
							for(int k=0;k<6;k++)
							{
								if(sn[i][k]==null)
									sn[i][k]="无";
							}
							i++;      
							} 
						DefaultTableModel tm = new DefaultTableModel(sn,col);
						jt1.setModel(tm);
						jt1.repaint();
					}
				}
	            //3.ResultSet类，用来存放获取的结果集！！
		        catch(ClassNotFoundException e1) {   
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
	public  Vector getNextRow(ResultSet rs, java.sql.ResultSetMetaData rsmd)
            throws SQLException {
        Vector<String> currentRow = new Vector<String>();
        for (int i = 1; i <= rsmd.getColumnCount(); ++i)
            currentRow.addElement(rs.getString(i));
        return currentRow; // 返回一条记录
    }
}



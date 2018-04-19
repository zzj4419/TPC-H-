package mysql2;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;


public class mainpanel extends JPanel implements ActionListener {
		JButton jb1;
		JButton jb2;
		JButton jb3;
		JButton jb4;
		JButton jb5;
		JButton jb6;
		JButton jb7;
		JButton jb8;
		JButton jb9;
		JButton jb10;
		JButton jb11;
	    JButton jb12;
	public mainpanel()
	{
		JButton jb1 = new JButton("part");
		JButton jb2 = new JButton("customer");
		JButton jb3 = new JButton("supplier");
		JButton jb4 = new JButton("region");
		JButton jb5 = new JButton("nation");
		JButton jb6 = new JButton("partsupp");
		JButton jb7 = new JButton("lineitem");
		JButton jb8 = new JButton("orders");
		JButton jb9 = new JButton("功能1");
		JButton jb10 = new JButton("功能2");
		JButton jb11 = new JButton("功能3");
		JButton jb12 = new JButton("功能4");
		add(jb1);
		add(jb2);
		add(jb3);
		add(jb4);
		add(jb5);
		add(jb6);
		add(jb7);
		add(jb8);
		add(jb9);
		add(jb10);
		add(jb11);
		add(jb12);
		jb1.setBounds(100,40,100,40);
	    jb2.setBounds(100,100,120,35);
	    jb3.setBounds(100,150,80,50);
	    jb4.setBounds(100,220,90,70);
	    jb5.setBounds(100,320,150,40);
	    jb6.setBounds(100,390,130,30);
	    jb7.setBounds(250,40,100,40);
	    jb8.setBounds(250,100,130,30);
	    jb9.setBounds(250,150,130, 30);
	    jb10.setBounds(250,220,130, 30);
	    jb11.setBounds(250,320,130, 30);
	    jb12.setBounds(250,390,130, 30);
	    jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);
		jb5.addActionListener(this);
		jb6.addActionListener(this);
		jb7.addActionListener(this);
		jb8.addActionListener(this);
		jb9.addActionListener(this);
		jb10.addActionListener(this);
		jb11.addActionListener(this);
		jb12.addActionListener(this);
	}

	

	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if("part".equals(e.getActionCommand())){
			   mainframe2 a=new mainframe2();
			   forma fm=new forma();
			   a.add(fm);
		 }
		 if("customer".equals(e.getActionCommand())){
			   mainframe2 a=new mainframe2();
			   formb fm=new formb();
			   a.add(fm);
		 }
		 if("supplier".equals(e.getActionCommand())){
			   mainframe2 a=new mainframe2();
			   formc fm=new formc();
			   a.add(fm);
			   }
		 if("region".equals(e.getActionCommand())){
			   mainframe2 a=new mainframe2();
			   formd fm=new formd();
			   a.add(fm);
			   }
		 if("nation".equals(e.getActionCommand())){
			   mainframe2 a=new mainframe2();
			   forme fm=new forme();
			   a.add(fm);
			   }
			   
		 if("partsupp".equals(e.getActionCommand())){
			   mainframe2 a=new mainframe2();
			   formf fm=new formf();
			   a.add(fm);
			   }
		 if("lineitem".equals(e.getActionCommand())){
			   mainframe2 a=new mainframe2();
			   formg fm=new formg();
			   a.add(fm);
			   }
		 if("orders".equals(e.getActionCommand())){
			   mainframe2 a=new mainframe2();
			   formh fm=new formh();
			   a.add(fm);
			   }
		 if("功能1".equals(e.getActionCommand())){
			   mainframe a=new mainframe();
			   fun1 fm=new fun1();
			   a.add(fm);
			   }
		 if("功能2".equals(e.getActionCommand())){
			   mainframe a=new mainframe();
			   fun2 fm=new fun2();
			   a.add(fm);
			   }
		 if("功能3".equals(e.getActionCommand())){
			   mainframe a=new mainframe();
			   fun3 fm=new fun3();
			   a.add(fm);
			   }
		 if("功能4".equals(e.getActionCommand())){
			   mainframe a=new mainframe();
			   fun4 fm=new fun4();
			   a.add(fm);
			   }
		 }
		// TODO Auto-generated method stub



	}
		
	



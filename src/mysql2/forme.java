package mysql2;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

import basicValue.Button;
import basicValue.Label;
import basicValue.Screen;
import basicValue.TextField;

public class forme extends JPanel implements ActionListener{
	JButton jb1;
	JButton jb2;
	JButton jb3;
	JButton jb4;
	
	public forme(){
		
		JButton jb1 = new JButton("����");
		JButton jb2 = new JButton("ɾ��");
		JButton jb3 = new JButton("�޸�");
		JButton jb4 = new JButton("����");
		add(jb1);
		add(jb2);
		add(jb3);
		add(jb4);
		jb1.setBounds(100,40,100,40);
	    jb2.setBounds(100,100,120,35);
	    jb3.setBounds(100,150,80,50);
	    jb4.setBounds(100,220,90,70);
	    jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if("����".equals(e.getActionCommand())){
			   mainframe a=new mainframe();
			   forme1 fm=new forme1();
			   a.add(fm);
		 }
		else if("ɾ��".equals(e.getActionCommand())){
			   mainframe a=new mainframe();
			   forme2 fm=new forme2();
			   a.add(fm);
		 }
		else if("�޸�".equals(e.getActionCommand())){
			   mainframe a=new mainframe();
			   forme3 fm=new forme3();
			   a.add(fm);
		 }
		else if("����".equals(e.getActionCommand())){
			   mainframe a=new mainframe();
			   forme4 fm=new forme4();
			   a.add(fm);
		 }
	}
}

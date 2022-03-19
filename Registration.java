import javax.swing.*; 
import javax.swing.table.DefaultTableModel; 
import java.awt.*;  
import java.awt.event.*;  
import java.sql.*;

import javax.swing.border.*;

import java.io.IOException;
import java.net.URI;
import java.awt.geom.*;
import java.awt.font.TextAttribute;
//import javax.swing.text.Document;
public class Registration  extends JFrame implements ActionListener   {

	JLabel l1,l2,l3,l4,err1,lbl,lbl1,lbl2,ss,google,insta,twit,err11;
	 JButton btn1,btn2;
	 JTextField txt1;
	 JPasswordField p1;
	 
     
	 JPanel panel1=new JPanel();
	 JPanel panel2=new JPanel();
	 Registration()
	{	 
	//setSize(400,600);
	setBounds(400,150,800,500);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	panel1.setBounds(260,0,530,500);
	panel2.setBounds(0,0,270,500);
	panel2.setBackground(new Color(19, 8, 43));
	panel2.setBorder(new SoftBevelBorder(BevelBorder.RAISED, Color.red,Color.orange));
	panel1.setBackground(Color.white);
	panel1.setBorder(new SoftBevelBorder(BevelBorder.RAISED, Color.red,Color.black));
	setTitle("Login FORM");
	lbl=new JLabel("Welcome..!");
	lbl.setBounds(35,5,500,80);
	lbl.setFont(new Font("Segoe Script", Font.BOLD, 30));
	lbl.setForeground(Color.white);
	add(panel1);
	add(panel2);
	panel2.add(lbl);
	l1=new JLabel("Your Host",JLabel.CENTER);
	l1.setBounds(0,10,270,500);
	l1.setFont(new Font("Segoe Script",Font.BOLD,15));
	l1.setForeground(Color.white);
	panel2.add(l1);
	l2=new JLabel("Registration",JLabel.CENTER);
	l2.setBounds(0,180,270,500);
	l2.setFont(new Font("Segoe Script",Font.BOLD,15));
	l2.setForeground(Color.white);
	panel2.add(l2);
//	ss=new JLabel();
//	ss.setIcon(new ImageIcon("C:\\Users\\krish\\Desktop\\ss.jpg"));
//	ss.setBounds(0,0,270,500);
//	panel2.add(ss);
//	
	
	
	
	
	
	panel2.setLayout(null);
	setLayout(null);
	//setResizable(false);
	setVisible(true);
	}
	public void actionPerformed(ActionEvent s)   
	   { 
		
	   }
	   
	public static void main(String args[])
	{
		new Registration();
	}
}
		
	

	


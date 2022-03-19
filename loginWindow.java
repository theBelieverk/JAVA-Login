import javax.swing.*; 
import javax.swing.table.DefaultTableModel; 
import java.awt.*;  
import java.awt.event.*;  
import java.sql.*;

import javax.swing.border.*;

import java.io.IOException;
import java.net.URI;

import javax.swing.ImageIcon;
import java.awt.geom.*;
import java.awt.font.TextAttribute;
//import javax.swing.text.Document;
public class loginWindow  extends JFrame implements ActionListener   {

	JLabel l1,l2,l3,l4,err1,lbl,lbl1,lbl2,face,google,insta,twit,err11;
	 JButton btn1,btn2;
	 JTextField txt1;
	 JPasswordField p1;
	 
     
	 JPanel panel=new JPanel();
	loginWindow()
	{	 
	//setSize(400,600);
	setBounds(500,200,530,450);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	panel.setBounds(0,0,530,450);
	panel.setBackground(Color.white);
	panel.setBorder(new SoftBevelBorder(BevelBorder.RAISED, Color.red,Color.black));
	setTitle("Login FORM");
	 lbl=new JLabel("Welcome..!");
	lbl.setBounds(235,5,80,80);
	
	panel.add(lbl);
	
	l1=new JLabel("");
	l1.setIcon(new ImageIcon("C:\\Users\\krish\\Desktop\\kk.png"));
	l1.setBounds(155,100,35,35);
	
	panel.add(l1);
	
	panel.setLayout(null);
	l2=new JLabel("");
	l2.setIcon(new ImageIcon("C:\\Users\\krish\\Desktop\\p.jpg"));
	l2.setBounds(155,175,35,35);
	panel.add(l2);
	txt1=new JTextField();
	txt1.setBorder(new SoftBevelBorder(BevelBorder.RAISED,Color.white,Color.blue));
	


	
	txt1.setBounds(190,100,200,35);
	
	err1=new JLabel("Please fill the Data First......!");
	err1.setVisible(false);
	err1.setBounds(200,210,300,40);
	err1.setForeground(Color.red);
	panel.add(err1);
	p1=new JPasswordField();
	p1.setBounds(190,175,200,35);
	p1.setBorder(new SoftBevelBorder(BevelBorder.RAISED, Color.white,Color.blue));
	panel.add(txt1);
	panel.add(p1);
	p1=new JPasswordField();
	btn1=new JButton("LOGIN");

	btn1.setBounds(150,250,250,30);

	btn1.setForeground(Color.white);  

	btn1.setBackground(Color.black);  
	btn1.setBorder(new SoftBevelBorder(BevelBorder.RAISED, Color.RED,Color.CYAN));
		panel.add(btn1);
		
		 btn1.addActionListener(this);  
	       
	add(panel);
	lbl1=new JLabel("New User ?");
	lbl2=new JLabel("Create an account");
	//lbl2.addMouseListener((MouseListener) this);;
	lbl2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	lbl1.setBounds(190,280,80,30);
	lbl2.setBounds(260,280,250,30);
	lbl2.setForeground(Color.blue);
	panel.add(lbl1);
	panel.add(lbl2);
	
//	lbl2.addComponentListener(new ActionListener() {
	lbl2.addMouseListener(new MouseAdapter() {
	    public void mouseClicked(MouseEvent me) {
	     // currentLabel.setVisible(false);   // No more compilation error here
	    	//System.out.println("hello ");
	    	if(me.getSource()==lbl2)
			{
			
				if(txt1.getText().length()==0 && p1.getText().length()==0)
				{
					
					err1.setVisible(true);
					err11.setVisible(true);
				}else if(txt1.getText().length()>=0 && p1.getText().length()>=0)
				{
					dispose();
			    	new Registration();
				}
				else
				{
					dispose();
			    	new Registration();
				}
			}
			
		}
	    	
	    	
	    }
	  );

	btn1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	
	face=new JLabel();
	face.setIcon(new ImageIcon("C:\\Users\\krish\\Desktop\\face.png"));
	
	face.setBounds(180,350,35,35);
	face.addMouseListener(new MouseAdapter() {
	    public void mouseClicked(MouseEvent me) {
	    	try {
                Desktop desktop = java.awt.Desktop.getDesktop();
                URI oURL = new URI("https://www.facebook.com");
                desktop.browse(oURL);
            } catch (Exception e) {
                e.printStackTrace();
            }
	    }
	});
	panel.add(face);
	face.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	
	
	insta=new JLabel();
	insta.setIcon(new ImageIcon("C:\\Users\\krish\\Desktop\\insta.png"));
	insta.setBounds(230,350,35,35);
	insta.addMouseListener(new MouseAdapter() {
	    public void mouseClicked(MouseEvent me) {
	    	try {
                Desktop desktop = java.awt.Desktop.getDesktop();
                URI oURL = new URI("https://www.instagram.com/accounts/login/?hl=en");
                desktop.browse(oURL);
            } catch (Exception e) {
                e.printStackTrace();
            }
	    }
	});
	panel.add(insta);
	insta.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	
	twit=new JLabel();
	twit.setIcon(new ImageIcon("C:\\Users\\krish\\Desktop\\twit.png"));
	twit.setBounds(280,350,35,35);
	twit.addMouseListener(new MouseAdapter() {
	    public void mouseClicked(MouseEvent me) {
	    	try {
                Desktop desktop = java.awt.Desktop.getDesktop();
                URI oURL = new URI("https://twitter.com/explore");
                desktop.browse(oURL);
            } catch (Exception e) {
                e.printStackTrace();
            }
	    }
	});
	panel.add(twit);
	twit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	
	google=new JLabel();
	google.setIcon(new ImageIcon("C:\\Users\\krish\\Desktop\\google.png"));
	google.setBounds(330,350,35,35);
	google.addMouseListener(new MouseAdapter() {
	    public void mouseClicked(MouseEvent me) {
	    	try {
                Desktop desktop = java.awt.Desktop.getDesktop();
                URI oURL = new URI("https://www.Google.com");
                desktop.browse(oURL);
            } catch (Exception e) {
                e.printStackTrace();
            }
	    }
	});
	
	panel.add(google);
	google.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	
	
	err11=new JLabel();
	err11.setIcon(new ImageIcon("C:\\Users\\krish\\Desktop\\err1.png"));
	err11.setBounds(180,223,15,15);
	panel.add(err11);
	err11.setVisible(false);
	
	
//	Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\krish\\Desktop");    
//	setIconImage(icon);
//	JLabel ll = new JLabel(new ImageIcon("E:\\kiran\\2021\\SwingProject\\src\\main\\java\\kk.png"));
//	ll.setBounds(100,70,50,50);
//	panel.add(ll);
//	JLabel image=new JLabel(new ImageIcon("C:\\\\Users\\\\krish\\\\Desktop\\f.jpg"));
//	image.setBounds(110,300,50,50);
//	panel.add(image);
//	ImageIcon background = new ImageIcon("C:\\Users\\krish\\Desktop");
//	JLabel image = new JLabel();
//	image.setBounds(110,300,50,50);
//	image.setIcon(background);

//	JPanel panel = new JPanel();
//	panel.setLayout(null);
//	panel.add(image);
	setLayout(null);
	setResizable(false);
	setVisible(true);
	}
//	 public void paint(Graphics g) {
//		 super.paint(g);  // fixes the immediate problem.
//	        Graphics2D g2 = (Graphics2D) g;
//	        Line2D lin = new Line2D.Float(750, 0, 100, 200000);
//	        g2.draw(lin);
//	        
//	 }
	public void actionPerformed(ActionEvent s)   
   {  
		
		if(s.getSource()==btn1)
		{
		
			if(txt1.getText().length()==0 && p1.getText().length()==0)
			{
				
				err1.setVisible(true);
				err11.setVisible(true);
			}else if(txt1.getText().length()>0 && p1.getText().length()>0)
			{
				err1.setVisible(false );
				err11.setVisible(false);
			}
			else
			{
				err1.setVisible(false);
				err11.setVisible(false);
			}
		}
		
	}
	public static void main(String args[])
	{
		
		new loginWindow();
		
	}
}

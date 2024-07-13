package ska;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class score extends  JFrame implements ActionListener
{
	
	private static final long serialVersionUID = 1L;
	JLabel l, l2,l3,l4;
	JButton b,b1;
	String Username;
     score(String Username,int score){
    	 
    	
    	setSize(900, 500);
		setLocation(120, 100);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.WHITE);
        setLayout(null);
 
        
        l = new JLabel("simple");
		l.setBounds(30, 50, 400, 150);
		l.setForeground(Color.BLUE);
		l.setFont(new Font("jokerman", Font.ITALIC, 100));
		add(l);
		
		l3 = new JLabel("Quiz");
		l3.setBounds(50, 180, 400, 150);
		l3.setForeground(Color.BLUE);
		l3.setFont(new Font("jokerman", Font.ITALIC, 100));
		add(l3);
        
        l2 = new JLabel(""+score);
		l2.setBounds(570, 170, 400, 150);
		l2.setForeground(new Color(199,21,133));
		l2.setFont(new Font("jokerman", Font.ITALIC, 30));
		add(l2);
		
		
		l4 = new JLabel("your Score");
		l4.setBounds(500, 100, 400, 150);
		l4.setForeground(new Color(199,21,133));
		l4.setFont(new Font("jokerman", Font.ITALIC, 40));
		add(l4);
		
		b=new JButton("Exit");
		b.setBounds(630, 300, 170, 20);
		b.setForeground(new Color(199,21,133));
		b.setFont(new Font("RUBIK", Font.ITALIC, 20));
		b.addActionListener(this);
		add(b);
		
		b1=new JButton("open again");
		b1.setBounds(400, 300, 170, 20);
		b1.setForeground(new Color(199,21,133));
		b1.setFont(new Font("RUBIK", Font.ITALIC, 18));
		b1.addActionListener(this);
		add(b1);
		
				setVisible(true);		
     }
public  void actionPerformed(ActionEvent e)  {
    
	 if(e.getSource()==b) {
		System.exit(0); 
	 }
	 
	 if(e.getSource()==b1) {
		 setVisible(false);
		new ska("").setVisible(true); 
	 }
}





public static void main(String args[]) {
   new score(" ",0).setVisible(true);
}

	
}

     


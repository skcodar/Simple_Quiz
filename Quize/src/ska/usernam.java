package ska;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public  class usernam extends JFrame implements ActionListener
{
	 
	private static final long serialVersionUID = 1L;
	JLabel l,l2;
	  JTextField t;
	  JButton b;
	 
      usernam(){
    	
    	
    	setSize(900, 500);
		setLocation(120, 100);
        
//		
	//	ImageIcon il =new ImageIcon(ClassLoader.getSystemResource("src/img/sk.png"));
    //      new JLabel(il);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        l=new JLabel("USERNAME");
        
		l.setBounds(500, 100, 300, 100);
		l.setForeground(new Color(199,21,133));
		l.setFont(new Font("jokerman", Font.ITALIC, 50));
		add(l);
		
		  l2=new JLabel("Q");
	        
			l2.setBounds(50, 180, 400, 200);
			l2.setForeground(new Color(199,21,133));
			l2.setFont(new Font("jokerman", Font.ITALIC, 190));
			add(l2);
        
        
		 t=new JTextField(20);
      
		t.setBounds(600, 300, 200, 25);
		t.setForeground(new Color(199,21,133));
		t.setFont(new Font("Righteous", Font.ITALIC, 15));
		add(t);
		
		 b=new JButton("Login");
	      
			b.setBounds(600, 370, 200, 20);
			b.setForeground(new Color(199,21,133));
			b.setFont(new Font("jokerman", Font.ITALIC, 20));
			b.addActionListener(this);
			add(b);
			setVisible(true);	
}


public  void actionPerformed(ActionEvent e)  {
    if(e.getSource()==b) {
    	String nem = t.getText();
    	 new ska(nem);
    }else {
    	System.exit(0);
    		
   }
}
public static void main(String args[]) {
	 new usernam();
	}




}




package ska;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ska extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	public static int count = 0;
	public static int ans =0;
	public static int score=0;
	JRadioButton p1, p2, p3,p4;
	JButton ne, pr, sub;
	ButtonGroup grop;
	Label l1, l2, l3,l4;
	Panel p,pl;
	String q1[][] = new String[10][5];
	String q2[][] = new String[10][1];
	String q3[][] = new String[10][2];
	String name;
    String Username;
	ska(String Username) {
        this.Username = Username;
		setSize(900, 500);
		setLocation(120, 100);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.WHITE);

		setLayout(null);

		l1 = new Label("");
		l1.setBounds(20, 160, 20, 20);
		l1.setFont(new Font("RUBIK", Font.ITALIC, 20));

		add(l1);

		l2 = new Label("");
		l2.setBounds(60, 160, 600, 20);
		l2.setFont(new Font("RUBIK", Font.ITALIC, 20));

		add(l2);

		ne = new JButton("next");
		ne.setBounds(680, 300, 150, 30);
		ne.setBackground(Color.BLUE);
		ne.setForeground(Color.WHITE);
		ne.addActionListener(this);
		add(ne);

		pr = new JButton("Previes");
		pr.setBounds(680, 350, 150, 30);
		pr.setBackground(Color.BLUE);
		pr.setForeground(Color.WHITE);
		pr.addActionListener(this);
		add(pr);

		sub = new JButton("submit");
		sub.setBounds(680, 400, 150, 30);
		sub.setBackground(Color.BLUE);
		sub.setForeground(Color.WHITE);
		sub.addActionListener(this);
		add(sub);

		p = new Panel();
		p.setBounds(0, 0, 900, 80);
		p.setBackground(Color.YELLOW);
		add(p);

		l3 = new Label("Walcome to the QUIZ");
		l3.setBounds(10, 150, 60, 50);
		l3.setForeground(Color.BLUE);
		l3.setFont(new Font("Righteous", Font.ITALIC, 60));
		p.add(l3);
		
    	pl = new Panel();
		pl.setBounds(0, 70, 900, 80);
		pl.setBackground(Color.YELLOW);
		add(pl);
		
		l4 = new Label(Username);
		l4.setBounds(50, 200, 110, 100);
		l4.setForeground(Color.BLUE);
		l4.setFont(new Font("jokerman", Font.PLAIN, 50));
		pl.add(l4);
	    
		
		
		
		setVisible(true);

		q1[0][0] = "Which is used to find and fix bugs in the Java programs.?";
		q1[0][1] = "JVM";
		q1[0][2] = "JDB";
		q1[0][3] = "JDK";
		q1[0][4] = "JRE";

		q1[1][0] = "What is the return type of the hashCode() method in the Object class?";
		q1[1][1] = "int";
		q1[1][2] = "Object";
		q1[1][3] = "long";
		q1[1][4] = "void";

		q1[2][0] = "Which package contains the Random class?";
		q1[2][1] = "java.util package";
		q1[2][2] = "java.lang package";
		q1[2][3] = "java.awt package";
		q1[2][4] = "java.io package";

		q1[3][0] = "An interface with no fields or methods is known as?";
		q1[3][1] = "Runnable Interface";
		q1[3][2] = "Abstract Interface";
		q1[3][3] = "Marker Interface";
		q1[3][4] = "CharSequence Interface";

		q1[4][0] = "In which memory a String is stored, when we create a string using new operator?";
		q1[4][1] = "Stack";
		q1[4][2] = "String memory";
		q1[4][3] = "Random storage space";
		q1[4][4] = "Heap memory";

		q1[5][0] = "Which of the following is a marker interface?";
		q1[5][1] = "Runnable interface";
		q1[5][2] = "Remote interface";
		q1[5][3] = "Readable interface";
		q1[5][4] = "Result interface";

		q1[6][0] = "Which keyword is used for accessing the features of a package?";
		q1[6][1] = "import";
		q1[6][2] = "package";
		q1[6][3] = "extends";
		q1[6][4] = "export";

		q1[7][0] = "In java, jar stands for?";
		q1[7][1] = "Java Archive Runner";
		q1[7][2] = "Java Archive";
		q1[7][3] = "Java Application Resource";
		q1[7][4] = "Java Application Runner";

		q1[8][0] = "Which of the following is a mutable class in java?";
		q1[8][1] = "java.lang.StringBuilder";
		q1[8][2] = "java.lang.Short";
		q1[8][3] = "java.lang.Byte";
		q1[8][4] = "java.lang.String";

		q1[9][0] = "Which of the following option leads to the portability and security of Java?";
		q1[9][1] = "Bytecode is executed by JVM";
		q1[9][2] = "The applet makes the Java code secure and portable";
		q1[9][3] = "Use of exception handling";
		q1[9][4] = "Dynamic binding between objects";

		q3[0][1] = "JDB";
		q3[1][1] = "int";
		q3[2][1] = "java.util package";
		q3[3][1] = "Marker Interface";
		q3[4][1] = "Heap memory";
		q3[5][1] = "Remote interface";
		q3[6][1] = "import";
		q3[7][1] = "Java Archive";
		q3[8][1] = "java.lang.StringBuilder";
		q3[9][1] = "Bytecode is executed by JVM";

		p1 = new JRadioButton("");
		p1.setBounds(40, 200, 180, 20);
		p1.setBackground(Color.WHITE);
		p1.setFont(new Font("dialog", Font.PLAIN, 18));
		add(p1);

		p2 = new JRadioButton("");
		p2.setBounds(40, 240, 180, 20);
		p2.setBackground(Color.WHITE);
		p2.setFont(new Font("dialog", Font.PLAIN, 18));
		add(p2);

		p3 = new JRadioButton("");
		p3.setBounds(40, 280, 180, 20);
		p3.setBackground(Color.WHITE);
		p3.setFont(new Font("dialog", Font.PLAIN, 18));
		add(p3);

		p4 = new JRadioButton("");
		p4.setBounds(40, 320, 180, 20);
		p4.setBackground(Color.WHITE);
		p4.setFont(new Font("dialog", Font.PLAIN, 18));
		add(p4);

		grop = new ButtonGroup();
		grop.add(p1);
		grop.add(p2);
		grop.add(p3);
		grop.add(p4);

		setVisible(true);
		start(0);
	}

	
	

	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == ne) {
			repaint();
           ans=1;
			if (grop.getSelection() == null) {
				q2[count][0] = "";
			} else {
				q2[count][0]=grop.getSelection().getActionCommand();
			}
			count++;
			start(count);
			if(count==9) {
				ne.setEnabled(false);
				
			}
	    }


		if (ae.getSource() == pr) {
			if(count==9) {
				pr.setEnabled(false);
			}
			if(grop.getSelection()==null) {
			  q2[count][0]="";
		  }else {
		  grop.getSelection().getActionCommand();
		   
		  }
			
			count--;
			start(count);
		  if(count==0) {
	     pr.setEnabled(false);}
			 if(count==9) {
				pr.setEnabled(false);
			}
	  
	     }else if(ae.getSource()==sub) {
	    	ans=1; 
	    	 if(grop.getSelection()==null) {
	    		 
	   	         q2[count][0]="";
		     }else {
				q2[count][0]=grop.getSelection().getActionCommand();
			
	     }	
	    	 
	    	 
        	  if(count == 9) {
            		sub.setEnabled(true);
        	  }else {
            		sub.setEnabled(false);
            	}
        	  for(int i=0;i<q2.length;i++) {
              	if(q2[i][0].equals(q3[i][1])) {
              		score+=10;
              	}else {
              		score+=0;
              	}
              	  this.setVisible(false);
      	          new score(Username,score).setVisible(true);
                     	  
        	  }	  
	     } 
	}	
	
		
	   
	

	public void paint(Graphics g) {
		super.paint(g);
		
/*		for(int i=0;i<q2.length;i++) {
        	if(q2[i][0].equals(q3[i][1])) {
        		score+=10;
        	}else {
        		score+=0;
        	}
        	  this.setVisible(false);
	          new score(Username,score).setVisible(true);
        }
	        if(grop.getSelection()==null) {
		  q2[count][0]="";
		}else {
			q2[count][0]=grop.getSelection().getActionCommand();
		
		count++;
		start(count);
	}*/
  }


	

	@SuppressWarnings("deprecation")
	public void start(int count) {
		l1.setText("" + (count + 1) + ".'");
		l2.setText(q1[count][0]);
		p1.setLabel(q1[count][1]);
		p1.setActionCommand(q1[count][1]);
		p2.setLabel(q1[count][2]);
		p2.setActionCommand(q1[count][2]);
		p3.setLabel(q1[count][3]);
		p3.setActionCommand(q1[count][3]);
		p4.setLabel(q1[count][4]);
		p4.setActionCommand(q1[count][4]);
		grop.clearSelection();
	}

	public static void main(String args[]) {

	  new ska("");
	}
}

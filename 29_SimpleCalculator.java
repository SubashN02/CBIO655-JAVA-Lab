

import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends Frame implements ActionListener{
	TextField tf,tf1,tf2;
	Button b,b1,b2,b3;
	Label l,l1,l2;
	SimpleCalculator(){
	Frame f=new Frame("A Simple Calculator");
	l=new Label("Enter the inputs: ");
	l.setBounds(20,35,100,30);
	l1=new Label("Output: ");
	l1.setBounds(20,100,100,30);
	 tf=new TextField();
	tf.setBounds(75,70,50,20);
	 tf1=new TextField();
	tf1.setBounds(175,70,50,20);
	 tf2=new TextField();
	tf2.setBounds(125,120,50,20);
	tf2.setEditable(false);
	 b=new Button("+");
	b.setBounds(30,170,50,30);
	b.addActionListener(this);
	 b1=new Button("-");
	b1.setBounds(90,170,50,30);
	b1.addActionListener(this);
	b2=new Button("*");
	b2.setBounds(150,170,50,30);
	b2.addActionListener(this);
	 b3=new Button("/");
	b3.setBounds(210,170,50,30);
	b3.addActionListener(this);
	f.setBackground(Color.PINK);
	f.add(l);
	f.add(l1);
	f.add(tf2);
	f.add(tf1);
	f.add(tf);
	f.add(b);
	f.add(b1);
	f.add(b2);
	f.add(b3);
	f.setSize(300,300);
	f.setLayout(null);
	f.setVisible(true);
	}
	public void actionPerformed(ActionEvent a)
	{
		String s,s1,out;
		int i,i1,i2=0;
		s=tf.getText();
		s1=tf1.getText();
		i=Integer.parseInt(s);
		i1=Integer.parseInt(s1);
		if(a.getSource()==b)
		{
			i2=i+i1;
		}
		else if(a.getSource()==b1)
		{
			i2=i-i1;
		}
		else if(a.getSource()==b2)
		{
			i2=i*i1;
		}
		else if(a.getSource()==b3)
		{
			i2=i/i1;
		}
		out=String.valueOf(i2);
		tf2.setText(out);
	}
	public static void main(String[] args) {
		new SimpleCalculator();
		
	}

}

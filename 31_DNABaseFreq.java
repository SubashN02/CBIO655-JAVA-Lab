
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import DNAFreqCalc.*;

public class DNABaseFreq extends Frame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	TextField tf,tf1,tf2,tf3,tf4;
	Button b;
	Label l,l1,l2,l3,l4,l5;
	DNABaseFreqCalc d=new DNABaseFreqCalc();
	DNABaseFreq()
	{
		Frame f= new Frame("DNA Base Frequency Calculator");
		l=new Label("Enter the DNA Sequence: ");
		l.setBounds(20,35,150,30);
		tf=new TextField();
		tf.setBounds(75,70,150,20);
		b=new Button("Enter");
		b.setBounds(120,110,50,25);
		b.addActionListener(this);
		l1=new Label("A (in %) ");
		l1.setBounds(20,145,50,30);
		tf1=new TextField();
		tf1.setBounds(75,150,150,20);
		tf1.setEditable(false);
		l2=new Label("G (in %) ");
		l2.setBounds(20,165,50,30);
		tf2=new TextField();
		tf2.setBounds(75,170,150,20);
		tf2.setEditable(false);
		l3=new Label("T (in %) ");
		l3.setBounds(20,185,50,30);
		tf3=new TextField();
		tf3.setBounds(75,190,150,20);
		tf3.setEditable(false);
		l4=new Label("C (in %) ");
		l4.setBounds(20,205,50,30);
		tf4=new TextField();
		tf4.setBounds(75,210,150,20);
		tf4.setEditable(false);
		f.add(l);
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(tf);
		f.add(tf1);
		f.add(tf2);
		f.add(tf3);
		f.add(tf4);
		f.add(b);
		f.setBackground(Color.ORANGE);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		String s;
		String[] out;
	
		s=tf.getText();
		if(e.getSource()==b)
		{
			 out=(d.getString(s));
			tf1.setText(out[0]);
			tf2.setText(out[1]);
			tf3.setText(out[2]);
			tf4.setText(out[3]);
		}	
	}
	public static void main(String[] args) {
	new DNABaseFreq();			
	}
}

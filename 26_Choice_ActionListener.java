
import java.awt.*;
import java.awt.event.*;

public class Choice_ActionListener {
	Choice_ActionListener()
	{
		Frame f=new Frame();
		final Label l=new Label();
		l.setAlignment(Label.CENTER);
		l.setSize(500,500);
		l.setBackground(Color.LIGHT_GRAY);
		Button b=new Button("Select");
		b.setBounds(200,100,50,25);
		b.setBackground(Color.CYAN);
		final Choice c=new Choice();
		c.setBounds(100,100,75,75);
		c.add("DNA");
		c.add("RNA");
		c.add("Protein");
		f.add(c);
		f.add(b);
		f.add(l);
		f.setSize(500,500);  
		f.setLayout(null);  
		f.setVisible(true);  
		b.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
				String s="Element selected : "+c.getItem(c.getSelectedIndex());
				l.setText(s);
			}}

				);      
	}
	public static void main(String[] args) {
		new Choice_ActionListener();
	}

}

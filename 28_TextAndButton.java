
import java.awt.*;
import java.awt.event.*;
public class TextAndButton{
	
	TextAndButton()
	{
		Button b;
		Label l;
		TextField tf;
		Frame f=new Frame();
		
		tf=new TextField();
		tf.setBounds(70,100,250,30);
		b=new Button("Submit");
		b.setBounds(150,150,75,50);		
		l=new Label();
		l.setSize(120,300);
		l.setBounds(130,200,100,50);
		f.setBackground(Color.LIGHT_GRAY);
		f.add(tf);
		f.add(b);
		f.add(l);
		
		f.setSize(400,400);
		f.setVisible(true);
		f.setLayout(null);
		b.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
				String s="Entered Text : "+tf.getText();
						l.setText(s);
			}
		});
	}
	public static void main(String[] args) {
	new TextAndButton();

	}

}

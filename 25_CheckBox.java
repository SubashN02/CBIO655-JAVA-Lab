

import java.awt.*;
public class CheckBox {

	CheckBox(){

		Frame f=new Frame("Central Dogma");
		Checkbox c=new Checkbox("DNA");
		c.setBounds(100,100,100,50);
		c.setBackground(Color.YELLOW);
		Checkbox cc=new Checkbox("RNA");
		cc.setBounds(100,150, 100,50);
		cc.setBackground(Color.CYAN);
		Checkbox ccc=new Checkbox("PROTEIN");
		ccc.setBounds(100,200, 100,50);
		ccc.setBackground(Color.gray);
		f.add(c);
		f.add(cc);
		f.add(ccc);
		f.setSize(700,500);
		f.setLayout(null);
		f.setVisible(true);  
	}
	public static void main(String[] args) {

		new CheckBox();
	}

}



import java.awt.*;

public class SimpleButton {
	SimpleButton(){
		Frame f=new Frame();
		Button b=new Button("Click Me");
		b.setBounds(100,150,100,50);
		f.add(b);
		f.setSize(450,450);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new SimpleButton();

	}

}

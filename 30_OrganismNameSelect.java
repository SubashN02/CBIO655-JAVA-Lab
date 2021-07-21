
	import java.awt.*;
	import java.awt.event.*;
	public class OrganismNameSelect {
	OrganismNameSelect()
	{
			Frame f=new Frame();
			final Label l=new Label();
			l.setAlignment(Label.CENTER);
			l.setSize(500,500);
			l.setBackground(Color.LIGHT_GRAY);
			Label l1=new Label("Select an Organism : ");
			l1.setBounds(50,75,150,20);
			l1.setBackground(Color.LIGHT_GRAY);
			Button b=new Button("Select");
			b.setBounds(350,100,50,25);
			b.setBackground(Color.CYAN);
			final Choice c=new Choice();
			c.setBounds(100,100,200,150);
			c.add("Helicobacter pylori");
			c.add("Escherichia coli");
			c.add("Klebsiella pneumoniae");
			c.add("Pseudomonas aeruginosa");
			f.add(l1);
			f.add(c);
			f.add(b);
			f.add(l);
			
			f.setSize(500,500);  
			f.setLayout(null);  
			f.setVisible(true);  
			b.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e) {
					String s="Selected Organism : "+c.getItem(c.getSelectedIndex());
					l.setText(s);
				}}

					);      
		}
		public static void main(String[] args) {
			new OrganismNameSelect();
		}

	}

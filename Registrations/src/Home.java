import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.event.*;
public class Home extends JFrame implements ActionListener{
	JPanel pnl;
	JButton b1,b2;
	public Home() {
		setSize(400,200);
		setVisible(true);
		setTitle("Home Page");
		pnl=new JPanel();
		pnl.setSize(200,200);
		pnl.setVisible(true);
		add(pnl);
		b1=new JButton("Login");
		b2=new JButton("Registration");
		pnl.add(b1);
		pnl.add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			Login lg=new Login();
			this.dispose();
		}
		if(e.getSource()==b2) {
			Registration rg=new Registration();
			this.dispose();
		}
		
	}

}

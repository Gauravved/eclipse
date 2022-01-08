import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.event.*;
public class Dashboard extends JFrame{
	JLabel lbl;
	JPanel pnl;
	public Dashboard() {
		setSize(400,400);
		setVisible(true);
		pnl=new JPanel();
		pnl.setSize(400,400);
		pnl.setVisible(true);
		add(pnl);
		lbl=new JLabel("Your have been logged in successfully");
		pnl.add(lbl);
	}
}

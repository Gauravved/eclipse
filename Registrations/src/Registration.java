import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.event.*;
public class Registration extends JFrame implements ActionListener{
	JPanel pnl;
	JLabel user,pass,conpass,gndr,ct,st,blank,passcheck;
	JTextField tuser,tct;
	JComboBox<String> state;
	JPasswordField tpass,tconpass;
	JRadioButton male,female;
	JButton home,lgin;
	public  Registration() {
		setSize(500,500);
		setVisible(true);
		pnl=new JPanel();
		pnl.setSize(500,500);
		pnl.setVisible(true);
		add(pnl);
		pnl.setLayout(new GridLayout(9,2));
		user=new JLabel("Username");
		pass=new JLabel("Password");
		conpass=new JLabel("Confirm Password");
		gndr=new JLabel("Gender");
		ct=new JLabel("City");
		st=new JLabel("State");
		String strst[]= {"Maharashtra","Tamil Nadu","Karnataka","Uttarkhand","Gujrat"};
		state=new JComboBox<>(strst);
		male=new JRadioButton("Male");
		female=new JRadioButton("Female");
		ButtonGroup group=new ButtonGroup();
		group.add(male);
		group.add(female);
		home=new JButton("Home");
		lgin=new JButton("Login Page");
		tuser=new JTextField(10);
		tct=new JTextField(10);
		tpass=new JPasswordField(10);
		tconpass=new JPasswordField(10);
		blank=new JLabel("");
		passcheck=new JLabel();
		pnl.add(user);
		pnl.add(tuser);
		pnl.add(pass);
		pnl.add(tpass);
		pnl.add(conpass);
		pnl.add(tconpass);
		pnl.add(ct);
		pnl.add(tct);
		pnl.add(st);
		pnl.add(state);
		pnl.add(gndr);
		pnl.add(male);
		pnl.add(blank);
		pnl.add(female);
		pnl.add(home);
		pnl.add(lgin);
		pnl.add(passcheck);
		home.addActionListener(this);
		lgin.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==home) {
			Home hm=new Home();
			this.dispose();
		}
		else if(e.getSource()==lgin) {
			String p=tpass.getText();
			String conp=tconpass.getText();
			if(p.equals(conp)) {
				passcheck.setText("");
				Login lg=new Login();
				this.dispose();
			}
			else {
				passcheck.setText("Passwords does not match");
			}
		}
	}

}

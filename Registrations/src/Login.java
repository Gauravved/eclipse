import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.event.*;
public class Login extends JFrame implements ActionListener{
	JPanel pnl;
	JLabel lno1,lpass;
	JTextField tuser;
	JPasswordField tpass;
	JButton btn;
	public Login() {
		setSize(300,200);
		setVisible(true);
		setTitle("Login Page");
		pnl=new JPanel();
		pnl.setSize(500,500);
		pnl.setVisible(true);
		add(pnl);
		pnl.setLayout(new GridLayout(5,2));
		lno1=new JLabel("Username:");
		lpass=new JLabel("Password:");
		tuser=new JTextField(10);
		tpass=new JPasswordField(10);
		btn=new JButton("Login");
		pnl.add(lno1);
		pnl.add(tuser);
		pnl.add(lpass);
		pnl.add(tpass);
		pnl.add(btn);
		btn.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn) {
			Dashboard dash=new Dashboard();
			this.dispose();
		}
		
	}

}

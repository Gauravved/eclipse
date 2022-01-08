import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.event.*;
public class Calculator implements ActionListener{
	JFrame frm;
	JPanel pnl;
	JLabel lno1,lno2,lans;
	JTextField tno1,tno2,tans;
	JButton badd,bsub,bmul,bdiv,bclear,bexit;
	public Calculator() {
		frm=new JFrame();
		frm.setTitle("Calculator");
		frm.setSize(400,400);
		frm.setVisible(true);
		pnl=new JPanel();
		pnl.setSize(400,400);
		pnl.setVisible(true);
		frm.add(pnl);
		pnl.setBackground(Color.gray);
		GridLayout gl=new GridLayout(6,2);
		pnl.setLayout(gl);
		lno1=new JLabel("Number 1");
		lno2=new JLabel("Number 2");
		lans=new JLabel("Answer");
		
		tno1=new JTextField(10);
		tno2=new JTextField(10);
		tans=new JTextField(10);
		
		badd = new JButton("+");
		bsub = new JButton("-");
		bmul = new JButton("*");
		bdiv = new JButton("/");
		bclear = new JButton("C");
		bexit = new JButton("exit");
		pnl.add(lno1);
		pnl.add(tno1);
		pnl.add(lno2);
		pnl.add(tno2);
		pnl.add(lans);
		pnl.add(tans);
		pnl.add(badd);
		pnl.add(bsub);
		pnl.add(bmul);
		pnl.add(bdiv);
		pnl.add(bclear);
		pnl.add(bexit);
		badd.addActionListener(this);
		bsub.addActionListener(this);
		bmul.addActionListener(this);
		bdiv.addActionListener(this);
		bclear.addActionListener(this);
		bexit.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == badd) {
			try {
				int a=Integer.parseInt(tno1.getText());
				int b=Integer.parseInt(tno2.getText());
				int add=a+b;
				tans.setText(Integer.toString(add));
			}catch(Exception ex) {
				System.out.println(e);
			}
		}
		else if(e.getSource() == bsub) {
			try {
				int a=Integer.parseInt(tno1.getText());
				int b=Integer.parseInt(tno2.getText());
				int sub=a-b;
				tans.setText(Integer.toString(sub));
			}catch(Exception ex) {
				System.out.println(e);
			}
		}
		else if(e.getSource() == bmul) {
			try {
				int a=Integer.parseInt(tno1.getText());
				int b=Integer.parseInt(tno2.getText());
				int mul=a*b;
				tans.setText(Integer.toString(mul));
			}catch(Exception ex) {
				System.out.println(e);
			}
		}
		else if(e.getSource() == bdiv) {
			try {
				int a=Integer.parseInt(tno1.getText());
				int b=Integer.parseInt(tno2.getText());
				int div=a/b;
				tans.setText(Integer.toString(div));
			}catch(Exception ex) {
				System.out.println(e);
			}
		}
		else if(e.getSource()==bclear) {
			tno1.setText("");
			tno2.setText("");
			tans.setText("");
		}
		else if(e.getSource()==bexit) {
			System.exit(0);
		}
	}
}

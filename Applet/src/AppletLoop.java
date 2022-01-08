import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="AppletLoop" width="300" height="200">
</applet>
*/
public class AppletLoop extends Applet implements ActionListener
{
	int n,ans;
	String msg="";
	TextField input;
	Button calc;		
	public void init()
	{	
		Label l1=new Label("Enter the Number:",Label.RIGHT);
		input=new TextField(5);	
		calc=new Button("Calculate");
		calc.addActionListener(this);
		input.addActionListener(this);
		add(l1);
		add(input);
		add(calc);
	}
	public void actionPerformed(ActionEvent ae)
	{
		ans=1;
		String s=ae.getActionCommand();
		n=Integer.parseInt(input.getText());
		for(int i=1;i<=n;i++)
		{
			ans*=i;
		}
		if(s.equals("Calculate"))	
		{
			msg="Factorial number is"+ans;
			repaint();
		}
	} 
	public void paint(Graphics g)
	{
		g.drawString(msg,100,100);
	}
}
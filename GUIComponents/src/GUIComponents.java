import java.awt.*;
import java.applet.*;
import java.util.*;
import java.awt.event.*;
/*
<applet code="GUIComponents" height="500" width="600">
</applet>
*/
public class GUIComponents extends Applet implements ActionListener, ItemListener
{
	String msg1="";
	TextField name,passwd;
	TextArea address;
	Checkbox English,Marathi,Hindi;
	CheckboxGroup cbg;
	Choice city;
	public void init()
	{
		Label namel=new Label("Name",Label.RIGHT);
		Label pass=new Label("password", Label.RIGHT);
		name=new TextField(20);
		passwd=new TextField(10);
		passwd.setEchoChar('*');
		Label lang=new Label("Languages", Label.RIGHT);
		name.addActionListener(this);
		passwd.addActionListener(this);
		English=new Checkbox("English");
		Marathi=new Checkbox("Marathi");
		Hindi=new Checkbox("Hindi");
		Label gender=new Label("Gender", Label.RIGHT);
		cbg=new CheckboxGroup();
		Checkbox male=new Checkbox("Male",cbg,true);
		Checkbox female=new Checkbox("Female",cbg,false);
		Label adrs=new Label("Address",Label.RIGHT);
		address=new TextArea("",5,50,1);
		English.addItemListener(this);
		Hindi.addItemListener(this);
		Marathi.addItemListener(this);
		male.addItemListener(this);
		female.addItemListener(this);
		city=new Choice();	
		city.add("Aurangabad");
		add(namel);
		add(name);
		add(pass);
		add(passwd);
		add(lang);
		add(English);
		add(Marathi);
		add(Hindi);
		add(gender);
		add(male);
		add(female);
		add(city);
		add(adrs);
		add(address);
	}
	public void actionPerformed(ActionEvent ae)
	{
		repaint();
	}
	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString("Hello",200,200);
		g.drawString("Name: "+name.getText(),200,220);
		g.drawString("Password:"+passwd.getText(),200,240);
		g.drawString("Gender:"+cbg.getSelectedCheckbox().getLabel(),200,300);
		
	}
}
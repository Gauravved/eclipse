import java.util.*;

public class FamilyTree{
	public static void main(String[]args){
		son son_name = new son();
		son_name.Son();
		son_name.GrandFather();
		Son2 sons = new Son2();
		sons.son2();
		sons.GrandFather();
		daughter daughter_name = new daughter();
		daughter_name.Daughter();
		daughter_name.GrandFather();
		grandson grand_son = new grandson();
		grand_son.Grandson();
		grand_son.GrandFather();
		grandson2 grand_son2=new grandson2();
		grand_son2.Grandson2();
		grand_son2.GrandFather();

	}
}

class grandfather{
	public void GrandFather(){
		System.out.print("of Vasantrao GovindRao Pandit\n");
	}
}

class son extends grandfather{
	public void Son(){
		System.out.print("Rahul Vasantrao Pandit:Son ");
	}
}

class daughter extends grandfather{
	public void Daughter(){
		System.out.print("Rohini Sathbhai: Daughter ");
	}
}

class grandson extends grandfather{
	public void Grandson(){
		System.out.print("Gaurav Rahul Pandit: GrandSon ");
	}
}

class grandson2 extends grandfather{
	public void Grandson2(){
		System.out.print("Sarvesh Rajesh Pandit: GrandSon ");
	}
}

class Son2 extends grandfather {
	public void son2(){
		System.out.print("Rajesh VasantRao Pandit :Son ");
	}
}


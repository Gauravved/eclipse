import java.util.*;
import java.io.*;
public class LongestWord
{
	public static void main(String srgs[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of file without extension:");
		String name=sc.next();
		File f=new File(name+".txt");
		try
		{
			if(f.createNewFile())
			{
				System.out.println("File does not exist");
				f.delete();
			}
			else{
				Scanner is=new Scanner(new FileReader(name+".txt"));
				String cw="";
				String lw="";
				while(is.hasNext())
				{
					cw=is.next();
					if(cw.length() > lw.length())
					{
						lw=cw;
					}
				}
				System.out.println("The Longest word is:"+lw);
			}
				
		}
		catch(IOException ex)
		{
			System.out.println("An error occured!!");
			ex.printStackTrace();
		}
	}
}
import java.util.*;
import java.io.*;
public class FileOperations {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ch=0;
		String name;
		do {
			System.out.println("1> Create \n2> Copy \n3> Delete \n4> Display \n5> Exit \nEnter your choice:");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter name of the file without extension:");
				name=sc.next();
				try {
					File file=new File(name+".txt");
					if(file.createNewFile()) {
						System.out.println("File is created");
					}
					else {
						System.out.println("This file already exists!!");
					}
				}catch(IOException ex) {
					System.out.println("Oops an error encountered");
					ex.printStackTrace();
				}
				break;
			case 2:
				System.out.println("Enter the name of File for writing output without extension:");
				name=sc.next();
				FileInputStream in=null;
				FileOutputStream out=null;
				try {
					File f=new File(name+"txt");
					if(f.createNewFile()) {
						System.out.println("This file doesn't exist");
						f.delete();
					}
					else {
						try{
							in=new FileInputStream("input.txt");
							out=new FileOutputStream(f);
							int c;
							while((c=in.read())!=-1) {
								out.write(c);
							}
						}catch(IOException e)
						{
							e.printStackTrace();
						}
						finally {
							if(in!=null) {
								in.close();
							}
							if(out!=null) {
								out.close();
							}
						}
					}
				}catch(IOException ex) {
					System.out.println("Oops an error encountered");
					ex.printStackTrace();
				}
				break;
			case 3:
				System.out.println("Enter the name of file without extension:");
				name=sc.next();
				File del=new File(name+"txt");
				if(del.delete()) {
					System.out.println("File has been deleted successfully");
				}
				else {
					System.out.println("Failed to delete the file");
				}
				break;
			case 4:
				System.out.println("Displaying input from input.txt file");
				String output="";
				FileInputStream display=null;
				Integer c;
				try {
					display=new FileInputStream("input.txt");
					while((c=display.read())!=-1) {
						output=output.concat(String.valueOf(c));
					}
					System.out.println(output);
				}catch(IOException ex) {
					ex.printStackTrace();
				}
				break;
			}
		}while(ch!=4);

	}

}

import java.util.*;

public class Collection {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		byte b=10;
		int a=20;
		float f=10.203f;
		double d=20.4330;
		Byte byteobj = null;
		Integer intobj=null;
		Float fobj=null;
		Double dblobj=null;
		int ch;
		do {
			System.out.println("\n1> Vector \n2> HashMap \n3> Wrapper Class \n4> Exit \nEnter your choice:");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				Vector<Integer> vec = new Vector<Integer>();
				int ch1;
				do {
					System.out.println("\n1> Create/Add \2> Display \n3> Insert \n4> Delete \n5> Search \n6> Length \n7> Exit \nEnter your choice:");
					ch1=sc.nextInt();
					switch(ch1) {
					case 1:
						System.out.println("Enter a number:");
						vec.add(sc.nextInt());
						break;
					case 2:
						System.out.print("The elements in the vector are:");
						for(int i=0;i<vec.size();i++) {
							System.out.print(" "+vec.get(i));
						}
						break;
					case 3:
						System.out.println("Enter element to enter at index:");
						int num=sc.nextInt();
						int index=sc.nextInt();
						vec.insertElementAt(num, index);
						System.out.print("The elements are:");
						for(int i=0;i<vec.size();i++) {
							System.out.println(" "+vec.get(i));
						}
						break;
					case 4:
						System.out.println("Enter the index to delete:");
						index=sc.nextInt();
						vec.remove(index);
						System.out.print("The elements are:");
						for(int i=0;i<vec.size();i++) {
							System.out.println(" "+vec.get(i));
						}
						break;
					case 5:
						System.out.println("Enter the number to search:");
						int s=sc.nextInt();
						if(vec.contains(s)) {
							System.out.println("The number is present");
						}
						else {
							System.out.println("The number is not present");
						}
						break;
					case 6:
						System.out.println("The length of the vector is :"+vec.size());
						break;
					case 7:
						break;
					default:
						System.out.println("Invalid choice!");
					}
				}while(ch!=7);
				break;
			case 2:
				HashMap<Integer, String> map=new HashMap<Integer,String>();
				int ch2;
				do {
					System.out.println("1> Create/Add \n2> Display \n3> Remove \n4> Size \n5> Clear \n6> Enter your choice:");
					ch2=sc.nextInt();
					switch(ch2) {
					case 1:
							System.out.println("Enter rollnumber:");
							int roll=sc.nextInt();
							System.out.println("Enter name:");
							String name=sc.next();
							map.put(roll, name);
							break;
					case 2:
						Iterator<Integer> itr= map.keySet().iterator();
						System.out.println("The elements are:");
						while(itr.hasNext()) {
							int i=itr.next();
							System.out.println(i+" "+map.get(i));
						}
						break;
					case 3: 
						System.out.println("Enter the key you wan to delete:");
						int key=sc.nextInt();
						map.remove(key);
						itr= map.keySet().iterator();
						System.out.println("The elements are:");
						while(itr.hasNext()) {
							int i=itr.next();
							System.out.println(i+" "+map.get(i));
						}
						break;
					case 4:
						System.out.println("Size of the hashmap is:"+map.size());
						break;
					case 5:
						map.clear();
						System.out.println("The size of hashmap after clearing:"+map.size());						
					}
				}while(ch2!=6);
				break;
			case 3:
				do {
					System.out.println("1> Primitive to Object \n2> Object to Primitive");
					int ch3=sc.nextInt();
					switch(ch3) {
					case 1:
						byteobj=b;
						intobj=a;
						fobj=f;
						dblobj=d;
						System.out.println("Byte value in Object:"+byteobj);
						System.out.println("Integer value in Object:"+intobj);
						System.out.println("Float value in Object:"+fobj);
						System.out.println("Double value in Object:"+dblobj);
						break;
					case 2:
						byte b1=byteobj;
						int a1=intobj;
						float f1=fobj;
						double d1=dblobj;
						System.out.println("Byte value in primitive datatype:"+b1);
						System.out.println("Integer value in primitive datatype:"+a1);
						System.out.println("Float value in primitive datatype:"+f1);
						System.out.println("Double value in primitive datatype:"+d1);
						break;
					}
				}while(ch!=3);
			}
		}while(ch!=4);

	}

}

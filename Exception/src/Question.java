import java.util.Scanner;

class Question{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enter the numbers in the array:");
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("The 2nd maximum number is:");
		int max=arr[0],max2=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max2=max;
				max=arr[i];
			}
		}
		System.out.println(max2);
	}	
}
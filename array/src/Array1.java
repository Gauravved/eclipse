import java.util.Scanner;

public class Array1 {
	Array2 ar=null;
	Scanner sc=new Scanner(System.in);
	public Array2 create() {
		int arr[]=null;
		System.out.println("Enter the number of element you want to enter:");
		int n=sc.nextInt();
		arr=new int[n];
		System.out.println("Enter "+n+" elements in the array:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		ar=new Array2(arr, n);
		return ar;
	}
	public void display(Array2 a) {
		System.out.println("The Elements of the array are:");
		for(int i=0;i<a.getArr().length;i++) {
			System.out.println(a.getArr()[i]);
		}
	}
	public void sort(Array2 arr) {
		for(int i=0;i<ar.getN();i++) {
			for(int j=0;j<ar.getN()-1;j++) {
				if(ar.getArr()[j]> ar.getArr()[j+1]) {
					int swap=ar.getArr()[j];
					ar.getArr()[j]=ar.getArr()[j+1];
					ar.getArr()[j+1]=swap;
				}
			}
		}
	}
	public Array2 insert(int n,int p) {
		int i;
		int arr[]=new int[ar.getArr().length+1];
		for(i=arr.length-1;i>p-1;i--) {
			arr[i]=ar.getArr()[i-1];
		}
		arr[i]=n;
		for(i=0;i<p-1;i++) {
			arr[i]=ar.getArr()[i];
		}
		ar=new Array2(arr,arr.length);
		return ar;
	}
	public Array2 delete(int del) {
		int i;
		for(i=0;ar.getArr()[i]!=del;i++);
		for(;i<ar.getN()-1;i++) {
			ar.setArrdata(i, ar.getArr()[i+1]);
		}
		ar=new Array2(ar.getArr(),ar.getN()-1);
		return ar;
	}
	public int search(int s) {
		for(int i=0;i<ar.getArr().length;i++) {
			if(ar.getArr()[i]==s) {
				return i;
			}
		}
		return 0;
	}
}

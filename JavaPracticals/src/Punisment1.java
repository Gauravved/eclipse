import java.util.*;
class Matrix{
	protected  int arr[][]=new int[3][3];
	protected int  arr2[][]=new int [3][3];
	protected int add[][]=new int [3][3];
	protected int mul[][]=new int [3][3];
	public void setArr(int[][] arr) {
		this.arr = arr;
	}
	public void setArr2(int[][] arr2) {
		this.arr2 = arr2;
	}
}
class Addition extends Matrix{
	public void ad(int mat[][],int mat1[][]) {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				add[i][j]=mat[i][j]+mat1[i][j];
			}
		}
	}
	public void display() {
		System.out.println("Addition:");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print("\t"+super.add[i][j]);
			}
			System.out.println("");
		}
	}
}
class Multiplication extends Matrix{
	public void multiplicaitons(int mat1[][],int mat2[][]) {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++){
				mul[i][j]=0;
				for(int k=0;k<3;k++) {
					mul[i][j]=mul[i][j]+(mat1[i][k]*mat2[k][j]);
				}
			}
		}
	}
	public void display() {
		System.out.println("Multiplication:");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print("\t"+super.mul[i][j]);
			}
			System.out.println("");
		}
	}
}
class Display extends Matrix{
	
	public void show() {
		System.out.println("Matrix 1:");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print("\t"+arr[i][j]);
			}
			System.out.println("");
		}
		System.out.println("Matrix 2:");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print("\t"+arr2[i][j]);
			}
			System.out.println("");
		}
	}
	public void show1(int mat[][]) {
		
	}
}
public class Punisment1{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Display display=new Display();
		int mat1[][]=new int [3][3];
		int mat2[][]=new int[3][3];
		System.out.println("Enter 9 numbers in the multi-dimensional array:");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				mat1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter 9 numbers in the multi-dimensional array2:");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				mat2[i][j]=sc.nextInt();
			}
		}
		display.setArr(mat1);
		display.setArr2(mat2);
		Addition add=new Addition();
		add.ad(mat1,mat2);
		Multiplication mull=new Multiplication();
		mull.multiplicaitons(mat1,mat2);
		display.show();
		add.display();
		mull.display();
	}

}

import java.util.Scanner;

public class MatrixOp {
	Scanner sc = new Scanner(System.in);

	public int[][] create(int mat[][]) {
		System.out.println("Enter the number of rows in the Matrix:");
		int r = sc.nextInt();
		mat = new int[r][];
		for (int i = 0; i < mat.length; i++) {
			System.out.println("Enter the numbr of Columns for the " + (i + 1) + " row:");
			int n = sc.nextInt();
			mat[i] = new int[n];
		}
		return mat;
	}

	public void insert(int mat[][]) {
		System.out.println("Enter the elements for the 2-D array:");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
	}

	public void display(int mat[][]) {
		System.out.println("The element of the Matric are:");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public boolean add(int mat[][], int mat2[][], int ch) {
		int n = 0;
		boolean b = false;
		if (mat.length == mat2.length) {
			for (int i = 0; i < mat.length; i++) {
				if (mat[i].length == mat2[i].length) {
					n++;
				} else
					break;
			}
		}
		if (mat.length == n) {
			insert(mat);
			insert(mat2);
			if (ch == 1) {
				int add[][] = new int[mat.length][];
				for (int i = 0; i < mat.length; i++) {
					add[i] = new int[mat[i].length];
					for (int j = 0; j < add[i].length; j++) {
						add[i][j] = mat[i][j] + mat2[i][j];
					}
				}
			} else if (ch == 2) {
				sub(mat, mat2);
			}
			b = true;
		} else {
			System.out.println("Dimensions for the matrix are not equal. Hence cannot be added or subtracted");
		}
		return b;
	}

	public void sub(int mat[][], int mat2[][]) {
		int sub[][] = new int[mat.length][];
		for (int i = 0; i < sub.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				sub[i] = new int[mat[i].length];
			}
		}
		for (int i = 0; i < sub.length; i++) {
			for (int j = 0; j < sub[i].length; j++) {
				sub[i][j] = mat[i][j] - mat2[i][j];
			}
		}
		System.out.println("Matrix 1:");
		display(mat);
		System.out.println("Matrix 2:");
		display(mat2);
		System.out.println("Addition of the matrix:");
		display(sub);
	}
}

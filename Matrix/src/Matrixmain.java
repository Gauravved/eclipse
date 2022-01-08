import java.util.*;

public class Matrixmain {

	public static void main(String[] args) {
		MatrixOp m = new MatrixOp();
		Scanner sc = new Scanner(System.in);
		int mat[][] = null, mat2[][] = null;
		int ch;
		do {
			System.out.println(
					"1> Addition of Matrix \n2> Subtraction of Matrix \n3> Multiplication of matrix\n4> Exit\nEnter your choice:");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				if (mat == null || mat2 == null) {
					System.out.println("Matrix 1::\n");
					mat = m.create(mat);
					System.out.println("\nMatrix 2::\n");
					mat2 = m.create(mat2);
				}
				boolean b=m.add(mat, mat2, ch);
				if(!b) {
					mat=null;
					mat2=null;
				}
				break;
			case 2:
				if (mat == null || mat2 == null) {
					System.out.println("Matrix 1::\n");
					mat = m.create(mat);
					System.out.println("\nMatrix 2::\n");
					mat2 = m.create(mat2);
				}
				b=m.add(mat, mat2, ch);
				if(!b) {
					mat=null;
					mat2=null;
				}
			}
		} while (ch != 4);

	}

}

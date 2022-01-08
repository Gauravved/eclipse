import java.util.*;

public class sort {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers do you want to enter?:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter " + n + " numbers:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("The array is:");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		for (int i = 0, j = 0; i < arr.length-1; j++) {
			if (j == arr.length - 1) {
				j=0;
				i++;
			}
			if (arr[j] > arr[j + 1]) {
				int swap = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = swap;
			}
		}
		System.out.println("\nThe array after sorting is:");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		sc.close();
	}
}

package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReadingFromConsole {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int arraySize = myScanner.nextInt();

		int[] arr = new int[arraySize];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter value:");
			arr[i] = myScanner.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}


		System.out.println(Arrays.toString(arr));

	}
}

package arrays;

import java.util.Arrays;

public class ArrayCompare {
	public static void main(String[] args) {
		int[] array = {2, 3, 4, 10};
		int[] array2 = new int[5];
		array2[0] = 2;
		array2[1] = 3;
		array2[2] = 4;
		array2[3] = 10;
		array2[4] = 10;



		//manual check if the two arrays are equal
		boolean isEqual = true;
		for (int i = 0; i < array.length; i++) {
			if(array[i] != array2[i]) {
				isEqual = false;
				break;
			}
		}

		System.out.println("The arrays are equals:" + isEqual);

		//the quick way
		System.out.println(Arrays.equals(array, array2));

		int[] otherArray = new int[10];

		Arrays.fill(otherArray, 7);

		System.out.println(Arrays.toString(otherArray));


	}
}

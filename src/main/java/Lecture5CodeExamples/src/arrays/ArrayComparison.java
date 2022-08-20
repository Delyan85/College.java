package arrays;

import java.util.Arrays;

public class ArrayComparison {
	public static void main(String[] args) {
		int[] oldArray = {1, 2, 3};
		int[] newArray = oldArray;

		System.out.println("oldArray:"+Arrays.toString(oldArray));
		System.out.println("newArray:"+Arrays.toString(newArray));


		newArray[0] = -100;
		System.out.println("newArray[0] changed:"+Arrays.toString(newArray));
		System.out.println("oldArray:"+Arrays.toString(oldArray));
		/*
		oldArray:[1, 2, 3]
		newArray:[1, 2, 3]
		newArray[0] changed:[-100, 2, 3]
		oldArray:[-100, 2, 3]
		*/
	}
}

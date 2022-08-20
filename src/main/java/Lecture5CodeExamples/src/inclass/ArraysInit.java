package inclass;

import java.util.Arrays;

public class ArraysInit {
    public static void main(String[] args) {
        int[] masiv = new int[5];
        for (int i = 0; i < masiv.length; i++) {
            masiv[i] = i*3;
        }
        System.out.println(Arrays.toString(masiv));
        //value = [0, 3, 6, 9, 12]
        //index = [0, 1, 2, 3, 4]

        for (int i = masiv.length - 1; i >= 0; i--) {
            System.out.println("Index: " + i + "value: " + masiv[i]);
        }

        for (int i = 0; i < masiv.length; i++) {
            masiv[i] = i - 1;
        }
        System.out.println(Arrays.toString(masiv));

    }
}

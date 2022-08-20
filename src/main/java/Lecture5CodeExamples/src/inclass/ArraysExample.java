package inclass;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        short[] arrName = new short[10];

        double[] arrDouble = {1.5, 2.7, 3, 5.1, 0};

        boolean[] arrBoolean = new boolean[10];
        boolean[] arrBoolsInit = {true, false, true, true, true};

        System.out.println(Arrays.toString(arrBoolsInit));
        System.out.println(Arrays.toString(arrBoolean));
        System.out.println(Arrays.toString(arrDouble));
        System.out.println(Arrays.toString(arrName));
        arrName[0] = 5;
        System.out.println(Arrays.toString(arrName));
        System.out.println(arrName.length);
        arrName[5] = 1;
        arrName[0] = 17;
        arrName[1] = 23;
        System.out.println(Arrays.toString(arrName));
        arrName[1] *= 3;
        System.out.println(Arrays.toString(arrName));

    }
}

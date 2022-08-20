package arrays;

public class MultidimentionalArray {
    public static void main(String[] args) {

        int[][] arr = {{1, 2},
                        {3, 4}};

        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                System.out.println("arr[" + i + "][" + j + "] = "
                        + arr[i][j]);

        System.out.println(arr.length);
    }
}

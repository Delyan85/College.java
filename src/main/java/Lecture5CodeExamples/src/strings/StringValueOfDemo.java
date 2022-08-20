package strings;

public class StringValueOfDemo {

    public static void main(String[] args) {


        String a = "28";

        System.out.println(a + 2); // this will be concatenation

        Integer result = Integer.valueOf(a);


        System.out.println(result + 2);

        int primitiveA = Integer.parseInt(a);

        System.out.println(primitiveA + 2);


        String b = "24.5";

        double doubleB = Double.parseDouble(b);
        System.out.println(doubleB + 2);

    }
}

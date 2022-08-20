package strings;

import java.util.Locale;

public class StringDemo {
    public static void main(String[] args) {
        String name = "Ivan Ivanov";

        int length = name.length();

        System.out.println(length);

        System.out.println(name.length());

        System.out.println(name.isEmpty());


        System.out.println(name.charAt(5));
        String test = "test";
        System.out.println("test.charAt(0): "+test.charAt(0));

        System.out.println(name.substring(5, 11));

        String substring = name.substring(5, 11);
        System.out.println(substring);

        String num = "+359321654";
        System.out.println(num.substring(4, 7));

        String ivan = "   Ivan Petrov            ";
        System.out.println(ivan);
        System.out.println(ivan.trim());

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

    }
}

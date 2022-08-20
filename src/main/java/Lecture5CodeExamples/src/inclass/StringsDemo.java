package inclass;

public class StringsDemo {
    public static void main(String[] args) {
        System.out.println(new String("test").equals("test"));

        System.out.println(new String("test") == "test");

        System.out.println(new String("test") == new String("test"));

        String welcome = "Welcome to \"Pragmatic\"";
        System.out.println(welcome);


    }
}

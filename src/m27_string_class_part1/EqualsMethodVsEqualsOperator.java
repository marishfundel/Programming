package m27_string_class_part1;

public class EqualsMethodVsEqualsOperator {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java");
        String str4 = new String("Java");
        System.out.println(str1 == str2); //same object
        System.out.println(str1.equals(str2));
        System.out.println(str3 == str4); // same object? No.
        System.out.println(str3.equals(str4)); //same condition? Yes

    }
}

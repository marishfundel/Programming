package m27_string_class_part1;

public class EqualsVsEqualIgnoreCase {
    public static void main(String[] args) {

        String str1 = "Cydeo";
        String str2 = "cydeo";

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));

    }
}

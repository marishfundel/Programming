package m28_string_class_part2;

public class ReplaceTrim {

    public static void main(String[] args) {

        String str = "Apple, Apple, Apple";
        String str1 = str.replace("Apple", "Cherry");
        System.out.println(str1);
        String str2 = str1.replaceFirst("Cherry", "Grape");
        System.out.println(str2);

        String s = "                Cydeo School                 ";
        System.out.println(s);
        System.out.println(s.trim());
        s = s.trim();
        System.out.println(s);

    }
}

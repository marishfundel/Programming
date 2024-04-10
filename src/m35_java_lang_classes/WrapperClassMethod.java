package m35_java_lang_classes;

public class WrapperClassMethod {
    public static void main(String[] args) {

        char ch = 'l';
        boolean isDigit = Character.isDigit(ch);
        boolean isLetter = Character.isLetter(ch);
        boolean isUpperCase = Character.isUpperCase(ch);
        boolean isLowerCase = Character.isLowerCase(ch);

        System.out.println(isLetter);
        System.out.println(isDigit);
        System.out.println(isUpperCase);
        System.out.println(isLowerCase);

        System.out.println();
        System.out.println("------------------------------------------");
        String str = "a1b2c3d4!@$";

        for (int i = 0; i < str.length(); i++) {
            boolean isDig = Character.isDigit(str.charAt(i));
            if (isDig){
                System.out.println(str.charAt(i));
            }
        }

        System.out.println("-------------------------------");
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

    }


}

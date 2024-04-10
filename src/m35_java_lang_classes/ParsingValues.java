package m35_java_lang_classes;

public class ParsingValues {
    public static void main(String[] args) {
        String str = "20";
        String s = "20.5";
        int num = Integer.parseInt(str);
        System.out.println(num +1 );
        Integer num1 = Integer.valueOf(str);
        Integer num2 = num; // autoboxing
        double num4 = Double.valueOf(s); //unboxing
        System.out.println(num4 + 1);
    }


}

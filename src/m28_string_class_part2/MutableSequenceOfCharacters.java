package m28_string_class_part2;

public class MutableSequenceOfCharacters {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Java");
        stringBuilder.append(17);
        stringBuilder.append(" Programming");
        stringBuilder.reverse();
        stringBuilder.reverse();
        String result = stringBuilder.toString();
        stringBuilder.reverse();
        System.out.println(stringBuilder);

        StringBuffer stringBuffer = new StringBuffer("Java");
        stringBuffer.append(" Programming");
        stringBuffer.reverse();
        System.out.println(stringBuffer);
        String result2 = stringBuffer.toString();


    }
}

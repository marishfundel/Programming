package m32_arrays_part2;

public class HowManyWords {
    public static void main(String[] args) {
        String str = "In computer programming white space refers to any character or sequence of characters " +
                "that represents empty space or have no visible representation when rendered.";
        String[] words = str.split(" ");
        char[] arr = str.toCharArray();
        System.out.println(arr.length);
        int amountOfWords = 0;
        for (int i = 1; i <= words.length; i++) {
            amountOfWords += 1;
        }
        System.out.println(amountOfWords);

    }
}

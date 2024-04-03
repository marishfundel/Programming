package m32_arrays_part2;

import java.util.Arrays;

public class SplitAndToCharArray {
    public static void main(String[] args) {
        String str = "Apple, Banana, Orange, Cherry, Strawberry";
        String[] fruits = str.split(",");
        System.out.println(Arrays.toString(fruits));
        System.out.println("--------------------------");
        System.out.println();

        String str2 = "Hello";
       char[] word = str2.toCharArray();
        System.out.println(Arrays.toString(word));
    }

}

package m31_arrays_part1;

public class ArrayLength {
    public static void main(String[] args) {

        String[] names = {"James", "Yulia", "Aaron", "Hazel"};
        int length = names.length;
        System.out.println(length);
        int lastIndex = length - 1;
        System.out.println(names[lastIndex]);
        System.out.println("------------------------------------");
        System.out.println();
        int[] numbers = {10, 20, 30, 40, 50, 60, 70};
        /*
        for (int i = 0; i <numbers.length ; i++) {
        for (int i = numbers.length - 1; i > -1; i--) {
            System.out.println(numbers[i]);
        }
        */

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers [i]);
        }
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers [i]);
        }
    }
}


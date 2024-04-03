package m32_arrays_part2;

public class MaxNumberFromArray {
    public static void main(String[] args) {
        int[] numbers = {6, 8, 3, 5, 1, 10};
        findMaxNumber(numbers);
    }

    public static int findMaxNumber(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            System.out.println("Array is empty");
            return 0;
        }

        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println(max);
        return max;
    }
}

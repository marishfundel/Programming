package m32_arrays_part2;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        int[] numbers = {3, 3, 2, 3, 2, 3};
        sumOfOddNumbers(numbers);
    }

    public static int sumOfOddNumbers(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            if (number % 2 != 0) {
                sum += number;
            }
        }
        System.out.println(sum);
        return sum;

    }

}

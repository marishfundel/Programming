package m21_methods_part2;

public class SumOf3numbers {
    public static void main(String[] args) {
        sumOf3Numbers(10, 50, 60);
        int a = 10;
        byte b = 10;
        short c = 10;
        sumOf3Numbers(a, b, c);

        int x = 100;
        long y = 100;
        long z = 100;
sumOf3Numbers(x, (int) y, (int) z); }

    public static void sumOf3Numbers(int num1, int num2, int num3) {
        System.out.println("Sum is: " + (num1 + num2 + num3));
    }
}

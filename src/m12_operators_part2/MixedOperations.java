package m12_operators_part2;

public class MixedOperations {

    public static void main(String[] args) {

        byte num1 = 100;
        short num2 = 20;

        short num3 = (short) (num1 + num2);

        int a = 100;
        long b = 200;

        long c = a + b;
        System.out.println("long is " + c);

        short x = 2;
        float y = 2.5F;
        float z = x * y;
        System.out.println("z = " + z);

        System.out.println(9 / 2.5);

        System.out.println( 9 / 3 );








    }


}

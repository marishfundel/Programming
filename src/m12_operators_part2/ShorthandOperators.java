package m12_operators_part2;

public class ShorthandOperators {

    public static void main(String[] args) {

        //addition assignment operator +=

        int x = 5;
        System.out.println(5);
        x+=5;
        System.out.println(x); // meaning: x = x +5;

        //subtraction assignment operator -=

        int y = 10;
        System.out.println(y);
        y-=4;
        System.out.println(y);

        //multiplication operator z*=
        int z =  10;
        z *= 2;
        System.out.println(z);

        // Division assignment: x/=

        int h = 10;
        h /=5;
        System.out.println(h);

        // Remainder assignment x %=
        int m = 100;
        m %= 2;
        System.out.println(m);

        // different data types:

        int c = 4;

        c += 20.5;
        System.out.println(c);







    }
}

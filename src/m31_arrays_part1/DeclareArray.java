package m31_arrays_part1;

import java.util.Arrays;

public class DeclareArray {
    public static void main(String[] args) {
        int[] scores;
        scores = new int[4];
        scores[0] = 85;
        scores[1] = 70;
        scores[2] = 95;
        scores[3] = 90;

       /* System.out.println(scores);
        System.out.println(Arrays.toString(scores));
        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        System.out.println(scores[3]);

        */

        // String[] names = new String[5]; if we dont know the exact number of elements we use this way

        //otherwise:

        String[] names  = {"Java", "Python", "Ruby", "C#", "C++"};
        System.out.println(Arrays.toString(names));
        System.out.println(names [0]);
        System.out.println(names [1]);

        String str1, str2, str3;
        str1 = "Name";
        str2 = "Name";
        str3 = new String("name");
        System.out.println(str1.equals(str3));


    }
}


       // 1. Equals () Method:
//- compares values of string for equality,
// - returns true if String objects are matching and both strings are of same Case
// - if the Strings matching but one of them inside the String pool, and another one not in the pool - it will show 'true'

// 2. == Operator
// - compares references not values.
// - returns true if both strings refer to the same instance,
// and false if one of Strings refer to instance created in nonpool and another located in String pool





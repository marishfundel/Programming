package m33_arrays_part3;

import java.util.Arrays;

public class TwoDimensionalArrays {

    public static void main(String[] args) {

        int[] arr1 = {10, 20, 30};
        int[] arr2 = {40, 50, 60, 70};
        int[] arr3 = {80, 90};

        int[][] numbers = new int[3][]; //index 0, 1, 2
        numbers[0] = arr1;
        numbers[1] = arr2;
        numbers[2] = arr3;
        System.out.println(Arrays.deepToString(numbers));
        System.out.println( Arrays.toString(numbers[2]));
        System.out.println(numbers[1][2]);
        System.out.println(numbers[2][0]);

        System.out.println("-----------------------------");
        System.out.println();

        //index:               0                1                   2
        int[][] arr2D = { {10, 20, 30} , {40, 50, 60, 70, 80}, {90, 100} };
        //elements:        0    1   2      0   1   2   3   4     0    1
        System.out.println(arr2D.length);
        System.out.println(arr2D[0][1]);
        System.out.println(Arrays.deepToString(arr2D));
        System.out.println(Arrays.toString(arr2D[1]));
        arr2D[0][2] = 300;
        System.out.println(Arrays.toString(arr2D[0]));

    }

}
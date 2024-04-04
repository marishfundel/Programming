package m33_arrays_part3;

import java.util.Arrays;

public class Iterating2DArrays {
    public static void main(String[] args) {
        int[][] arr2D = { {10, 20, 30} , {40, 50, 60, 70, 80}, {90, 100, 110, 120} };
        for (int i = 0; i < arr2D.length; i++) {
          int[] each1DArray = arr2D[i];
            System.out.println(Arrays.toString(each1DArray));
            for (int j = 0; j < each1DArray.length; j++) {
                System.out.println(each1DArray[j]);
            }
        }
        System.out.println();
        System.out.println();

        for (int[] eachAr : arr2D) {
            System.out.println(Arrays.toString(eachAr));
            for (int eachElement : eachAr) {
                System.out.println(eachElement);
            }

            }


        for (int i = arr2D.length - 1; i >= 0; i--) {
            int[] eachArray = arr2D[i];
            System.out.println(Arrays.toString(eachArray));
            for (int eachElem = eachArray.length - 1; eachElem >= 0; eachElem--) {
                System.out.println(eachArray[eachElem]);
            }
        }



        }






    }



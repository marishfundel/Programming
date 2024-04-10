package m36_array_list;

import java.util.Arrays;

public class Countries {
    public static void main(String[] args) {

        String[] countries = {
                "Brazil", "China", "Cuba", "Sweden", "France", "Vietnam",
                "Albania", "Portugal", "Philippines", "Armenia", "Colombia",
                "Honduras", "Indonesia", "United States"
        };

        //- Find and print all the first and last characters
        int maxLength = 0;
        int minLength = 100;

        for (String country : countries) {
            String firstLetter = country.substring(0, 1);
            String lastLetter = country.substring(country.length() - 1);
            System.out.print(firstLetter + lastLetter + " ");

            if (country.length() > maxLength) {
                maxLength = country.length();
                System.out.println();
            } else if (country.length() < minLength) {
                minLength = country.length();
            }
        }
        System.out.println();

      /* it's my solution
         System.out.println();
        for (String country : countries){
            if (country.length()== maxLength){
                System.out.println(country);
            } else if (country.length() == minLength) {
                System.out.println(country);
            }
        }

       */

        //- Find the largest and smaller countries based on the length of their names
        String[] result = {countries[0], countries[0]}; // 2 elements: first element will be the smallest, second element will be the largest

        //{Brazil, Brazil} -> this is a better default than new String[2] this gives null object

        for (int i = 0; i < countries.length; i++) {
            if (countries[i].length() < result[0].length()){
                result[0] = countries[i];
            } else if (countries[i].length() > result[1].length()) {
                result[1] = countries[i];
            }
        }
        System.out.println("Smallest is: " + result[0]);
        System.out.println("Largest is: " + result[1]);
        System.out.println();

        for (String country : countries) {
            if (country.charAt(0) == 'C'){
                System.out.println(country);
            } else if (country.charAt(country.length() - 1) == 's') {
                System.out.println(country);
            }
        }

    }
}

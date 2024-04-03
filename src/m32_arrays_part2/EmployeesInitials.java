package m32_arrays_part2;

import java.util.Arrays;

public class EmployeesInitials {
    public static void main(String[] args) {

        String[] names = {"John Doe", "Alice Smith", "Robert Johnson"};
       /* String[] initials = new String[names.length];

        for (int i = 0; i < names.length; i++) {
            initials[i] = names[i].charAt(0) + "" + names[i].charAt( names[i].indexOf(" ") + 1);
        }
        System.out.println(Arrays.toString(initials));
        System.out.println("--------------------------------------------------------------");
        System.out.println();
        */

        String[] names2 = {"Marina Ustundag", "Asya Ustundag", "Robert Johnson"};
        String[] initials = findInitials(names);
        System.out.println(Arrays.toString(initials));

        String[] initials2 = findInitials(names2);
        System.out.println(Arrays.toString(initials2));


    }
    public static String[] findInitials(String[] names){
        String[] initials = new String[names.length];

        for (int i = 0; i < names.length; i++) {
            initials[i] = names[i].charAt(0) + "" + names[i].charAt( names[i].indexOf(" ") + 1);
        }
       return initials;
    }

}

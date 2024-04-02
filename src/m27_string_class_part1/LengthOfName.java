package m27_string_class_part1;

import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String name = input.next();

        System.out.println("Enter your last name:");
        String surname = input.next();

        input.close();

        int total = name.length() + surname.length();
        System.out.println("Total characters in your first and last name is: " + total);
    }
}

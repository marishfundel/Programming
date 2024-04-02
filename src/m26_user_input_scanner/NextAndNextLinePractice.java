package m26_user_input_scanner;

import java.util.Scanner;

public class NextAndNextLinePractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        String name;

        System.out.println("Please enter your age");
        age = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Please enter your first name and surname");
       name = scanner.nextLine();

        scanner.close();

        System.out.println(age);
        System.out.println(name);
    }
}

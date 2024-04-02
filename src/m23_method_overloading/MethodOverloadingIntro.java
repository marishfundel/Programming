package m23_method_overloading;

import javax.sound.midi.Soundbank;

public class MethodOverloadingIntro {
    public static void main(String[] args) {
displayValue(20);
displayValue(2.2);
displayValue(3, 33.2);
displayValue(2.2, 3);
    }

    public static void displayValue(int a) {
        System.out.println("First method");
    }

    public static void displayValue(double a) {
        System.out.println("Second method");
    }

    public static void displayValue(int a, double b) {
        System.out.println("Third method");

    }
    public static void displayValue(double a, int b) {
        System.out.println("Fourth method");
    }
}
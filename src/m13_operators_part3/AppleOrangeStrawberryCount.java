package m13_operators_part3;

public class AppleOrangeStrawberryCount {

    public static void main(String[] args) {

        int appleCount, orangeCount, strawberryCount;

        appleCount = 1;
        orangeCount = 2;
        strawberryCount = 4;

        boolean result = appleCount < orangeCount || orangeCount >= strawberryCount;
        System.out.println("result is " + result);


    }
}

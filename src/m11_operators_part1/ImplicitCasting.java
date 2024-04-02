package m11_operators_part1;

public class ImplicitCasting {

    public static void main(String[] args) {

        byte num1 = 25;

        int num2 = num1; //implicit casting

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        double num3;
        int num4 = 10; //directly casting to double because double is more than int. So int is gonna be 10.0
        num3 = num4;

        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4); //num4 will be the same 10 because we didn't reassigned it yet.




        }



    }

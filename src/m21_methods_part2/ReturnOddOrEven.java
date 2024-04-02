package m21_methods_part2;

public class ReturnOddOrEven {
    public static void main(String[] args) {
       String s1= returnOddOrEven(101);
        System.out.println("Number is " + s1);


    }
    public static String returnOddOrEven(int number){
    if (number % 2 ==0){
        return "even";
    }else{
        return "odd";
    }
    }
}

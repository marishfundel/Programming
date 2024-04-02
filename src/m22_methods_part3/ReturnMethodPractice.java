package m22_methods_part3;

public class ReturnMethodPractice {
    public static void main(String[] args) {
        double result = calculate(15.2, '+', 15.8);
        System.out.println(result);

    }

    public static double calculate(double num1, char mathOperator, double num2) {
        boolean validOperator = mathOperator == '+' || mathOperator == '-' || mathOperator == '*'
                || mathOperator == '/' || mathOperator == '%';
if (!validOperator){
    return 0;
}
double result = (mathOperator == '+')? num1 + num2 : (mathOperator == '-')? num1 - num2
        :(mathOperator == '*')? num1 * num2: (mathOperator == '/')? num1/num2 : num1 % num2;
return result;
    }

}

/*
Create a method called calculator
 */
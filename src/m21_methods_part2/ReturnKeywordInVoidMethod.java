package m21_methods_part2;

public class ReturnKeywordInVoidMethod {
    public static void main(String[] args) {
eligibleToVote(22);
    }
    public static void eligibleToVote (int age){
        if (age <0 || age >=150){
            System.out.println("Invalid age: " + age);
            return; // exits the method;

        }
if (age >= 18){
    System.out.println("You are eligible to vote");
}else{
    System.out.println("You are mot eligible to vote");
}
    }
}

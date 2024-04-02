package m22_methods_part3;

import javax.sound.midi.Soundbank;

public class VoidMethodPractice {
    public static void main(String[] args) {

   displayGrade(160);


    }

    public static void displayGrade(int score){
        if (score<0 || score > 100){
            System.err.println("Invalid score " + score);
            return;
        }
        if (score >= 90){
            System.out.println("Excellent, you made an A");
        }else if (score>=80){
            System.out.println("Great, you made a B");
        } else if (score>=70) {
            System.out.println("Good, you made a C");
        }else if (score>=60){
            System.out.println("Passed, you made a D");
        }else{
            System.out.println("Failed, you made an F");
        }
    }
}

/*
Create a method named displayGrade that passes an int parameter named score and displays the grade of the student.
Example 1:
Grade (95);
Output: excellent, You made an A;
 */
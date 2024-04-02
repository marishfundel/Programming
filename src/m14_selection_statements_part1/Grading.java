package m14_selection_statements_part1;

public class Grading {

    public static void main(String[] args) {

        int score = 67;
        String result;
        if (score >= 0 && score <=100) { //if the score is valid
            if (score >= 90) {
                result = "Passed with distinction";
            } else if (score >= 60) {
                result = "Passed";
            } else {
                result = "Failed";
            }
        } else {
            result = "Invalid Score";
        }

        System.out.println(result);



    }
}

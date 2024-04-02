package m28_string_class_part2;

public class IndexOfLastIndexOf {
    public static void main(String[] args) {

        String str = "Java Programming Language";

        int indexOfFirstA = str.indexOf("a");
        System.out.println("indexOfFirstA = " + indexOfFirstA);

        int indexOfSecondA = str.indexOf("a P");
        System.out.println("indexOfSecondA = " + indexOfSecondA);

        int indexOfThirdA = str.indexOf("a", 5);
        System.out.println("indexOfThirdA = " + indexOfThirdA);

        int indexFourthA = str.indexOf("a", indexOfThirdA + 1);
        System.out.println("indexFourthA = " + indexFourthA);

        int indexLastA = str.lastIndexOf("a");
        System.out.println("indexLastA = " + indexLastA);

    }
}

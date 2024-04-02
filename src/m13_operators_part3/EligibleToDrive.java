package m13_operators_part3;

public class EligibleToDrive {

    public static void main(String[] args) {

        double age = 15.5;

        boolean hasLearnigPermit = true;
        boolean hasGriverLicence = false;

        boolean result = (age >= 18 && hasGriverLicence) || (age >= 15.5 && hasLearnigPermit);
        System.out.println("Is Mike eligible to drive?  " + result);


    }
}

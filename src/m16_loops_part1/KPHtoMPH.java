package m16_loops_part1;

public class KPHtoMPH {

    public static void main(String[] args) {

        int kph = 0;
        double mph = 0.0;
        System.out.println("KPH"+ "\t|\t" + "MPH" );
        System.out.println("------------");

        for (int i = 20; i <= 140; i += 10) {
            kph = i;
            mph = kph * 0.62;
            System.out.println(kph + "\t|\t" + mph);
        }
    }
}




/*
Print KPH and MPH conversion table like you see below
1 mile = 0.62 * km

 */

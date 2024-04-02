package m10_variables_data_types;

public class WholeNumbers {

    public static void main(String[] args) {
        // DataType variableName = Data;

        byte maxByte = 127;
        short maxShort = 32_767; // underscore makes large numbers to be more readable
        int maxInt = 2_147_483_647;
        long maxLong = 9_223_372_036_854_775_807L; //This long by default is taken as an Int. We just added the L character and now the compiler knows that it's long, not int


        System.out.println(maxByte);
        System.out.println(maxShort);
        System.out.println(maxInt);
        System.out.println(maxLong);

    }

}

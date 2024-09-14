package Day1;

public class PrimitiveDataTypes {
    public static void main(String[] args) {


        //Primitive data types - includes byte, short, int, long, float, double, boolean and char
        // 1 byte	Stores whole numbers from -128 to 127
        byte studentNumberInMyClass = 67;
        //short	2 bytes	Stores whole numbers from -32,768 to 32,767
        short populationInMyNeighborhood = 10_456;

        //int	4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
        int bankAccountBalance = 2_345_234;
        //long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        long numberLong = 876_983_324_343L;
        //float	4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        float myFloat = 4.23F;
        //double	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
        double myDecimal = 45.37287382832;
        //boolean	1 bit	Stores true or false values
        boolean isHappy = false;
        //char	2 bytes	Stores a single character/letter or ASCII values
        char myChar = 'E';


        System.out.println(studentNumberInMyClass);
        System.out.println(populationInMyNeighborhood);
        System.out.println(bankAccountBalance);
        System.out.println(numberLong);
        System.out.println(myFloat);
        System.out.println(myDecimal);
        System.out.println(isHappy);
        System.out.println(myChar);
    }


}

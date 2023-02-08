package type_casting_2;

public class Type_Casting {
    public static void main(String[] args) {
        double maxd=Double.MAX_VALUE;
        float maxf=Float.MAX_VALUE;
        long maxl=Long.MAX_VALUE;
        int maxi=Integer.MAX_VALUE;
        char maxch=Character.MAX_VALUE;
        short maxsh=Short.MAX_VALUE;
        byte maxb=Byte.MAX_VALUE;

        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0

        double myDouble_1 = 9.78d;
        int myInt_1 = (int) myDouble_1; // Manual casting: double to int

        System.out.println(myDouble_1);   // Outputs 9.78
        System.out.println(myInt_1);      // Outputs 9




    }
}

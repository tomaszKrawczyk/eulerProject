import java.math.BigInteger;

/**
 * Created by Tomek Krawczyk on 18.10.2017.
 */
public class problem3 {


        static boolean isPrime(double a) {



        for (double c = 2; c <= a / 2; c++) {

            if (a % c == 0) {
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {


        System.out.println(isPrime(16));


        double n=600851475143d;
        double n1=n/2;

        System.out.println(Math.sqrt(n));

        double theBigFactor=3d;

        for (double i=2d;i<=775146;i++){

            if (n%i==0 && isPrime(i)==true){
                theBigFactor=i;
            }

    }

        System.out.println(theBigFactor);








    }
}

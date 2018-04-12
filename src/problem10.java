import java.math.BigInteger;

/**
 * Created by Tomek Krawczyk on 23.10.2017.
 */
/*
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
Find the sum of all the primes below two million.
 */

public class problem10 {

    static boolean isPrime(long a) {


        for (int c = 3; c <= Math.sqrt((double) a) ; c++) {


                if (a % c == 0) {
                    return false;
                }
            }

        return true;
    }

    public static void main(String[] args) {



        long sum=2;


        String number="1";

        long below=2000000l;

        for (long i=3l;i<below;i=i+2){


            if (isPrime(i)==true){

                sum=sum+i;

            }
        }
        System.out.println(sum);
    }

}

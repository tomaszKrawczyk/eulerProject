/**
 * Created by Tomek Krawczyk on 19.10.2017.
 */



/*
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
What is the 10 001st prime number?
*/



public class problem7 {


    static boolean isPrime(long a) {



        for (double c = 2; c <= a / 2; c++) {

            if (a % c == 0) {
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {

        long counter=0;

        for (long i=2;i<=100000000000000l;i++){

            if (isPrime(i)==true){

                counter++;
                if (counter==10001){
                    System.out.println(i);
                    break;
                }
            }
        }

        System.out.println(isPrime(5));




    }

}

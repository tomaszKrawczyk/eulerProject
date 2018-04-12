/**
 * Created by Tomek Krawczyk on 27.10.2017.
 */

/*The following iterative sequence is defined for the set of positive integers:
n → n/2 (n is even)
n → 3n + 1 (n is odd)
Using the rule above and starting with 13, we generate the following sequence:
13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved
yet (Collatz Problem), it is thought that all starting numbers finish at 1.

Which starting number, under one million, produces the longest chain?

NOTE: Once the chain starts the terms are allowed to go above one million.
*/

public class problem14 {


    public static void main(String[] args) {


        long theBigestCount = 0;
        long n;
        long theBestNumber=1;


        for (int i = 2; i < 1000000; i++) {



            n = i;
            int count=1;


            while (n!=1){
                if (n % 2 == 0) {
                    n = n / 2;


                } else {
                    n = n * 3 + 1;
                }
                count++;


            }



            if (count > theBigestCount) {

                theBigestCount=count;
                theBestNumber=i;

            }




        }
        System.out.println(theBigestCount);


        System.out.println(theBestNumber);
    }
}

/**
 * Created by Tomek Krawczyk on 19.10.2017.
 */

/*
The sum of the squares of the first ten natural numbers is,
  1^2 + 2^2 + ... + 10^2 = 385
 The square of the sum of the first ten natural numbers is,
 (1 + 2 + ... + 10)^2 = 55^2 = 3025
 Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum
 is 3025 − 385 = 2640.
 Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
*/


public class problem6 {


    public static void main(String[] args) {

        double sumSquare=0;

        for (double i=1;i<=100;i++){

          sumSquare=sumSquare+Math.pow(i,2);


        }


        double sum=0d;
        double squareSum=0d;

        for (double j=1;j<=100;j++){

            sum=sum+j;

            squareSum=Math.pow(sum,2);
        }


        double result= squareSum-sumSquare;

        int result2=(int) result;



        System.out.println(result2);
    }
}

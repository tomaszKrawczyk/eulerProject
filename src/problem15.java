import java.math.BigInteger;

/**
 * Created by Tomek Krawczyk on 30.10.2017.
 */

/*
 n! means n × (n − 1) × ... × 3 × 2 × 1

 For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
 and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

 Find the sum of the digits in the number 100!
*/


public class problem15 {

    public static void main(String[] args) {


        BigInteger score=new BigInteger("1");


        for (int i=2;i<=100;i++){

            String id=Integer.toString(i);

            BigInteger is=new BigInteger(id);

            score=score.multiply(is);

        }


        System.out.println(score.toString().length());


        System.out.println(score.toString());



       char[]array= score.toString().toCharArray();

       long sum=0;

       for (int i=0;i<=157;i++){

            int sumNum=Character.getNumericValue(array[i]);

           sum=sum+sumNum;


       }

        System.out.println(sum);



    }
}

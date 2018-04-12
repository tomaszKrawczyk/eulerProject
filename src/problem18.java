import java.math.BigInteger;

/**
 * Created by Tomek Krawczyk on 25.11.2017.
 */

/*

2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
What is the sum of the digits of the number 2^1000?

*/
public class problem18 {

    public static void main(String[] args) {

         BigInteger a=new BigInteger("1");



         for (int i=1;i<=1000;i++){

            a=a.multiply(new BigInteger("2"));


         }

        System.out.println(a);


        char [] b=a.toString().toCharArray();

        System.out.println(b.length);

        int[] c=new int[b.length];

        System.out.println(c.length);

        int sum=0;


        for (int i=0;i<c.length;i++){


            c[i]=(int) b[i];
            sum=Integer.valueOf(c[i]-48)+sum;


        }
        System.out.println(sum);

    }
}

import java.math.BigInteger;

/**
 * Created by Tomek Krawczyk on 30.10.2017.
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

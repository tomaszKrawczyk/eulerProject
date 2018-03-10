/**
 * Created by Tomek Krawczyk on 19.10.2017.
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

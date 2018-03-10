/**
 * Created by Tomek Krawczyk on 27.10.2017.
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

/**
 * Created by Tomek Krawczyk on 17.10.2017.
 */
public class problem1 {

    public static void main(String[] args) {

        int sum=0;

        for (int i=1;i<1000;i++){

            if (i%5==0 || i%3==0){

                sum+=i;
            }
        }

        System.out.println(sum);
    }
}

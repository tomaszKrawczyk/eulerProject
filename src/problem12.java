import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tomek Krawczyk on 27.10.2017.
 */
public class problem12 {






   static int getNumberOfdivisiors(int n) {

        int count = 1;

        for (int i = 1; i < Math.sqrt((double) n); i++) {

            if (n % i == 0) {

                count+=2;
            }
        }
        return count;
    }


    static int solution() {


        int triangleNumbers = 0;

        for (int j = 1; j <= 100000000; j++) {

            triangleNumbers = triangleNumbers + j;

            if (getNumberOfdivisiors(triangleNumbers) > 500) {

                System.out.println(triangleNumbers);
                break;


            }

        }return triangleNumbers;
    }

    public static void main(String[] args) {

       solution();






    }
}




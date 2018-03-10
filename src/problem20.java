import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Tomek Krawczyk on 05.02.2018.
 */
public class problem20 {

// perfect number is a number for which the sum of its proper divisors is exactly equal to the number.
// For example, the sum of the proper divisors of 28 would be 1 + 2 + 4 + 7 + 14 = 28, which means that 28 is a perfect number.
// A number n is called deficient if the sum of its proper divisors is less than n and it is called abundant if this sum exceeds n.
// As 12 is the smallest abundant number, 1 + 2 + 3 + 4 + 6 = 16, the smallest number that can be written as the sum of two abundant numbers is 24.
// By mathematical analysis, it can be shown that all integers greater than 28123 can be written as the sum of two abundant numbers.
// However, this upper limit cannot be reduced any further by analysis even though it is known that the greatest number that cannot
// be expressed as the sum of two abundant numbers is less than this limit.
// Find the sum of all the positive integers which cannot be written as the sum of two abundant numbers.


    static boolean isAbundat(int a) {

        int sum = 0;

        for (int i = 1; i <= a / 2; i++) {

            if (a % i == 0) {
                sum = sum + i;
            }

            if (sum > a) {
                return true;
            }
        }
        return false;

    }


    public static void main(String[] args) {


        List<Integer> listOfAbundatNumber = new ArrayList<>();
        Set<Integer> mySet=new TreeSet();


        System.out.println(isAbundat(12));


        int sum2 = 0;


        for (int i = 1; i <= 28123; i++) {

            if (isAbundat(i)) {
                listOfAbundatNumber.add(i);


            }

        }

//        for (int abundat:listOfAbundatNumber) {
//
//            System.out.println(abundat);
//
//        }


        for (int i = 0; i <= listOfAbundatNumber.size() - 2; i++) {

            for (int y = i + 1; y <= listOfAbundatNumber.size()-1; y++) {

                int sumOfTwoAbundatNumber = listOfAbundatNumber.get(i) + listOfAbundatNumber.get(y);
                int sumOfTwoTheSameAbundatNumber=listOfAbundatNumber.get(i)*2;



                    mySet.add(sumOfTwoAbundatNumber);
                    mySet.add(sumOfTwoTheSameAbundatNumber);



            }

        }

//        for (int set:mySet) {
//
//            System.out.println(set);
//
//        }


        int sum3=0;

        for (int i=1;i<=28123;i++){

            if (!mySet.contains(i)){

                sum3=sum3+i;
            }
        }
        System.out.println(sum3);




    }
}

/**
 * Created by Tomek Krawczyk on 18.10.2017.
 */
public class problem2 {

    public static void main(String[] args) {

        int firstNumber = 1;
        int secondNumber = 2;


        long [] fibonachi = new long[101];
        fibonachi[0] = firstNumber;
        fibonachi[1] = secondNumber;

        long sum = 2;
        long fib=0;





        for (int i=2;i<=100;i++) {

            fib = (fibonachi[i - 2] + fibonachi[i - 1]);
            fibonachi[i] = fib;
            if (fib>4000000){
                break;
            }
            if (fib%2==0) {
                sum = sum + fib;
            }

        }
        System.out.println(sum);




    }
}

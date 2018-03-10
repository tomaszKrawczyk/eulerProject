/**
 * Created by Tomek Krawczyk on 19.10.2017.
 */
public class Problem5 {



    static boolean isDividedbyAllNumberTo20(int a){

        for (int i=1;i<=20;i++){
            if (!(a%i==0)){
                return false;
            }
        }return true;
    }

    public static void main(String[] args) {

        int smallestNumber=20;

        for (int i=20;i<=1000000000;i++){
            if (isDividedbyAllNumberTo20(i)==true){

                smallestNumber=i;
                break;
            }

        }
        System.out.println(smallestNumber);


        isDividedbyAllNumberTo20(6);
    }
}

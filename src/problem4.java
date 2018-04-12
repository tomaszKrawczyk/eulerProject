/**
 * Created by Tomek Krawczyk on 19.10.2017.
 */


       /*
        A palindromic number reads the same both ways.
        The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
        Find the largest palindrome made from the product of two 3-digit numbers.
       */

public class problem4 {

    static boolean areHaveTwoThreeDigitNumberProduct(int i) {



        for (int c = 100; c <= 999; c++) {

            int product=i%c;
            int divide=i/c;
            String word= Integer.toString(divide);


            if (product == 0 && word.length()==3) {
                return true;

            }
        }

        return false;

    }


    static boolean isPandrome (String someWord){

        char [] charArray=someWord.toCharArray();

        char [] charArray2= new char[6];

        for (int i=0;i<=5;i++){
            charArray2[i]=charArray[charArray.length-1-i];
        }

        String word1=new String(charArray);
        String word2=new String(charArray2);



        if (word1.equals(word2)){
            return true;
        }else
            return false;

    }




    public static void main(String[] args) {

        int palindrom=0;


        for (int i=100000;i<=999999;i++){




           String word= Integer.toString(i);



            if (isPandrome(word)==true && areHaveTwoThreeDigitNumberProduct(i)==true ){
                palindrom=i;

            }


        } System.out.println(palindrom);


        int word=400004;
       String word2= Integer.toString(word);

        System.out.println( isPandrome(word2));
        System.out.println(areHaveTwoThreeDigitNumberProduct(word));






















    }





}

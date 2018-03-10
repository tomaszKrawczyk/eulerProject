/**
 * Created by Tomek Krawczyk on 23.10.2017.
 */
public class problem9 {

    static boolean isPitagorian(int a, int b, int c){

        if (a*a+b*b==c*c){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {

        int a;
        int b;
        int c;


        for (int i=1;i<=1000;i++){
            a=i;
            for (int y=1;y<=1000;y++){
                b=y;
                for(int z=1;z<=1000;z++){
                    c=z;

                    if (isPitagorian(a,b,c)==true && a+b+c==1000){
                        System.out.println(a*b*c);

                        System.out.println(a);
                        System.out.println(b);
                        System.out.println(c);
                    }
                }

            }
        }




    }


}

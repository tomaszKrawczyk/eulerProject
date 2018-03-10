/**
 * Created by Tomek Krawczyk on 25.11.2017.
 */
public class problem19 {

   static int factories(int a){

        int factory=1;

        for (int i=1;i<=a;i++) {

            factory = factory * i;
        }

        return factory;
    }


    public static void main(String[] args) {

        int[]t=new int[3];

        t[0]=0;
        t[1]=1;
        t[2]=2;

        System.out.println(factories(4));


        



    }

}

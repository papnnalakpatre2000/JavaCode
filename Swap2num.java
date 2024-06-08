import java.util.Scanner;

class Swap2num{
    public static void main(String arg[]){

        Scanner s=new Scanner(System.in);

        int a=s.nextInt();
        int b=s.nextInt();


        System.out.println("a "+a+", b "+b);
        // ----------------------------------------------------------------
        // 1 way

        // b=a+b;
        // a=b-a;
        // b=b-a;
        

        // ----------------------------------------------------------------
        // 2 way

        // int temp =a;
        // a=b;
        // b=temp;

        // ----------------------------------------------------------------
        // 3 way
        

        // ----------------------------------------------------------------

        System.out.println("a "+a+", b "+b);
        s.close();

    }
}
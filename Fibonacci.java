import java.util.Scanner;

public class Fibonacci {


    public static int fabseries(int n){

        if(n<=1){
            return n;
        }


        return fabseries(n-1)+fabseries(n-2);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        // way 1
        // int a=0,b=1,c=1;
        // System.out.print(a+" "+b+" "+c);
        // for(int i=0;i<n-3;i++){
        //     a=c;
        //     c=c+b;
        //     b=a;
        //     System.out.printf(" %d",c);


        // }

        // way 2
        for(int i=0;i<n;i++)
        {
            System.out.printf("%d ",fabseries(i));
        }
         

        s.close();
    }
}

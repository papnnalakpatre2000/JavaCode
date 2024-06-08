import java.util.Scanner;
class Swap2nums{
    public static int[] swap2(int a,int b){
        int[] temp={b,a};
        return temp;
    }

    public static void main(String arg[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();

        System.out.println("a="+a+" , b="+b);

        int[] arr=swap2(a,b);
        a=arr[0];
        b=arr[1];
        
        System.out.println("a="+a+" , b="+b);
    }
}
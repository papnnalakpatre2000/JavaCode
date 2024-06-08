public class Prime{
    public static void main(String arg[]){
        int n=21;
        boolean flag=true;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0){
                System.out.println("the number is not the prime number");
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("the number is prime number");
        }
    }
}
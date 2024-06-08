public class Factorial {
    public static int getfactorial(int n){
        // int total=1;
        if (n==0) {
            return 1;
        }
        return(n*getfactorial(n-1));
    }
    public static void main(String[] args) {
        int n=10;
        int total=1;
        // for(int i=1;i<=n;i++){
        //     total=i*total;
        // }
        total=getfactorial(n);
        System.out.println(total);
    }
    
}

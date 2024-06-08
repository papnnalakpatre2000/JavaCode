import java.util.Scanner;

public class RemoveWhitespaces {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String[] ss=s.nextLine().split(" ");

        String cs="";
        for(String os:ss){
            cs=cs+os;
        }
        System.out.println(cs);

        s.close();

    }
    
}

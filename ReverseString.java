import java.util.Scanner;
public class ReverseString{
    public static void main(String arg[]){

        Scanner s=new Scanner(System.in);
        String ss=s.nextLine();

        System.out.println(ss);

        // way 1
        // String[] sls=ss.split("");
        // String r="";
        // for(int i=0;i<ss.length();i++){
        //     r=sls[i]+r;
        // }

        // way 2
        // StringBuffer r=new StringBuffer(ss);
        // r=r.reverse();

        // way 3
        StringBuilder r=new StringBuilder(ss);
        r=r.reverse();
        System.out.println(r);
        

        s.close();
    }
} 
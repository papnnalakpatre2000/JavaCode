import java.util.Scanner;

public class Removeextraspaces {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String l=s.nextLine();

        String[] ar=l.split(" ");


String normal="";
boolean flag=true;

for (int i = ar.length-1; i > 0; i--) {
        if(ar[i]!="" && flag){
            flag=false;
        normal=ar[i];
    }
    else if(ar[i]!="" && !flag){
        flag=false;
    normal=ar[i]+" "+normal;
}
}
normal=normal+"-";
        System.out.println(normal);
        s.close();
    }
}

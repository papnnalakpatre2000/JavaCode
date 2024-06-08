import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CheckOdd {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        List<Integer> l=new ArrayList<>();
        int n=s.nextInt();

        for(int i=0;i<n;i++){
            l.add(s.nextInt());
        }

       boolean b= l.stream().allMatch(aa->aa%2!=0);
       if(b){
        System.out.println("list contains all the odd numbers");
       }else{
        System.out.println("List contains even numbers as well");
       }
        
    }
}

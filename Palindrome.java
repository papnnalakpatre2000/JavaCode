import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String rs="";

        // way 1
        StringBuilder ss=new StringBuilder(str);
        rs=new String(ss.reverse());


        // way 2
        // char[] ch=str.toCharArray();
       
        // for(char oc:ch){
        //     rs=oc+rs;
        // }



        if(rs.equals(str)){
            System.out.println("The String is palindrome");
        }
        else{
            System.out.println("String is not palindrom String");
        }

        s.close();

    }
}

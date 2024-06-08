public class Vowel{
    public static void main(String arg[]){
        char[] v={'a','e','i','o','u'};
        String s="mm";
        boolean flag=true;
        for(char vv:v){
            if(s.indexOf(vv)!=-1){
                System.out.println("yes");
                flag=false;
                break;
            }
            
        }
        if(flag){
            System.out.println("no");
            
            }
    }

}
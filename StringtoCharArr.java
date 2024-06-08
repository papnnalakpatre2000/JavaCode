public class StringtoCharArr{
    public static void main(String arg[]){
        String s=null;
            if(s==null)
        throw new IllegalArgumentException("Null is not valid input");
    char[] a=s.toCharArray();

    for(char aa:a){
        System.out.println(aa);
    }
    }
}
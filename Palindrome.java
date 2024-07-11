import java.util.Locale;

public class Palindrome {
    public static void main(String[] args) {
     String pal = "shrutiturhs";
        System.out.println(Palin(pal));
    }
    public static boolean Palin(String pal){
         pal = pal.toLowerCase();
        for (int i = 0; i <= pal.length()/2; i++) {
            int start = pal.charAt(i) ;
            int end = pal.charAt(pal.length()-i-1);

            if ( start != end){
                return false;
            }
        } return true;
    }
}

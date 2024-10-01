public class palindrome_in_no {
    public static void main(String[] args) {
        int n=010;
        System.out.println(find(n));

    }
    public static boolean find(int n){
        for (int i = 0; i <=n/2; i++) {
            int start=0;
            int end=n-1;

            if(start!=end){
                return false;
            }



        }
        return true;

    }
}

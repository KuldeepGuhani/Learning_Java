package Arrays;

public class isPalindromeNo {
    public static void main(String[] args){
        int x=-121;
        System.out.println(isPalindrome(x));
    }
    public static boolean isPalindrome(int x) {
        int rev=0;
        int pal=x;
        while(x>0){
            int rem=x%10;
            rev=rev*10+rem;
            x/=10;
        }
        System.out.println("["+rev+"]");
        System.out.println("["+x+"]");
        System.out.println("["+pal+"]");


        return pal==rev;
    }
}

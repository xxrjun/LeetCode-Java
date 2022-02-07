public class E09_PalindromeNumber {
    public static void main(String[] args){
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
    }

    public static boolean isPalindrome(int x){
        if(x < 0) return false;
        
        long revx = 0;
        int tmpx = x;
        while(tmpx != 0){
            int pop = tmpx % 10;
            tmpx /= 10;
            revx = revx * 10 + pop;
        }
        return x == revx;
    }
}

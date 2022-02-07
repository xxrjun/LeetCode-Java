public class E05_LongestPalindromicSubstring {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("aba"));
    }

    public static String longestPalindrome(String s) {
        int len = s.length();
        if(len == 1){
            return Character.toString(s.charAt(0));
        }

        int[] range = new int[2]; // index 0 for start, 1 for len

        for(int i = 0 ; i < len ; i++){
            expander(s, i, i + 1, range, len);
            expander(s, i - 1, i + 1, range, len);

        }

        if(range[1] == 0) return Character.toString(s.charAt(0));

        return s.substring(range[0], range[0] + range[1]);
    }

    private static void expander(String s, int left, int right, int[] range, int sLen){
        for(; left >= 0 && right < sLen ; left--, right++){
            if(s.charAt(left) != s.charAt(right))
                break;
        }

        int len = --right - ++left + 1;
        if(len > range[1]){
            range[0] = left;
            range[1] = len;
        }

    }
}

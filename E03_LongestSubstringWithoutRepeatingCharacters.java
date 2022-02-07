public class E03_LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args){
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int[] count = new int[256];
        int max = 0;
        int len = s.length();
        for(int i = 0, j = 0 ; i < len ; i++){
            char c = s.charAt(i);
            count[c]++;
            for(; count[c] > 1 && j < i ; j++){
                count[s.charAt(i)]--;
            }
            max = Math.max(max, i - j + 1);
        }

        return max;
    }

}

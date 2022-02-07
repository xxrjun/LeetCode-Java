import java.util.ArrayList;
import java.util.List;

public class E383_RansomNote {
    public static void main(String[] args) {
        String r = "aa";
        String mag = "aab";
        System.out.println(canConstruct(r, mag));

    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        int rsLen = ransomNote.length(), magLen = magazine.length();
        if(rsLen > magLen) return false;
        int count[] = new int[26];
        for(int i = 0 ; i < magLen ; i++)
            count[magazine.charAt(i) - 'a']++;
        for(int i = 0 ; i < rsLen ; i++)
            if(--count[ransomNote.charAt(i) - 'a'] < 0) return false;

        return true;
    }

//    public boolean canConstruct(String ransomNote, String magazine) {
//
//        List<Character> magList = new ArrayList<>();
//        int magLen = magazine.length();
//        int rnLen = ransomNote.length();
//        for(int i = 0 ; i < magLen ; i++){
//            char c = magazine.charAt(i);
//            magList.add(c);
//        }
//        for(int i = 0 ; i < rnLen ; i++){
//            char c = ransomNote.charAt(i);
//            if(!magList.contains(c))
//                return false;
//            else{
//                magList.remove(Character.valueOf(c));
//            }
//        }
//
//        return true;
//    }
}

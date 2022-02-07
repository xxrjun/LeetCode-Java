import java.util.HashMap;

public class E387_FirstUniqueCharinString {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int len  = s.length();
        for(int i = 0 ; i < len ; i++){
            char c = s.charAt(i);
            if(!map.containsKey(c)){
                map.put(c, i);
            }
            else{
                map.put(c, -2);
            }
        }
        for(int i = 0 ; i < len ; i++){
            char c = s.charAt(i);
            if(map.get(c) != -2)
                return i;
        }

        return -1;
    }
}

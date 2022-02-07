public class E13_RomanToInteger {
    public static void main(String[] args){
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("IX"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }
    public static int romanToInt(String s) {
        int len = s.length();
        int result = 0;
        for(int i = len - 1; i >= 0; i--){
            char c = s.charAt(i);
            switch(c){
                case 'V': result += 5; break;
                case 'L': result += 50; break;
                case 'D': result += 500; break;
                case 'M': result += 1000; break;
                case 'I': result = (result >= 5) ? result - 1 : result + 1; break;
                case 'X': result = (result >= 50) ? result - 10 : result + 10; break;
                case 'C': result = (result >= 500) ? result - 100 : result + 100; break;
            }
            
        }

        return result;
    }
}

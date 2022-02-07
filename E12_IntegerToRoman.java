public class E12_IntegerToRoman {
    public static void main(String[] args){
        System.out.println(intToRoman(3));
        System.out.println(intToRoman(4));
        System.out.println(intToRoman(9));
        System.out.println(intToRoman(58));
        System.out.println(intToRoman(1994));
        System.out.println(intToRoman(10));
    }

    public static String intToRoman(int num) {
        String result = "";
        String[] first = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] second = {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] third = {"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] fourth = {"M", "MM", "MMM"};
        
        int count = 0;
        while(num != 0){
            count++;
            int pop = num % 10;
            num /= 10;
            if(pop != 0){
                switch(count){
                    case 1: result = first[pop - 1] + result; break;
                    case 2: result = second[pop - 1] + result; break;
                    case 3: result = third[pop - 1] + result; break;
                    case 4: result = fourth[pop - 1] + result; break;
                }
            }  
        }

        return result;
    }
}

public class E07_ReverseNumber {
    public static int reverse(int x) {
        
        long reversedx = 0;
        while(x != 0){
            int pop = x % 10;
            x /= 10;
            reversedx = reversedx * 10 + pop;
        }

        if(reversedx > Integer.MAX_VALUE || reversedx < Integer.MIN_VALUE){
            return 0;
        }
        else{
            return (int) reversedx;
        }
          
    }
    public static void main(String[] args){
        System.out.println(reverse(1534236469));
        System.out.println(reverse(-998));
        
    }
}

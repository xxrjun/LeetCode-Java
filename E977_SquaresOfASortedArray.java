public class E977_SquaresOfASortedArray {

    public static int[] sortedSquares(int[] nums) {
        int l = 0, r = nums.length - 1;
        int res[] = new int[nums.length];
        int count = nums.length - 1;
        while(l <= r){
            int leftS = nums[l] * nums[l];
            int rightS = nums[r] * nums[r];
            if(leftS <= rightS){
                res[count--] = rightS;
                r--;
            }
            else{
                res[count--] = leftS;
                l++;
            }

        }

        return res;

    }


}

public class E53_MaximumSubarray {
    public static void main(String[] args) {
        int nums[] = {-1};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int maxsum = nums[0];
        int cursum = 0;

        for(int n : nums){
            if(cursum < 0){
                cursum = 0;
            }
            cursum += n;
            maxsum = maxsum < cursum ? cursum : maxsum;
        }

        return maxsum;
    }
}

import java.util.Arrays;

public class E16_3SumClosest {
    public static void main(String[] args) {
        int[] nums = {-1,2,1,-4};
        System.out.println(threeSumClosest(nums, 1));
        int[] nums2 = {0, 0, 0};
        System.out.println(threeSumClosest(nums2, 1));
    }

    public static int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        int res = 0;
        int minGap = Integer.MAX_VALUE;
        Arrays.sort(nums);

        for(int i = 0 ; i < n - 1; i++){
            if(i == 0 || (i > 0 && nums[i] != nums[i -1])){
                int lo = i + 1, hi = n - 1;
                while(lo < hi){
                    int sum = nums[i] + nums[lo] + nums[hi];
                    int gap = Math.abs(target - sum);
                    if(gap < minGap){
                        minGap = gap;
                        res = sum;
                    }
                    else if(sum > target) hi--;
                    else lo++;

                }
            }
        }

        return res;
    }
}

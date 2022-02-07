import java.util.Arrays;

public class E152_MaximumProductSubarray {
    public static void main(String[] args) {
        int nums[] = {-2, -3, 7};
        int newnums[] = Arrays.copyOf(nums, nums.length);
        newnums[0] = 1;
        System.out.println(nums[0]);
        System.out.println(maxProduct(nums));
    }
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;

        int newnums[] = Arrays.copyOf(nums, nums.length);
        Arrays.sort(newnums);
        int maxnum = newnums[n - 1];
        int minnum = newnums[0];

        // System.out.println(maxnum + " " + minnum);

        // find maxnumindex and minnumindex
        int maxnumindex = -1;
        int minnumindex = -1;
        for(int i = 0 ; i < n ; i++){
            if(maxnumindex == -1 && nums[i] == maxnum)
                maxnumindex = i;
            if(minnumindex == -1 && nums[i] == minnum)
                minnumindex = i;
            if(maxnumindex != -1 && minnumindex != -1)
                break;
        }


        // System.out.println(maxnumindex + " " + minnumindex);


        int disFromleft = maxnumindex > minnumindex ? maxnumindex + 1 : minnumindex + 1;
        int disFromright = maxnumindex > minnumindex ? n - minnumindex : n - maxnumindex;
        int disFromBoth = maxnumindex > minnumindex ? (minnumindex + 1) + (n - maxnumindex) : (maxnumindex + 1) + (n - minnumindex);


        return Math.min(disFromBoth, Math.min(disFromleft, disFromright));

    }
    public static int maxProduct(int[] nums) {
        int max = nums[0], min = nums[0], res = nums[0];
        for(int i = 1 ; i < nums.length ; i++){

            // if encounter a negative element, max will become min, min will become max
            if(nums[i] < 0){
                int tmp = max;
                max = min;
                min = tmp;
            }
            max = Math.max(nums[i], max * nums[i]);
            min = Math.min(nums[i], min * nums[i]);
//            System.out.println(max + " " + min);
            if(max > res)
                res = max;
        }
        return res;
    }
//    public static int maxProduct(int[] nums) {
//        int n  = nums.length;
//        int l = 1, r = 1;
//        int ans = nums[0];
//
//        for(int i = 0 ; i < n ; i++){
//            l = l == 0 ? 1 : l;
//            r = r == 0 ? 1 : r;
//
//            l *= nums[i];
//            r *= nums[n - i - 1];
//            ans = Math.max(ans, Math.max(l, r));
//        }
//
//        return ans;
//    }
}

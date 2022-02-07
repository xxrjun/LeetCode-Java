import java.util.Arrays;

public class E2091_RemovingMinimumandMaximumFromArray {
    public static void main(String[] args) {
        int nums[] = {0,-4,19,1,8,-2,-3,5};
        System.out.println(minimumDeletions(nums));
    }
    public static int minimumDeletions(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;
        if(n == 1) return 1;

        // find maxnumindex and minnumindex
        int max = nums[0], min = nums[0];
        int maxnumindex = 0, minnumindex = 0;
        for(int i = 1 ; i < n ; i++){
            if(nums[i] > max){
                max = nums[i];
                maxnumindex = i;
            }
            else if(nums[i] < min) {
                min = nums[i];
                minnumindex = i;
            }
        }

        int disFromleft = maxnumindex > minnumindex ? maxnumindex + 1 : minnumindex + 1;
        int disFromright = maxnumindex > minnumindex ? n - minnumindex : n - maxnumindex;
        int disFromBoth = maxnumindex > minnumindex ? (minnumindex + 1) + (n - maxnumindex) : (maxnumindex + 1) + (n - minnumindex);

        return Math.min(disFromBoth, Math.min(disFromleft, disFromright));
    }


    // mine(slow)
//    public int minimumDeletions(int[] nums) {
//        int n = nums.length;
//        if(n == 0)
//            return 0;
//        if(n == 1)
//            return 1;
//
//        int newnums[] = Arrays.copyOf(nums, nums.length);
//        Arrays.sort(newnums);
//        int maxnum = newnums[n - 1];
//        int minnum = newnums[0];
//
//        // find maxnumindex and minnumindex
//        int maxnumindex = -1;
//        int minnumindex = -1;
//        for(int i = 0 ; i < n ; i++){
//            if(maxnumindex == -1 && nums[i] == maxnum)
//                maxnumindex = i;
//            if(minnumindex == -1 && nums[i] == minnum)
//                minnumindex = i;
//            if(maxnumindex != -1 && minnumindex != -1)
//                break;
//        }
//
//        int disFromleft = maxnumindex > minnumindex ? maxnumindex + 1 : minnumindex + 1;
//        int disFromright = maxnumindex > minnumindex ? n - minnumindex : n - maxnumindex;
//        int disFromBoth = maxnumindex > minnumindex ? (minnumindex + 1) + (n - maxnumindex) : (maxnumindex + 1) + (n - minnumindex);
//
//        return Math.min(disFromBoth, Math.min(disFromleft, disFromright));
//    }

}

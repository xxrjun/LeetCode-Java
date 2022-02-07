import java.util.Arrays;

public class E2090_KRadiusSubarrayAverages {
    public static void main(String[] args) {
        int nums[] = {7,4,3,9,1,8,5,2,6};
        int res[] = getAverages(nums, 3);
        for(int n : res){
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static int[] getAverages(int[] nums, int k) {
        // case 1: k == 0 => no need to change elements
        if(k == 0) return nums;

        int len = nums.length;
        int division = (2 * k) + 1;
        int res[] = new int [len];
        Arrays.fill(res, -1);

        // case 2: k >= len => fill -1
        if(len < division) return res;

        // case 3: k <= len =>fill mid elements
        long curSum = 0;
        int first = 0, last = division - 1;
        for(int i = 0 ; i <= last ; i++) curSum += nums[i];

        for(int i = k ; i < len - k ; i++){
            res[i] = (int) (curSum / division);
            curSum -= nums[first++];
            if(last + 1 < len) curSum += nums[++last];
        }

        return res;
    }

}

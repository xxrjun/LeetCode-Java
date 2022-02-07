import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class E18_4Sum {

    public static void main(String[] args) {
        int[] nums = {-2,-1,-1,1,1,2,2};
        System.out.println(fourSum(nums, 0));
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);

        List<List<Integer>> res = new LinkedList<>();
        // i, j, m, n
        for(int i = 0 ; i < nums.length - 3; i++){
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }

            for(int j = i + 1 ; j < nums.length - 2 ; j++){
                if(j != i + 1 && nums[j] == nums[j - 1]){
                    continue;
                }

                long newTarget = target -nums[i] - nums[j];
                for(int m = j + 1, n = nums.length - 1; m < n ; ){
                    long sum = nums[m] + nums[n];
                    if(sum < newTarget){
                        m++;
                    }
                    else if(sum > newTarget){
                        n--;
                    }
                    else{
                        res.add(Arrays.asList(nums[i], nums[j], nums[m], nums[n]));

                        for(m++, n--; m < n && nums[m] == nums[m - 1] && nums[n] == nums[n + 1]; m++, n--);
                    }

                }
            }


        }

        return res;
    }
}

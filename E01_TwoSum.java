import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class E01_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> prevMap = new HashMap(); // val:index
        for(int i = 0 ; i < nums.length ; i++){
            int remain = target - nums[i];
            if(prevMap.containsKey(remain)){
                int res[] = {prevMap.get(remain), i};
                return res;
            }
            prevMap.put(nums[i], i);
        }

        return null;
    }
}

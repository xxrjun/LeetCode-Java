
import java.util.Arrays;


public class E217_ContainsDuplicate {
    public static void main(String[] args) {
        int nums[] = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(nums));
    }
    public static boolean containsDuplicate(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        for(int i = 0 ; i < len - 1 ; i++){
            if(nums[i] == nums[i + 1]){
                return true;
            }
        }
        return false;
    }
}

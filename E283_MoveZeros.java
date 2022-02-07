public class E283_MoveZeros {
    public void moveZeroes(int[] nums) {
        // push every non-zero elements in the front of array
        int countzero = 0;
        for(int n : nums){
            if(n == 0) countzero++;
        }
        int cur = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] != 0) nums[cur++] = nums[i];
        }
        for(; cur < nums.length ; cur++){
            nums[cur] = 0;
        }
    }


}

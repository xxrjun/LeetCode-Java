public class E189_RotatedArray {
    public void rotate(int[] nums, int k){
        if(k == nums.length) return;
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end){
        while(start < end){
            int tmp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = tmp;
        }
    }

//    public void rotate(int[] nums, int k) {
//        if(k == nums.length)
//            return;
//
//        int n = nums.length;
//        k = k % n;
//        // reversing entire arr
//        for(int i = 0 ; i < (n / 2) ; i++){
//            swap(nums, i , n - i - 1);
//        }
//        // reversing two parts of arr
//        for(int i = 0 ; i < (k / 2) ; i++){
//            swap(nums, i , k - i - 1);
//        }
//        for(int i = k, j = 0; i < ((n + k) / 2); i++, j++){
//            swap(nums, i , n - j - 1);
//        }
//    }
//
//    public void swap(int[] nums, int a, int b){
//        int tmp = nums[a];
//        nums[a] = nums[b];
//        nums[b] = tmp;
//    }
}

public class E26_RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
        for(int i = 0 ; i < nums.length ; i++){
            System.out.print(nums[i] + " ");
        }
    }

    public static int removeDuplicates(int[] nums) {
        int k = nums.length;
        for(int i = 1 ; i < nums.length ; i++){

            if(nums[i] == nums[i - 1]){
                nums[i - 1] = -101;
                k--;
            }


        }

        int count = 0;
        for(int i = 0 ; i < nums.length; i++){

            if(nums[i] != -101){
                nums[count++] = nums[i];
             }
        }

        return k;
    }
}

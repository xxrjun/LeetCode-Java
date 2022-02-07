public class E27_RemoveElement {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        System.out.println(removeElement(nums, 2));
        for(int i = 0 ; i < nums.length ; i++){
            System.out.print(nums[i] + " ");
        }
    }

    public static int removeElement(int[] nums, int val) {
        int k = nums.length;
        int count = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == val){
                k--;
            }
            if(nums[i] != val){
                nums[count++] = nums[i];
            }
        }

        return k;
    }
}

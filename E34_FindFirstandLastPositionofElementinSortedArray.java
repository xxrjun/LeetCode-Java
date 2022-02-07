public class E34_FindFirstandLastPositionofElementinSortedArray {
    public static void main(String[] args) {
        int nums[] = {1};
        int target = 1;
        int nums2[] = searchRange(nums, target);
        for(int n : nums2){
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static int[] searchRange(int[] nums, int target){

        int left = 0, right = nums.length - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(target == nums[mid]){
                int maxIndex = mid, minIndex = mid;
                while((maxIndex < nums.length - 1)&& nums[maxIndex + 1] == target){
                    maxIndex++;
                }
                while(minIndex > 0 && nums[minIndex - 1] == target){
                    minIndex--;
                }
                int found[] = {minIndex, maxIndex};
                return found;
            }
            else if (target > nums[mid]){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }

        int nofound[] = {-1, -1};
        return nofound;

    }
}

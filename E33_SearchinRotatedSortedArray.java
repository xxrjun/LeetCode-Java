public class E33_SearchinRotatedSortedArray {
    public static void main(String[] args) {
        int nums[] = {1};
        int target = 1;
        System.out.println(search(nums,target));
    }

    public static int search(int[] nums, int target) {
        int len = nums.length;

        if(len == 0)
            return -1;

        // find smallest num -> pivot
        int lo = 0, hi = len - 1;
        while(lo < hi){
            int mid = (lo + hi) / 2;
            if(nums[mid] > nums[hi]){
                lo = mid + 1;
            }
            else{
                hi = mid;
            }
        }
        int pivot = lo;
        lo = 0;
        hi = len - 1;
        while(lo <= hi){
            int mid = (lo + hi) / 2;
            int realmid = (mid + pivot) % len;

            if(nums[realmid] == target)
                return realmid;
            else if(nums[realmid] < target)
                lo = mid + 1;
            else
                hi = mid - 1;
        }
        return -1;
    }
}

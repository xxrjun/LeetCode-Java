import java.util.Arrays;
import java.util.Collection;

public class E04_MedianofTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergeArr = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, mergeArr, 0 ,nums1.length);
        System.arraycopy(nums2, 0, mergeArr, nums1.length ,nums2.length);
        Arrays.sort(mergeArr);
        if(mergeArr.length % 2 != 0){
            return (double) mergeArr[mergeArr.length / 2];
        }
        else{
            return ((double) mergeArr[mergeArr.length / 2 - 1] + mergeArr[mergeArr.length / 2]) / 2;
        }

    }
}

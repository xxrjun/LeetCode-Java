import java.util.ArrayList;

public class E88_MergeSortedArray {

    public static void main(String[] args) {
        int nums1[] = {1,2,3,0,0,0};
        int nums2[] = {4,5,6};
        int m = 3, n = 3;

        for(int num : nums1){
            System.out.print(num);
        }
        System.out.println();
        merge(nums1, m, nums2, n);

        for(int num : nums1){
            System.out.print(num);
        }
        System.out.println();
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
       int i = nums1.length - 1;

       while( m > 0 && n > 0){
            if(nums1[m - 1] >= nums2[n - 1]){
                nums1[i] = nums1[m - 1];
                m--;
            }
            else{
                nums1[i] = nums2[n - 1];
                n--;
            }
            i--;
       }

       while(n > 0){
           nums1[i] = nums2[n - 1];
           n--; i--;
       }

    }
}

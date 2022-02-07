import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

public class E350_IntersectionofTwoArraysII {
    public static void main(String[] args) {
        int nums1[] = {4,9,5};
        int nums2[] = {9,4,9,8,4};
        int res[] = intersect(nums1, nums2);
        for(int n : res){
            System.out.print(n + " ");
        }
        System.out.println();
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>(); // (val-quantity)

        for(int data : nums1){
            map.put(data, map.getOrDefault(data, 0) + 1);
        }
        for(int data : nums2){
            if(map.containsKey(data) && map.get(data) != 0){
                list.add(data);
                int remainQuantity = map.get(data) - 1;
                if(remainQuantity == 0){
                    map.remove(data);
                }
                else{
                    map.put(data, remainQuantity);
                }
            }
        }

        int res[] = new int[list.size()];
        int count = 0;
        for(int data : list){
            res[count++] = data;
        }

        return res;
    }
}

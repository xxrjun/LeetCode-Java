import java.util.HashMap;

public class E167_TwoSumII_InputArrayIsSorted {
    public int[] twoSum(int[] numbers, int target){
        int l = 0, r = numbers.length - 1;
        while(l < r){
            int sum = numbers[l] + numbers[r];
            if(sum == target) return new int[]{l + 1, r + 1};
            else if(sum > target) r--;
            else l++;
        }
        return null;
    }

//    public int[] twoSum(int[] numbers, int target) {
//        // val-index;
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for(int i = 0 ; i < numbers.length ; i++){
//            if(numbers[i] > target && numbers[i] + numbers[0] > target) break;
//            map.put(numbers[i], i);
//        }
//        int res[] = new int[2];
//        for(int i = 0 ; i < numbers.length ; i++){
//            int remain = target - numbers[i];
//            if(map.containsKey(remain)){
//                res[0] = i + 1; res[1] = map.get(remain) + 1;
//                break;
//            }
//        }
//        return res;
//    }
}

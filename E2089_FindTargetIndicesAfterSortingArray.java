import java.util.ArrayList;
import java.util.List;

public class E2089_FindTargetIndicesAfterSortingArray {
    public List<Integer> targetIndices(int[] nums, int target) {
        int before = 0, same = 0;
        for(int n : nums){
            if(n < target)
                before++;
            else if(n == target)
                same++;
        }
        List<Integer> res = new ArrayList<>(same);
        for(int i = before ; i < same + before ; i++)
            res.add(i);
        return res;
    }
}

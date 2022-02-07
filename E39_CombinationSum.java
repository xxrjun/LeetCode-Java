import java.util.*;

public class E39_CombinationSum {
    public static void main(String[] args) {
        int candidates[] = {2,3,6,7};
        int target = 7;
        List<List<Integer>> res = combinationSum(candidates, target);
        for(List<Integer> l : res){
            for(int n : l){
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curList = new ArrayList<>();
        dfs(0, 0, curList, res ,candidates, target);
        return res;
    }

    public static void dfs(int index, int total, List<Integer> curList, List<List<Integer>> res, int[] candidates, int target){
        if(total == target){
            res.add(new ArrayList<>(curList));
            return;
        }
        if(index >= candidates.length || total > target){
            return;
        }

        curList.add(candidates[index]);
        dfs(index, total + candidates[index], curList, res ,candidates, target);
        curList.remove(curList.size() - 1);
        dfs(index + 1, total, curList, res, candidates, target);

    }
}

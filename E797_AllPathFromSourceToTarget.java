import java.util.ArrayList;
import java.util.List;

public class E797_AllPathFromSourceToTarget {
    public static void main(String[] args) {
        int graph[][] = {{1,2}, {3}, {3}, {}};
        List<List<Integer>> res = new ArrayList<>();
        res = allPathsSourceTarget(graph);
        for(List<Integer> l : res){
            System.out.print(l + " ");
        }
    }
    public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res  = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        tmp.add(0);
        dfs(graph, res, tmp, 0);
        return res;
    }

    private static void dfs(int[][] graph, List<List<Integer>> res,List<Integer> tmp, int start){
        if(start == graph.length - 1){
            res.add(new ArrayList<>(tmp));
            return;
        }

        for(int n : graph[start]){
            tmp.add(n);
            dfs(graph, res, tmp, n);
            tmp.remove(tmp.size() - 1);
        }
    }

}

import java.util.ArrayList;
import java.util.List;

public class E118_PascalsTriangle {
    public static void main(String[] args) {
        List<List<Integer>> list = generate(5);
        for(List<Integer> l : list){
            for(int n : l){
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> inner = new ArrayList<>();
        inner.add(1);
        res.add(inner);
        for(int i = 1 ; i < numRows ; i++){
            inner = new ArrayList<>();
            int val = 1;
            inner.add(val);
            for(int j = 0 ; j < i ; j++){
                val = val * (i - j) / (j + 1);
                inner.add(val);
            }

            res.add(inner);
        }
        return res;
    }


}

import java.util.ArrayList;
import java.util.List;

public class E22_GenerateParentheses {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(generateParenthesis(n));
    }
    public static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        getParentheses(res, n, 1, 0, "(");

        return res;
    }

    public static void getParentheses(List<String> res, int n, int open, int close,String s){
        if(open == n && close == n){
            res.add(s);
            return;
        }
        else{
            if(open < n){
                getParentheses(res, n, open + 1, close, s + "(");
            }
            if(close < open){
                getParentheses(res, n, open, close + 1, s + ")");
            }
        }
    }
}

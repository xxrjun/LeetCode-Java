import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class E20_ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();

        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        for(char cur : s.toCharArray()){
            if(map.containsKey(cur))
                stack.push(map.get(cur));
            else if(stack.empty() || stack.peek() != cur)
                return false;
            else
                stack.pop();
        }

        return stack.empty();
    }
}

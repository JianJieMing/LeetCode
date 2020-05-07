package simple;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author jianjieming
 * @date 2020/5/7 17:06
 */
public class ValidParentheses {
    private static HashMap<Character, Character> mappings;
    static {
        mappings = new HashMap<>();
        mappings.put(')', '(');
        mappings.put('}', '{');
        mappings.put(']', '[');
    }

    public static void main(String[] args) {

        System.out.println(isValid("{[()()]}"));
        System.out.println(isValidTwo("{[()()]}"));
    }


    private static boolean isValid(String s) {
        if (s.isEmpty())
            return true;
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.empty() || c != stack.pop())
                return false;
        }
        return stack.empty();
    }


    private static boolean isValidTwo(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (mappings.containsKey(c)) {
                char topElement = stack.empty() ? '#' : stack.pop();
                if (topElement != mappings.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

}

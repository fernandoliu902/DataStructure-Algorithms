package stack.leetcode;
import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for (Character c: s.toCharArray()) {
            if(c == '(' || c == '{' || c=='['){
                stack.push(c);
            }else{
                if(stack.isEmpty())
                    return false;
                char topChar = stack.pop();
                if( c == ')' && topChar != '(')
                    return false;
                if( c == '}' && topChar != '{')
                    return false;
                if( c == ']' && topChar != '[')
                    return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(new ValidParentheses().isValid("{()[]{}}"));
        System.out.println(new ValidParentheses().isValid("{()[{]}}"));
    }
}

package Stack;

import com.codewithmosh.Array;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Expression {

    private final List<Character> leftBrackets = Arrays.asList('(', '<', '[', '{');
    private final List<Character> rightBrackets = Arrays.asList(')', '>', ']', '}');

    public boolean isBalanced(String input){
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()){
            if (isLeftBracked(ch)){
                stack.push(ch);
            }
            if (isRightBracked(ch)){
                if (stack.empty()) return false;

                var top = stack.pop();
                if(isBrackedMatch(top, ch)){
                    return false;
                }
            }
        }
        return stack.empty();
    }

    private boolean isLeftBracked(char ch){
        return leftBrackets.contains(ch);
    }
    private boolean isRightBracked(char ch){
        return rightBrackets.contains(ch);
    }
    private boolean isBrackedMatch(char left, char right){
        return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);
    }

}

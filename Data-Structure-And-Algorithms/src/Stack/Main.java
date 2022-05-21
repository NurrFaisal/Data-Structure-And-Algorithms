package Stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args){
        String str = "(1 + 2)";
        var exp = new Expression();
        var result = exp.isBalanced(str);
        System.out.println(result);
    }
}

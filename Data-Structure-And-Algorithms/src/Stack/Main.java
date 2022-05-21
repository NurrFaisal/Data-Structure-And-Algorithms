package Stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);
        var top = stack.pop();
        System.out.println(top);
        System.out.println(stack);
        var top2 = stack.peek();
        System.out.println(top2);
        System.out.println(stack);
    }
}

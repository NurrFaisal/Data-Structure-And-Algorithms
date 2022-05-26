package Queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args){
//        Queue<Integer> queue = new ArrayDeque<>();
//        queue.add(10);
//        queue.add(20);
//        queue.add(30);
//        var front = queue.remove();
//        System.out.println(queue);
//        System.out.println(front);
//        System.out.println(queue);
//        reverse(queue);


//        ArrayQueue queue = new ArrayQueue(5);
//        queue.enqueue(10);
//        queue.enqueue(20);
//        queue.enqueue(30);
//        queue.enqueue(40);
//        queue.dequeue();
//        var item = queue.dequeue();
//        queue.enqueue(50);
//        queue.enqueue(60);
//        queue.enqueue(70);
//        System.out.println(queue);
//        System.out.println(item);

//        PriorityQueue<Integer> queue = new PriorityQueue<>();
//        queue.add(2);
//        queue.add(4);
//        queue.add(1);
//        queue.add(3);
//        while (!queue.isEmpty()){
//            System.out.println(queue.remove());
//        }

        PriorityQueue queue = new PriorityQueue();
        queue.add(5);
        queue.add(3);
        queue.add(4);
        System.out.println(queue);

//        [5, 3, 1]
    }

    public static void reverse(Queue<Integer> queue){
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()){
            stack.push(queue.remove());
        }
        while (!stack.isEmpty()){
            queue.add(stack.pop());
        }
        System.out.println(queue);
    }

}

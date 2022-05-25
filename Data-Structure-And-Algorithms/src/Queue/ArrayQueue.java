package Queue;

import com.codewithmosh.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayQueue {
    private int items[];
    private int count;
    private int front;
    private int rear;
    public ArrayQueue(int capacity){
        items = new int[capacity];
    }
    public void enqueue(int item){
        if (count == items.length){
            throw new IllegalStateException();
        }
        items[rear++] = item;
        count++;
    }
    @Override
    public String toString(){
        return Arrays.toString(items);
    }

    public int dequeue(){
       var item = items[front];
       items[front++] = 0;
       count--;
       return item;
    }

}

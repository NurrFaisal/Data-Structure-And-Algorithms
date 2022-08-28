package Heap;

import Array.Array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
//        var heap = new Heap();
//        heap.insert(10);
//        heap.insert(17);
//        heap.insert(5);
//        heap.insert(22);
//        heap.insert(4);
//        System.out.println("Done");
        int[] numbers = {5, 3, 10, 1, 4, 2};
//        MaxHeap.heapify(numbers);
//        System.out.println(Arrays.toString(numbers));
        System.out.println(MaxHeap.getKthLargest(numbers, 2));
    }
}

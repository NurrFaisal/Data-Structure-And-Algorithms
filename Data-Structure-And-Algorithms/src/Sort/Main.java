package Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] names){
        int[] numbers = {7, 3, 1, 4, 6, 2, 3};
        var sorter = new CountingSort();
        sorter.sort(numbers, 7);
        System.out.println(Arrays.toString(numbers));
    }
}

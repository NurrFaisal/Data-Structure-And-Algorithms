package Search;

public class Main {
    public static void main(String[] names){
//        int[] numbers = {7, 1, 3, 6, 5};
        int[] numbers = {1, 3, 5, 6, 7};
        var search = new Search();
        var index = search.binarySearchRec(numbers, 5);
        System.out.println(index);
    }
}

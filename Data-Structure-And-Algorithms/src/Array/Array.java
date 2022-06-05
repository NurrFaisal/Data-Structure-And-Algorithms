package Array;

public class Array {
    int[] items;
    int count = 0;
    public Array(int length){
        items = new int[length];
    }
    public void insert(int item){
        if (items.length == count){
            int[] newArray = new int[count*2];
            for (int i = 0; i < items.length; i++){
                newArray[i] = items[i];
            }
            items = newArray;
        }
        items[count] = item;
        count++;
    }
    public void print(){
        for (int i = 0; i < count; i++){
            System.out.println(items[i]);
        }
    }
    public void removeAt(int index){
        if(index < 0 || index >= count){
            throw new IllegalArgumentException();
        }
        for (int i = index; i < count; i++){
            items[i] = items[i+1];
        }
        count--;
    }
    public int indexOf(int item){
        for (int i = 0; i < count; i++){
            if(items[i] == item){
                return i;
            }
        }
        return -1;
    }
}

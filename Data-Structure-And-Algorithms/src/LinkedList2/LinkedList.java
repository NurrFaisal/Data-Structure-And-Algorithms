package LinkedList2;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;
        public Node(int item){
            this.value = item;
        }
    }
    private Node first;
    private Node last;

    public void addLast(int item){
        var node = new Node(item);
        if (isEmpty()){
            first = last = node;
        }else {
            last.next = node;
            last = node;
        }
    }
    
    public void addFirst(int item){
        var node = new Node(item);
        if(isEmpty()){
            first = last = node;
        }else {
            node.next = first;
            first = node;
        }
    }
    public int indexOf(int item){
        int index = 0;
        var current = first;
        while (current != null){
            if(current.value == item) return index;
            current = current.next;
            index++;
        }
        return -1;
    }
    public boolean isEmpty(){
        return first == null;
    }
}

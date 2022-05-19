package LinkedList;


public class Main {
    public static void main(String[] args){
        var linkedlist = new LinkedList();
        linkedlist.addLast(10);
        linkedlist.addLast(20);
        linkedlist.addLast(30);
        linkedlist.addLast(40);
//        var indexof = linkedlist.indexOf(40);
//        System.out.println(indexof);
//        System.out.println(linkedlist.contains(30));
        System.out.println(linkedlist.getKthFromTheEnd(2));


    }
}

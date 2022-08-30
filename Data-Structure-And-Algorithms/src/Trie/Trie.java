package Trie;

import java.util.HashMap;

public class Trie {
    private class Node{
        public static int ALPHABET_SIZE = 26;
        private char value;
        private HashMap<Character, Node> children = new HashMap<>();
        private boolean isEndOfWord;

        public Node(char value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "value=" + value;
        }
        public boolean hasChild(char ch){
            return children.containsKey(ch);
        }
        public void addChild(char ch){
            children.put(ch, new Node(ch));
        }
        public Node getChild(char ch){
            return children.get(ch);
        }
        public Node[] getChildren(){
            return children.values().toArray(new Node[0]);
        }
    }

    private Node root = new Node(' ');



    public void insert(String word){
        var current = root;
        for (var ch : word.toCharArray()){
            if(!current.hasChild(ch)){
                current.addChild(ch);
            }
            current = current.getChild(ch);
        }
        current.isEndOfWord = true;
    }
    public boolean contains(String word){
        if(word == null){
            return false;
        }
        var current = root;
        for (var ch : word.toCharArray()){
            if(!current.hasChild(ch)){
                return false;
            }
            current = current.getChild(ch);
        }
        return current.isEndOfWord;
    }
    public void travers(){
        travers(root);
    }
    private void travers(Node root){
        // POST ORDER
        for (var child : root.getChildren()){
            travers(child);
        }
        System.out.println(root.value);
        // PRE-ORDER
//        for (var child : root.getChildren()){
//            travers(child);
//        }
    }
}

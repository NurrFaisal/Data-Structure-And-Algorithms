package Trie;

public class Main {
    public static void main(String[] names){
        var trie = new Trie();
        trie.insert("canada");
//        System.out.println(trie.contains("can"));
        trie.travers();
    }
}

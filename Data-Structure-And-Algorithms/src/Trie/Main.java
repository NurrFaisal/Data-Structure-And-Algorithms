package Trie;

public class Main {
    public static void main(String[] names){
        var trie = new Trie();
        trie.insert("car");
        trie.insert("card");
        trie.insert("care");
        trie.insert("carefull");
        trie.insert("egg");
        var worlds = trie.findWords("car");
        System.out.println(worlds);
    }
}

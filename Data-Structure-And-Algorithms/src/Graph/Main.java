package Graph;

public class Main {
    public static void main(String[] names){
        var graph = new Graph();
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addNode("D");
        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
//        graph.removeEdge("A", "C");
//        graph.print();
        graph.traverseDepthFirst("C");
    }
}

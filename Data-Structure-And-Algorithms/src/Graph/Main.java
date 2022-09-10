package Graph;

public class Main {
    public static void main(String[] names){
        var graph = new Graph();
        graph.addNode("X");
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("P");
        graph.addEdge("X", "A");
        graph.addEdge("X", "B");
        graph.addEdge("A", "P");
        graph.addEdge("B", "P");
//        graph.removeEdge("A", "C");
//        graph.print();
//        graph.traversDepthFirst("A");
        var list = graph.topologicalSort();
        System.out.println(list);
    }
}

public class Main {
    public static void main(String[] args) {
        UnweightedGraph<String> graph = new UnweightedGraph<>(true);
        fillWithoutWeights(graph);

        System.out.println();
        System.out.println("DFS:");
        Search<String> dfs = new DepthFirstSearch<>(graph, "Astana");
        outputPath(dfs, "Almaty");



        System.out.println("----------------------");

        System.out.println("BFS:");
        Search<String> bfs = new BreadthFirstSearch<>(graph, "Astana");
        outputPath(bfs, "Almaty");

        System.out.println("----------------------");

        WeightedGraph<String> weightedGraph = new WeightedGraph<>(true);
        fillWithWeights(weightedGraph);

        System.out.println("Dijkstra:");
        Search<String> djk = new DijkstraSearch<>(weightedGraph, "Astana");
        outputPath(djk, "Almaty");

    }

    public static void fillWithoutWeights(UnweightedGraph<String> graph) {
        graph.addEdge("Astana", "Karaganda");
        graph.addEdge("Karaganda", "Balkash");
        graph.addEdge("Balkash", "Almaty");
        graph.addEdge("Almaty", "Taraz");
        graph.addEdge("Taraz", "Shymkent");
        graph.addEdge("Shymkent", "Turkistan");
        graph.addEdge("Turkistan", "Kyzylorda");
        graph.addEdge("Kyzylorda", "Baikonur");
        graph.addEdge("Baikonur", "Aral");
        graph.addEdge("Aral", "Aktobe");
        graph.addEdge("Aktobe", "Oral");
        graph.addEdge("Oral", "Atyrau");
        graph.addEdge("Atyrau", "Kulsary");
        graph.addEdge("Kulsary", "Beineu");
        graph.addEdge("Beineu", "Zhanaozen");
        graph.addEdge("Aktobe", "Kostanai");
        graph.addEdge("Kostanai", "Atbasar");
        graph.addEdge("Atbasar", "Astana");
        graph.addEdge("Atbasar", "Kokshetau");
        graph.addEdge("Astana", "Ekibastuz");
        graph.addEdge("Ekibastuz", "Pavlodar");
        graph.addEdge("Pavlodar", "Semei");
        graph.addEdge("Semei", "Ayakoz");
        graph.addEdge("Ayakoz", "Taldykorgan");
        graph.addEdge("Taldykorgan", "Almaty");
    }


    public static void fillWithWeights(WeightedGraph<String> graph) {
        graph.addEdge("Astana", "Karaganda", 2.0);
        graph.addEdge("Karaganda", "Balkash", 3.7);
        graph.addEdge("Balkash", "Almaty", 5.9);
        graph.addEdge("Almaty", "Taraz", 4.6);
        graph.addEdge("Taraz", "Shymkent", 1.65);
        graph.addEdge("Shymkent", "Turkistan", 1.59);
        graph.addEdge("Turkistan", "Kyzylorda", 2.82);
        graph.addEdge("Kyzylorda", "Baikonur", 2.0);
        graph.addEdge("Baikonur", "Aral", 2.0);
        graph.addEdge("Aral", "Aktobe", 5.88);
        graph.addEdge("Aktobe", "Oral", 4.6);
        graph.addEdge("Oral", "Atyrau", 4.7);
        graph.addEdge("Atyrau", "Kulsary", 2.1);
        graph.addEdge("Kulsary", "Beineu", 2.05);
        graph.addEdge("Beineu", "Zhanaozen", 4.3);
        graph.addEdge("Aktobe", "Kostanai", 7.25);
        graph.addEdge("Kostanai", "Atbasar", 4.0);
        graph.addEdge("Atbasar", "Astana", 2.4);
        graph.addEdge("Atbasar", "Kokshetau", 2.9);
        graph.addEdge("Astana", "Ekibastuz", 3.01);
        graph.addEdge("Ekibastuz", "Pavlodar", 1.26);
        graph.addEdge("Pavlodar", "Semei", 3.1);
        graph.addEdge("Semei", "Ayakoz", 3.37);
        graph.addEdge("Ayakoz", "Taldykorgan", 4.59);
        graph.addEdge("Taldykorgan", "Almaty", 2.5);

    }



    public static void outputPath(Search<String> search, String key) {
        for (String v : search.pathTo(key)) {
            System.out.print(v + " -> ");
        }
        System.out.println();
    }


}

public class DepthFirstSearch<T> extends Search<T> {
    public DepthFirstSearch(UnweightedGraph<T> graph, T startValue) {
        super(new Vertex<>(startValue));
        dfs(graph, this.start);
    }

    private void dfs(UnweightedGraph<T> graph, Vertex<T> current) {
        marked.put(current, true);
        for (Vertex<T> neighbor : graph.getAdjVertices(current)) {
            if (!marked.containsKey(neighbor)) {
                edgeTo.put(neighbor, current);
                dfs(graph, neighbor);
            }
        }
    }
}

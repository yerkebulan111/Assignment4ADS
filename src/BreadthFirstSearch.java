import java.util.*;

public class BreadthFirstSearch<T> extends Search<T> {
    public BreadthFirstSearch(UnweightedGraph<T> graph, T startValue) {
        super(new Vertex<>(startValue));
        bfs(graph);
    }

    private void bfs(UnweightedGraph<T> graph) {
        Queue<Vertex<T>> queue = new LinkedList<>();
        queue.add(start);
        marked.put(start, true);

        while (!queue.isEmpty()) {
            Vertex<T> current = queue.poll();
            for (Vertex<T> neighbor : graph.getAdjVertices(current)) {
                if (!marked.containsKey(neighbor)) {
                    edgeTo.put(neighbor, current);
                    marked.put(neighbor, true);
                    queue.add(neighbor);
                }
            }
        }
    }
}

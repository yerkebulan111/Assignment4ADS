import java.util.*;

public class DijkstraSearch<T> extends Search<T> {
    private final Map<Vertex<T>, Double> distance = new HashMap<>();

    public DijkstraSearch(WeightedGraph<T> graph, T startValue) {
        super(new Vertex<>(startValue));
        dijkstra(graph);
    }

    private void dijkstra(WeightedGraph<T> graph) {
        PriorityQueue<Vertex<T>> queue = new PriorityQueue<>(Comparator.comparingDouble(distance::get));
        distance.put(start, 0.0);
        queue.add(start);

        while (!queue.isEmpty()) {
            Vertex<T> current = queue.poll();
            if (marked.containsKey(current)) continue;
            marked.put(current, true);

            for (Edge<T> edge : graph.getAdjEdges(current)) {
                Vertex<T> neighbor = edge.getTo();
                double newDist = distance.getOrDefault(current, Double.MAX_VALUE) + edge.getWeight();
                if (newDist < distance.getOrDefault(neighbor, Double.MAX_VALUE)) {
                    distance.put(neighbor, newDist);
                    edgeTo.put(neighbor, current);
                    queue.add(neighbor);
                }
            }
        }
    }
}

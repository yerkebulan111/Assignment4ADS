import java.util.*;

public class WeightedGraph<T> {
    private final Map<Vertex<T>, List<Edge<T>>> adjList = new HashMap<>();
    private final boolean directed;

    public WeightedGraph(boolean directed) {
        this.directed = directed;
    }

    public void addVertex(T value) {
        adjList.putIfAbsent(new Vertex<>(value), new ArrayList<>());
    }

    public void addEdge(T from, T to, double weight) {
        Vertex<T> v1 = new Vertex<>(from);
        Vertex<T> v2 = new Vertex<>(to);

        adjList.putIfAbsent(v1, new ArrayList<>());
        adjList.putIfAbsent(v2, new ArrayList<>());

        adjList.get(v1).add(new Edge<>(v1, v2, weight));
        if (!directed) {
            adjList.get(v2).add(new Edge<>(v2, v1, weight));
        }
    }

    public List<Edge<T>> getAdjEdges(Vertex<T> vertex) {
        return adjList.getOrDefault(vertex, new ArrayList<>());
    }

    public Set<Vertex<T>> getVertices() {
        return adjList.keySet();
    }
}

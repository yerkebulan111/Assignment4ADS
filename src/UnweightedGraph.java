import java.util.*;

public class UnweightedGraph<T> {
    private final Map<Vertex<T>, List<Vertex<T>>> adjList = new HashMap<>();
    private final boolean directed;

    public UnweightedGraph(boolean directed) {
        this.directed = directed;
    }

    public void addVertex(T value) {
        adjList.putIfAbsent(new Vertex<>(value), new ArrayList<>());
    }

    public void addEdge(T from, T to) {
        Vertex<T> v1 = new Vertex<>(from);
        Vertex<T> v2 = new Vertex<>(to);

        adjList.putIfAbsent(v1, new ArrayList<>());
        adjList.putIfAbsent(v2, new ArrayList<>());

        adjList.get(v1).add(v2);
        if (!directed) {
            adjList.get(v2).add(v1);
        }
    }

    public List<Vertex<T>> getAdjVertices(Vertex<T> vertex) {
        return adjList.getOrDefault(vertex, new ArrayList<>());
    }

    public Set<Vertex<T>> getVertices() {
        return adjList.keySet();
    }
}

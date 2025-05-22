import java.util.*;

public abstract class Search<T> {
    protected final Map<Vertex<T>, Boolean> marked = new HashMap<>();
    protected final Map<Vertex<T>, Vertex<T>> edgeTo = new HashMap<>();
    protected final Vertex<T> start;

    public Search(Vertex<T> start) {
        this.start = start;
    }

    public List<T> pathTo(T end) {
        Vertex<T> endVertex = new Vertex<>(end);
        if (!marked.containsKey(endVertex)) return Collections.emptyList();

        LinkedList<T> path = new LinkedList<>();
        for (Vertex<T> v = endVertex; v != null; v = edgeTo.get(v)) {
            path.addFirst(v.getValue());
        }
        return path;
    }
}

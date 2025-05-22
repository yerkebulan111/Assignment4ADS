public class Edge<T> {
    private final Vertex<T> from;
    private final Vertex<T> to;
    private final double weight;

    public Edge(Vertex<T> from, Vertex<T> to, double weight) {
        this.from = from;
        this.to = to;
        this.weight = weight;
    }

    public Vertex<T> getFrom() {
        return from;
    }

    public Vertex<T> getTo() {
        return to;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return from + " -> " + to + " (" + weight + ")";
    }
}

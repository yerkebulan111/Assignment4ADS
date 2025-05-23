# Graph Search Algorithms in Java

This project demonstrates the implementation of key graph search algorithms in Java, including:

- **Breadth-First Search (BFS)**
- **Depth-First Search (DFS)**
- **Dijkstra’s Algorithm** for shortest path in a weighted graph

## Project Structure

The project uses a custom graph implementation with generic support for vertex types. It includes both weighted and unweighted directed graphs, and allows pathfinding between cities in Kazakhstan using different search strategies.

### Classes:

- `Vertex<T>`: Represents a node in the graph.
- `Edge<T>`: Represents an edge (used only in weighted graphs).
- `UnweightedGraph<T>`: A directed unweighted graph.
- `WeightedGraph<T>`: A directed weighted graph.
- `Search<T>`: Interface for search result abstraction.
- `BreadthFirstSearch<T>`: Implements BFS.
- `DepthFirstSearch<T>`: Implements DFS.
- `DijkstraSearch<T>`: Implements Dijkstra’s algorithm.
- `Main`: Builds the graphs, runs the search algorithms, and prints the paths.

### Cities in the Graph

The graphs model connections between the following cities:

- Astana
- Karaganda
- Balkash
- Almaty
- Taraz
- Shymkent
- Turkistan
- Kyzylorda
- Baikonur
- Aral
- Aktobe
- Oral
- Atyrau
- Kulsary
- Beineu
- Zhanaozen
- Kostanai
- Atbasar
- Kokshetau
- Ekibastuz
- Pavlodar
- Semei
- Ayakoz
- Taldykorgan

### Example

The `Main` class runs three different search strategies to find a path from **Astana** to **Almaty**, printing the route found by each algorithm.

### Output

DFS:
Astana -> Karaganda -> Balkash -> Almaty -> 
----------------------
BFS:
Astana -> Karaganda -> Balkash -> Almaty -> 
----------------------
Dijkstra:
Astana -> Karaganda -> Balkash -> Almaty ->


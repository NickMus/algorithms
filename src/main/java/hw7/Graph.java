package hw7;

/**
 * @author Nick Musinov e-mail:n.musinov@gmail.com
 * 22.04.2022
 */
public interface Graph {
    void addVertex(String name);
    boolean addEdge(String start, String destination, int distance);

    int size();
    void display();
    String toString();
}

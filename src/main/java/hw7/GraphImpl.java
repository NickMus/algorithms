package hw7;

import java.util.*;

/**
 * @author Nick Musinov e-mail:n.musinov@gmail.com
 * 22.04.2022
 */
public class GraphImpl implements Graph {

    private final List<Vertex> vertexList;
    private final int[][] adjMatrix;
    int sum;

    public GraphImpl(int maxVertexCount) {
        this.vertexList = new ArrayList<>(maxVertexCount);
        this.adjMatrix = new int[maxVertexCount][maxVertexCount];
    }

    @Override
    public void addVertex(String name) {
        vertexList.add(new Vertex(name));
    }

    @Override
    public boolean addEdge(String start, String destination, int distance) {
        int startIndex = indexOf(start);
        int endIndex = indexOf(destination);

        if (startIndex == -1 || endIndex == -1) {
            return false;
        }

        adjMatrix[startIndex][endIndex] = distance;
        return true;
    }

    private int indexOf(String start) {
        for (int i = 0; i < vertexList.size(); i++) {
            if (vertexList.get(i).getName().equals(start)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int size() {
        return vertexList.size();
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size(); i++) {
            sb.append(vertexList.get(i));
            for (int j = 0; j < size(); j++) {
                if (adjMatrix[i][j] != 0) {
                    sb.append(" -> ").append(vertexList.get(j));
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public void dfs(String start) {
        int startIndex = indexOf(start);
        if (startIndex == -1) {
            throw new IllegalArgumentException();
        }
        Stack<Vertex> stack = new Stack<>();
        Vertex vertex = vertexList.get(startIndex);


        visitVertex(stack, vertex);

        while (!stack.isEmpty()) {
            vertex = getNearVertex(stack.peek());
            if (vertex == null) {
                stack.pop();
            } else {
                visitVertex(stack, vertex);


            }
            if (vertex.getName().equals("Voronezh")) {
                vertex.setVisited(false);
                System.out.println("=========================================");
                sum = 0;
                dfs("Moscow");
            }
        }

    }

    private Vertex getNearVertex(Vertex vertex) {
        int currentIndex = vertexList.indexOf(vertex);


        for (int i = 0; i < size(); i++) {
            if (adjMatrix[currentIndex][i] != 0 && !vertexList.get(i).getVisited()) {
                System.out.println(sum += adjMatrix[currentIndex][i]);
                return vertexList.get(i);
            }
        }
        return null;
    }

    private void visitVertex(Stack<Vertex> stack, Vertex vertex) {
        System.out.println(vertex.getName() + " ");
        stack.push(vertex);
        vertex.setVisited(true);

    }

}

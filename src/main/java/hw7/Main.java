package hw7;

/**
 * @author Nick Musinov e-mail:n.musinov@gmail.com
 * 22.04.2022
 */
public class Main {
    public static void main(String[] args) {

        GraphImpl graph = new GraphImpl(10);
        graph.addVertex("Moscow");
        graph.addVertex("Tula");
        graph.addVertex("Lipetsk");
        graph.addVertex("Voronezh");
        graph.addVertex("Ryazan");
        graph.addVertex("Tambow");
        graph.addVertex("Saratow");
        graph.addVertex("Kaluga");
        graph.addVertex("Orel");
        graph.addVertex("Kursk");

        graph.addEdge("Moscow", "Tula", 200);
        graph.addEdge("Tula", "Lipetsk", 150);
        graph.addEdge("Lipetsk", "Voronezh", 200);

        graph.addEdge("Moscow", "Ryazan", 180);
        graph.addEdge("Ryazan", "Tambow", 150);
        graph.addEdge("Tambow", "Saratow", 190);
        graph.addEdge("Saratow", "Voronezh", 130);

        graph.addEdge("Moscow", "Kaluga", 140);
        graph.addEdge("Kaluga", "Orel", 170);
        graph.addEdge("Orel", "Kursk", 150);
        graph.addEdge("Kursk", "Voronezh", 120);


        graph.display();

        graph.dfs("Moscow");

//        System.out.println(graph.size());
    }
}

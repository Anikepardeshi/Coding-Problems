package searching.algorithms;

import java.util.*;

public class BFS {
    // Graph represented using adjacency lists
    private Map<Integer, List<Integer>> graph;

    public BFS(int vertices) {
        graph = new HashMap<>();
        for (int i = 0; i < vertices; i++) {
            graph.put(i, new LinkedList<>());
        }
    }

    // Function to add an edge to the graph
    public void addEdge(int source, int destination) {
        graph.get(source).add(destination);
    }

    // Function to perform Breadth-First Search starting from a given vertex
    public void bfs(int startVertex) {
        // Queue to store vertices for BFS traversal
        Queue<Integer> queue = new LinkedList<>();
        // Set to keep track of visited vertices
        Set<Integer> visited = new HashSet<>();

        // Add the start vertex to the queue and mark it as visited
        queue.add(startVertex);
        visited.add(startVertex);

        // Iterate until the queue is empty
        while (!queue.isEmpty()) {
            // Dequeue a vertex from the queue
            int currentVertex = queue.poll();
            System.out.print(currentVertex + " ");

            // Visit all adjacent vertices of the current vertex
            for (int adjacentVertex : graph.get(currentVertex)) {
                // If adjacent vertex is not visited, mark it as visited and enqueue it
                if (!visited.contains(adjacentVertex)) {
                    visited.add(adjacentVertex);
                    queue.add(adjacentVertex);
                }
            }
        }
    }

    public static void main(String[] args) {
        BFS bfsGraph = new BFS(4); // Create a graph with 4 vertices
        bfsGraph.addEdge(0, 1);
        bfsGraph.addEdge(0, 2);
        bfsGraph.addEdge(1, 2);
        bfsGraph.addEdge(2, 0);
        bfsGraph.addEdge(2, 3);
        bfsGraph.addEdge(3, 3);

        System.out.println("BFS traversal starting from vertex 2:");
        bfsGraph.bfs(2); // Perform BFS starting from vertex 2
    }
}


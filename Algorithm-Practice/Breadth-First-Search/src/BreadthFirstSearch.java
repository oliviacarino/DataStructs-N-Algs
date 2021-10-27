// simple implementation of BFS

import java.util.*;

class BreadthFirstSearch {

    // Perform BFS on the graph starting from vertex `v` --- iterative implementation
    public static void BFS(Graph graph, int v, boolean[] discovered) {
        // create a queue for doing BFS
        Queue<Integer> q = new ArrayDeque<>();

        // mark the source vertex as discovered
        discovered[v] = true;

        // enqueue source vertex
        q.add(v);

        // loop till queue is empty
        while (!q.isEmpty())
        {
            // dequeue front node and print it
            v = q.poll();
            System.out.print(v + " ");

            // do for every edge `v —> u`
            for (int u: graph.adjList.get(v))
            {
                if (!discovered[u])
                {
                    // mark it as discovered and enqueue it
                    discovered[u] = true;
                    q.add(u);
                }
            }
        }
    } // BFS

    // Perform BFS recursively on the graph --- recursive implementation
/*    public static void recursiveBFS(Graph graph, Queue<Integer> q, boolean[] discovered) {
      if (q.isEmpty()) {
      return;
      } // if

        // dequeue front node and print it
        int v = q.poll();
        System.out.print(v + " ");

        // do for every edge `v —> u`
        for (int u: graph.adjList.get(v)) {
        if (!discovered[u]) {
        // mark it as discovered and enqueue it
        discovered[u] = true;
        q.add(u);
        } // if
        } // for

        recursiveBFS(graph, q, discovered);
        } // recursiveBFS
*/

    public static void main(String[] args) {
        // List of graph edges as per the above diagram
        List<Edge> edges = Arrays.asList(
            new Edge(1, 2), new Edge(1, 3), new Edge(1, 4),
            new Edge(2, 5), new Edge(2, 6), new Edge(5, 9),
            new Edge(5, 10), new Edge(4, 7), new Edge(4, 8),
            new Edge(7, 11), new Edge(7, 12)
            // vertex 0, 13, and 14 are single nodes
            );

        // total number of nodes in the graph
        final int N = 15;

        // build a graph from the given edges
        Graph graph = new Graph(edges, N);

        // to keep track of whether a vertex is discovered or not
        boolean[] discovered = new boolean[N];

        // create a queue for doing BFS
        Queue<Integer> q = new ArrayDeque<>();

        // Perform BFS traversal from all undiscovered nodes to
        // cover all unconnected components of a graph
        for (int i = 0; i < N; i++) {
            if (discovered[i] == false) {
                // mark the source vertex as discovered
//                discovered[i] = true;

                // enqueue source vertex
//                q.add(i);

                // start BFS traversal from vertex `i`
//                recursiveBFS(graph, q, discovered);

                BFS(graph, i, discovered);

            } // if
        } // for
        System.out.println();
    } // main
} // BreadthFirstSearch

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CycleDetection {

  static Map<Integer, List<Integer>> graph = new HashMap<>();

  private static boolean cycleDetection(int parent) {
    Deque<int[]> stack = new LinkedList<>();
    Set<Integer> visited = new HashSet<>();

    stack.push(new int[] { parent, -1 });
    visited.add(parent);
    while (!stack.isEmpty()) {
      int[] current = stack.poll();
      int node = current[0];
      int parentNode = current[1];

      for (int neighbour : graph.get(node)) {
        if (!visited.contains(neighbour)) {
          stack.push(new int[] { neighbour, node });
          visited.add(neighbour);
        } else if (neighbour != parentNode) {
          return true;
        }
      }
    }

    return false;
  }

  public static void main(String[] args) {
    // Add edges (undirected)
    addEdge(graph, 0, 1);
    addEdge(graph, 0, 2);
    // addEdge(graph, 1, 2);
    addEdge(graph, 1, 3);

    // Print the graph
    for (int node : graph.keySet()) {
      System.out.println(node + " -> " + graph.get(node));
    }

    System.out.println(cycleDetection(0));
  }

  static void addEdge(Map<Integer, List<Integer>> graph, int u, int v) {
    graph.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
    graph.computeIfAbsent(v, k -> new ArrayList<>()).add(u); // undirected
  }
}

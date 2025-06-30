import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class BFSGraph {

  private static void bfsGraph(Map<Integer, List<Integer>> graph, int start) {
    Queue<Integer> queue = new LinkedList<>();
    Set<Integer> visited = new HashSet<>();

    queue.add(start);
    visited.add(start);

    while (!queue.isEmpty()) {
      int node = queue.poll();
      System.out.print(node + " ");

      for (int neighbour : graph.get(node)) {
        if (!visited.contains(neighbour)) {
          visited.add(neighbour);
          queue.add(neighbour);
        }
      }
    }
  }

  public static void main(String[] args) {
    Map<Integer, List<Integer>> graph = new HashMap<>();

    graph.put(0, Arrays.asList(1, 3));
    graph.put(1, Arrays.asList(0, 2, 4));
    graph.put(2, Arrays.asList(1));
    graph.put(3, Arrays.asList(0, 4));
    graph.put(4, Arrays.asList(1, 3));
    bfsGraph(graph, 0);
  }
}

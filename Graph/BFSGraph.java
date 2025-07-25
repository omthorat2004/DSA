import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class BFSGraph {

  private static void bfsShortest(
    Map<Integer, List<Integer>> graph,
    int start,
    int destination
  ) {
    Queue<int[]> queue = new LinkedList<>();
    Set<Integer> visited = new HashSet<>();

    queue.add(new int[] { start, 0 });
    visited.add(start);

    while (!queue.isEmpty()) {
      int[] curr = queue.poll();
      int node = curr[0];
      int distance = curr[1];

      if (node == destination) {
        System.out.println(distance);
        return;
      }

      for (int neighbour : graph.getOrDefault(node, new ArrayList<>())) {
        if (!visited.contains(neighbour)) {
          visited.add(neighbour);
          queue.add(new int[] { neighbour, distance + 1 });
        }
      }
    }

    // Optional: If destination is unreachable
    System.out.println("Destination not reachable");
  }

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

    graph.put(0, Arrays.asList(1, 2));
    graph.put(1, Arrays.asList(0, 3));
    graph.put(2, Arrays.asList(0, 4));
    graph.put(3, Arrays.asList(1, 2));
    graph.put(4, Arrays.asList(3, 2));
    // bfsGraph(graph, 0);
    bfsShortest(graph, 0, 4);
  }
}

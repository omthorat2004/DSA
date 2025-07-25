import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CycleDetectionDirecetd {

  static Map<Integer, List<Integer>> graph = new HashMap<>();

  public static boolean detectCycle(int start) {
    Deque<int[]> stack = new LinkedList<>();
    Set<Integer> visited = new HashSet<>();

    stack.push(new int[] { start, -1 });
    visited.add(start);

    while (!stack.isEmpty()) {
      int[] current = stack.pop();

      int node = current[0];
      int parent = current[1];

      for (int neighbour : graph.get(node)) {
        if (!visited.contains(neighbour)) {
          visited.add(neighbour);
          stack.push(new int[] { neighbour, node });
        } else {
          return true;
        }
      }
      return false;
    }

    return true;
  }

  public static void main(String[] args) {
    // Cyclic graph representation:
    graph.put(1, Arrays.asList(2));
    graph.put(2, Arrays.asList(3));
    graph.put(3, Arrays.asList(4));
    graph.put(4, Arrays.asList(5));
    graph.put(5, Arrays.asList(2));
    System.out.println(detectCycle(1));
  }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
public class DFSGraph {
    public void dfs(int startNode, List<List<Integer>> adj, boolean[] visited) {
        Stack<Integer> stack = new Stack<>();
        stack.push(startNode);
        visited[startNode] = true;
        System.out.print(startNode + " ");
        while (!stack.isEmpty()) {
            int currentNode = stack.peek();
            boolean foundUnvisitedNeighbor = false;
            for (int neighbor : adj.get(currentNode)) {
                if (!visited[neighbor]) {
                    stack.push(neighbor);
                    visited[neighbor] = true;
                    System.out.print(neighbor + " ");
                    foundUnvisitedNeighbor = true;
                    break;
                }
            }
            if (!foundUnvisitedNeighbor) {
                stack.pop(); 
            }
        }
    }
    public static void main(String[] args) {
        int numVertices = 5;
        List<List<Integer>> adj = new ArrayList<>(numVertices);
        for (int i = 0; i < numVertices; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(0);
        adj.get(1).add(3);
        adj.get(2).add(0);
        adj.get(2).add(4);
        adj.get(3).add(1);
        adj.get(4).add(2);
        DFSGraph graph = new DFSGraph();
        boolean[] visited = new boolean[numVertices];
        System.out.println("DFS Traversal starting from vertex 0:");
        graph.dfs(0, adj, visited);
        System.out.println();
    }
}